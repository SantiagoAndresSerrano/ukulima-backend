/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.ProfundidadMuestra;

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
@Table(name = "profundidad_muestra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProfundidadMuestra.findAll", query = "SELECT p FROM ProfundidadMuestra p"),
    @NamedQuery(name = "ProfundidadMuestra.findByIdProfundidadMuestra", query = "SELECT p FROM ProfundidadMuestra p WHERE p.idProfundidadMuestra = :idProfundidadMuestra"),
    @NamedQuery(name = "ProfundidadMuestra.findByProfundidad", query = "SELECT p FROM ProfundidadMuestra p WHERE p.profundidad = :profundidad")})
public class ProfundidadMuestra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_profundidad_muestra")
    private Integer idProfundidadMuestra;
    @Basic(optional = false)
    @Column(name = "profundidad")
    private int profundidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProfundidad")
    private Collection<AnalisisSuelo> analisisSueloCollection;

    public ProfundidadMuestra() {
    }

    public ProfundidadMuestra(Integer idProfundidadMuestra) {
        this.idProfundidadMuestra = idProfundidadMuestra;
    }

    public ProfundidadMuestra(Integer idProfundidadMuestra, int profundidad) {
        this.idProfundidadMuestra = idProfundidadMuestra;
        this.profundidad = profundidad;
    }

    public Integer getIdProfundidadMuestra() {
        return idProfundidadMuestra;
    }

    public void setIdProfundidadMuestra(Integer idProfundidadMuestra) {
        this.idProfundidadMuestra = idProfundidadMuestra;
    }

    public int getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
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
        hash += (idProfundidadMuestra != null ? idProfundidadMuestra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProfundidadMuestra)) {
            return false;
        }
        ProfundidadMuestra other = (ProfundidadMuestra) object;
        if ((this.idProfundidadMuestra == null && other.idProfundidadMuestra != null) || (this.idProfundidadMuestra != null && !this.idProfundidadMuestra.equals(other.idProfundidadMuestra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.ProfundidadMuestra[ idProfundidadMuestra=" + idProfundidadMuestra + " ]";
    }
    
}
