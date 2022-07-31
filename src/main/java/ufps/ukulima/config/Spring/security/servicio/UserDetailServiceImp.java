/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.config.Spring.security.servicio;

/**
 *
 * @author santi
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ufps.ukulima.config.Spring.security.model.Usuario;
import ufps.ukulima.config.Spring.security.model.UsuarioPrincipal;

@Service
public class UserDetailServiceImp implements UserDetailsService {

    @Autowired
    UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        Usuario usuario = usuarioService.findByEmail(nombreUsuario);
        return UsuarioPrincipal.build(usuario);
    }
}
