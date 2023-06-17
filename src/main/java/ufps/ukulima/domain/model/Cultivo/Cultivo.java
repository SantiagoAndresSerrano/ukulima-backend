/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.Cultivo;

import ufps.ukulima.domain.EtapaFenologica.EtapaFenologica;
import ufps.ukulima.domain.model.AnalisisSuelo.AnalisisSuelo;
import ufps.ukulima.domain.model.DistanciaSiembra.DistanciaSiembra;
import ufps.ukulima.domain.model.Finca.Finca;
import ufps.ukulima.domain.model.Suelo.Suelo;
import ufps.ukulima.domain.model.Topografia.Topografia;
import ufps.ukulima.domain.model.Variedad.Variedad;

import java.util.Collection;
import javax.validation.constraints.NotNull;

/**
 *
 * @author santi
 */
public class Cultivo {

    private Integer idCultivo;
    private String descripcion;
    private int plantasPorHectarea;
    private int rendimiento;

    private Suelo idSuelo;
    private Collection<AnalisisSuelo> analisisSueloCollection;
    private DistanciaSiembra idDistanciaSiembra;
    private EtapaFenologica idEtapaFenologica;
    private Finca idFinca;
    private Topografia idTopografia;
    @NotNull(message = "La Variedad no puede estar vacío")
    private Variedad idVariedad;

    public Cultivo() {
    }

    public Cultivo(Integer idCultivo) {
        this.idCultivo = idCultivo;
    }

    public Cultivo(Integer idCultivo, String descripcion, int plantasPorHectarea) {
        this.idCultivo = idCultivo;
        this.descripcion = descripcion;
        this.plantasPorHectarea = plantasPorHectarea;
    }
    public int getRendimiento() {
        return rendimiento;
    }

    public Suelo getIdSuelo() {
        return idSuelo;
    }

    public void setIdSuelo(Suelo idSuelo) {
        this.idSuelo = idSuelo;
    }

    public void setRendimiento(int rendimiento) {
        this.rendimiento = rendimiento;
    }
    public Integer getIdCultivo() {
        return idCultivo;
    }

    public void setIdCultivo(Integer idCultivo) {
        this.idCultivo = idCultivo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPlantasPorHectarea() {
        return plantasPorHectarea;
    }

    public void setPlantasPorHectarea(int plantasPorHectarea) {
        this.plantasPorHectarea = plantasPorHectarea;
    }

    public Collection<AnalisisSuelo> analisisSueloCollection() {
        return analisisSueloCollection;
    }

    public void setAnalisisSueloCollection(Collection<AnalisisSuelo> analisisSueloCollection) {
        this.analisisSueloCollection = analisisSueloCollection;
    }

    public DistanciaSiembra getIdDistanciaSiembra() {
        return idDistanciaSiembra;
    }

    public void setIdDistanciaSiembra(DistanciaSiembra idDistanciaSiembra) {
        this.idDistanciaSiembra = idDistanciaSiembra;
    }

    public EtapaFenologica getIdEtapaFenologica() {
        return idEtapaFenologica;
    }

    public void setIdEtapaFenologica(EtapaFenologica idEtapaFenologica) {
        this.idEtapaFenologica = idEtapaFenologica;
    }

    public Finca getIdFinca() {
        return idFinca;
    }

    public void setIdFinca(Finca idFinca) {
        this.idFinca = idFinca;
    }

    public Topografia getIdTopografia() {
        return idTopografia;
    }

    public void setIdTopografia(Topografia idTopografia) {
        this.idTopografia = idTopografia;
    }

    public Variedad getIdVariedad() {
        return idVariedad;
    }

    public void setIdVariedad(Variedad idVariedad) {
        this.idVariedad = idVariedad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCultivo != null ? idCultivo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Cultivo)) {
            return false;
        }
        Cultivo other = (Cultivo) object;
        if ((this.idCultivo == null && other.idCultivo != null)
                || (this.idCultivo != null && !this.idCultivo.equals(other.idCultivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.Cultivo[ idCultivo=" + idCultivo + " ]";
    }

}
