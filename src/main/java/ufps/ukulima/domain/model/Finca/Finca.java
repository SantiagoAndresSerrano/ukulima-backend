/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.Finca;

import ufps.ukulima.domain.model.Cultivo.Cultivo;
import ufps.ukulima.domain.model.Vereda.Vereda;
import ufps.ukulima.infrastructure.db.springdata.entity.Agricultor.AgricultorEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Corregimiento.CorregimientoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Municipio.MunicipioEntity;

import java.util.Collection;

/**
 *
 * @author santi
 */
public class Finca {

    private Integer idFinca;
    private String nombre;
    private int areaTotal;
    private int areaEnUso;
    private String geolocalizacion;
    private AgricultorEntity idAgricultor;
    private CorregimientoEntity idCorregimiento;
    private MunicipioEntity idMunicipio;
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

    public AgricultorEntity getIdAgricultor() {
        return idAgricultor;
    }

    public void setIdAgricultor(AgricultorEntity idAgricultor) {
        this.idAgricultor = idAgricultor;
    }

    public CorregimientoEntity getIdCorregimiento() {
        return idCorregimiento;
    }

    public void setIdCorregimiento(CorregimientoEntity idCorregimiento) {
        this.idCorregimiento = idCorregimiento;
    }

    public MunicipioEntity getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(MunicipioEntity idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public Vereda getIdVereda() {
        return idVereda;
    }

    public void setIdVereda(Vereda idVereda) {
        this.idVereda = idVereda;
    }

    public Collection<Cultivo> getCultivoCollection() {
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
        if ((this.idFinca == null && other.idFinca != null) || (this.idFinca != null && !this.idFinca.equals(other.idFinca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.Finca[ idFinca=" + idFinca + " ]";
    }
    
}
