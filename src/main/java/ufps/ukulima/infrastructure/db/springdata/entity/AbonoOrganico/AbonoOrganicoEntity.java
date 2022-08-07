/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.infrastructure.db.springdata.entity.AbonoOrganico;


import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ufps.ukulima.infrastructure.db.springdata.entity.AbonoOrganicoRecomendacion.AbonoOrganicoRecomendacionEntity;

/**
 *
 * @author santi
 */
@Entity
@Table(name = "abono_organico")
@NamedQueries({
    @NamedQuery(name = "AbonoOrganico.findAll", query = "SELECT a FROM AbonoOrganicoEntity a"),
    @NamedQuery(name = "AbonoOrganico.findById", query = "SELECT a FROM AbonoOrganicoEntity a WHERE a.id = :id"),
    @NamedQuery(name = "AbonoOrganico.findByDescripcion", query = "SELECT a FROM AbonoOrganicoEntity a WHERE a.descripcion = :descripcion")})
public class AbonoOrganicoEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAbonoOrganico")
    private Collection<AbonoOrganicoRecomendacionEntity> abonoOrganicoRecomendacionCollection;
    public AbonoOrganicoEntity() {
    }

    public AbonoOrganicoEntity(Integer id) {
        this.id = id;
    }

    public AbonoOrganicoEntity(Integer id, String descripcion) {
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

    public Collection<AbonoOrganicoRecomendacionEntity> aOrganicoRecomendacionCollection() {
        return abonoOrganicoRecomendacionCollection;
    }

    public void setAbonoOrganicoRecomendacionCollection(Collection<AbonoOrganicoRecomendacionEntity> abonoOrganicoRecomendacionCollection) {
        this.abonoOrganicoRecomendacionCollection = abonoOrganicoRecomendacionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof AbonoOrganicoEntity)) {
            return false;
        }
        AbonoOrganicoEntity other = (AbonoOrganicoEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.AbonoOrganico[ id=" + id + " ]";
    }
    
}
