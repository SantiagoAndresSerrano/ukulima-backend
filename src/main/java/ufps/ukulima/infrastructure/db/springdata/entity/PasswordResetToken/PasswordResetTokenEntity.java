package ufps.ukulima.infrastructure.db.springdata.entity.PasswordResetToken;

import ufps.ukulima.infrastructure.db.springdata.entity.Agricultor.AgricultorEntity;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "password_reset_token")
public class PasswordResetTokenEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "agricultor", nullable = false)
    private AgricultorEntity agricultor;

    @Column(name = "fecha_expiracion", nullable = false)
    private Date fechaExpiracion;

    @Column(name = "token", nullable = false)
    private String token;


    public PasswordResetTokenEntity(AgricultorEntity agricultor) {
        this.agricultor = agricultor;
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR,1);
        Date manana = calendar.getTime();
        fechaExpiracion = manana;
        token = UUID.randomUUID().toString();
    }
    public PasswordResetTokenEntity(){}

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

    public AgricultorEntity getAgricultor() {
        return agricultor;
    }

    public void setAgricultor(AgricultorEntity agricultor) {
        this.agricultor = agricultor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
