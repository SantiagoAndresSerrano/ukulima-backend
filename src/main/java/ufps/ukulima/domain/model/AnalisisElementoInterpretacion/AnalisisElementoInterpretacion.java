package ufps.ukulima.domain.model.AnalisisElementoInterpretacion;

import ufps.ukulima.infrastructure.db.springdata.entity.Elemento.ElementoEntity;

public class AnalisisElementoInterpretacion {
    private Integer id;

    private Integer valorMin;

    private Integer valorMax;

    private Integer interpretacion;

    private ElementoEntity idElemento;

    public AnalisisElementoInterpretacion(Integer id, Integer valorMin, Integer valorMax, Integer interpretacion, ElementoEntity idElemento) {
        this.id = id;
        this.valorMin = valorMin;
        this.valorMax = valorMax;
        this.interpretacion = interpretacion;
        this.idElemento = idElemento;
    }

    public Integer getId() {
            return id;
        }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getValorMin() {
        return valorMin;
    }

    public void setValorMin(Integer valorMin) {
        this.valorMin = valorMin;
    }

    public Integer getValorMax() {
        return valorMax;
    }

    public void setValorMax(Integer valorMax) {
        this.valorMax = valorMax;
    }

    public Integer getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(Integer interpretacion) {
        this.interpretacion = interpretacion;
    }

    public ElementoEntity getIdElemento() {
        return idElemento;
    }

    public void setIdElemento(ElementoEntity idElemento) {
        this.idElemento = idElemento;
    }
    }

