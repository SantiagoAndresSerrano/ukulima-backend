/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.Corregimiento;

import ufps.ukulima.domain.model.Finca.Finca;
import ufps.ukulima.domain.model.Municipio.Municipio;

import java.util.Collection;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author santi
 */
public class Corregimiento  {

    private Integer idCorregimiento;
    private String nombre;
    private Municipio idMunicipio;
    private Collection<Finca> fincaCollection;

    public Corregimiento() {
    }

    public Corregimiento(Integer idCorregimiento) {
        this.idCorregimiento = idCorregimiento;
    }

    public Corregimiento(Integer idCorregimiento, String nombre) {
        this.idCorregimiento = idCorregimiento;
        this.nombre = nombre;
    }

    public Integer getIdCorregimiento() {
        return idCorregimiento;
    }

    public void setIdCorregimiento(Integer idCorregimiento) {
        this.idCorregimiento = idCorregimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Municipio getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Municipio idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public Collection<Finca> fincaCollection() {
        return fincaCollection;
    }

    public void fincaCollection(Collection<Finca> fincaCollection) {
        this.fincaCollection = fincaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCorregimiento != null ? idCorregimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof Corregimiento)) {
            return false;
        }
        Corregimiento other = (Corregimiento) object;
        if ((this.idCorregimiento == null && other.idCorregimiento != null) || (this.idCorregimiento != null && !this.idCorregimiento.equals(other.idCorregimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Corregimiento{" +
                "idCorregimiento=" + idCorregimiento +
                ", nombre='" + nombre + '\'' +
                ", idMunicipio=" + idMunicipio +
                ", fincaCollection=" + fincaCollection +
                '}';
    }
}
