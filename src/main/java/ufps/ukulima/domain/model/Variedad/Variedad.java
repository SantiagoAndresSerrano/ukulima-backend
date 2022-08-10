/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.Variedad;

import ufps.ukulima.domain.model.Cultivo.Cultivo;
import ufps.ukulima.domain.model.TipoCultivo.TipoCultivo;
import java.util.Collection;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author santi
 */
public class Variedad  {

    private Integer id;
    private String descripcion;
    private TipoCultivo idTipoCultivo;
    private Collection<Cultivo> cultivoCollection;

    public Variedad() {
    }

    public Variedad(Integer id) {
        this.id = id;
    }

    public Variedad(Integer id, String descripcion) {
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

    public TipoCultivo getIdTipoCultivo() {
        return idTipoCultivo;
    }

    public void setIdTipoCultivo(TipoCultivo idTipoCultivo) {
        this.idTipoCultivo = idTipoCultivo;
    }

    @XmlTransient
    public Collection<Cultivo> getCultivoCollection() {
        return cultivoCollection;
    }

    public void setCultivoCollection(Collection<Cultivo> cultivoCollection) {
        this.cultivoCollection = cultivoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof Variedad)) {
            return false;
        }
        Variedad other = (Variedad) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.Variedad[ id=" + id + " ]";
    }
    
}
