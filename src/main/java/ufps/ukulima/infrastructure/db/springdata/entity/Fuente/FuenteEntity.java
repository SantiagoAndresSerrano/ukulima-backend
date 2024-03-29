/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.infrastructure.db.springdata.entity.Fuente;

import ufps.ukulima.infrastructure.db.springdata.entity.FuenteRecomendacion.FuenteRecomendacionEntity;

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
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author santi
 */
@Entity
@Table(name = "fuente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fuente.findAll", query = "SELECT f FROM FuenteEntity f"),
    @NamedQuery(name = "Fuente.findById", query = "SELECT f FROM FuenteEntity f WHERE f.id = :id"),
    @NamedQuery(name = "Fuente.findByDescripcion", query = "SELECT f FROM FuenteEntity f WHERE f.descripcion = :descripcion")})
public class FuenteEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFuente")
    private Collection<FuenteRecomendacionEntity> fuenteRecomendacionCollection;

    public FuenteEntity() {
    }

    public FuenteEntity(Integer id) {
        this.id = id;
    }

    public FuenteEntity(Integer id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public Collection<FuenteRecomendacionEntity> getFuenteRecomendacionCollection() {
        return fuenteRecomendacionCollection;
    }

    public void setFuenteRecomendacionCollection(Collection<FuenteRecomendacionEntity> fuenteRecomendacionCollection) {
        this.fuenteRecomendacionCollection = fuenteRecomendacionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof FuenteEntity)) {
            return false;
        }
        FuenteEntity other = (FuenteEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.Fuente[ id=" + id + " ]";
    }
    
}
