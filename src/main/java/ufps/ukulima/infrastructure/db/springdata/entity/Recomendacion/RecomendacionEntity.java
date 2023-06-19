/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.infrastructure.db.springdata.entity.Recomendacion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.fasterxml.jackson.annotation.JsonIgnore;
import ufps.ukulima.infrastructure.db.springdata.entity.AbonoOrganicoRecomendacion.AbonoOrganicoRecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AbonoQuimicoRecomendacion.AbonoQuimicoRecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisSuelo.AnalisisSueloEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Enmienda.EnmiendaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.EnmiendaRecomendacion.EnmiendaRecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.FuenteRecomendacion.FuenteRecomendacionEntity;

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
@Table(name = "recomendacion")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "Recomendacion.findAll", query = "SELECT r FROM RecomendacionEntity r"),
        @NamedQuery(name = "Recomendacion.findById", query = "SELECT r FROM RecomendacionEntity r WHERE r.id = :id"),
        @NamedQuery(name = "Recomendacion.findByCantidadEnmienda", query = "SELECT r FROM RecomendacionEntity r WHERE r.cantidadEnmienda = :cantidadEnmienda"),
        @NamedQuery(name = "Recomendacion.findByPreparacionSuelo", query = "SELECT r FROM RecomendacionEntity r WHERE r.preparacionSuelo = :preparacionSuelo") })
public class RecomendacionEntity implements Serializable {

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

    @Basic(optional = false)
    @Column(name = "labranza")
    private String labranza;
    @JoinColumn(name = "id_analisis_suelo", referencedColumnName = "id_analisis_suelo")
    @ManyToOne(optional = false)
    @JsonIgnore
    private AnalisisSueloEntity idAnalisisSuelo;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRecomendacion")
    private Collection<AbonoOrganicoRecomendacionEntity> abonoOrganicoRecomendacionCollection;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recomendacion")
    private Collection<AbonoQuimicoRecomendacionEntity> abonoQuimicoRecomendacionEntities;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRecomendacion")
    private Collection<FuenteRecomendacionEntity> fuenteRecomendacionCollection;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recomendacion")
    private Collection<EnmiendaRecomendacionEntity> enmiendaRecomendacionEntityCollection;



    public RecomendacionEntity() {
    }

    public RecomendacionEntity(Integer id) {
        this.id = id;
    }

    public RecomendacionEntity(Integer id, float cantidadEnmienda, short preparacionSuelo,
                               AnalisisSueloEntity idAnalisisSuelo, String labranza) {
        this.id = id;
        this.cantidadEnmienda = cantidadEnmienda;
        this.preparacionSuelo = preparacionSuelo;
        this.idAnalisisSuelo = idAnalisisSuelo;
        this.labranza = labranza;

    }

    public Collection<EnmiendaRecomendacionEntity> getEnmiendaRecomendacionEntityCollection() {
        return enmiendaRecomendacionEntityCollection;
    }

    public void setEnmiendaRecomendacionEntityCollection(Collection<EnmiendaRecomendacionEntity> enmiendaRecomendacionEntityCollection) {
        this.enmiendaRecomendacionEntityCollection = enmiendaRecomendacionEntityCollection;
    }
    public String getLabranza() {
        return labranza;
    }

    public void setLabranza(String labranza) {
        this.labranza = labranza;
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

    public AnalisisSueloEntity idAnalisisSuelo() {
        return idAnalisisSuelo;
    }

    public void setIdAnalisisSuelo(AnalisisSueloEntity idAnalisisSuelo) {
        this.idAnalisisSuelo = idAnalisisSuelo;
    }

    public Collection<AbonoOrganicoRecomendacionEntity> getAbonoOrganicoRecomendacionCollection() {
        return abonoOrganicoRecomendacionCollection;
    }

    public Collection<AbonoQuimicoRecomendacionEntity> getAbonoQuimicoRecomendacionEntities() {
        return abonoQuimicoRecomendacionEntities;
    }

    public void setAbonoQuimicoRecomendacionEntities(Collection<AbonoQuimicoRecomendacionEntity> abonoQuimicoRecomendacionEntities) {
        this.abonoQuimicoRecomendacionEntities = abonoQuimicoRecomendacionEntities;
    }

    public void setAbonoOrganicoRecomendacionCollection(
            Collection<AbonoOrganicoRecomendacionEntity> abonoOrganicoRecomendacionCollection) {
        this.abonoOrganicoRecomendacionCollection = abonoOrganicoRecomendacionCollection;
    }

    public Collection<FuenteRecomendacionEntity> fuenteRecomendacionCollection() {
        return fuenteRecomendacionCollection;
    }

    public void setFuenteRecomendacionCollection(Collection<FuenteRecomendacionEntity> fuenteRecomendacionCollection) {
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

        if (!(object instanceof RecomendacionEntity)) {
            return false;
        }
        RecomendacionEntity other = (RecomendacionEntity) object;
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