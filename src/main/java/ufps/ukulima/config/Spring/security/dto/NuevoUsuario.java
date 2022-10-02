/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.config.Spring.security.dto;

/**
 *
 * @author santi
 */
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class NuevoUsuario {

    @Email
    private String email;

    @NotBlank(message = "La contraseña no puede estar en blanco")
    @NotNull(message = "La contraseña no puede estar vacía")
    private String password;
    private Set<String> roles = new HashSet<>();
    @NotBlank(message = "Los nombres no pueden estar en blanco")
    @NotNull(message = "Los nombres no puede estar vacíos")
    private String nombres;
    @NotBlank(message = "Los apellidos no pueden estar en blanco")
    @NotNull(message = "Los apellidos no puede estar vacíos")
    private String apellidos;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}