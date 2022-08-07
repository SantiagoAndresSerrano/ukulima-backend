/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.Enmienda;

import ufps.ukulima.domain.model.Recomendacion.Recomendacion;

import java.util.Collection;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author santi
 */
public class Enmienda  {

    private Integer id;
    private String descripcion;
    private Collection<Recomendacion> recomendacionCollection;

    public Enmienda() {
    }

    public Enmienda(Integer id) {
        this.id = id;
    }

    public Enmienda(Integer id, String descripcion) {
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
    public Collection<Recomendacion> getRecomendacionCollection() {
        return recomendacionCollection;
    }

    public void setRecomendacionCollection(Collection<Recomendacion> recomendacionCollection) {
        this.recomendacionCollection = recomendacionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof Enmienda)) {
            return false;
        }
        Enmienda other = (Enmienda) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.Enmienda[ id=" + id + " ]";
    }
    
}
