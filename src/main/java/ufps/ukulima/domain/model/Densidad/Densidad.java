/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.Densidad;

import ufps.ukulima.domain.model.AnalisisSuelo.AnalisisSuelo;

import java.util.Collection;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author santi
 */
public class Densidad {

    private Integer idDensidad;
    private float valor;
    private Collection<AnalisisSuelo> analisisSueloCollection;

    public Densidad() {
    }

    public Densidad(Integer idDensidad) {
        this.idDensidad = idDensidad;
    }

    public Densidad(Integer idDensidad, float valor) {
        this.idDensidad = idDensidad;
        this.valor = valor;
    }

    public Integer getIdDensidad() {
        return idDensidad;
    }

    public void setIdDensidad(Integer idDensidad) {
        this.idDensidad = idDensidad;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Collection<AnalisisSuelo> analisisSueloCollection() {
        return analisisSueloCollection;
    }

    public void setAnalisisSueloCollection(Collection<AnalisisSuelo> analisisSueloCollection) {
        this.analisisSueloCollection = analisisSueloCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDensidad != null ? idDensidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Densidad)) {
            return false;
        }
        Densidad other = (Densidad) object;
        if ((this.idDensidad == null && other.idDensidad != null)
                || (this.idDensidad != null && !this.idDensidad.equals(other.idDensidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.Densidad[ idDensidad=" + idDensidad + " ]";
    }

}
