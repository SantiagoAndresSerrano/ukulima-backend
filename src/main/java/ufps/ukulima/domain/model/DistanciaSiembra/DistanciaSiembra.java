/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.DistanciaSiembra;

import ufps.ukulima.domain.model.Cultivo.Cultivo;

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
@Table(name = "distancia_siembra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DistanciaSiembra.findAll", query = "SELECT d FROM DistanciaSiembra d"),
    @NamedQuery(name = "DistanciaSiembra.findById", query = "SELECT d FROM DistanciaSiembra d WHERE d.id = :id"),
    @NamedQuery(name = "DistanciaSiembra.findByDescripcion", query = "SELECT d FROM DistanciaSiembra d WHERE d.descripcion = :descripcion")})
public class DistanciaSiembra implements Serializable {

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
    private Collection<Cultivo> cultivoCollection;

    public DistanciaSiembra() {
    }

    public DistanciaSiembra(Integer id) {
        this.id = id;
    }

    public DistanciaSiembra(Integer id, String descripcion) {
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
    public Collection<Cultivo> getCultivoCollection() {
        return cultivoCollection;
    }

    public void setCultivoCollection(Collection<Cultivo> cultivoCollection) {
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
        
        if (!(object instanceof DistanciaSiembra)) {
            return false;
        }
        DistanciaSiembra other = (DistanciaSiembra) object;
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
