package ufps.ukulima.domain.model.AluminioIntercambiable;


import ufps.ukulima.domain.model.AnalisisSuelo.AnalisisSuelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;

public class AluminioIntercambiable implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private Float valorMin;
    private Float valorMax;
    private String interpretacion;
    private Collection<AnalisisSuelo> analisisSueloCollection;

    public AluminioIntercambiable() {}

    public AluminioIntercambiable(Integer id, Float valorMin, Float valorMax, String interpretacion) {
        this.id = id;
        this.valorMin = valorMin;
        this.valorMax = valorMax;
        this.interpretacion = interpretacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getValorMin() {
        return valorMin;
    }

    public void setValorMin(Float valorMin) {
        this.valorMin = valorMin;
    }

    public Float getValorMax() {
        return valorMax;
    }

    public void setValorMax(Float valorMax) {
        this.valorMax = valorMax;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public Collection<AnalisisSuelo> analisisSueloCollection() {
        return analisisSueloCollection;
    }

    public void setAnalisisSueloCollection(Collection<AnalisisSuelo> analisisSueloCollection) {
        this.analisisSueloCollection = analisisSueloCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "AluminioIntercambiable{" +
                "id=" + id +
                ", valorMin=" + valorMin +
                ", valorMax=" + valorMax +
                ", interpretacion='" + interpretacion + '\'' +
                ", analisisSueloCollection=" + analisisSueloCollection +
                '}';
    }
}

