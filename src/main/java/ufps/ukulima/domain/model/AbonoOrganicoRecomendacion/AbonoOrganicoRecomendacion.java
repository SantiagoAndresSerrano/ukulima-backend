/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.AbonoOrganicoRecomendacion;

import ufps.ukulima.domain.model.AbonoOrganico.AbonoOrganico;
import ufps.ukulima.domain.model.Recomendacion.Recomendacion;

/**
 *
 * @author santi
 */
public class AbonoOrganicoRecomendacion  {

    private Integer id;
    private float cantidad;
    private AbonoOrganico idAbonoOrganico;
    private Recomendacion idRecomendacion;

    public AbonoOrganicoRecomendacion() {
    }

    public AbonoOrganicoRecomendacion(Integer id) {
        this.id = id;
    }

    public AbonoOrganicoRecomendacion(Integer id, float cantidad) {
        this.id = id;
        this.cantidad = cantidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public AbonoOrganico getIdAbonoOrganico() {
        return idAbonoOrganico;
    }

    public void setIdAbonoOrganico(AbonoOrganico idAbonoOrganico) {
        this.idAbonoOrganico = idAbonoOrganico;
    }

    public Recomendacion getIdRecomendacion() {
        return idRecomendacion;
    }

    public void setIdRecomendacion(Recomendacion idRecomendacion) {
        this.idRecomendacion = idRecomendacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof AbonoOrganicoRecomendacion)) {
            return false;
        }
        AbonoOrganicoRecomendacion other = (AbonoOrganicoRecomendacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.AbonoOrganicoRecomendacion[ id=" + id + " ]";
    }
    
}
