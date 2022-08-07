/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.infrastructure.db.springdata.entity.AbonoOrganicoRecomendacion;

import ufps.ukulima.infrastructure.db.springdata.entity.AbonoOrganico.AbonoOrganicoEntity;
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
@Table(name = "abono_organico_recomendacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AbonoOrganicoRecomendacion.findAll", query = "SELECT a FROM AbonoOrganicoRecomendacionEntity a"),
    @NamedQuery(name = "AbonoOrganicoRecomendacion.findById", query = "SELECT a FROM AbonoOrganicoRecomendacionEntity a WHERE a.id = :id"),
    @NamedQuery(name = "AbonoOrganicoRecomendacion.findByCantidad", query = "SELECT a FROM AbonoOrganicoRecomendacionEntity a WHERE a.cantidad = :cantidad")})
public class AbonoOrganicoRecomendacionEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private float cantidad;
    @JoinColumn(name = "id_abono_organico", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private AbonoOrganicoEntity idAbonoOrganico;
    @JoinColumn(name = "id_recomendacion", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private RecomendacionEntity idRecomendacion;

    public AbonoOrganicoRecomendacionEntity() {
    }

    public AbonoOrganicoRecomendacionEntity(Integer id) {
        this.id = id;
    }

    public AbonoOrganicoRecomendacionEntity(Integer id, float cantidad) {
        this.id = id;
        this.cantidad = cantidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public AbonoOrganicoEntity getIdAbonoOrganico() {
        return idAbonoOrganico;
    }

    public void setIdAbonoOrganico(AbonoOrganicoEntity idAbonoOrganico) {
        this.idAbonoOrganico = idAbonoOrganico;
    }

    public RecomendacionEntity getIdRecomendacion() {
        return idRecomendacion;
    }

    public void setIdRecomendacion(RecomendacionEntity idRecomendacion) {
        this.idRecomendacion = idRecomendacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof AbonoOrganicoRecomendacionEntity)) {
            return false;
        }
        AbonoOrganicoRecomendacionEntity other = (AbonoOrganicoRecomendacionEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.AbonoOrganicoRecomendacion[ id=" + id + " ]";
    }
    
}
