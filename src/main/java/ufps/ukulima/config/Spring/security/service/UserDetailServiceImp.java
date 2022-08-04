/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.config.Spring.security.service;

/**
 *
 * @author santi
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
//import ufps.ukulima.config.Spring.security.model.Usuario;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.config.Spring.security.model.Usuario;
import ufps.ukulima.config.Spring.security.model.UsuarioPrincipal;
import ufps.ukulima.config.Spring.security.service.imp.UsuarioServiceImp;
import ufps.ukulima.domain.model.Agricultor.Agricultor;
import ufps.ukulima.domain.model.Agricultor.gateway.AgricultorService;

@Service
public class UserDetailServiceImp implements UserDetailsService {

    @Autowired
    UsuarioServiceImp usuarioService;

    @Autowired
    AgricultorService agricultorService;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String emailOrPhone) throws UsernameNotFoundException {

         Usuario usuario = usuarioService.findByEmail(emailOrPhone);
        if(usuario==null){

            Agricultor agricultor = agricultorService.getAgricultorByPhoneOrEmail(emailOrPhone);
            return UsuarioPrincipal.build(agricultor,emailOrPhone);
        }

        return UsuarioPrincipal.build(usuario);
    }
}
