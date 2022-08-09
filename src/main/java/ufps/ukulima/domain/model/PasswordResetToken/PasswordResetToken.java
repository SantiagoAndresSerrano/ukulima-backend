package ufps.ukulima.domain.model.PasswordResetToken;

import ufps.ukulima.domain.model.Agricultor.Agricultor;
import ufps.ukulima.infrastructure.db.springdata.entity.Agricultor.AgricultorEntity;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class PasswordResetToken {
    private Integer id;
    private Agricultor agricultor;
    private Date fechaExpiracion;

    private String token;

    public PasswordResetToken(Agricultor agricultor) {
        this.agricultor = agricultor;
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR,1);
        Date manana = calendar.getTime();
        fechaExpiracion = manana;
        token = UUID.randomUUID().toString();
    }
    public PasswordResetToken(){}

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public Agricultor getAgricultor() {
        return agricultor;
    }

    public void setAgricultor(Agricultor agricultor) {
        this.agricultor = agricultor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}