/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.Finca;

import ufps.ukulima.domain.model.Agricultor.Agricultor;
import ufps.ukulima.domain.model.Corregimiento.Corregimiento;
import ufps.ukulima.domain.model.Cultivo.Cultivo;
import ufps.ukulima.domain.model.Municipio.Municipio;
import ufps.ukulima.domain.model.Vereda.Vereda;

import java.util.Collection;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 *
 * @author santi
 */
public class Finca {

    private Integer idFinca;
    @NotNull(message = "El nombre no puede estar vacío")
    @NotBlank(message = "El nombre no puede estar en blanco")
    private String nombre;
    private int areaTotal;
    private int areaEnUso;
    private String geolocalizacion;
    @NotNull(message = "Debe tener asociado un agricultor")
    private Agricultor idAgricultor;
    private Corregimiento idCorregimiento;
    private Municipio idMunicipio;
    private Vereda idVereda;
    private Collection<Cultivo> cultivoCollection;

    public Finca() {
    }

    public Finca(Integer idFinca) {
        this.idFinca = idFinca;
    }

    public Finca(Integer idFinca, int areaTotal, int areaEnUso, String geolocalizacion) {
        this.idFinca = idFinca;
        this.areaTotal = areaTotal;
        this.areaEnUso = areaEnUso;
        this.geolocalizacion = geolocalizacion;
    }

    public Integer getIdFinca() {
        return idFinca;
    }

    public void setIdFinca(Integer idFinca) {
        this.idFinca = idFinca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(int areaTotal) {
        this.areaTotal = areaTotal;
    }

    public int getAreaEnUso() {
        return areaEnUso;
    }

    public void setAreaEnUso(int areaEnUso) {
        this.areaEnUso = areaEnUso;
    }

    public String getGeolocalizacion() {
        return geolocalizacion;
    }

    public void setGeolocalizacion(String geolocalizacion) {
        this.geolocalizacion = geolocalizacion;
    }

    public Agricultor getIdAgricultor() {
        return idAgricultor;
    }

    public void setIdAgricultor(Agricultor idAgricultor) {
        this.idAgricultor = idAgricultor;
    }

    public Corregimiento getIdCorregimiento() {
        return idCorregimiento;
    }

    public void setIdCorregimiento(Corregimiento idCorregimiento) {
        this.idCorregimiento = idCorregimiento;
    }

    public Municipio getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Municipio idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public Vereda getIdVereda() {
        return idVereda;
    }

    public void setIdVereda(Vereda idVereda) {
        this.idVereda = idVereda;
    }

    public Collection<Cultivo> cultivoCollection() {
        return cultivoCollection;
    }

    public void setCultivoCollection(Collection<Cultivo> cultivoCollection) {
        this.cultivoCollection = cultivoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFinca != null ? idFinca.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Finca)) {
            return false;
        }
        Finca other = (Finca) object;
        if ((this.idFinca == null && other.idFinca != null)
                || (this.idFinca != null && !this.idFinca.equals(other.idFinca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.Finca[ idFinca=" + idFinca + " ]";
    }

}
