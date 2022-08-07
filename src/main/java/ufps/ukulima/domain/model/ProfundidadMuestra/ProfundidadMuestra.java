/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.ProfundidadMuestra;

import ufps.ukulima.domain.model.AnalisisSuelo.AnalisisSuelo;

import java.util.Collection;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author santi
 */
public class ProfundidadMuestra  {

    private Integer idProfundidadMuestra;
    private int profundidad;
    private Collection<AnalisisSuelo> analisisSueloCollection;

    public ProfundidadMuestra() {
    }

    public ProfundidadMuestra(Integer idProfundidadMuestra) {
        this.idProfundidadMuestra = idProfundidadMuestra;
    }

    public ProfundidadMuestra(Integer idProfundidadMuestra, int profundidad) {
        this.idProfundidadMuestra = idProfundidadMuestra;
        this.profundidad = profundidad;
    }

    public Integer getIdProfundidadMuestra() {
        return idProfundidadMuestra;
    }

    public void setIdProfundidadMuestra(Integer idProfundidadMuestra) {
        this.idProfundidadMuestra = idProfundidadMuestra;
    }

    public int getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }

    @XmlTransient
    public Collection<AnalisisSuelo> getAnalisisSueloCollection() {
        return analisisSueloCollection;
    }

    public void setAnalisisSueloCollection(Collection<AnalisisSuelo> analisisSueloCollection) {
        this.analisisSueloCollection = analisisSueloCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProfundidadMuestra != null ? idProfundidadMuestra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof ProfundidadMuestra)) {
            return false;
        }
        ProfundidadMuestra other = (ProfundidadMuestra) object;
        if ((this.idProfundidadMuestra == null && other.idProfundidadMuestra != null) || (this.idProfundidadMuestra != null && !this.idProfundidadMuestra.equals(other.idProfundidadMuestra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.ProfundidadMuestra[ idProfundidadMuestra=" + idProfundidadMuestra + " ]";
    }
    
}
