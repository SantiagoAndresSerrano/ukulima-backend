/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.config.Spring.security.controller;

import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ufps.ukulima.config.Spring.email.service.imp.EmailServiceImp;
import ufps.ukulima.config.Spring.security.dto.*;
import ufps.ukulima.config.Spring.security.jwt.JwtProvider;
import ufps.ukulima.config.Spring.security.model.Rol;
import ufps.ukulima.config.Spring.security.model.Usuario;
import ufps.ukulima.config.Spring.security.service.RolService;
import ufps.ukulima.config.Spring.security.service.UsuarioService;
import ufps.ukulima.domain.model.Agricultor.Agricultor;
import ufps.ukulima.domain.model.Agricultor.gateway.AgricultorService;
import ufps.ukulima.domain.model.PasswordResetToken.PasswordResetToken;
import ufps.ukulima.domain.model.PasswordResetToken.gateway.PasswordResetTokenService;

import javax.mail.MessagingException;
import javax.validation.Valid;
import java.util.*;

/**
 *
 * @author santi
 */
@RestController
@RequestMapping(value="/api/auth", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class AuthController {
    private static Logger log = LoggerFactory.getLogger(AuthController.class);

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    AgricultorService agricultorService;
    @Autowired
    RolService rolService;

    @Autowired
    JwtProvider jwtProvider;

    @Autowired
    PasswordResetTokenService passwordResetTokenService;

    @Autowired
    EmailServiceImp emailServiceImp;

    @Value("${urifrontend}")
    String urlFrontend;


    @PostMapping("/nuevo")
    public ResponseEntity<?> nuevo(@Valid @RequestBody NuevoUsuario nuevoUsuario, BindingResult bindingResult) throws MessagingException {
        if(bindingResult.hasErrors())
            return new ResponseEntity(new Mensaje("campos mal puestos o email inválido"), HttpStatus.BAD_REQUEST);
        if(usuarioService.existsByEmail(nuevoUsuario.getEmail()) || agricultorService.existByEmail(nuevoUsuario.getEmail()))
            return new ResponseEntity(new Mensaje("ese email ya existe"), HttpStatus.BAD_REQUEST);

        Usuario usuario =
                new Usuario(nuevoUsuario.getEmail(),
                        passwordEncoder.encode(nuevoUsuario.getPassword()));


        Set<Rol> roles = new HashSet<>();
        roles.add(rolService.getByRolNombre(Rol.RolNombre.ROLE_USER).get());
        roles.add(rolService.getByRolNombre(Rol.RolNombre.ROLE_ADMIN).get());

        usuario.setRoles(roles);
        usuario.setEmail(nuevoUsuario.getEmail());
        usuario.setNombres(nuevoUsuario.getNombres());
        usuario.setApellidos(nuevoUsuario.getApellidos());

        usuarioService.guardar(usuario);
        return ResponseEntity.ok(usuario);
    }

    @PostMapping("/nuevoAgricultor")
    public ResponseEntity<?> nuevoAgricultor(@Valid @RequestBody NuevoAgricultor nuevoAgricultor, BindingResult bindingResult) throws MessagingException {
        if(bindingResult.hasErrors())
            return new ResponseEntity(new Mensaje("campos mal puestos o email inválido"), HttpStatus.BAD_REQUEST);

        Agricultor agricultor = new Agricultor();

        if (nuevoAgricultor.getEmail()!=null){                          //TODO: || usuarioService.existsByEmail(nuevoAgricultor.getEmail()) pendiente
            if(agricultorService.existByEmail(nuevoAgricultor.getEmail()) )
                return new ResponseEntity(new Mensaje("ese email ya existe"), HttpStatus.BAD_REQUEST);
            if(agricultorService.existById(nuevoAgricultor.getIdentificacion()) )
                return new ResponseEntity(new Mensaje("esa identificacion ya existe"), HttpStatus.BAD_REQUEST);
            agricultor.setEmail(nuevoAgricultor.getEmail());

        }else{
            if(agricultorService.existByPhone(nuevoAgricultor.getTelefono()))
                return new ResponseEntity(new Mensaje("ese telefono ya existe"), HttpStatus.BAD_REQUEST);
            agricultor.setTelefono(agricultor.getTelefono());
        }

        agricultor.setIdentifiacion(nuevoAgricultor.getIdentificacion());
        agricultor.setIdTipoIdentificacion(nuevoAgricultor.getIdTipoIdentificacion());
        agricultor.setApellidos(nuevoAgricultor.getApellidos());
        agricultor.setNombres(nuevoAgricultor.getNombres());
        agricultor.setFechaNacimiento(nuevoAgricultor.getFechaNacimiento());
        agricultor.setIdTipoIdentificacion(nuevoAgricultor.getIdTipoIdentificacion());
        agricultor.setPassword(passwordEncoder.encode(nuevoAgricultor.getPassword()));
        agricultor.setConfirmationToken(UUID.randomUUID().toString());
        agricultor.setEstado(false);

        agricultorService.saveAgricultor(agricultor);
        return ResponseEntity.ok(agricultor);
    }


    @GetMapping("/solicitudPassword/{email}")
    public ResponseEntity<?> recuperarPassword(@PathVariable String email) throws MessagingException {
        Agricultor u = agricultorService.getAgricultorByEmail(email);

        if(u==null)
            return new ResponseEntity(new Mensaje("El email no existe"), HttpStatus.NOT_FOUND);

        if(u.getPasswordResetTokens().size()>0){
            PasswordResetToken passwordResetToken = u.getPasswordResetTokens().iterator().next();
            if(passwordResetToken.getFechaExpiracion().before(new Date())){
                passwordResetTokenService.eliminarByToken(passwordResetToken.getToken());
            }else{
                return new ResponseEntity(new Mensaje("Ya hay una solicitud de reestablecimiento pendiente"), HttpStatus.BAD_REQUEST);

            }
        }

        PasswordResetToken passwordResetToken = new PasswordResetToken(u);
        passwordResetTokenService.guardar(passwordResetToken);

        emailServiceImp.enviarEmail("Cambio de contraseña",
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "\n" +
                        "<head>\n" +
                        "    <meta charset=\"UTF-8\">\n" +
                        "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                        "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                        "    <title>Document</title>\n" +
                        "</head>\n" +
                        "\n" +
                        "<body style=\"width: 800px\">\n" +
                        "    <div style=\"background-color: #a5b4fc; width: 100%; padding: 3rem 0;\">\n" +
                        "        <div style=\"text-align: center; background-color: #ffffff; margin: 0 auto; width: 80%; border-radius: 8px;\">\n" +
                        "            <img style=\"margin-top: 3rem; width: 190px\"\n" +
                        "                src=\"https://master.d1oc2nyuhwk984.amplifyapp.com/assets/images/logo.png\" alt=\"logo\">\n" +
                        "            <p style=\"margin: 1rem 0; font-size: 25px;\">Cambio de contraseña</p>\n" +
                        "            <p style=\"color: #424242;\">Hola, <b>"+u.getNombres()+"</b>, has solicitado " +
                        "cambiar tu contraseña, <br> para cambiar tu contraseña ingresa al siguiente link:  \n" +
                        "            </p>\n" +
                        "            <div style=\"margin: 2rem auto; width: 120px; background-color: #4f46e5; padding: 8px; border-radius: 6px; \">\n" +
                        "                <a style=\"color: #ffffff; text-decoration: none\" href=\""+urlFrontend+"password-reset/confirmation/"+passwordResetToken.getToken()+"\">Continuar</a>\n" +
                        "            </div>\n" +
                        "            <div style=\"width: 100%; border-top: 2px solid #a5b4fc; padding: 1rem 0\">\n" +
                        "                <p>Copyright © 2022 Analytic Hierarchy Process <br> Todos los derechos reservados.</p>\n" +
                        "            </div>\n" +
                        "        </div>\n" +
                        "    </div>\n" +
                        "</body>\n" +
                        "\n" +
                        "</html>"

                ,
                u.getEmail());

        return ResponseEntity.ok(new Mensaje("Mensaje de recuperación enviado al correo"));
    }


     @GetMapping("/recuperar/{token}") //petición que recibe el backend de parte del frontend, recordar cambiar el link de la linea 131 a un URL del frontend
    public ResponseEntity<?>confirmarRecuperarPassword(@PathVariable String token){

        PasswordResetToken passwordResetToken = passwordResetTokenService.buscarToken(token);

        if(passwordResetToken == null)
            return new ResponseEntity(new Mensaje("El token no existe"), HttpStatus.NOT_FOUND);

        if(passwordResetToken.getFechaExpiracion().before(new Date()))
            return new ResponseEntity(new Mensaje("El token ha expirado"), HttpStatus.BAD_REQUEST);

        return ResponseEntity.ok(new Mensaje("Contraseña cambiada con exito"));
    }

    @PostMapping("/recuperar/{token}")
    public ResponseEntity<?>cambiarPassword(@PathVariable String token, @RequestBody LoginUsuario loginUsuario) throws MessagingException {

        PasswordResetToken passwordResetToken = passwordResetTokenService.buscarToken(token);
        Agricultor uToken = agricultorService.findByResetPassword(token);

        if(passwordResetToken == null)
            return new ResponseEntity(new Mensaje("El token no existe"), HttpStatus.NOT_FOUND);

        if(passwordResetToken.getFechaExpiracion().before(new Date()))
            return new ResponseEntity(new Mensaje("El token ha expirado"), HttpStatus.BAD_REQUEST);

        loginUsuario.setEmailOrPhone(passwordResetToken.getAgricultor().getEmail());

        Usuario u = usuarioService.findByEmail(loginUsuario.getEmailOrPhone());

        if(u==null){
            return new ResponseEntity(new Mensaje("El correo no existe"), HttpStatus.BAD_REQUEST);
        }


        if(uToken==null){
            return new ResponseEntity(new Mensaje("El token no está asociado a ningun usuario"), HttpStatus.BAD_REQUEST);
        }

        if(!u.getEmail().equals(uToken.getEmail())){
            return new ResponseEntity(new Mensaje("El token se encuentra asociado a otro usuario"), HttpStatus.BAD_REQUEST);
        }

        log.info(loginUsuario.getPassword());
        log.info(passwordResetToken.getAgricultor().getEmail());
        log.info(uToken.getEmail());

        u.setPassword(passwordEncoder.encode(loginUsuario.getPassword()));
        usuarioService.guardar(u);

        emailServiceImp.enviarEmail("Contraseña actualizada",
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "\n" +
                        "<head>\n" +
                        "    <meta charset=\"UTF-8\">\n" +
                        "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                        "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                        "    <title>Document</title>\n" +
                        "</head>\n" +
                        "\n" +
                        "<body style=\"width: 800px\">\n" +
                        "    <div style=\"background-color: #a5b4fc; width: 100%; padding: 3rem 0;\">\n" +
                        "        <div style=\"text-align: center; background-color: #ffffff; margin: 0 auto; width: 80%; border-radius: 8px;\">\n" +
                        "            <img style=\"margin-top: 3rem; width: 190px\"\n" +
                        "                src=\"https://master.d1oc2nyuhwk984.amplifyapp.com/assets/images/logo.png\" alt=\"logo\">\n" +
                        "            <p style=\"margin: 1rem 0; font-size: 25px;\">Cambio de contraseña</p>\n" +
                        "            <p style=\"color: #424242;\">Hola, <b>"+u.getNombres()+"</b>, se ha cambiado tu " +
                        "contraseña en el sistema.  \n" +
                        "            </p>\n" +
                        "            <div style=\"width: 100%; border-top: 2px solid #a5b4fc; padding: 1rem 0\">\n" +
                        "                <p>Copyright © 2022 Analytic Hierarchy Process <br> Todos los derechos reservados.</p>\n" +
                        "            </div>\n" +
                        "        </div>\n" +
                        "    </div>\n" +
                        "</body>\n" +
                        "\n" +
                        "</html>"

                ,
                u.getEmail());
        passwordResetTokenService.eliminarByToken(passwordResetToken.getToken());


        return ResponseEntity.ok(new Mensaje("Contraseña cambiada con exito"));
    }

    @GetMapping("/confirmacion/{token}")
    public ResponseEntity<?> confirmarToken(@PathVariable String token){
        Agricultor agricultor = agricultorService.findByResetPassword(token);

        if(agricultor==null){
            return new ResponseEntity(new Mensaje("Error, Token no encontrado"), HttpStatus.NOT_FOUND);
        }

        agricultor.setEstado(true);
        agricultorService.saveAgricultor(agricultor);

        return ResponseEntity.ok(new Mensaje("Usuario verificado correctamente"));
    }

    @PostMapping("/login")
    public ResponseEntity<JwtDto> login(@Valid @RequestBody LoginUsuario loginUsuario, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return new ResponseEntity(new Mensaje("campos mal puestos"), HttpStatus.BAD_REQUEST);
        }
        Usuario usuario = usuarioService.getByEmail(loginUsuario.getEmailOrPhone()).orElse(null);
        if(usuario == null){
            Agricultor agricultor= agricultorService.getAgricultorByPhoneOrEmail(loginUsuario.getEmailOrPhone());

            if(agricultor!=null){
                Authentication authentication =
                        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginUsuario.getEmailOrPhone(), loginUsuario.getPassword()));
                SecurityContextHolder.getContext().setAuthentication(authentication);
                String jwt = jwtProvider.generateToken(authentication);
                UserDetails userDetails = (UserDetails)authentication.getPrincipal();
                JwtDto jwtDto = new JwtDto(jwt, userDetails.getUsername(), userDetails.getAuthorities());

                return new ResponseEntity(jwtDto, HttpStatus.OK);
            }else{
                return new ResponseEntity(new Mensaje("No existe usuario ni agricultor asociado a "+loginUsuario.getEmailOrPhone()),
                        HttpStatus.NOT_FOUND);
            }
        }


        Authentication authentication =
                authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(usuario.getEmail(), loginUsuario.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);

        String jwt = jwtProvider.generateToken(authentication);
        UserDetails userDetails = (UserDetails)authentication.getPrincipal();
        JwtDto jwtDto = new JwtDto(jwt, userDetails.getUsername(), userDetails.getAuthorities());

        return new ResponseEntity(jwtDto, HttpStatus.OK);
    }
}
