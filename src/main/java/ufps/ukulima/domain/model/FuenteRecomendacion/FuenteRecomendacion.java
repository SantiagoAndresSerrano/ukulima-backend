/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.FuenteRecomendacion;

import ufps.ukulima.domain.model.Elemento.Elemento;
import ufps.ukulima.domain.model.Fuente.Fuente;
import ufps.ukulima.domain.model.Recomendacion;

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
@Table(name = "fuente_recomendacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FuenteRecomendacion.findAll", query = "SELECT f FROM FuenteRecomendacion f"),
    @NamedQuery(name = "FuenteRecomendacion.findById", query = "SELECT f FROM FuenteRecomendacion f WHERE f.id = :id"),
    @NamedQuery(name = "FuenteRecomendacion.findByCantidad", query = "SELECT f FROM FuenteRecomendacion f WHERE f.cantidad = :cantidad")})
public class FuenteRecomendacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private float cantidad;
    @JoinColumn(name = "id_elemento", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Elemento idElemento;
    @JoinColumn(name = "id_fuente", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Fuente idFuente;
    @JoinColumn(name = "id_recomendacion", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Recomendacion idRecomendacion;

    public FuenteRecomendacion() {
    }

    public FuenteRecomendacion(Integer id) {
        this.id = id;
    }

    public FuenteRecomendacion(Integer id, float cantidad) {
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

    public Elemento getIdElemento() {
        return idElemento;
    }

    public void setIdElemento(Elemento idElemento) {
        this.idElemento = idElemento;
    }

    public Fuente getIdFuente() {
        return idFuente;
    }

    public void setIdFuente(Fuente idFuente) {
        this.idFuente = idFuente;
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
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FuenteRecomendacion)) {
            return false;
        }
        FuenteRecomendacion other = (FuenteRecomendacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.FuenteRecomendacion[ id=" + id + " ]";
    }
    
}
