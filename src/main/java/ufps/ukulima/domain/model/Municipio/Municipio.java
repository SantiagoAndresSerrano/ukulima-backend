/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.Municipio;

import ufps.ukulima.domain.model.Corregimiento.Corregimiento;
import ufps.ukulima.domain.model.Departamento.Departamento;
import ufps.ukulima.domain.model.Finca.Finca;

import java.util.Collection;

/**
 *
 * @author santi
 */
public class Municipio  {

    private Integer idMunicipio;
    private Departamento idDepartamento;
    private Collection<Corregimiento> corregimientoCollection;
    private Collection<Finca> fincaCollection;

    public Municipio() {
    }

    public Municipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public Integer getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public Departamento getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Departamento idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public Collection<Corregimiento> getCorregimientoCollection() {
        return corregimientoCollection;
    }

    public void setCorregimientoCollection(Collection<Corregimiento> corregimientoCollection) {
        this.corregimientoCollection = corregimientoCollection;
    }

    public Collection<Finca> getFincaCollection() {
        return fincaCollection;
    }

    public void setFincaCollection(Collection<Finca> fincaCollection) {
        this.fincaCollection = fincaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMunicipio != null ? idMunicipio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof Municipio)) {
            return false;
        }
        Municipio other = (Municipio) object;
        if ((this.idMunicipio == null && other.idMunicipio != null) || (this.idMunicipio != null && !this.idMunicipio.equals(other.idMunicipio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.Municipio[ idMunicipio=" + idMunicipio + " ]";
    }
    
}
