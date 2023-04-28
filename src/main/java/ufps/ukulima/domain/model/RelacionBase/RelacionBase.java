package ufps.ukulima.domain.model.RelacionBase;

import ufps.ukulima.domain.model.Elemento.Elemento;
import ufps.ukulima.infrastructure.db.springdata.entity.Elemento.ElementoEntity;

import javax.persistence.*;

public class RelacionBase {
    private Integer id;
    private Elemento idElemento1;
    private Elemento idElemento2;
    private Elemento idElemento3;
    private Float valorMin;
    private Float valorMax;
    private String interpretacion;
    private String formula;

    public RelacionBase(Integer id) {
        this.id = id;
    }
    public RelacionBase() {
    }

    public RelacionBase(Integer id, Elemento idElemento1, Elemento idElemento2, Elemento idElemento3, Float valorMin, Float valorMax, String interpretacion, String formula) {
        this.id = id;
        this.idElemento1 = idElemento1;
        this.idElemento2 = idElemento2;
        this.idElemento3 = idElemento3;
        this.valorMin = valorMin;
        this.valorMax = valorMax;
        this.interpretacion = interpretacion;
        this.formula = formula;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Elemento getIdElemento1() {
        return idElemento1;
    }

    public void setIdElemento1(Elemento idElemento1) {
        this.idElemento1 = idElemento1;
    }

    public Elemento getIdElemento2() {
        return idElemento2;
    }

    public void setIdElemento2(Elemento idElemento2) {
        this.idElemento2 = idElemento2;
    }

    public Elemento getIdElemento3() {
        return idElemento3;
    }

    public void setIdElemento3(Elemento idElemento3) {
        this.idElemento3 = idElemento3;
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

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    @Override
    public String toString() {
        return "RelacionBase{" +
                "id=" + id +
                ", idElemento1=" + idElemento1 +
                ", idElemento2=" + idElemento2 +
                ", idElemento3=" + idElemento3 +
                ", valorMin=" + valorMin +
                ", valorMax=" + valorMax +
                ", interpretacion='" + interpretacion + '\'' +
                ", formula='" + formula + '\'' +
                '}';
    }
}
