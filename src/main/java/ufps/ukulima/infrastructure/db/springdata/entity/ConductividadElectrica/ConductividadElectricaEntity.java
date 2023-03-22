/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.infrastructure.db.springdata.entity.ConductividadElectrica;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author santi
 */
@Entity
@Table(name = "conductividad_electrica")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "ConductividadElectricaEntity.findAll", query = "SELECT c FROM ConductividadElectricaEntity c"),
        @NamedQuery(name = "ConductividadElectricaEntity.findById", query = "SELECT c FROM ConductividadElectricaEntity c WHERE c.id = :id"),
        @NamedQuery(name = "ConductividadElectricaEntity.findByValorMin", query = "SELECT c FROM ConductividadElectricaEntity c WHERE c.valorMin = :valorMin"),
        @NamedQuery(name = "ConductividadElectricaEntity.findByValorMax", query = "SELECT c FROM ConductividadElectricaEntity c WHERE c.valorMax = :valorMax"),
        @NamedQuery(name = "ConductividadElectricaEntity.findByInterpretacion", query = "SELECT c FROM ConductividadElectricaEntity c WHERE c.interpretacion = :interpretacion")
})

public class ConductividadElectricaEntity implements Serializable {

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

    public ConductividadElectricaEntity() {
    }

    public ConductividadElectricaEntity(Integer id) {
        this.id = id;
    }

    public ConductividadElectricaEntity(Integer id, Float valorMin, Float valorMax, String interpretacion) {
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
