package ufps.ukulima.domain.model.AbonoQuimicoRecomendacion;

import ufps.ukulima.domain.model.Elemento.Elemento;
import ufps.ukulima.domain.model.Recomendacion.Recomendacion;

public class AbonoQuimicoRecomendacion {

    private Integer id;
    private Recomendacion recomendacion;
    private Elemento elemento;
    private Float disponibilidad;
    private Float eficiencia;
    private Float dosis;

    public AbonoQuimicoRecomendacion() {
    }

    public AbonoQuimicoRecomendacion(Integer id, Recomendacion recomendacion, Elemento elemento, Float disponibilidad, Float eficiencia) {
        this.id = id;
        this.recomendacion = recomendacion;
        this.elemento = elemento;
        this.disponibilidad = disponibilidad;
        this.eficiencia = eficiencia;
    }

    public Float getDosis() {
        return dosis;
    }

    public void setDosis(Float dosis) {
        this.dosis = dosis;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Recomendacion getRecomendacion() {
        return recomendacion;
    }

    public Elemento getElemento() {
        return elemento;
    }

    public void setElemento(Elemento elemento) {
        this.elemento = elemento;
    }

    public Float getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Float disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Float getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(Float eficiencia) {
        this.eficiencia = eficiencia;
    }
    // Constructor, getters, and setters
}
