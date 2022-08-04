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
import javax.validation.constraints.NotBlank;

public class LoginUsuario {
    private String emailOrPhone;
    @NotBlank
    private String password;

    public String getEmailOrPhone() {
        return emailOrPhone;
    }

    public void setEmailOrPhone(String email) {
        this.emailOrPhone = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
