/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.infrastructure.db.springdata.entity.Corregimiento;

import ufps.ukulima.infrastructure.db.springdata.entity.Finca.FincaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Municipio.MunicipioEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Vereda.VeredaEntity;

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

/**
 *
 * @author santi
 */
@Entity
@Table(name = "corregimiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Corregimiento.findAll", query = "SELECT c FROM CorregimientoEntity c"),
    @NamedQuery(name = "Corregimiento.findByIdCorregimiento", query = "SELECT c FROM CorregimientoEntity c WHERE c.idCorregimiento = :idCorregimiento"),
    @NamedQuery(name = "Corregimiento.findByNombre", query = "SELECT c FROM CorregimientoEntity c WHERE c.nombre = :nombre")})
public class CorregimientoEntity implements Serializable {

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
    private MunicipioEntity idMunicipio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCorregimiento")
    private Collection<FincaEntity> fincaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCorregimiento")
    private Collection<VeredaEntity> veredaCollection;

    public CorregimientoEntity() {
    }

    public CorregimientoEntity(Integer idCorregimiento) {
        this.idCorregimiento = idCorregimiento;
    }

    public CorregimientoEntity(Integer idCorregimiento, String nombre) {
        this.idCorregimiento = idCorregimiento;
        this.nombre = nombre;
    }

    public Collection<VeredaEntity> veredaCollection() {
        return veredaCollection;
    }

    public void veredaCollection(Collection<VeredaEntity> veredaCollection) {
        this.veredaCollection = veredaCollection;
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

    public MunicipioEntity getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(MunicipioEntity idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public Collection<FincaEntity> fincaCollection() {
        return fincaCollection;
    }

    public void fincaCollection(Collection<FincaEntity> fincaCollection) {
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
        
        if (!(object instanceof CorregimientoEntity)) {
            return false;
        }
        CorregimientoEntity other = (CorregimientoEntity) object;
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
