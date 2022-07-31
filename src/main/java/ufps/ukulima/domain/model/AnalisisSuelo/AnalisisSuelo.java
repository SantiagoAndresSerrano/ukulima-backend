/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.AnalisisSuelo;

import ufps.ukulima.domain.model.AnalisisElemento.AnalisisElemento;
import ufps.ukulima.domain.model.ClaseTextural.ClaseTextural;
import ufps.ukulima.domain.model.Cultivo.Cultivo;
import ufps.ukulima.domain.model.Densidad.Densidad;
import ufps.ukulima.domain.model.ProfundidadMuestra.ProfundidadMuestra;
import ufps.ukulima.domain.model.Recomendacion.Recomendacion;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author santi
 */
@Entity
@Table(name = "analisis_suelo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AnalisisSuelo.findAll", query = "SELECT a FROM AnalisisSuelo a"),
    @NamedQuery(name = "AnalisisSuelo.findByIdAnalisisSuelo", query = "SELECT a FROM AnalisisSuelo a WHERE a.idAnalisisSuelo = :idAnalisisSuelo"),
    @NamedQuery(name = "AnalisisSuelo.findByPorcentArena", query = "SELECT a FROM AnalisisSuelo a WHERE a.porcentArena = :porcentArena"),
    @NamedQuery(name = "AnalisisSuelo.findByPorcentLimos", query = "SELECT a FROM AnalisisSuelo a WHERE a.porcentLimos = :porcentLimos"),
    @NamedQuery(name = "AnalisisSuelo.findByPorcentArcilla", query = "SELECT a FROM AnalisisSuelo a WHERE a.porcentArcilla = :porcentArcilla"),
    @NamedQuery(name = "AnalisisSuelo.findByFecha", query = "SELECT a FROM AnalisisSuelo a WHERE a.fecha = :fecha")})
public class AnalisisSuelo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_analisis_suelo")
    private Integer idAnalisisSuelo;
    @Basic(optional = false)
    @Column(name = "porcent_arena")
    private float porcentArena;
    @Basic(optional = false)
    @Column(name = "porcent_limos")
    private float porcentLimos;
    @Basic(optional = false)
    @Column(name = "porcent_arcilla")
    private float porcentArcilla;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAnalisisSuelo")
    private Collection<Recomendacion> recomendacionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAnalisisSuelo")
    private Collection<AnalisisElemento> analisisElementoCollection;
    @JoinColumn(name = "id_clase_textural", referencedColumnName = "id_clase_textural")
    @ManyToOne(optional = false)
    private ClaseTextural idClaseTextural;
    @JoinColumn(name = "id_cultivo", referencedColumnName = "id_cultivo")
    @ManyToOne(optional = false)
    private Cultivo idCultivo;
    @JoinColumn(name = "id_densidad", referencedColumnName = "id_densidad")
    @ManyToOne(optional = false)
    private Densidad idDensidad;
    @JoinColumn(name = "id_profundidad", referencedColumnName = "id_profundidad_muestra")
    @ManyToOne(optional = false)
    private ProfundidadMuestra idProfundidad;

    public AnalisisSuelo() {
    }

    public AnalisisSuelo(Integer idAnalisisSuelo) {
        this.idAnalisisSuelo = idAnalisisSuelo;
    }

    public AnalisisSuelo(Integer idAnalisisSuelo, float porcentArena, float porcentLimos, float porcentArcilla, Date fecha) {
        this.idAnalisisSuelo = idAnalisisSuelo;
        this.porcentArena = porcentArena;
        this.porcentLimos = porcentLimos;
        this.porcentArcilla = porcentArcilla;
        this.fecha = fecha;
    }

    public Integer getIdAnalisisSuelo() {
        return idAnalisisSuelo;
    }

    public void setIdAnalisisSuelo(Integer idAnalisisSuelo) {
        this.idAnalisisSuelo = idAnalisisSuelo;
    }

    public float getPorcentArena() {
        return porcentArena;
    }

    public void setPorcentArena(float porcentArena) {
        this.porcentArena = porcentArena;
    }

    public float getPorcentLimos() {
        return porcentLimos;
    }

    public void setPorcentLimos(float porcentLimos) {
        this.porcentLimos = porcentLimos;
    }

    public float getPorcentArcilla() {
        return porcentArcilla;
    }

    public void setPorcentArcilla(float porcentArcilla) {
        this.porcentArcilla = porcentArcilla;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @XmlTransient
    public Collection<Recomendacion> getRecomendacionCollection() {
        return recomendacionCollection;
    }

    public void setRecomendacionCollection(Collection<Recomendacion> recomendacionCollection) {
        this.recomendacionCollection = recomendacionCollection;
    }

    @XmlTransient
    public Collection<AnalisisElemento> getAnalisisElementoCollection() {
        return analisisElementoCollection;
    }

    public void setAnalisisElementoCollection(Collection<AnalisisElemento> analisisElementoCollection) {
        this.analisisElementoCollection = analisisElementoCollection;
    }

    public ClaseTextural getIdClaseTextural() {
        return idClaseTextural;
    }

    public void setIdClaseTextural(ClaseTextural idClaseTextural) {
        this.idClaseTextural = idClaseTextural;
    }

    public Cultivo getIdCultivo() {
        return idCultivo;
    }

    public void setIdCultivo(Cultivo idCultivo) {
        this.idCultivo = idCultivo;
    }

    public Densidad getIdDensidad() {
        return idDensidad;
    }

    public void setIdDensidad(Densidad idDensidad) {
        this.idDensidad = idDensidad;
    }

    public ProfundidadMuestra getIdProfundidad() {
        return idProfundidad;
    }

    public void setIdProfundidad(ProfundidadMuestra idProfundidad) {
        this.idProfundidad = idProfundidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAnalisisSuelo != null ? idAnalisisSuelo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof AnalisisSuelo)) {
            return false;
        }
        AnalisisSuelo other = (AnalisisSuelo) object;
        if ((this.idAnalisisSuelo == null && other.idAnalisisSuelo != null) || (this.idAnalisisSuelo != null && !this.idAnalisisSuelo.equals(other.idAnalisisSuelo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.AnalisisSuelo[ idAnalisisSuelo=" + idAnalisisSuelo + " ]";
    }
    
}
