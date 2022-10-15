/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.infrastructure.db.springdata.entity.Variedad;

import ufps.ukulima.infrastructure.db.springdata.entity.Cultivo.CultivoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.TipoCultivo.TipoCultivoEntity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author santi
 */
@Entity
@Table(name = "variedad")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "Variedad.findAll", query = "SELECT v FROM VariedadEntity v"),
        @NamedQuery(name = "Variedad.findById", query = "SELECT v FROM VariedadEntity v WHERE v.id = :id"),
        @NamedQuery(name = "Variedad.findByDescripcion", query = "SELECT v FROM VariedadEntity v WHERE v.descripcion = :descripcion") })
public class VariedadEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @JoinColumn(name = "id_tipo_cultivo", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TipoCultivoEntity idTipoCultivo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idVariedad")
    private Collection<CultivoEntity> cultivoCollection;

    public VariedadEntity() {
    }

    public VariedadEntity(Integer id) {
        this.id = id;
    }

    public VariedadEntity(Integer id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoCultivoEntity getIdTipoCultivo() {
        return idTipoCultivo;
    }

    public void setIdTipoCultivo(TipoCultivoEntity idTipoCultivo) {
        this.idTipoCultivo = idTipoCultivo;
    }

    public Collection<CultivoEntity> cultivoCollection() {
        return cultivoCollection;
    }

    public void setCultivoCollection(Collection<CultivoEntity> cultivoCollection) {
        this.cultivoCollection = cultivoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof VariedadEntity)) {
            return false;
        }
        VariedadEntity other = (VariedadEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.Variedad[ id=" + id + " ]";
    }

}
