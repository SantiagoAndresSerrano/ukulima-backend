/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.ClaseTextural;
import ufps.ukulima.domain.model.AnalisisSuelo.AnalisisSuelo;

import java.util.Collection;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author santi
 */
public class ClaseTextural  {

    private Integer idClaseTextural;
    private String nombre;
    private String sigla;
    private Collection<AnalisisSuelo> analisisSueloCollection;

    public ClaseTextural() {
    }

    public ClaseTextural(Integer idClaseTextural) {
        this.idClaseTextural = idClaseTextural;
    }

    public ClaseTextural(Integer idClaseTextural, String nombre, String sigla) {
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

    @XmlTransient
    public Collection<AnalisisSuelo> getAnalisisSueloCollection() {
        return analisisSueloCollection;
    }

    public void setAnalisisSueloCollection(Collection<AnalisisSuelo> analisisSueloCollection) {
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
        
        if (!(object instanceof ClaseTextural)) {
            return false;
        }
        ClaseTextural other = (ClaseTextural) object;
        if ((this.idClaseTextural == null && other.idClaseTextural != null) || (this.idClaseTextural != null && !this.idClaseTextural.equals(other.idClaseTextural))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClaseTextural{" +
                "idClaseTextural=" + idClaseTextural +
                ", nombre='" + nombre + '\'' +
                ", sigla='" + sigla + '\'' +
                ", analisisSueloCollection=" + analisisSueloCollection +
                '}';
    }

}
