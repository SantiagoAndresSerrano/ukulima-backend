package ufps.ukulima.infrastructure.db.springdata.entity.AbonoQuimicoRecomendacion;


import ufps.ukulima.infrastructure.db.springdata.entity.Elemento.ElementoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Recomendacion.RecomendacionEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "abono_quimicos_recomendacion")
public class AbonoQuimicoRecomendacionEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "recomendacion", referencedColumnName = "id")
    private RecomendacionEntity recomendacion;

    @ManyToOne(optional = true)
    @JoinColumn(name = "elemento", referencedColumnName = "id")
    private ElementoEntity elemento;

    @Column(name = "disponibilidad")
    private Float disponibilidad;

    @Column(name = "eficiencia")
    private Float eficiencia;
    public AbonoQuimicoRecomendacionEntity(){}
    public AbonoQuimicoRecomendacionEntity(Integer id, RecomendacionEntity recomendacion, ElementoEntity elemento, Float disponibilidad, Float eficiencia) {
        this.id = id;
        this.recomendacion = recomendacion;
        this.elemento = elemento;
        this.disponibilidad = disponibilidad;
        this.eficiencia = eficiencia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RecomendacionEntity getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(RecomendacionEntity recomendacion) {
        this.recomendacion = recomendacion;
    }

    public ElementoEntity getElemento() {
        return elemento;
    }

    public void setElemento(ElementoEntity elemento) {
        this.elemento = elemento;
    }

    public Float getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Float disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Float getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(Float eficiencia) {
        this.eficiencia = eficiencia;
    }

    // Constructor, getters, and setters
}

