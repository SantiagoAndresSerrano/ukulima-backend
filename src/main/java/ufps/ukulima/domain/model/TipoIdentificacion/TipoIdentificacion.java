/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.TipoIdentificacion;

import ufps.ukulima.domain.model.Agricultor.Agricultor;

import java.util.Collection;

/**
 *
 * @author santi
 */
public class TipoIdentificacion {

    private Integer idTipo;
    private String nombre;
    private Collection<Agricultor> agricultorCollection;

    public TipoIdentificacion() {
    }

    public TipoIdentificacion(Integer idTipo) {
        this.idTipo = idTipo;
    }

    public TipoIdentificacion(Integer idTipo, String nombre) {
        this.idTipo = idTipo;
        this.nombre = nombre;
    }

    public Integer getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Agricultor> agricultorCollection() {
        return agricultorCollection;
    }

    public void setAgricultorCollection(Collection<Agricultor> agricultorCollection) {
        this.agricultorCollection = agricultorCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipo != null ? idTipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof TipoIdentificacion)) {
            return false;
        }
        TipoIdentificacion other = (TipoIdentificacion) object;
        if ((this.idTipo == null && other.idTipo != null)
                || (this.idTipo != null && !this.idTipo.equals(other.idTipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.TipoIdentificacion[ idTipo=" + idTipo + " ]";
    }

}
