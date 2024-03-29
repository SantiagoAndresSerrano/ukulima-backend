/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.Recomendacion;

import ufps.ukulima.domain.model.AbonoOrganicoRecomendacion.AbonoOrganicoRecomendacion;
import ufps.ukulima.domain.model.AbonoQuimicoRecomendacion.AbonoQuimicoRecomendacion;
import ufps.ukulima.domain.model.AnalisisSuelo.AnalisisSuelo;
import ufps.ukulima.domain.model.EnmiendaRecomendacion.EnmiendaRecomendacion;
import ufps.ukulima.domain.model.FuenteRecomendacion.FuenteRecomendacion;
import ufps.ukulima.domain.model.Enmienda.Enmienda;
import ufps.ukulima.infrastructure.db.springdata.entity.AbonoQuimicoRecomendacion.AbonoQuimicoRecomendacionEntity;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

/**
 *
 * @author santi
 */
public class Recomendacion {

    private Integer id;
    private float cantidadEnmienda;
    private float materiaOrganica;

    private short preparacionSuelo;

    private String labranza;

    private AnalisisSuelo idAnalisisSuelo;
    private Collection<AbonoOrganicoRecomendacion> abonoOrganicoRecomendacionCollection;
    private Collection<FuenteRecomendacion> fuenteRecomendacionCollection;
    private Collection<EnmiendaRecomendacion> enmiendaRecomendacionEntityCollection;

    private Collection<AbonoQuimicoRecomendacion> abonoQuimicoRecomendacionEntities;
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

    public Recomendacion(Integer id, float cantidadEnmienda, short preparacionSuelo, AnalisisSuelo idAnalisisSuelo) {
        this.id = id;
        this.cantidadEnmienda = cantidadEnmienda;
        this.preparacionSuelo = preparacionSuelo;
        this.idAnalisisSuelo = idAnalisisSuelo;
    }

    public Collection<AbonoQuimicoRecomendacion> getAbonoQuimicoRecomendacionEntities() {
        return abonoQuimicoRecomendacionEntities;
    }
    public float getMateriaOrganica() {
        return materiaOrganica;
    }

    public void setMateriaOrganica(float materiaOrganica) {
        this.materiaOrganica = materiaOrganica;
    }
    public void setAbonoQuimicoRecomendacionEntities(Collection<AbonoQuimicoRecomendacion> abonoQuimicoRecomendacionEntities) {
        this.abonoQuimicoRecomendacionEntities = abonoQuimicoRecomendacionEntities;
    }

    public String getLabranza() {
        return labranza;
    }

    public void setLabranza(String labranza) {
        this.labranza = labranza;
    }

    public Collection<EnmiendaRecomendacion> getEnmiendaRecomendacionEntityCollection() {
        return enmiendaRecomendacionEntityCollection;
    }

    public void setEnmiendaRecomendacionEntityCollection(Collection<EnmiendaRecomendacion> enmiendaRecomendacionEntityCollection) {
        this.enmiendaRecomendacionEntityCollection = enmiendaRecomendacionEntityCollection;
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

    public AnalisisSuelo analisisSuelo() {
        return idAnalisisSuelo;
    }

    public void setIdAnalisisSuelo(AnalisisSuelo idAnalisisSuelo) {
        this.idAnalisisSuelo = idAnalisisSuelo;
    }

    public Collection<AbonoOrganicoRecomendacion> getAbonoOrganicoRecomendacionCollection() {
        return abonoOrganicoRecomendacionCollection;
    }

    public void setAbonoOrganicoRecomendacionCollection(
            Collection<AbonoOrganicoRecomendacion> abonoOrganicoRecomendacionCollection) {
        this.abonoOrganicoRecomendacionCollection = abonoOrganicoRecomendacionCollection;
    }

    public Collection<FuenteRecomendacion> fuenteRecomendacionCollection() {
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
