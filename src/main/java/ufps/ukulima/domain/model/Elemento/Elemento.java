/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the ednativeitor.
 */
package ufps.ukulima.domain.model.Elemento;

import ufps.ukulima.domain.model.AnalisisElemento.AnalisisElemento;
import ufps.ukulima.domain.model.FuenteRecomendacion.FuenteRecomendacion;

import java.util.Collection;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author santi
 */
public class Elemento {

    private Integer id;
    @NotBlank(message = "La descripcion no puede estar en blanco")
    @NotNull(message = "La descripcion no puede estar vacía")
    private String nombre;
    @NotBlank(message = "La unidad no puede estar en blanco")
    @NotNull(message = "La unidad no puede estar vacía")
    private String unidad;
    private Collection<AnalisisElemento> analisisElementoCollection;
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

    public Collection<AnalisisElemento> analisisElementoCollection() {
        return analisisElementoCollection;
    }

    public void setAnalisisElementoCollection(Collection<AnalisisElemento> analisisElementoCollection) {
        this.analisisElementoCollection = analisisElementoCollection;
    }

    public Collection<FuenteRecomendacion> fuenteRecomendacionCollection() {
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
