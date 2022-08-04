/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.config.Spring.security.repository;

/**
 *
 * @author santi
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ufps.ukulima.config.Spring.security.model.Usuario;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
     Optional<Usuario> findByEmail(String email);
    boolean existsByEmail(String email);



}

