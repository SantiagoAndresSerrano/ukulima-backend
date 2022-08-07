/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.infrastructure.db.springdata.entity.DistanciaSiembra;

import ufps.ukulima.infrastructure.db.springdata.entity.Cultivo.CultivoEntity;

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
@Table(name = "distancia_siembra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DistanciaSiembra.findAll", query = "SELECT d FROM DistanciaSiembraEntity d"),
    @NamedQuery(name = "DistanciaSiembra.findById", query = "SELECT d FROM DistanciaSiembraEntity d WHERE d.id = :id"),
    @NamedQuery(name = "DistanciaSiembra.findByDescripcion", query = "SELECT d FROM DistanciaSiembraEntity d WHERE d.descripcion = :descripcion")})
public class DistanciaSiembraEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDistanciaSiembra")
    private Collection<CultivoEntity> cultivoCollection;

    public DistanciaSiembraEntity() {
    }

    public DistanciaSiembraEntity(Integer id) {
        this.id = id;
    }

    public DistanciaSiembraEntity(Integer id, String descripcion) {
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

    public Collection<CultivoEntity> getCultivoCollection() {
        return cultivoCollection;
    }

    public void setCultivoCollection(Collection<CultivoEntity> cultivoCollection) {
        this.cultivoCollection = cultivoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof DistanciaSiembraEntity)) {
            return false;
        }
        DistanciaSiembraEntity other = (DistanciaSiembraEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.DistanciaSiembra[ id=" + id + " ]";
    }
    
}
