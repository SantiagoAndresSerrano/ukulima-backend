package ufps.ukulima.infrastructure.db.springdata.entity.PhSuelo;

import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisSuelo.AnalisisSueloEntity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author santi
 */
@Entity
@Table(name = "ph_suelo")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "PhSueloEntity.findAll", query = "SELECT p FROM PhSueloEntity p"),
        @NamedQuery(name = "PhSueloEntity.findById", query = "SELECT p FROM PhSueloEntity p WHERE p.id = :id"),
        @NamedQuery(name = "PhSueloEntity.findByValorMin", query = "SELECT p FROM PhSueloEntity p WHERE p.valorMin = :valorMin"),
        @NamedQuery(name = "PhSueloEntity.findByValorMax", query = "SELECT p FROM PhSueloEntity p WHERE p.valorMax = :valorMax"),
        @NamedQuery(name = "PhSueloEntity.findByInterpretacion", query = "SELECT p FROM PhSueloEntity p WHERE p.interpretacion = :interpretacion")
})
public class PhSueloEntity implements Serializable {

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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPhSuelo")
    private Collection<AnalisisSueloEntity> analisisSueloCollection;
    public PhSueloEntity() {
    }

    public PhSueloEntity(Integer id, Float valorMin, Float valorMax, String interpretacion) {
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
        public PhSueloEntity(Integer id) {
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

    public Collection<AnalisisSueloEntity> getAnalisisSueloCollection() {
        return analisisSueloCollection;
    }

    public void setAnalisisSueloCollection(Collection<AnalisisSueloEntity> analisisSueloCollection) {
        this.analisisSueloCollection = analisisSueloCollection;
    }

    public void setValorMax(Float valorMax) {
        this.valorMax = valorMax;
    }
}
