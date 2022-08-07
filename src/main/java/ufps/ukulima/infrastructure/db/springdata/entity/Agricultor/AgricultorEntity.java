/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.infrastructure.db.springdata.entity.Agricultor;

import ufps.ukulima.infrastructure.db.springdata.entity.Finca.FincaEntity;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author santi
 */
@Entity
@Table(name = "agricultor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Agricultor.findAll", query = "SELECT a FROM AgricultorEntity a"),
    @NamedQuery(name = "Agricultor.findByIdentifiacion", query = "SELECT a FROM AgricultorEntity a WHERE a.identifiacion = :identifiacion"),
    @NamedQuery(name = "Agricultor.findByNombres", query = "SELECT a FROM AgricultorEntity a WHERE a.nombres = :nombres"),
    @NamedQuery(name = "Agricultor.findByApellidos", query = "SELECT a FROM AgricultorEntity a WHERE a.apellidos = :apellidos"),
    @NamedQuery(name = "Agricultor.findByTelefono", query = "SELECT a FROM AgricultorEntity a WHERE a.telefono = :telefono"),
    @NamedQuery(name = "Agricultor.findByFechaNacimiento", query = "SELECT a FROM AgricultorEntity a WHERE a.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Agricultor.findByEmail", query = "SELECT a FROM AgricultorEntity a WHERE a.email = :email")})
public class AgricultorEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "identifiacion")
    private Integer identifiacion;
    @Basic(optional = false)
    @Column(name = "nombres")
    private String nombres;
    @Basic(optional = false)
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
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    @JoinColumn(name = "id_tipo_identificacion", referencedColumnName = "id_tipo")
    @ManyToOne(optional = false)
    private TipoIdentificacionEntity idTipoIdentificacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAgricultor")
    private Collection<FincaEntity> fincaCollection;

    public AgricultorEntity() {
    }

    public AgricultorEntity(Integer identifiacion) {
        this.identifiacion = identifiacion;
    }

    public AgricultorEntity(Integer identifiacion, String nombres, String apellidos, Date fechaNacimiento, String password) {
        this.identifiacion = identifiacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.password = password;
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

    public TipoIdentificacionEntity getIdTipoIdentificacion() {
        return idTipoIdentificacion;
    }

    public void setIdTipoIdentificacion(TipoIdentificacionEntity idTipoIdentificacion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
    }

    @XmlTransient
    public Collection<FincaEntity> getFincaCollection() {
        return fincaCollection;
    }

    public void setFincaCollection(Collection<FincaEntity> fincaCollection) {
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
        
        if (!(object instanceof AgricultorEntity)) {
            return false;
        }
        AgricultorEntity other = (AgricultorEntity) object;
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
