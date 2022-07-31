/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.Finca;

import ufps.ukulima.domain.model.Agricultor.Agricultor;
import ufps.ukulima.domain.model.Corregimiento.Corregimiento;
import ufps.ukulima.domain.model.Cultivo.Cultivo;
import ufps.ukulima.domain.model.Municipio.Municipio;
import ufps.ukulima.domain.model.Vereda.Vereda;

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
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author santi
 */
@Entity
@Table(name = "finca")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Finca.findAll", query = "SELECT f FROM Finca f"),
    @NamedQuery(name = "Finca.findByIdFinca", query = "SELECT f FROM Finca f WHERE f.idFinca = :idFinca"),
    @NamedQuery(name = "Finca.findByNombre", query = "SELECT f FROM Finca f WHERE f.nombre = :nombre"),
    @NamedQuery(name = "Finca.findByAreaTotal", query = "SELECT f FROM Finca f WHERE f.areaTotal = :areaTotal"),
    @NamedQuery(name = "Finca.findByAreaEnUso", query = "SELECT f FROM Finca f WHERE f.areaEnUso = :areaEnUso")})
public class Finca implements Serializable {

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
    @JoinColumn(name = "id_agricultor", referencedColumnName = "identifiacion")
    @ManyToOne(optional = false)
    private Agricultor idAgricultor;
    @JoinColumn(name = "id_corregimiento", referencedColumnName = "id_corregimiento")
    @ManyToOne(optional = false)
    private Corregimiento idCorregimiento;
    @JoinColumn(name = "id_municipio", referencedColumnName = "id_municipio")
    @ManyToOne(optional = false)
    private Municipio idMunicipio;
    @JoinColumn(name = "id_vereda", referencedColumnName = "id_vereda")
    @ManyToOne(optional = false)
    private Vereda idVereda;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFinca")
    private Collection<Cultivo> cultivoCollection;

    public Finca() {
    }

    public Finca(Integer idFinca) {
        this.idFinca = idFinca;
    }

    public Finca(Integer idFinca, int areaTotal, int areaEnUso, String geolocalizacion) {
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

    public Agricultor getIdAgricultor() {
        return idAgricultor;
    }

    public void setIdAgricultor(Agricultor idAgricultor) {
        this.idAgricultor = idAgricultor;
    }

    public Corregimiento getIdCorregimiento() {
        return idCorregimiento;
    }

    public void setIdCorregimiento(Corregimiento idCorregimiento) {
        this.idCorregimiento = idCorregimiento;
    }

    public Municipio getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Municipio idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public Vereda getIdVereda() {
        return idVereda;
    }

    public void setIdVereda(Vereda idVereda) {
        this.idVereda = idVereda;
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
        hash += (idFinca != null ? idFinca.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof Finca)) {
            return false;
        }
        Finca other = (Finca) object;
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
