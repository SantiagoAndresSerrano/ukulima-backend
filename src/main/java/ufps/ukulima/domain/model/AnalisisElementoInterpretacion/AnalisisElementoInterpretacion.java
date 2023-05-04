package ufps.ukulima.domain.model.AnalisisElementoInterpretacion;

import ufps.ukulima.domain.model.Elemento.Elemento;
import ufps.ukulima.infrastructure.db.springdata.entity.Elemento.ElementoEntity;

public class AnalisisElementoInterpretacion {
    private Integer id;

    private Integer valorMin;

    private Integer valorMax;

    private String interpretacion;

    private Elemento idElemento;

    public AnalisisElementoInterpretacion(Integer id, Integer valorMin, Integer valorMax, String interpretacion,
                                          Elemento idElemento) {
        this.id = id;
        this.valorMin = valorMin;
        this.valorMax = valorMax;
        this.interpretacion = interpretacion;
        this.idElemento = idElemento;
    }

    public Elemento getIdElemento() {
        return idElemento;
    }

    public void setIdElemento(Elemento idElemento) {
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

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }


    }

