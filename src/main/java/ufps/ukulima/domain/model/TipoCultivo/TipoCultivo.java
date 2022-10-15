/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.TipoCultivo;

import ufps.ukulima.domain.model.Variedad.Variedad;

import java.util.Collection;

/**
 *
 * @author santi
 */
public class TipoCultivo {

    private Integer id;
    private String descripcion;
    private Collection<Variedad> variedadCollection;

    public TipoCultivo() {
    }

    public TipoCultivo(Integer id) {
        this.id = id;
    }

    public TipoCultivo(Integer id, String descripcion) {
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

    public Collection<Variedad> variedadCollection() {
        return variedadCollection;
    }

    public void setVariedadCollection(Collection<Variedad> variedadCollection) {
        this.variedadCollection = variedadCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof TipoCultivo)) {
            return false;
        }
        TipoCultivo other = (TipoCultivo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.TipoCultivo[ id=" + id + " ]";
    }

}
