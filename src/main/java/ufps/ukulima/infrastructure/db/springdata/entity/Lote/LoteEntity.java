package ufps.ukulima.infrastructure.db.springdata.entity.Lote;
import com.fasterxml.jackson.annotation.JsonIgnore;
import ufps.ukulima.infrastructure.db.springdata.entity.Finca.FincaEntity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Entity
@Table(name = "lote")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "LoteEntity.findAll", query = "SELECT l FROM LoteEntity l"),
        @NamedQuery(name = "LoteEntity.findById", query = "SELECT l FROM LoteEntity l WHERE l.id = :id"),
})

public class LoteEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;

    @Basic(optional = false)
    private String descripcion;

    @JsonIgnore
    @JoinColumn(name = "id_finca", referencedColumnName = "id_finca")
    @ManyToOne(optional = false)
    private FincaEntity idFinca;

    public LoteEntity(){}
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public LoteEntity(Integer id, FincaEntity idFinca) {
        this.id = id;
        this.idFinca = idFinca;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public FincaEntity getIdFinca() {
        return idFinca;
    }

    public void setIdFinca(FincaEntity idFinca) {
        this.idFinca = idFinca;
    }
}

