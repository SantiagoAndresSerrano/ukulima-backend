package ufps.ukulima.infrastructure.db.springdata.entity.GrupoTextural;

import ufps.ukulima.infrastructure.db.springdata.entity.Elemento.ElementoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Fuente.FuenteEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Recomendacion.RecomendacionEntity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author santi
 */
@Entity
@Table(name = "grupo_textural")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "GrupoTextural.findAll", query = "SELECT f FROM GrupoTexturalEntity f"),
        @NamedQuery(name = "GrupoTextural.findById", query = "SELECT f FROM GrupoTexturalEntity f WHERE f" +
                ".id = :id"),
        @NamedQuery(name = "GrupoTextural.findByNombre", query = "SELECT f FROM GrupoTexturalEntity f " +
                "WHERE f.nombre = :nombre")

})
public class GrupoTexturalEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    public GrupoTexturalEntity() {
    }
    public GrupoTexturalEntity(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}