/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.AnalisisElemento;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ufps.ukulima.domain.model.AnalisisElementoInterpretacion.AnalisisElementoInterpretacion;
import ufps.ukulima.domain.model.AnalisisSuelo.AnalisisSuelo;
import ufps.ukulima.domain.model.Elemento.Elemento;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisElementoInterpretacion.AnalisisElementoInterpretacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisSuelo.AnalisisSueloEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Elemento.ElementoEntity;
/**
 *
 * @author santi
 */
public class AnalisisElemento{

    private Integer id;

    private float valor;
    private AnalisisSuelo idAnalisisSuelo;
    private Elemento idElemento;

    private AnalisisElementoInterpretacion idAnalisisElementoInterpretacion;

    public AnalisisElemento(Integer id) {
        this.id = id;
    }

    public AnalisisElemento() {
    }

    public AnalisisElemento(Integer id, float valor, AnalisisSuelo idAnalisisSuelo, Elemento idElemento, AnalisisElementoInterpretacion idAnalisisElementoInterpretacion) {
        this.id = id;
        this.valor = valor;
        this.idAnalisisSuelo = idAnalisisSuelo;
        this.idElemento = idElemento;
        this.idAnalisisElementoInterpretacion = idAnalisisElementoInterpretacion;
    }

    public AnalisisElementoInterpretacion getIdAnalisisElementoInterpretacion() {
        return idAnalisisElementoInterpretacion;
    }

    public void setIdAnalisisElementoInterpretacion(AnalisisElementoInterpretacion idAnalisisElementoInterpretacion) {
        this.idAnalisisElementoInterpretacion = idAnalisisElementoInterpretacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }



    public AnalisisSuelo getIdAnalisisSuelo() {
        return idAnalisisSuelo;
    }

    public void setIdAnalisisSuelo(AnalisisSuelo idAnalisisSuelo) {
        this.idAnalisisSuelo = idAnalisisSuelo;
    }

    public Elemento getIdElemento() {
        return idElemento;
    }

    public void setIdElemento(Elemento idElemento) {
        this.idElemento = idElemento;
    }



    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }


    @Override
    public String toString() {
        return "AnalisisElemento{" +
                "id=" + id +
                ", valor=" + valor +
                ", idAnalisisSuelo=" + idAnalisisSuelo +
                ", idElemento=" + idElemento +
                ", idAnalisisElementoInterpretacion=" + idAnalisisElementoInterpretacion +
                '}';
    }
}