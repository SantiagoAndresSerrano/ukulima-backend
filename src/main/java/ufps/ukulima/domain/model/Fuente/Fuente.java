/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.Fuente;

import ufps.ukulima.domain.model.FuenteRecomendacion.FuenteRecomendacion;

import java.util.Collection;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author santi
 */
public class Fuente {

    private Integer id;
    @NotNull(message = "la descripcion no puede estar vacío")
    @NotBlank(message = "la descripcion no puede estar en blanco")
    private String descripcion;
    private Collection<FuenteRecomendacion> fuenteRecomendacionCollection;

    public Fuente() {
    }

    public Fuente(Integer id) {
        this.id = id;
    }

    public Fuente(Integer id, String descripcion) {
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

        if (!(object instanceof Fuente)) {
            return false;
        }
        Fuente other = (Fuente) object;
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
