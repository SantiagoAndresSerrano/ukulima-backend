/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.Corregimiento;

import ufps.ukulima.domain.model.Finca.Finca;
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "corregimiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Corregimiento.findAll", query = "SELECT c FROM Corregimiento c"),
    @NamedQuery(name = "Corregimiento.findByIdCorregimiento", query = "SELECT c FROM Corregimiento c WHERE c.idCorregimiento = :idCorregimiento"),
    @NamedQuery(name = "Corregimiento.findByNombre", query = "SELECT c FROM Corregimiento c WHERE c.nombre = :nombre")})
public class Corregimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_corregimiento")
    private Integer idCorregimiento;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @JoinColumn(name = "id_municipio", referencedColumnName = "id_municipio")
    @ManyToOne(optional = false)
    private Municipio idMunicipio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCorregimiento")
    private Collection<Finca> fincaCollection;

    public Corregimiento() {
    }

    public Corregimiento(Integer idCorregimiento) {
        this.idCorregimiento = idCorregimiento;
    }

    public Corregimiento(Integer idCorregimiento, String nombre) {
        this.idCorregimiento = idCorregimiento;
        this.nombre = nombre;
    }

    public Integer getIdCorregimiento() {
        return idCorregimiento;
    }

    public void setIdCorregimiento(Integer idCorregimiento) {
        this.idCorregimiento = idCorregimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Municipio getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Municipio idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    @XmlTransient
    public Collection<Finca> getFincaCollection() {
        return fincaCollection;
    }

    public void setFincaCollection(Collection<Finca> fincaCollection) {
        this.fincaCollection = fincaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCorregimiento != null ? idCorregimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Corregimiento)) {
            return false;
        }
        Corregimiento other = (Corregimiento) object;
        if ((this.idCorregimiento == null && other.idCorregimiento != null) || (this.idCorregimiento != null && !this.idCorregimiento.equals(other.idCorregimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.Corregimiento[ idCorregimiento=" + idCorregimiento + " ]";
    }
    
}
