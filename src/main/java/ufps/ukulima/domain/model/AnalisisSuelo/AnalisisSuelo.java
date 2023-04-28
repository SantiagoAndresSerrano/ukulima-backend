/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.AnalisisSuelo;

import ufps.ukulima.domain.model.AluminioIntercambiable.AluminioIntercambiable;
import ufps.ukulima.domain.model.AnalisisElemento.AnalisisElemento;
import ufps.ukulima.domain.model.AnalisisSueloRelacionBase.AnalisisSueloRelacionBase;
import ufps.ukulima.domain.model.ClaseTextural.ClaseTextural;
import ufps.ukulima.domain.model.ConductividadElectrica.ConductividadElectrica;
import ufps.ukulima.domain.model.Cultivo.Cultivo;
import ufps.ukulima.domain.model.Densidad.Densidad;
import ufps.ukulima.domain.model.GrupoTextural.GrupoTextural;
import ufps.ukulima.domain.model.IntercambioCationico.IntercambioCationico;
import ufps.ukulima.domain.model.MateriaOrganica.MateriaOrganica;
import ufps.ukulima.domain.model.PhSuelo.PhSuelo;
import ufps.ukulima.domain.model.ProfundidadMuestra.ProfundidadMuestra;
import ufps.ukulima.domain.model.Recomendacion.Recomendacion;
import ufps.ukulima.infrastructure.db.springdata.entity.AluminioIntercambiable.AluminioIntercambiableEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisSueloRelacionBases.AnalisisSueloRelacionBaseEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.ConductividadElectrica.ConductividadElectricaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.MateriaOrganica.MateriaOrganicaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.PhSuelo.PhSueloEntity;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    private Collection<AnalisisSueloRelacionBase> analisisSueloRelacionBaseEntities;

    private ClaseTextural idClaseTextural;
    @NotNull(message = "Cultivo no puede ser vacío")
    private Cultivo idCultivo;
    @NotNull(message = "Densidad no puede ser vacío")
    private Densidad idDensidad;
    @NotNull(message = "Profundidad de muestra no puede ser vacío")
    private ProfundidadMuestra idProfundidad;
    @NotNull(message = "ph Suelo no puede ser vacío")
    private float phSuelo;
    @NotNull(message = "aluminio Intercambiable no puede ser vacío")
    private float aluminioIntercambiable;
    private float conductividadElectrica;
    @NotNull(message = "materiaOrganica no puede ser vacío")
    private float materiaOrganica;
    private float intercambioCationico;

    private PhSuelo idPhSuelo;

    private GrupoTextural idGrupoTextural;

    private AluminioIntercambiable idAluminioIntercambiable;

    private ConductividadElectrica idConductividadElectrica;

    private MateriaOrganica idMateriaOrganica;

    private IntercambioCationico idIntercambioCationico;


    public AnalisisSuelo() {
    }

    public AnalisisSuelo(Integer idAnalisisSuelo) {
        this.idAnalisisSuelo = idAnalisisSuelo;
    }

    public AnalisisSuelo(Integer idAnalisisSuelo, float porcentArena,
                         float porcentLimos, float porcentArcilla, Date fecha,
                         ClaseTextural idClaseTextural, Cultivo idCultivo, Densidad idDensidad,
                         ProfundidadMuestra idProfundidad, float phSuelo, float aluminioIntercambiable,
                         float conductividadElectrica, float materiaOrganica, float intercambioCationico
                         ,PhSuelo idPhSuelo, AluminioIntercambiable idAluminioIntercambiable,
                         ConductividadElectrica idConductividadElectrica,
                         MateriaOrganica idMmateriaOrganica,
                         IntercambioCationico idIntercambioCationico,GrupoTextural idGrupoTextural) {

        this.idAnalisisSuelo = idAnalisisSuelo;
        this.porcentArena = porcentArena;
        this.porcentLimos = porcentLimos;
        this.porcentArcilla = porcentArcilla;
        this.fecha = fecha;
        this.idClaseTextural = idClaseTextural;
        this.idCultivo = idCultivo;
        this.idDensidad = idDensidad;
        this.idProfundidad = idProfundidad;
        this.phSuelo = phSuelo;
        this.aluminioIntercambiable = aluminioIntercambiable;
        this.conductividadElectrica = conductividadElectrica;
        this.materiaOrganica = materiaOrganica;
        this.intercambioCationico = intercambioCationico;
        this.idPhSuelo = idPhSuelo;
        this.idGrupoTextural=idGrupoTextural;
        this.idAluminioIntercambiable = idAluminioIntercambiable;
        this.idConductividadElectrica = idConductividadElectrica;
        this.idMateriaOrganica = idMmateriaOrganica;
        this.idIntercambioCationico = idIntercambioCationico;
    }

    public Collection<AnalisisSueloRelacionBase> getAnalisisSueloRelacionBaseEntities() {
        return analisisSueloRelacionBaseEntities;
    }

    public void setAnalisisSueloRelacionBaseEntities(Collection<AnalisisSueloRelacionBase> analisisSueloRelacionBaseEntities) {
        this.analisisSueloRelacionBaseEntities = analisisSueloRelacionBaseEntities;
    }

    public float getPhSuelo() {
        return phSuelo;
    }

    public void setPhSuelo(float phSuelo) {
        this.phSuelo = phSuelo;
    }

    public float getAluminioIntercambiable() {
        return aluminioIntercambiable;
    }

    public void setAluminioIntercambiable(float aluminioIntercambiable) {
        this.aluminioIntercambiable = aluminioIntercambiable;
    }

    public PhSuelo getIdPhSuelo() {
        return idPhSuelo;
    }

    public void setIdPhSuelo(PhSuelo idPhSuelo) {
        this.idPhSuelo = idPhSuelo;
    }

    public AluminioIntercambiable getIdAluminioIntercambiable() {
        return idAluminioIntercambiable;
    }

    public void setIdAluminioIntercambiable(AluminioIntercambiable idAluminioIntercambiable) {
        this.idAluminioIntercambiable = idAluminioIntercambiable;
    }

    public ConductividadElectrica getIdConductividadElectrica() {
        return idConductividadElectrica;
    }

    public void setIdConductividadElectrica(ConductividadElectrica idConductividadElectrica) {
        this.idConductividadElectrica = idConductividadElectrica;
    }

    public MateriaOrganica getIdMateriaOrganica() {
        return idMateriaOrganica;
    }

    public void setIdMateriaOrganica(MateriaOrganica idMateriaOrganica) {
        this.idMateriaOrganica = idMateriaOrganica;
    }

    public IntercambioCationico getIdIntercambioCationico() {
        return idIntercambioCationico;
    }

    public void setIdIntercambioCationico(IntercambioCationico idIntercambioCationico) {
        this.idIntercambioCationico = idIntercambioCationico;
    }

    public float getConductividadElectrica() {
        return conductividadElectrica;
    }

    public void setConductividadElectrica(float conductividadElectrica) {
        this.conductividadElectrica = conductividadElectrica;
    }

    public float getMateriaOrganica() {
        return materiaOrganica;
    }

    public void setMateriaOrganica(float materiaOrganica) {
        this.materiaOrganica = materiaOrganica;
    }

    public float getIntercambioCationico() {
        return intercambioCationico;
    }

    public void setIntercambioCationico(float intercambioCationico) {
        this.intercambioCationico = intercambioCationico;
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

    public Collection<AnalisisElemento> getAnalisisElementoCollection() {
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

    public GrupoTextural getGrupoTextural() {
        return idGrupoTextural;
    }

    public GrupoTextural getIdGrupoTextural() {
        return idGrupoTextural;
    }

    public void setIdGrupoTextural(GrupoTextural idGrupoTextural) {
        this.idGrupoTextural = idGrupoTextural;
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
                ", idClaseTextural=" + idClaseTextural +
                ", idCultivo=" + idCultivo +
                ", idDensidad=" + idDensidad +
                ", idProfundidad=" + idProfundidad +
                ", phSuelo=" + phSuelo +
                ", aluminioIntercambiable=" + aluminioIntercambiable +
                ", conductividadElectrica=" + conductividadElectrica +
                ", materiaOrganica=" + materiaOrganica +
                ", intercambioCationico=" + intercambioCationico +
                ", idPhSuelo=" + idPhSuelo +
                ", idAluminioIntercambiable=" + idAluminioIntercambiable +
                ", idConductividadElectrica=" + idConductividadElectrica +
                ", idMateriaOrganica=" + idMateriaOrganica +
                ", idIntercambioCationico=" + idIntercambioCationico +
                '}';
    }
}
