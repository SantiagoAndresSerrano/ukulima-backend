/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.Agricultor;

import ufps.ukulima.domain.model.PasswordResetToken.PasswordResetToken;
import ufps.ukulima.domain.model.TipoIdentificacion.TipoIdentificacion;
import ufps.ukulima.domain.model.Finca.Finca;

import java.util.Collection;
import java.util.Date;

/**
 *
 * @author santi
 */
public class Agricultor  {
    private Integer identificacion;
    private String nombres;
    private String apellidos;
    private String telefono;
    private Date fechaNacimiento;
    private String password;
    private String email;

    private String confirmationToken;

    private Boolean estado;
    private TipoIdentificacion idTipoidentificacion;
    private Collection<Finca> fincaCollection;

    private Collection<PasswordResetToken> passwordResetTokens;



    public Agricultor() {
    }

    public Agricultor(Integer identificacion) {
        this.identificacion = identificacion;
    }

    public Agricultor(Integer identificacion, String nombres, String apellidos, Date fechaNacimiento, String password) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.password = password;
    }

    public String getConfirmationToken() {
        return confirmationToken;
    }

    public void setConfirmationToken(String confirmationToken) {
        this.confirmationToken = confirmationToken;
    }

    public Collection<PasswordResetToken> getPasswordResetTokens() {
        return passwordResetTokens;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public void setPasswordResetTokens(Collection<PasswordResetToken> passwordResetTokens) {
        this.passwordResetTokens = passwordResetTokens;
    }

    public Integer getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Integer identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipoIdentificacion getIdTipoidentificacion() {
        return idTipoidentificacion;
    }

    public void setIdTipoIdentificacion(TipoIdentificacion idTipoIdentificacion) {
        this.idTipoidentificacion = idTipoIdentificacion;
    }

    public Collection<Finca> getFincaCollection() {
        return fincaCollection;
    }

    public void setFincaCollection(Collection<Finca> fincaCollection) {
        this.fincaCollection = fincaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (identificacion != null ? identificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof Agricultor)) {
            return false;
        }
        Agricultor other = (Agricultor) object;
        if ((this.identificacion == null && other.identificacion != null) || (this.identificacion != null && !this.identificacion.equals(other.identificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Agricultor{" +
                "identificacion=" + identificacion +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", idTipoidentificacion=" + idTipoidentificacion +
                '}';
    }
}
