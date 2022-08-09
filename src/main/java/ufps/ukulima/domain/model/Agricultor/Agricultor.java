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
    private Integer identifiacion;
    private String nombres;
    private String apellidos;
    private String telefono;
    private Date fechaNacimiento;
    private String password;
    private String email;

    private Boolean estado;
    private TipoIdentificacion idTipoIdentificacion;
    private Collection<Finca> fincaCollection;

    private Collection<PasswordResetToken> passwordResetTokens;

    public Agricultor() {
    }

    public Agricultor(Integer identifiacion) {
        this.identifiacion = identifiacion;
    }

    public Agricultor(Integer identifiacion, String nombres, String apellidos, Date fechaNacimiento, String password) {
        this.identifiacion = identifiacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.password = password;
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

    public Integer getIdentifiacion() {
        return identifiacion;
    }

    public void setIdentifiacion(Integer identifiacion) {
        this.identifiacion = identifiacion;
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

    public TipoIdentificacion getIdTipoIdentificacion() {
        return idTipoIdentificacion;
    }

    public void setIdTipoIdentificacion(TipoIdentificacion idTipoIdentificacion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
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
        hash += (identifiacion != null ? identifiacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof Agricultor)) {
            return false;
        }
        Agricultor other = (Agricultor) object;
        if ((this.identifiacion == null && other.identifiacion != null) || (this.identifiacion != null && !this.identifiacion.equals(other.identifiacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Agricultor{" +
                "identifiacion=" + identifiacion +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", idTipoIdentificacion=" + idTipoIdentificacion +
                '}';
    }
}
