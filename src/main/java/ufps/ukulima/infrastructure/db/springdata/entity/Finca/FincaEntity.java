/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.infrastructure.db.springdata.entity.Finca;

import com.fasterxml.jackson.annotation.JsonIgnore;
import ufps.ukulima.infrastructure.db.springdata.entity.Agricultor.AgricultorEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Corregimiento.CorregimientoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Cultivo.CultivoEntity;
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
import javax.persistence.Lob;
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
@Table(name = "finca")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Finca.findAll", query = "SELECT f FROM FincaEntity f"),
    @NamedQuery(name = "Finca.findByIdFinca", query = "SELECT f FROM FincaEntity f WHERE f.idFinca = :idFinca"),
    @NamedQuery(name = "Finca.findByNombre", query = "SELECT f FROM FincaEntity f WHERE f.nombre = :nombre"),
    @NamedQuery(name = "Finca.findByAreaTotal", query = "SELECT f FROM FincaEntity f WHERE f.areaTotal = :areaTotal"),
    @NamedQuery(name = "Finca.findByAreaEnUso", query = "SELECT f FROM FincaEntity f WHERE f.areaEnUso = :areaEnUso")})
public class FincaEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_finca")
    private Integer idFinca;
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "area_total")
    private int areaTotal;
    @Basic(optional = false)
    @Column(name = "area_en_uso")
    private int areaEnUso;
    @Basic(optional = false)
    @Lob
    @Column(name = "geolocalizacion")
    private String geolocalizacion;
    @JoinColumn(name = "id_agricultor", referencedColumnName = "identificacion")
    @ManyToOne(optional = false)
    private AgricultorEntity idAgricultor;
    @JoinColumn(name = "id_corregimiento", referencedColumnName = "id_corregimiento")
    @ManyToOne(optional = false)
    private CorregimientoEntity idCorregimiento;
    @JoinColumn(name = "id_municipio", referencedColumnName = "id_municipio")
    @ManyToOne(optional = false)
    private MunicipioEntity idMunicipio;
    @JoinColumn(name = "id_vereda", referencedColumnName = "id_vereda")
    @ManyToOne(optional = false)
    @JsonIgnore
    private VeredaEntity idVereda;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFinca")
    private Collection<CultivoEntity> cultivoCollection;

    public FincaEntity() {
    }

    public FincaEntity(Integer idFinca) {
        this.idFinca = idFinca;
    }

    public FincaEntity(Integer idFinca, int areaTotal, int areaEnUso, String geolocalizacion) {
        this.idFinca = idFinca;
        this.areaTotal = areaTotal;
        this.areaEnUso = areaEnUso;
        this.geolocalizacion = geolocalizacion;
    }

    public Integer getIdFinca() {
        return idFinca;
    }

    public void setIdFinca(Integer idFinca) {
        this.idFinca = idFinca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(int areaTotal) {
        this.areaTotal = areaTotal;
    }

    public int getAreaEnUso() {
        return areaEnUso;
    }

    public void setAreaEnUso(int areaEnUso) {
        this.areaEnUso = areaEnUso;
    }

    public String getGeolocalizacion() {
        return geolocalizacion;
    }

    public void setGeolocalizacion(String geolocalizacion) {
        this.geolocalizacion = geolocalizacion;
    }

    public AgricultorEntity getIdAgricultor() {
        return idAgricultor;
    }

    public void setIdAgricultor(AgricultorEntity idAgricultor) {
        this.idAgricultor = idAgricultor;
    }

    public void setCultivoCollection(Collection<CultivoEntity> cultivoCollection) {
        this.cultivoCollection = cultivoCollection;
    }

    public CorregimientoEntity getIdCorregimiento() {
        return idCorregimiento;
    }

    public void setIdCorregimiento(CorregimientoEntity idCorregimiento) {
        this.idCorregimiento = idCorregimiento;
    }

    public MunicipioEntity getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(MunicipioEntity idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public VeredaEntity getIdVereda() {
        return idVereda;
    }

    public void setIdVereda(VeredaEntity idVereda) {
        this.idVereda = idVereda;
    }



    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFinca != null ? idFinca.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof FincaEntity)) {
            return false;
        }
        FincaEntity other = (FincaEntity) object;
        if ((this.idFinca == null && other.idFinca != null) || (this.idFinca != null && !this.idFinca.equals(other.idFinca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.Finca[ idFinca=" + idFinca + " ]";
    }
    
}
