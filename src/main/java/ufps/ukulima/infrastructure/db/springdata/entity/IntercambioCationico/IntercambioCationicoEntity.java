package ufps.ukulima.infrastructure.db.springdata.entity.IntercambioCationico;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author santi
 */
@Entity
@Table(name = "intercambio_cationico")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "IntercambioCationicoEntity.findAll", query = "SELECT i FROM IntercambioCationicoEntity i"),
        @NamedQuery(name = "IntercambioCationicoEntity.findById", query = "SELECT i FROM IntercambioCationicoEntity i WHERE i.id = :id"),
        @NamedQuery(name = "IntercambioCationicoEntity.findByValorMin", query = "SELECT i FROM IntercambioCationicoEntity i WHERE i.valorMin = :valorMin"),
        @NamedQuery(name = "IntercambioCationicoEntity.findByValorMax", query = "SELECT i FROM IntercambioCationicoEntity i WHERE i.valorMax = :valorMax"),
        @NamedQuery(name = "IntercambioCationicoEntity.findByInterpretacion", query = "SELECT i FROM IntercambioCationicoEntity i WHERE i.interpretacion = :interpretacion")
})

public class IntercambioCationicoEntity implements Serializable {

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

    public IntercambioCationicoEntity() {
    }

    public IntercambioCationicoEntity(Integer id, Float valorMin, Float valorMax, String interpretacion) {
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

    public IntercambioCationicoEntity(Integer id) {
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
