package ufps.ukulima.infrastructure.db.springdata.entity.RelacionBase;

import ufps.ukulima.infrastructure.db.springdata.entity.Elemento.ElementoEntity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Entity
@Table(name = "relacion_base")
@XmlRootElement
public class RelacionBaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_elemento_1")
    private ElementoEntity idElemento1;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_elemento2")
    private ElementoEntity idElemento2;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_elemento_3")
    private ElementoEntity idElemento3;

    @Column(name = "valor_min", nullable = false)
    private Float valorMin;

    @Column(name = "valor_max", nullable = false)
    private Float valorMax;

    @Column(name = "interpretacion", nullable = false, length = 100)
    private String interpretacion;

    @Column(name = "formula", length = 100)
    private String formula;

    public RelacionBaseEntity(Integer id) {
        this.id = id;
    }
    public RelacionBaseEntity() {
    }
    public RelacionBaseEntity(Integer id, ElementoEntity idElemento1, ElementoEntity idElemento2, ElementoEntity idElemento3, Float valorMin, Float valorMax, String interpretacion, String formula) {
        this.id = id;
        this.idElemento1 = idElemento1;
        this.idElemento2 = idElemento2;
        this.idElemento3 = idElemento3;
        this.valorMin = valorMin;
        this.valorMax = valorMax;
        this.interpretacion = interpretacion;
        this.formula = formula;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ElementoEntity getIdElemento1() {
        return idElemento1;
    }

    public void setIdElemento1(ElementoEntity idElemento1) {
        this.idElemento1 = idElemento1;
    }

    public ElementoEntity getIdElemento2() {
        return idElemento2;
    }

    public void setIdElemento2(ElementoEntity idElemento2) {
        this.idElemento2 = idElemento2;
    }

    public ElementoEntity getIdElemento3() {
        return idElemento3;
    }

    public void setIdElemento3(ElementoEntity idElemento3) {
        this.idElemento3 = idElemento3;
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

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }
    @Override
    public String toString() {
        return "RelacionBase{" +
                "id=" + id +
                ", idElemento1=" + idElemento1 +
                ", idElemento2=" + idElemento2 +
                ", idElemento3=" + idElemento3 +
                ", valorMin=" + valorMin +
                ", valorMax=" + valorMax +
                ", interpretacion='" + interpretacion + '\'' +
                ", formula='" + formula + '\'' +
                '}';
    }
}