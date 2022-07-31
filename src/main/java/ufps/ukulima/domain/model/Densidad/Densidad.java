/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.Densidad;


import ufps.ukulima.domain.model.AnalisisSuelo.AnalisisSuelo;

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
@Table(name = "densidad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Densidad.findAll", query = "SELECT d FROM Densidad d"),
    @NamedQuery(name = "Densidad.findByIdDensidad", query = "SELECT d FROM Densidad d WHERE d.idDensidad = :idDensidad"),
    @NamedQuery(name = "Densidad.findByValor", query = "SELECT d FROM Densidad d WHERE d.valor = :valor")})
public class Densidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_densidad")
    private Integer idDensidad;
    @Basic(optional = false)
    @Column(name = "valor")
    private float valor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDensidad")
    private Collection<AnalisisSuelo> analisisSueloCollection;

    public Densidad() {
    }

    public Densidad(Integer idDensidad) {
        this.idDensidad = idDensidad;
    }

    public Densidad(Integer idDensidad, float valor) {
        this.idDensidad = idDensidad;
        this.valor = valor;
    }

    public Integer getIdDensidad() {
        return idDensidad;
    }

    public void setIdDensidad(Integer idDensidad) {
        this.idDensidad = idDensidad;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @XmlTransient
    public Collection<AnalisisSuelo> getAnalisisSueloCollection() {
        return analisisSueloCollection;
    }

    public void setAnalisisSueloCollection(Collection<AnalisisSuelo> analisisSueloCollection) {
        this.analisisSueloCollection = analisisSueloCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDensidad != null ? idDensidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof Densidad)) {
            return false;
        }
        Densidad other = (Densidad) object;
        if ((this.idDensidad == null && other.idDensidad != null) || (this.idDensidad != null && !this.idDensidad.equals(other.idDensidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.Densidad[ idDensidad=" + idDensidad + " ]";
    }
    
}
