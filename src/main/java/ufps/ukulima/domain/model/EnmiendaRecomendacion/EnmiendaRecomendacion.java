package ufps.ukulima.domain.model.EnmiendaRecomendacion;


import ufps.ukulima.domain.model.Enmienda.Enmienda;
import ufps.ukulima.domain.model.Recomendacion.Recomendacion;

public class EnmiendaRecomendacion {

    private int id;
    private Enmienda enmienda;
    private Recomendacion recomendacion;
    private Float valor;

    public EnmiendaRecomendacion() {
    }

    public EnmiendaRecomendacion(int id, Enmienda enmienda, Recomendacion recomendacion, Float valor) {
        this.id = id;
        this.enmienda = enmienda;
        this.recomendacion = recomendacion;
        this.valor = valor;
    }
    public EnmiendaRecomendacion(Enmienda enmienda, Recomendacion recomendacion, Float valor) {
        this.enmienda = enmienda;
        this.recomendacion = recomendacion;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Enmienda getEnmienda() {
        return enmienda;
    }

    public void setEnmienda(Enmienda enmienda) {
        this.enmienda = enmienda;
    }

    public Recomendacion getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(Recomendacion recomendacion) {
        this.recomendacion = recomendacion;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
}

