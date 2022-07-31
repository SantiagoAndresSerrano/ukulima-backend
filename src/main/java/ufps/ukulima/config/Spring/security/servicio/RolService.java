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

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.config.Spring.security.dao.RolRepository;
import ufps.ukulima.config.Spring.security.model.Rol;

import java.util.Optional;

@Service
@Transactional
public class RolService {

    @Autowired
    RolRepository rolRepository;
    
    @Transactional(readOnly = true)
    public Optional<Rol> getByRolNombre(Rol.RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }

        
    @Transactional
    public void guardar(Rol rol) {
        rolRepository.save(rol);
    }

    @Transactional
    public void eliminar(int id) {
        rolRepository.deleteById(id);
    }

    @Transactional(readOnly = true )
    public Optional<Rol> encontrar(int id) {
        return rolRepository.findById(id);
    }

    @Transactional(readOnly = true)
    public List<Rol> listar() {
        return rolRepository.findAll();
    }
    
    public void save(Rol rol){
        rolRepository.save(rol);
    }
}

