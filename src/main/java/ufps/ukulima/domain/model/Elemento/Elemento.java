/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.Elemento;

import ufps.ukulima.domain.model.AnalisisElemento.AnalisisElemento;
import ufps.ukulima.domain.model.FuenteRecomendacion.FuenteRecomendacion;

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
@Table(name = "elemento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Elemento.findAll", query = "SELECT e FROM Elemento e"),
    @NamedQuery(name = "Elemento.findById", query = "SELECT e FROM Elemento e WHERE e.id = :id"),
    @NamedQuery(name = "Elemento.findByNombre", query = "SELECT e FROM Elemento e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Elemento.findByUnidad", query = "SELECT e FROM Elemento e WHERE e.unidad = :unidad")})
public class Elemento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "unidad")
    private String unidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idElemento")
    private Collection<AnalisisElemento> analisisElementoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idElemento")
    private Collection<FuenteRecomendacion> fuenteRecomendacionCollection;

    public Elemento() {
    }

    public Elemento(Integer id) {
        this.id = id;
    }

    public Elemento(Integer id, String nombre, String unidad) {
        this.id = id;
        this.nombre = nombre;
        this.unidad = unidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    @XmlTransient
    public Collection<AnalisisElemento> getAnalisisElementoCollection() {
        return analisisElementoCollection;
    }

    public void setAnalisisElementoCollection(Collection<AnalisisElemento> analisisElementoCollection) {
        this.analisisElementoCollection = analisisElementoCollection;
    }

    @XmlTransient
    public Collection<FuenteRecomendacion> getFuenteRecomendacionCollection() {
        return fuenteRecomendacionCollection;
    }

    public void setFuenteRecomendacionCollection(Collection<FuenteRecomendacion> fuenteRecomendacionCollection) {
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
        
        if (!(object instanceof Elemento)) {
            return false;
        }
        Elemento other = (Elemento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.Elemento[ id=" + id + " ]";
    }
    
}
