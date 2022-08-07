/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.infrastructure.db.springdata.entity.Municipio;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ufps.ukulima.infrastructure.db.springdata.entity.Corregimiento.CorregimientoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Departamento.DepartamentoEntity;
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
@Table(name = "municipio")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "Municipio.findAll", query = "SELECT m FROM MunicipioEntity m"),
        @NamedQuery(name = "Municipio.findByIdMunicipio", query = "SELECT m FROM MunicipioEntity m WHERE m.idMunicipio = :idMunicipio")})
public class MunicipioEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_municipio")
    private Integer idMunicipio;
    @JoinColumn(name = "id_departamento", referencedColumnName = "id_depto")
    @ManyToOne(optional = false)
    private DepartamentoEntity idDepartamento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMunicipio")
    private Collection<CorregimientoEntity> corregimientoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMunicipio")
    private Collection<FincaEntity> fincaCollection;

    public MunicipioEntity() {
    }

    public MunicipioEntity(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public Integer getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public DepartamentoEntity getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(DepartamentoEntity idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public Collection<CorregimientoEntity> getCorregimientoCollection() {
        return corregimientoCollection;
    }

    public void setCorregimientoCollection(Collection<CorregimientoEntity> corregimientoCollection) {
        this.corregimientoCollection = corregimientoCollection;
    }

    public Collection<FincaEntity> getFincaCollection() {
        return fincaCollection;
    }

    public void setFincaCollection(Collection<FincaEntity> fincaCollection) {
        this.fincaCollection = fincaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMunicipio != null ? idMunicipio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof MunicipioEntity)) {
            return false;
        }
        MunicipioEntity other = (MunicipioEntity) object;
        if ((this.idMunicipio == null && other.idMunicipio != null) || (this.idMunicipio != null && !this.idMunicipio.equals(other.idMunicipio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.Municipio[ idMunicipio=" + idMunicipio + " ]";
    }

}