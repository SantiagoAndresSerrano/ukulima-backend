package ufps.ukulima.infrastructure.db.springdata.entity.AluminioIntercambiable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisSuelo.AnalisisSueloEntity;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author santi
 */
@Entity
@Table(name = "aluminio_intercambiable")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "AluminioIntercambiableEntity.findAll", query = "SELECT a FROM AluminioIntercambiableEntity a"),
        @NamedQuery(name = "AluminioIntercambiableEntity.findById", query = "SELECT a FROM AluminioIntercambiableEntity a WHERE a.id = :id"),
        @NamedQuery(name = "AluminioIntercambiableEntity.findByValorMin", query = "SELECT a FROM AluminioIntercambiableEntity a WHERE a.valorMin = :valorMin"),
        @NamedQuery(name = "AluminioIntercambiableEntity.findByValorMax", query = "SELECT a FROM AluminioIntercambiableEntity a WHERE a.valorMax = :valorMax"),
        @NamedQuery(name = "AluminioIntercambiableEntity.findByInterpretacion", query = "SELECT a FROM AluminioIntercambiableEntity a WHERE a.interpretacion = :interpretacion")
})
public class AluminioIntercambiableEntity implements Serializable {

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
    @Column(name = "interpretacion")
    private String interpretacion;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAluminioIntercambiable")
    private Collection<AnalisisSueloEntity> analisisSueloEntityCollection;

    public AluminioIntercambiableEntity() {
    }

    public AluminioIntercambiableEntity(Integer id) {
        this.id = id;
    }

    public AluminioIntercambiableEntity(Integer id, Float valorMin, Float valorMax, String interpretacion) {
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
}
