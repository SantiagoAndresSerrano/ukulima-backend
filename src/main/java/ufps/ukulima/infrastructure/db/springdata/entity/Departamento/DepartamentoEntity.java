/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.infrastructure.db.springdata.entity.Departamento;

import ufps.ukulima.infrastructure.db.springdata.entity.Municipio.MunicipioEntity;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author santi
 */
@Entity
@Table(name = "departamento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Departamento.findAll", query = "SELECT d FROM DepartamentoEntity d"),
    @NamedQuery(name = "Departamento.findByIdDepto", query = "SELECT d FROM DepartamentoEntity d WHERE d.idDepto = :idDepto"),
    @NamedQuery(name = "Departamento.findByNombre", query = "SELECT d FROM DepartamentoEntity d WHERE d.nombre = :nombre")})
public class DepartamentoEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_depto")
    private Integer idDepto;
    @Basic(optional = false)
    @Column(name = "nombre")
    private int nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDepartamento")
    private Collection<MunicipioEntity> municipioCollection;

    public DepartamentoEntity() {
    }

    public DepartamentoEntity(Integer idDepto) {
        this.idDepto = idDepto;
    }

    public DepartamentoEntity(Integer idDepto, int nombre) {
        this.idDepto = idDepto;
        this.nombre = nombre;
    }

    public Integer getIdDepto() {
        return idDepto;
    }

    public void setIdDepto(Integer idDepto) {
        this.idDepto = idDepto;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public Collection<MunicipioEntity> getMunicipioCollection() {
        return municipioCollection;
    }

    public void setMunicipioCollection(Collection<MunicipioEntity> municipioCollection) {
        this.municipioCollection = municipioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDepto != null ? idDepto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof DepartamentoEntity)) {
            return false;
        }
        DepartamentoEntity other = (DepartamentoEntity) object;
        if ((this.idDepto == null && other.idDepto != null) || (this.idDepto != null && !this.idDepto.equals(other.idDepto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.Departamento[ idDepto=" + idDepto + " ]";
    }
    
}
