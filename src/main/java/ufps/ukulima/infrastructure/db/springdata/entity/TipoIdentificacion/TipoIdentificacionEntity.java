/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.infrastructure.db.springdata.entity.TipoIdentificacion;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ufps.ukulima.infrastructure.db.springdata.entity.Agricultor.AgricultorEntity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author santi
 */
@Entity
@Table(name = "tipo_identificacion")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "TipoIdentificacion.findAll", query = "SELECT t FROM TipoIdentificacionEntity t"),
        @NamedQuery(name = "TipoIdentificacion.findByIdTipo", query = "SELECT t FROM TipoIdentificacionEntity t WHERE t.idTipo = :idTipo"),
        @NamedQuery(name = "TipoIdentificacion.findByNombre", query = "SELECT t FROM TipoIdentificacionEntity t WHERE t.nombre = :nombre")})
public class TipoIdentificacionEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo")
    private Integer idTipo;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoIdentificacion")
    private Collection<AgricultorEntity> agricultorCollection;

    public TipoIdentificacionEntity() {
    }

    public TipoIdentificacionEntity(Integer idTipo) {
        this.idTipo = idTipo;
    }

    public TipoIdentificacionEntity(Integer idTipo, String nombre) {
        this.idTipo = idTipo;
        this.nombre = nombre;
    }

    public Integer getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<AgricultorEntity> getAgricultorCollection() {
        return agricultorCollection;
    }

    public void setAgricultorCollection(Collection<AgricultorEntity> agricultorCollection) {
        this.agricultorCollection = agricultorCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipo != null ? idTipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof TipoIdentificacionEntity)) {
            return false;
        }
        TipoIdentificacionEntity other = (TipoIdentificacionEntity) object;
        if ((this.idTipo == null && other.idTipo != null) || (this.idTipo != null && !this.idTipo.equals(other.idTipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.TipoIdentificacion[ idTipo=" + idTipo + " ]";
    }

}