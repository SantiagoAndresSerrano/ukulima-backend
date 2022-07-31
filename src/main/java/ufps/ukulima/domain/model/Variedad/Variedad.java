/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.Variedad;

import ufps.ukulima.domain.model.Cultivo.Cultivo;
import ufps.ukulima.domain.model.TipoCultivo.TipoCultivo;

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
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author santi
 */
@Entity
@Table(name = "variedad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Variedad.findAll", query = "SELECT v FROM Variedad v"),
    @NamedQuery(name = "Variedad.findById", query = "SELECT v FROM Variedad v WHERE v.id = :id"),
    @NamedQuery(name = "Variedad.findByDescripcion", query = "SELECT v FROM Variedad v WHERE v.descripcion = :descripcion")})
public class Variedad implements Serializable {

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
    private TipoCultivo idTipoCultivo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idVariedad")
    private Collection<Cultivo> cultivoCollection;

    public Variedad() {
    }

    public Variedad(Integer id) {
        this.id = id;
    }

    public Variedad(Integer id, String descripcion) {
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

    public TipoCultivo getIdTipoCultivo() {
        return idTipoCultivo;
    }

    public void setIdTipoCultivo(TipoCultivo idTipoCultivo) {
        this.idTipoCultivo = idTipoCultivo;
    }

    @XmlTransient
    public Collection<Cultivo> getCultivoCollection() {
        return cultivoCollection;
    }

    public void setCultivoCollection(Collection<Cultivo> cultivoCollection) {
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
        
        if (!(object instanceof Variedad)) {
            return false;
        }
        Variedad other = (Variedad) object;
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
