/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.Enmienda;

import ufps.ukulima.domain.model.Recomendacion.Recomendacion;

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
@Table(name = "enmienda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Enmienda.findAll", query = "SELECT e FROM Enmienda e"),
    @NamedQuery(name = "Enmienda.findById", query = "SELECT e FROM Enmienda e WHERE e.id = :id"),
    @NamedQuery(name = "Enmienda.findByDescripcion", query = "SELECT e FROM Enmienda e WHERE e.descripcion = :descripcion")})
public class Enmienda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEnmienda")
    private Collection<Recomendacion> recomendacionCollection;

    public Enmienda() {
    }

    public Enmienda(Integer id) {
        this.id = id;
    }

    public Enmienda(Integer id, String descripcion) {
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
    public Collection<Recomendacion> getRecomendacionCollection() {
        return recomendacionCollection;
    }

    public void setRecomendacionCollection(Collection<Recomendacion> recomendacionCollection) {
        this.recomendacionCollection = recomendacionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof Enmienda)) {
            return false;
        }
        Enmienda other = (Enmienda) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.Enmienda[ id=" + id + " ]";
    }
    
}
