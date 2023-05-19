
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.infrastructure.db.springdata.entity.Elemento;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisElemento.AnalisisElementosEntity;
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

/**
 *
 * @author santi
 */
@Entity
@Table(name = "elemento")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "Elemento.findAll", query = "SELECT e FROM ElementoEntity e"),
        @NamedQuery(name = "Elemento.findById", query = "SELECT e FROM ElementoEntity e WHERE e.id = :id"),
        @NamedQuery(name = "Elemento.findByNombre", query = "SELECT e FROM ElementoEntity e WHERE e.nombre = :nombre"),
        @NamedQuery(name = "Elemento.findByUnidad", query = "SELECT e FROM ElementoEntity e WHERE e.unidad = :unidad") })
public class ElementoEntity implements Serializable {

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
    private Collection<AnalisisElementosEntity> analisisElementoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idElemento")
    private Collection<FuenteRecomendacionEntity> fuenteRecomendacionCollection;

    public ElementoEntity() {
    }

    public ElementoEntity(Integer id) {
        this.id = id;
    }

    public ElementoEntity(Integer id, String nombre, String unidad) {
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

    public Collection<AnalisisElementosEntity> analisisElementoCollection() {
        return analisisElementoCollection;
    }

    public void setAnalisisElementoCollection(Collection<AnalisisElementosEntity> analisisElementoCollection) {
        this.analisisElementoCollection = analisisElementoCollection;
    }

    public Collection<FuenteRecomendacionEntity> getFuenteRecomendacionCollection() {
        return fuenteRecomendacionCollection;
    }

    public void setFuenteRecomendacionCollection(Collection<FuenteRecomendacionEntity>
                                                         fuenteRecomendacionCollection) {
        this.fuenteRecomendacionCollection = fuenteRecomendacionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "ElementoEntity{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", unidad='" + unidad + '\'' +
                ", analisisElementoCollection=" + analisisElementoCollection +
                ", fuenteRecomendacionCollection=" + fuenteRecomendacionCollection +
                '}';
    }
}