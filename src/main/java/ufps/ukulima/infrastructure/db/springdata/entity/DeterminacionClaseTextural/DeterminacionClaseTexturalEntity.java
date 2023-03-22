package ufps.ukulima.infrastructure.db.springdata.entity.DeterminacionClaseTextural;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ufps.ukulima.infrastructure.db.springdata.entity.ClaseTextural.ClaseTexturalEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.ProfundidadMuestra.ProfundidadMuestraEntity;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author santi
 */
@Entity
@Table(name = "determinacion_clase_textural")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "DeterminacionClaseTexturalEntity.findAll", query = "SELECT d FROM DeterminacionClaseTexturalEntity d"),
        @NamedQuery(name = "DeterminacionClaseTexturalEntity.findById", query = "SELECT d FROM DeterminacionClaseTexturalEntity d WHERE d.id = :id"),
        @NamedQuery(name = "DeterminacionClaseTexturalEntity.findByValorMin", query = "SELECT d FROM DeterminacionClaseTexturalEntity d WHERE d.valorMin = :valorMin"),
        @NamedQuery(name = "DeterminacionClaseTexturalEntity.findByValorMax", query = "SELECT d FROM DeterminacionClaseTexturalEntity d WHERE d.valorMax = :valorMax"),
        @NamedQuery(name = "DeterminacionClaseTexturalEntity.findByContenido", query = "SELECT d FROM DeterminacionClaseTexturalEntity d WHERE d.contenido = :contenido"),
})

public class DeterminacionClaseTexturalEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "valor_min")
    private Float valorMin;
    @Basic(optional = false)
    @Column(name = "valor_max")
    private Float valorMax;

    @Basic(optional = false)
    @Column(name = "contenido")
    private String contenido;

    @JoinColumn(name = "id_clase_textural", referencedColumnName = "id_clase_textural")
    @ManyToOne(optional = false)
    private ClaseTexturalEntity idClaseTextural;

    public DeterminacionClaseTexturalEntity() {
    }

    public DeterminacionClaseTexturalEntity(Integer id) {
        this.id = id;
    }

    public DeterminacionClaseTexturalEntity(Integer id, Float valorMin, Float valorMax, String contenido, ClaseTexturalEntity idClaseTextural) {
        this.id = id;
        this.valorMin = valorMin;
        this.valorMax = valorMax;
        this.contenido = contenido;
        this.idClaseTextural = idClaseTextural;
    }

    public ClaseTexturalEntity getIdClaseTextural() {
        return idClaseTextural;
    }

    public void setIdClaseTextural(ClaseTexturalEntity idClaseTextural) {
        this.idClaseTextural = idClaseTextural;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
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


}
