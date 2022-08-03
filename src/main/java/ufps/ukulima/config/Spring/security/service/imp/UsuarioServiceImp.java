/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.config.Spring.security.service.imp;

/**
 *
 * @author santi
 */

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.config.Spring.security.repository.UsuarioRepository;
import ufps.ukulima.config.Spring.security.model.Usuario;
import ufps.ukulima.config.Spring.security.service.UsuarioService;

import java.util.Optional;

@Service
public class UsuarioServiceImp implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Optional<Usuario> getByEmail(String email){
        return usuarioRepository.findByEmail(email);
    }
    public Optional<Usuario> getById(int id){
        return usuarioRepository.findById(id);
    }
    public Usuario findByConfirmationToken(String token){ return usuarioRepository.findUsuarioByConfirmationToken(token);}
    public boolean existsByEmail(String email){
        return usuarioRepository.existsByEmail(email);
    }
    @Transactional
    public Usuario findByEmail(String email) {
        return usuarioRepository.findByEmail(email).orElse(null);
    }

    @Transactional
    public Usuario guardar(Usuario usuario) {
        usuarioRepository.save(usuario);
        return usuario;
    }

    @Transactional(readOnly = true)
    public Optional<Usuario> encontrar(int id) {
        return usuarioRepository.findById(id);
    }


}