package ufps.ukulima.domain.model.DeterminacionClaseTextural;
import ufps.ukulima.domain.model.ClaseTextural.ClaseTextural;

import java.util.Objects;

public class DeterminacionClaseTextural {

    private Integer id;
    private Float valorMin;
    private Float valorMax;
    private String contenido;
    private ClaseTextural claseTextural;

    public DeterminacionClaseTextural() {}

    public DeterminacionClaseTextural(Integer id, Float valorMin, Float valorMax, ClaseTextural claseTextural,
                                      String contenido) {
        this.id = id;
        this.valorMin = valorMin;
        this.valorMax = valorMax;
        this.claseTextural = claseTextural;
        this.contenido = contenido;
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

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public ClaseTextural getClaseTextural() {
        return claseTextural;
    }

    public void setClaseTextural(ClaseTextural claseTextural) {
        this.claseTextural = claseTextural;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DeterminacionClaseTextural)) return false;
        DeterminacionClaseTextural that = (DeterminacionClaseTextural) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public String toString() {
        return "DeterminacionClaseTextural{" +
                "id=" + id +
                ", valorMin=" + valorMin +
                ", valorMax=" + valorMax +
                ", contenido='" + contenido + '\'' +
                '}';
    }
}
