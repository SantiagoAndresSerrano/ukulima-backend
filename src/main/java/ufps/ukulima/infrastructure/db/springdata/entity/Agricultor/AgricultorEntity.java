/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.infrastructure.db.springdata.entity.Agricultor;

import ufps.ukulima.infrastructure.db.springdata.entity.Finca.FincaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.PasswordResetToken.PasswordResetTokenEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.TipoIdentificacion.TipoIdentificacionEntity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author santi
 */
@Entity
@Table(name = "agricultor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AgricultorEntity.findAll", query = "SELECT a FROM AgricultorEntity a"),
    @NamedQuery(name = "AgricultorEntity.findByIdentificacion", query = "SELECT a FROM AgricultorEntity a WHERE a.identificacion = :identificacion"),
    @NamedQuery(name = "AgricultorEntity.findByNombres", query = "SELECT a FROM AgricultorEntity a WHERE a.nombres = :nombres"),
    @NamedQuery(name = "AgricultorEntity.findByApellidos", query = "SELECT a FROM AgricultorEntity a WHERE a.apellidos = :apellidos"),
    @NamedQuery(name = "AgricultorEntity.findByTelefono", query = "SELECT a FROM AgricultorEntity a WHERE a.telefono = :telefono"),
    @NamedQuery(name = "AgricultorEntity.findByFechaNacimiento", query = "SELECT a FROM AgricultorEntity a WHERE a.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "AgricultorEntity.findByEmail", query = "SELECT a FROM AgricultorEntity a WHERE a.email = :email")})
public class AgricultorEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "identificacion")
    private Integer identificacion;
    @NotNull(message = "El nombre no puede estar vacío")
    @NotBlank(message = "El nombre no puede estar en blanco")
    @Basic(optional = false)
    @Column(name = "nombres")
    private String nombres;
    @Basic(optional = false)
    @NotNull(message = "El nombre no puede estar vacío")
    @NotBlank(message = "El nombre no puede estar en blanco")
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "telefono")
    private String telefono;
    @Basic(optional = false)
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Basic(optional = false)
    @Lob
    @NotNull(message = "La contraseña no puede estar vacía")
    @NotBlank(message = "La contraseña no puede estar en blanco")
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    @Email(message = "El email no tiene formato")
    private String email;

    private Boolean estado;
    @JoinColumn(name = "id_tipo_identificacion", referencedColumnName = "id_tipo")
    @ManyToOne(optional = false)
    private TipoIdentificacionEntity idTipoIdentificacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAgricultor")
    private Collection<FincaEntity> fincaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agricultor")
    private Collection<PasswordResetTokenEntity> passwordResetTokenCollection;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 16777215)
    @Column(name = "confirmation_token")
    private String confirmationToken;

    public AgricultorEntity() {
    }

    public AgricultorEntity(Integer identificacion) {
        this.identificacion = identificacion;
    }

    public AgricultorEntity(Integer identificacion, String nombres, String apellidos, Date fechaNacimiento, String password) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.password = password;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Collection<PasswordResetTokenEntity> getPasswordResetTokenCollection() {
        return passwordResetTokenCollection;
    }

    public void setPasswordResetTokenCollection(Collection<PasswordResetTokenEntity> passwordResetTokenCollection) {
        this.passwordResetTokenCollection = passwordResetTokenCollection;
    }

    public String getConfirmationToken() {
        return confirmationToken;
    }

    public void setConfirmationToken(String confirmationToken) {
        this.confirmationToken = confirmationToken;
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

    public TipoIdentificacionEntity getIdTipoIdentificacion() {
        return idTipoIdentificacion;
    }

    public void setIdTipoIdentificacion(TipoIdentificacionEntity idTipoIdentificacion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
    }

    public Collection<FincaEntity> fincaCollection() {
        return fincaCollection;
    }

    public void fincaCollection(Collection<FincaEntity> fincaCollection) {
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
        
        if (!(object instanceof AgricultorEntity)) {
            return false;
        }
        AgricultorEntity other = (AgricultorEntity) object;
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
                ", idTipoIdentificacion=" + idTipoIdentificacion +
                '}';
    }
}
