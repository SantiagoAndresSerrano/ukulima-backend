package ufps.ukulima.infrastructure.db.springdata.entity.MateriaOrganica;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author santi
 */
@Entity
@Table(name = "materia_organica")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "MateriaOrganicaEntity.findAll", query = "SELECT m FROM MateriaOrganicaEntity m"),
        @NamedQuery(name = "MateriaOrganicaEntity.findById", query = "SELECT m FROM MateriaOrganicaEntity m WHERE m.id = :id"),
        @NamedQuery(name = "MateriaOrganicaEntity.findByValorMin", query = "SELECT m FROM MateriaOrganicaEntity m WHERE m.valorMin = :valorMin"),
        @NamedQuery(name = "MateriaOrganicaEntity.findByValorMax", query = "SELECT m FROM MateriaOrganicaEntity m WHERE m.valorMax = :valorMax"),
        @NamedQuery(name = "MateriaOrganicaEntity.findByInterpretacion", query = "SELECT m FROM MateriaOrganicaEntity m WHERE m.interpretacion = :interpretacion")
})

public class MateriaOrganicaEntity implements Serializable {

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

    public MateriaOrganicaEntity() {
    }

    public MateriaOrganicaEntity(Integer id, Float valorMin, Float valorMax, String interpretacion) {
        this.id = id;
        this.valorMin = valorMin;
        this.valorMax = valorMax;
        this.interpretacion = interpretacion;

    }
    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    public MateriaOrganicaEntity(Integer id) {
        this.id = id;
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
