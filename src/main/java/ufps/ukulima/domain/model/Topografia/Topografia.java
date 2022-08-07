/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.Topografia;

import ufps.ukulima.domain.model.Cultivo.Cultivo;

import java.util.Collection;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author santi
 */
public class Topografia  {

    private Integer id;
    private String descripcion;
    private Collection<Cultivo> cultivoCollection;

    public Topografia() {
    }

    public Topografia(Integer id) {
        this.id = id;
    }

    public Topografia(Integer id, String descripcion) {
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
    public Collection<Cultivo> getCultivoCollection() {
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
        
        if (!(object instanceof Topografia)) {
            return false;
        }
        Topografia other = (Topografia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.Topografia[ id=" + id + " ]";
    }
    
}
