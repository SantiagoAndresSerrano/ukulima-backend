/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.Departamento;

import ufps.ukulima.domain.model.Municipio.Municipio;

import java.util.Collection;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author santi
 */
public class Departamento  {

    private Integer idDepto;
    private int nombre;
    private Collection<Municipio> municipioCollection;

    public Departamento() {
    }

    public Departamento(Integer idDepto) {
        this.idDepto = idDepto;
    }

    public Departamento(Integer idDepto, int nombre) {
        this.idDepto = idDepto;
        this.nombre = nombre;
    }

    public Integer getIdDepto() {
        return idDepto;
    }

    public void setIdDepto(Integer idDepto) {
        this.idDepto = idDepto;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public Collection<Municipio> getMunicipioCollection() {
        return municipioCollection;
    }

    public void setMunicipioCollection(Collection<Municipio> municipioCollection) {
        this.municipioCollection = municipioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDepto != null ? idDepto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof Departamento)) {
            return false;
        }
        Departamento other = (Departamento) object;
        if ((this.idDepto == null && other.idDepto != null) || (this.idDepto != null && !this.idDepto.equals(other.idDepto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.Departamento[ idDepto=" + idDepto + " ]";
    }
    
}
