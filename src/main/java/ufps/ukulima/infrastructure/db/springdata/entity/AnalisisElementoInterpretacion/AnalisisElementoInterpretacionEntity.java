package ufps.ukulima.infrastructure.db.springdata.entity.AnalisisElementoInterpretacion;

import ufps.ukulima.infrastructure.db.springdata.entity.Elemento.ElementoEntity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "analisis_elemento_interpretacion")
@XmlRootElement
public class AnalisisElementoInterpretacionEntity {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    @Basic(optional = false)
    @Column(name = "valor_min")
    private Integer valorMin;

    @Basic(optional = false)
    @Column(name = "valor_max")
    private Integer valorMax;

    @Basic(optional = false)
    @Column(name = "interpretacion")
    private String interpretacion;

    @JoinColumn(name = "id_elemento", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private ElementoEntity idElemento;
    public AnalisisElementoInterpretacionEntity(){}
    public AnalisisElementoInterpretacionEntity(Integer id, Integer valorMin, Integer valorMax, String interpretacion, ElementoEntity idElemento) {
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

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public ElementoEntity getIdElemento() {
        return idElemento;
    }

    public void setIdElemento(ElementoEntity idElemento) {
        this.idElemento = idElemento;
    }

    @Override
    public String toString() {
        return "AnalisisElementoInterpretacionEntity{" +
                "id=" + id +
                ", valorMin=" + valorMin +
                ", valorMax=" + valorMax +
                ", interpretacion='" + interpretacion + '\'' +
                ", idElemento=" + idElemento +
                '}';
    }
}
