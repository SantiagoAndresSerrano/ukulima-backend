/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.AbonoOrganicoRecomendacion;

import ufps.ukulima.domain.model.AbonoOrganico.AbonoOrganico;
import ufps.ukulima.domain.model.Recomendacion.Recomendacion;

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
    @NamedQuery(name = "AbonoOrganicoRecomendacion.findAll", query = "SELECT a FROM AbonoOrganicoRecomendacion a"),
    @NamedQuery(name = "AbonoOrganicoRecomendacion.findById", query = "SELECT a FROM AbonoOrganicoRecomendacion a WHERE a.id = :id"),
    @NamedQuery(name = "AbonoOrganicoRecomendacion.findByCantidad", query = "SELECT a FROM AbonoOrganicoRecomendacion a WHERE a.cantidad = :cantidad")})
public class AbonoOrganicoRecomendacion implements Serializable {

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
    private AbonoOrganico idAbonoOrganico;
    @JoinColumn(name = "id_recomendacion", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Recomendacion idRecomendacion;

    public AbonoOrganicoRecomendacion() {
    }

    public AbonoOrganicoRecomendacion(Integer id) {
        this.id = id;
    }

    public AbonoOrganicoRecomendacion(Integer id, float cantidad) {
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

    public AbonoOrganico getIdAbonoOrganico() {
        return idAbonoOrganico;
    }

    public void setIdAbonoOrganico(AbonoOrganico idAbonoOrganico) {
        this.idAbonoOrganico = idAbonoOrganico;
    }

    public Recomendacion getIdRecomendacion() {
        return idRecomendacion;
    }

    public void setIdRecomendacion(Recomendacion idRecomendacion) {
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
        
        if (!(object instanceof AbonoOrganicoRecomendacion)) {
            return false;
        }
        AbonoOrganicoRecomendacion other = (AbonoOrganicoRecomendacion) object;
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
