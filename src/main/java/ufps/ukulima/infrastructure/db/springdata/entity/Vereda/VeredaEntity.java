/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.infrastructure.db.springdata.entity.Vereda;

import ufps.ukulima.infrastructure.db.springdata.entity.Finca.FincaEntity;

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
@Table(name = "vereda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vereda.findAll", query = "SELECT v FROM VeredaEntity v"),
    @NamedQuery(name = "Vereda.findByIdVereda", query = "SELECT v FROM VeredaEntity v WHERE v.idVereda = :idVereda"),
    @NamedQuery(name = "Vereda.findByIdCorregimiento", query = "SELECT v FROM VeredaEntity v WHERE v.idCorregimiento = :idCorregimiento"),
    @NamedQuery(name = "Vereda.findByNombre", query = "SELECT v FROM VeredaEntity v WHERE v.nombre = :nombre")})
public class VeredaEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_vereda")
    private Integer idVereda;
    @Basic(optional = false)
    @Column(name = "id_corregimiento")
    private int idCorregimiento;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idVereda")
    private Collection<FincaEntity> fincaCollection;

    public VeredaEntity() {
    }

    public VeredaEntity(Integer idVereda) {
        this.idVereda = idVereda;
    }

    public VeredaEntity(Integer idVereda, int idCorregimiento, String nombre) {
        this.idVereda = idVereda;
        this.idCorregimiento = idCorregimiento;
        this.nombre = nombre;
    }

    public Integer getIdVereda() {
        return idVereda;
    }

    public void setIdVereda(Integer idVereda) {
        this.idVereda = idVereda;
    }

    public int getIdCorregimiento() {
        return idCorregimiento;
    }

    public void setIdCorregimiento(int idCorregimiento) {
        this.idCorregimiento = idCorregimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public Collection<FincaEntity> getFincaCollection() {
        return fincaCollection;
    }

    public void setFincaCollection(Collection<FincaEntity> fincaCollection) {
        this.fincaCollection = fincaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVereda != null ? idVereda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof VeredaEntity)) {
            return false;
        }
        VeredaEntity other = (VeredaEntity) object;
        if ((this.idVereda == null && other.idVereda != null) || (this.idVereda != null && !this.idVereda.equals(other.idVereda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.Vereda[ idVereda=" + idVereda + " ]";
    }
    
}
