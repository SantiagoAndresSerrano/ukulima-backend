/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.Recomendacion;

import ufps.ukulima.domain.model.AbonoOrganicoRecomendacion.AbonoOrganicoRecomendacion;
import ufps.ukulima.domain.model.AnalisisSuelo.AnalisisSuelo;
import ufps.ukulima.domain.model.Enmienda.Enmienda;
import ufps.ukulima.domain.model.FuenteRecomendacion.FuenteRecomendacion;

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
@Table(name = "recomendacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Recomendacion.findAll", query = "SELECT r FROM Recomendacion r"),
    @NamedQuery(name = "Recomendacion.findById", query = "SELECT r FROM Recomendacion r WHERE r.id = :id"),
    @NamedQuery(name = "Recomendacion.findByCantidadEnmienda", query = "SELECT r FROM Recomendacion r WHERE r.cantidadEnmienda = :cantidadEnmienda"),
    @NamedQuery(name = "Recomendacion.findByPreparacionSuelo", query = "SELECT r FROM Recomendacion r WHERE r.preparacionSuelo = :preparacionSuelo")})
public class Recomendacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "cantidad_enmienda")
    private float cantidadEnmienda;
    @Basic(optional = false)
    @Column(name = "preparacion_suelo")
    private short preparacionSuelo;
    @JoinColumn(name = "id_analisis_suelo", referencedColumnName = "id_analisis_suelo")
    @ManyToOne(optional = false)
    private AnalisisSuelo idAnalisisSuelo;
    @JoinColumn(name = "id_enmienda", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Enmienda idEnmienda;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRecomendacion")
    private Collection<AbonoOrganicoRecomendacion> abonoOrganicoRecomendacionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRecomendacion")
    private Collection<FuenteRecomendacion> fuenteRecomendacionCollection;

    public Recomendacion() {
    }

    public Recomendacion(Integer id) {
        this.id = id;
    }

    public Recomendacion(Integer id, float cantidadEnmienda, short preparacionSuelo) {
        this.id = id;
        this.cantidadEnmienda = cantidadEnmienda;
        this.preparacionSuelo = preparacionSuelo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getCantidadEnmienda() {
        return cantidadEnmienda;
    }

    public void setCantidadEnmienda(float cantidadEnmienda) {
        this.cantidadEnmienda = cantidadEnmienda;
    }

    public short getPreparacionSuelo() {
        return preparacionSuelo;
    }

    public void setPreparacionSuelo(short preparacionSuelo) {
        this.preparacionSuelo = preparacionSuelo;
    }

    public AnalisisSuelo getIdAnalisisSuelo() {
        return idAnalisisSuelo;
    }

    public void setIdAnalisisSuelo(AnalisisSuelo idAnalisisSuelo) {
        this.idAnalisisSuelo = idAnalisisSuelo;
    }

    public Enmienda getIdEnmienda() {
        return idEnmienda;
    }

    public void setIdEnmienda(Enmienda idEnmienda) {
        this.idEnmienda = idEnmienda;
    }

    @XmlTransient
    public Collection<AbonoOrganicoRecomendacion> getAbonoOrganicoRecomendacionCollection() {
        return abonoOrganicoRecomendacionCollection;
    }

    public void setAbonoOrganicoRecomendacionCollection(Collection<AbonoOrganicoRecomendacion> abonoOrganicoRecomendacionCollection) {
        this.abonoOrganicoRecomendacionCollection = abonoOrganicoRecomendacionCollection;
    }

    @XmlTransient
    public Collection<FuenteRecomendacion> getFuenteRecomendacionCollection() {
        return fuenteRecomendacionCollection;
    }

    public void setFuenteRecomendacionCollection(Collection<FuenteRecomendacion> fuenteRecomendacionCollection) {
        this.fuenteRecomendacionCollection = fuenteRecomendacionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof Recomendacion)) {
            return false;
        }
        Recomendacion other = (Recomendacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.Recomendacion[ id=" + id + " ]";
    }
    
}
