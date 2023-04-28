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
    private AnalisisSueloEntity idAnalisisSuelo;
    private ElementoEntity idElemento;

    private AnalisisElementoInterpretacionEntity idAnalisisElementoInterpretacion;

    public AnalisisElemento(Integer id) {
        this.id = id;
    }

    public AnalisisElemento() {
    }

    public AnalisisElemento(Integer id, float valor, AnalisisSueloEntity idAnalisisSuelo, ElementoEntity idElemento, AnalisisElementoInterpretacionEntity idAnalisisElementoInterpretacion) {
        this.id = id;
        this.valor = valor;
        this.idAnalisisSuelo = idAnalisisSuelo;
        this.idElemento = idElemento;
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

    public AnalisisElementoInterpretacionEntity getIdAnalisisElementoInterpretacion() {
        return idAnalisisElementoInterpretacion;
    }

    public void setIdAnalisisElementoInterpretacion(AnalisisElementoInterpretacionEntity idAnalisisElementoInterpretacion) {
        this.idAnalisisElementoInterpretacion = idAnalisisElementoInterpretacion;
    }

    public AnalisisSueloEntity getIdAnalisisSuelo() {
        return idAnalisisSuelo;
    }

    public void setIdAnalisisSuelo(AnalisisSueloEntity idAnalisisSuelo) {
        this.idAnalisisSuelo = idAnalisisSuelo;
    }

    public ElementoEntity getIdElemento() {
        return idElemento;
    }

    public void setIdElemento(ElementoEntity idElemento) {
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