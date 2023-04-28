/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.infrastructure.db.springdata.entity.AnalisisElemento;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisElementoInterpretacion.AnalisisElementoInterpretacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisSuelo.AnalisisSueloEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Elemento.ElementoEntity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author santi
 */
@Entity
@Table(name = "analisis_elemento")
@XmlRootElement
public class AnalisisElementosEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    @Basic(optional = false)
    @Column(name = "valor")
    private float valor;
    @JoinColumn(name = "id_analisis_suelo", referencedColumnName = "id_analisis_suelo")
    @ManyToOne(optional = false)
    private AnalisisSueloEntity idAnalisisSuelo;
    @JoinColumn(name = "id_elemento", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private ElementoEntity idElemento;

    @JoinColumn(name = "id_analisis_elemento_interpretacion", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private AnalisisElementoInterpretacionEntity idAnalisisElementoInterpretacion;

    public AnalisisElementosEntity() {
    }

    public AnalisisElementosEntity(Integer id) {
        this.id = id;
    }

    public AnalisisElementosEntity(Integer id, float valor, AnalisisSueloEntity idAnalisisSuelo,
                                   ElementoEntity idElemento,
                                   AnalisisElementoInterpretacionEntity idAnalisisElementoInterpretacion) {
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

    public AnalisisSueloEntity analisisSuelo() {
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
    public boolean equals(Object object) {

        if (!(object instanceof AnalisisElementosEntity)) {
            return false;
        }
        AnalisisElementosEntity other = (AnalisisElementosEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.AnalisisElemento[ id=" + id + " ]";
    }

}