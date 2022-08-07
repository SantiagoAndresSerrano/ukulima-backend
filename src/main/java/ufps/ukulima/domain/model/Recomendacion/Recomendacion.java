/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.Recomendacion;

import ufps.ukulima.domain.model.AbonoOrganicoRecomendacion.AbonoOrganicoRecomendacion;
import ufps.ukulima.domain.model.AnalisisSuelo.AnalisisSuelo;
import ufps.ukulima.domain.model.Enmienda.Enmienda;
import ufps.ukulima.domain.model.FuenteRecomendacion.FuenteRecomendacion;

import java.util.Collection;

/**
 *
 * @author santi
 */
public class Recomendacion  {

    private Integer id;
    private float cantidadEnmienda;
    private short preparacionSuelo;
    private AnalisisSuelo idAnalisisSuelo;
    private Enmienda idEnmienda;
    private Collection<AbonoOrganicoRecomendacion> abonoOrganicoRecomendacionCollection;
    private Collection<FuenteRecomendacion> fuenteRecomendacionCollection;

    public Recomendacion() {
    }

    public Recomendacion(Integer id) {
        this.id = id;
    }

    public Recomendacion(Integer id, float cantidadEnmienda, short preparacionSuelo) {
        this.id = id;
        this.cantidadEnmienda = cantidadEnmienda;
        this.preparacionSuelo = preparacionSuelo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getCantidadEnmienda() {
        return cantidadEnmienda;
    }

    public void setCantidadEnmienda(float cantidadEnmienda) {
        this.cantidadEnmienda = cantidadEnmienda;
    }

    public short getPreparacionSuelo() {
        return preparacionSuelo;
    }

    public void setPreparacionSuelo(short preparacionSuelo) {
        this.preparacionSuelo = preparacionSuelo;
    }

    public AnalisisSuelo getIdAnalisisSuelo() {
        return idAnalisisSuelo;
    }

    public void setIdAnalisisSuelo(AnalisisSuelo idAnalisisSuelo) {
        this.idAnalisisSuelo = idAnalisisSuelo;
    }

    public Enmienda getIdEnmienda() {
        return idEnmienda;
    }

    public void setIdEnmienda(Enmienda idEnmienda) {
        this.idEnmienda = idEnmienda;
    }

    public Collection<AbonoOrganicoRecomendacion> getAbonoOrganicoRecomendacionCollection() {
        return abonoOrganicoRecomendacionCollection;
    }

    public void setAbonoOrganicoRecomendacionCollection(Collection<AbonoOrganicoRecomendacion> abonoOrganicoRecomendacionCollection) {
        this.abonoOrganicoRecomendacionCollection = abonoOrganicoRecomendacionCollection;
    }

    public Collection<FuenteRecomendacion> getFuenteRecomendacionCollection() {
        return fuenteRecomendacionCollection;
    }

    public void setFuenteRecomendacionCollection(Collection<FuenteRecomendacion> fuenteRecomendacionCollection) {
        this.fuenteRecomendacionCollection = fuenteRecomendacionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof Recomendacion)) {
            return false;
        }
        Recomendacion other = (Recomendacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.Recomendacion[ id=" + id + " ]";
    }
    
}
