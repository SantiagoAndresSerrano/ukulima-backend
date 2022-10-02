/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.FuenteRecomendacion;

import javax.validation.constraints.NotNull;

import ufps.ukulima.domain.model.Elemento.Elemento;
import ufps.ukulima.domain.model.Fuente.Fuente;
import ufps.ukulima.domain.model.Recomendacion.Recomendacion;

/**
 *
 * @author santi
 */
public class FuenteRecomendacion {

    private Integer id;
    @NotNull(message = "la cantidad no puede estar vacía")
    private float cantidad;
    @NotNull(message = "el elemento no puede estar vacía")
    private Elemento idElemento;
    @NotNull(message = "la fuente no puede estar vacía")
    private Fuente idFuente;
    @NotNull(message = "la recomendación no puede estar vacía")
    private Recomendacion idRecomendacion;

    public FuenteRecomendacion() {
    }

    public FuenteRecomendacion(Integer id) {
        this.id = id;
    }

    public FuenteRecomendacion(Integer id, float cantidad) {
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

    public Elemento getIdElemento() {
        return idElemento;
    }

    public void setIdElemento(Elemento idElemento) {
        this.idElemento = idElemento;
    }

    public Fuente getIdFuente() {
        return idFuente;
    }

    public void setIdFuente(Fuente idFuente) {
        this.idFuente = idFuente;
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

        if (!(object instanceof FuenteRecomendacion)) {
            return false;
        }
        FuenteRecomendacion other = (FuenteRecomendacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.FuenteRecomendacion[ id=" + id + " ]";
    }

}
