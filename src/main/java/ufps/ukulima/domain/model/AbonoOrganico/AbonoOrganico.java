/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.AbonoOrganico;
import java.util.Collection;

import ufps.ukulima.domain.model.AbonoOrganicoRecomendacion.AbonoOrganicoRecomendacion;

/**
 *
 * @author santi
 */
public class AbonoOrganico  {

    
    private Integer id;
    private String descripcion;
    private Collection<AbonoOrganicoRecomendacion> abonoOrganicoRecomendacionCollection;
    public AbonoOrganico() {
    }

    public AbonoOrganico(Integer id) {
        this.id = id;
    }

    public AbonoOrganico(Integer id, String descripcion) {
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

    public Collection<AbonoOrganicoRecomendacion> aOrganicoRecomendacionCollection() {
        return abonoOrganicoRecomendacionCollection;
    }

    public void setAbonoOrganicoRecomendacionCollection(Collection<AbonoOrganicoRecomendacion> abonoOrganicoRecomendacionCollection) {
        this.abonoOrganicoRecomendacionCollection = abonoOrganicoRecomendacionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof AbonoOrganico)) {
            return false;
        }
        AbonoOrganico other = (AbonoOrganico) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.AbonoOrganico[ id=" + id + " ]";
    }
    
}
