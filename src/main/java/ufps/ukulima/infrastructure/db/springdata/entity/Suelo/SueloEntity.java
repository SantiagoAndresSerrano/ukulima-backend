package ufps.ukulima.infrastructure.db.springdata.entity.Suelo;
import ufps.ukulima.infrastructure.db.springdata.entity.Lote.LoteEntity;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "suelo")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "SueloEntity.findAll", query = "SELECT l FROM SueloEntity l"),
        @NamedQuery(name = "SueloEntity.findById", query = "SELECT l FROM SueloEntity l WHERE l.id = :id"),
})
public class SueloEntity {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    @JoinColumn(name = "id_lote", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private LoteEntity idLote;

    @Basic(optional = false)
    private String descripcion;

    public SueloEntity(){}

    public SueloEntity(Integer id, LoteEntity idLote) {
        this.id = id;
        this.idLote = idLote;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LoteEntity getIdLote() {
        return idLote;
    }

    public void setIdLote(LoteEntity idLote) {
        this.idLote = idLote;
    }
}
