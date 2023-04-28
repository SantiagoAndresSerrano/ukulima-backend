package ufps.ukulima.domain.model.AnalisisSueloRelacionBase;


import ufps.ukulima.domain.model.AnalisisSuelo.AnalisisSuelo;
import ufps.ukulima.domain.model.RelacionBase.RelacionBase;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisSuelo.AnalisisSueloEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.RelacionBase.RelacionBaseEntity;

import javax.persistence.*;

public class AnalisisSueloRelacionBase {
    private Integer id;

    private RelacionBase idRelacionBase;

    private AnalisisSuelo idAnalisisSuelo;
    private float valor;

    public AnalisisSueloRelacionBase() {
    }

    public AnalisisSueloRelacionBase(Integer id) {
        this.id = id;
    }

    public AnalisisSueloRelacionBase(Integer id, RelacionBase idRelacionBase, AnalisisSuelo idAnalisisSuelo, float valor) {
        this.id = id;
        this.idRelacionBase = idRelacionBase;
        this.idAnalisisSuelo = idAnalisisSuelo;
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RelacionBase getIdRelacionBase() {
        return idRelacionBase;
    }

    public void setIdRelacionBase(RelacionBase idRelacionBase) {
        this.idRelacionBase = idRelacionBase;
    }

    public AnalisisSuelo getIdAnalisisSuelo() {
        return idAnalisisSuelo;
    }

    public void setIdAnalisisSuelo(AnalisisSuelo idAnalisisSuelo) {
        this.idAnalisisSuelo = idAnalisisSuelo;
    }

    @Override
    public String toString() {
        return "AnalisisSueloRelacionBase{" +
                "id=" + id +
                ", idRelacionBase=" + idRelacionBase +
                ", idAnalisisSuelo=" + idAnalisisSuelo +
                ", valor=" + valor +
                '}';
    }
}
