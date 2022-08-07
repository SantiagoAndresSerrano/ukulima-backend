/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.infrastructure.db.springdata.entity.ClaseTextural;

import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisSuelo.AnalisisSueloEntity;

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
@Table(name = "clase_textural")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ClaseTextural.findAll", query = "SELECT c FROM ClaseTexturalEntity c"),
    @NamedQuery(name = "ClaseTextural.findByIdClaseTextural", query = "SELECT c FROM ClaseTexturalEntity c WHERE c.idClaseTextural = " +
            ":idClaseTextural"),
    @NamedQuery(name = "ClaseTextural.findByNombre", query = "SELECT c FROM ClaseTexturalEntity c WHERE c.nombre = " +
            ":nombre"),
    @NamedQuery(name = "ClaseTextural.findBySigla", query = "SELECT c FROM ClaseTexturalEntity c WHERE c.sigla = :sigla")})
public class ClaseTexturalEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_clase_textural")
    private Integer idClaseTextural;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "sigla")
    private String sigla;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idClaseTextural")
    private Collection<AnalisisSueloEntity> analisisSueloCollection;

    public ClaseTexturalEntity() {
    }

    public ClaseTexturalEntity(Integer idClaseTextural) {
        this.idClaseTextural = idClaseTextural;
    }

    public ClaseTexturalEntity(Integer idClaseTextural, String nombre, String sigla) {
        this.idClaseTextural = idClaseTextural;
        this.nombre = nombre;
        this.sigla = sigla;
    }

    public Integer getIdClaseTextural() {
        return idClaseTextural;
    }

    public void setIdClaseTextural(Integer idClaseTextural) {
        this.idClaseTextural = idClaseTextural;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Collection<AnalisisSueloEntity> getAnalisisSueloCollection() {
        return analisisSueloCollection;
    }

    public void setAnalisisSueloCollection(Collection<AnalisisSueloEntity> analisisSueloCollection) {
        this.analisisSueloCollection = analisisSueloCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idClaseTextural != null ? idClaseTextural.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof ClaseTexturalEntity)) {
            return false;
        }
        ClaseTexturalEntity other = (ClaseTexturalEntity) object;
        if ((this.idClaseTextural == null && other.idClaseTextural != null) || (this.idClaseTextural != null && !this.idClaseTextural.equals(other.idClaseTextural))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.ClaseTextural[ idClaseTextural=" + idClaseTextural + " ]";
    }
    
}
