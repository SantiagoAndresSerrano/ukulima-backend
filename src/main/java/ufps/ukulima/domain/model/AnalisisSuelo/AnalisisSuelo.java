/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.AnalisisSuelo;

import ufps.ukulima.domain.model.AnalisisElemento.AnalisisElemento;
import ufps.ukulima.domain.model.ClaseTextural.ClaseTextural;
import ufps.ukulima.domain.model.Cultivo.Cultivo;
import ufps.ukulima.domain.model.Densidad.Densidad;
import ufps.ukulima.domain.model.ProfundidadMuestra.ProfundidadMuestra;
import ufps.ukulima.domain.model.Recomendacion.Recomendacion;
import ufps.ukulima.infrastructure.db.springdata.entity.ClaseTextural.ClaseTexturalEntity;

import java.util.Collection;
import java.util.Date;

import javax.validation.constraints.NotNull;

/**
 *
 * @author santi
 */
public class AnalisisSuelo {

    private Integer idAnalisisSuelo;
    @NotNull(message = "Porcentaje de arena no puede ser vacío")
    private float porcentArena;
    @NotNull(message = "Porcentaje de limos no puede ser vacío")
    private float porcentLimos;
    @NotNull(message = "Porcentaje de arcilla no puede ser vacío")
    private float porcentArcilla;
    private Date fecha;
    private Collection<Recomendacion> recomendacionCollection;
    private Collection<AnalisisElemento> analisisElementoCollection;
    @NotNull(message = "Clase textural no puede ser vacío")
    private ClaseTextural idClaseTextural;
    @NotNull(message = "Cultivo no puede ser vacío")
    private Cultivo idCultivo;
    @NotNull(message = "Densidad no puede ser vacío")
    private Densidad idDensidad;
    @NotNull(message = "Profundidad de muestra no puede ser vacío")
    private ProfundidadMuestra idProfundidad;

    public AnalisisSuelo() {
    }

    public AnalisisSuelo(Integer idAnalisisSuelo) {
        this.idAnalisisSuelo = idAnalisisSuelo;
    }

    public AnalisisSuelo(Integer idAnalisisSuelo, float porcentArena, float porcentLimos, float porcentArcilla,
            Date fecha) {
        this.idAnalisisSuelo = idAnalisisSuelo;
        this.porcentArena = porcentArena;
        this.porcentLimos = porcentLimos;
        this.porcentArcilla = porcentArcilla;
        this.fecha = fecha;
    }

    public Integer getIdAnalisisSuelo() {
        return idAnalisisSuelo;
    }

    public void setIdAnalisisSuelo(Integer idAnalisisSuelo) {
        this.idAnalisisSuelo = idAnalisisSuelo;
    }

    public float getPorcentArena() {
        return porcentArena;
    }

    public void setPorcentArena(float porcentArena) {
        this.porcentArena = porcentArena;
    }

    public float getPorcentLimos() {
        return porcentLimos;
    }

    public void setPorcentLimos(float porcentLimos) {
        this.porcentLimos = porcentLimos;
    }

    public float getPorcentArcilla() {
        return porcentArcilla;
    }

    public void setPorcentArcilla(float porcentArcilla) {
        this.porcentArcilla = porcentArcilla;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Collection<Recomendacion> recomendacionCollection() {
        return recomendacionCollection;
    }

    public void setRecomendacionCollection(Collection<Recomendacion> recomendacionCollection) {
        this.recomendacionCollection = recomendacionCollection;
    }

    public Collection<AnalisisElemento> analisisElementoCollection() {
        return analisisElementoCollection;
    }

    public void setAnalisisElementoCollection(Collection<AnalisisElemento> analisisElementoCollection) {
        this.analisisElementoCollection = analisisElementoCollection;
    }

    public ClaseTextural getIdClaseTextural() {
        return idClaseTextural;
    }

    public void setIdClaseTextural(ClaseTextural idClaseTextural) {
        this.idClaseTextural = idClaseTextural;
    }

    public Cultivo getIdCultivo() {
        return idCultivo;
    }

    public void setIdCultivo(Cultivo idCultivo) {
        this.idCultivo = idCultivo;
    }

    public Densidad getIdDensidad() {
        return idDensidad;
    }

    public void setIdDensidad(Densidad idDensidad) {
        this.idDensidad = idDensidad;
    }

    public ProfundidadMuestra getIdProfundidad() {
        return idProfundidad;
    }

    public void setIdProfundidad(ProfundidadMuestra idProfundidad) {
        this.idProfundidad = idProfundidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAnalisisSuelo != null ? idAnalisisSuelo.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "AnalisisSuelo{" +
                "idAnalisisSuelo=" + idAnalisisSuelo +
                ", porcentArena=" + porcentArena +
                ", porcentLimos=" + porcentLimos +
                ", porcentArcilla=" + porcentArcilla +
                ", fecha=" + fecha +
                ", recomendacionCollection=" + recomendacionCollection +
                ", analisisElementoCollection=" + analisisElementoCollection +
                ", idClaseTextural=" + idClaseTextural +
                ", idCultivo=" + idCultivo +
                ", idDensidad=" + idDensidad +
                ", idProfundidad=" + idProfundidad +
                '}';
    }

}
