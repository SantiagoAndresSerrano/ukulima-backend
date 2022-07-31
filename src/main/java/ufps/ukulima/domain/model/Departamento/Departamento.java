/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.Departamento;

import ufps.ukulima.domain.model.Municipio.Municipio;

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
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author santi
 */
@Entity
@Table(name = "departamento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Departamento.findAll", query = "SELECT d FROM Departamento d"),
    @NamedQuery(name = "Departamento.findByIdDepto", query = "SELECT d FROM Departamento d WHERE d.idDepto = :idDepto"),
    @NamedQuery(name = "Departamento.findByNombre", query = "SELECT d FROM Departamento d WHERE d.nombre = :nombre")})
public class Departamento implements Serializable {

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
    private Collection<Municipio> municipioCollection;

    public Departamento() {
    }

    public Departamento(Integer idDepto) {
        this.idDepto = idDepto;
    }

    public Departamento(Integer idDepto, int nombre) {
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

    @XmlTransient
    public Collection<Municipio> getMunicipioCollection() {
        return municipioCollection;
    }

    public void setMunicipioCollection(Collection<Municipio> municipioCollection) {
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
        
        if (!(object instanceof Departamento)) {
            return false;
        }
        Departamento other = (Departamento) object;
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
