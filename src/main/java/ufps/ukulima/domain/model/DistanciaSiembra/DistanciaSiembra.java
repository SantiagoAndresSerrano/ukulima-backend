/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.DistanciaSiembra;

import ufps.ukulima.domain.model.Cultivo.Cultivo;

import java.util.Collection;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author santi
 */
public class DistanciaSiembra {

    private Integer id;
    @NotBlank(message = "La descripcion no puede estar en blanco")
    @NotNull(message = "La descripcion no puede estar vacía")
    private String descripcion;
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

    public Collection<Cultivo> cultivoCollection() {
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
