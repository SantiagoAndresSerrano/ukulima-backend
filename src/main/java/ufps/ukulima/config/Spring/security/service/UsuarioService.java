package ufps.ukulima.config.Spring.security.service;

import ufps.ukulima.config.Spring.security.model.Usuario;

import java.util.Optional;

public interface UsuarioService {
    public Optional<Usuario> getByEmail(String email);
    public Optional<Usuario> getById(int id);
    public boolean existsByEmail(String email);

    public Usuario findByEmail(String email);

    public Usuario findByEmailOrPhone(String email);


    public Usuario guardar(Usuario usuario);

    public Optional<Usuario> encontrar(int id);
}
