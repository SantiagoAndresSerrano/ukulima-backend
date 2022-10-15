package ufps.ukulima.infrastructure.db.springdata.entity.AnalisisSuelo;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisElemento.AnalisisElementosEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.ClaseTextural.ClaseTexturalEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Cultivo.CultivoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Densidad.DensidadEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.ProfundidadMuestra.ProfundidadMuestraEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Recomendacion.RecomendacionEntity;

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

/**
 *
 * @author santi
 */
@Entity
@Table(name = "analisis_suelo")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "AnalisisSuelo.findAll", query = "SELECT a FROM AnalisisSueloEntity a"),
        @NamedQuery(name = "AnalisisSuelo.findByIdAnalisisSuelo", query = "SELECT a FROM AnalisisSueloEntity a WHERE a.idAnalisisSuelo = :idAnalisisSuelo"),
        @NamedQuery(name = "AnalisisSuelo.findByPorcentArena", query = "SELECT a FROM AnalisisSueloEntity a WHERE a.porcentArena = :porcentArena"),
        @NamedQuery(name = "AnalisisSuelo.findByPorcentLimos", query = "SELECT a FROM AnalisisSueloEntity a WHERE a.porcentLimos = :porcentLimos"),
        @NamedQuery(name = "AnalisisSuelo.findByPorcentArcilla", query = "SELECT a FROM AnalisisSueloEntity a WHERE a.porcentArcilla = :porcentArcilla"),
        @NamedQuery(name = "AnalisisSuelo.findByFecha", query = "SELECT a FROM AnalisisSueloEntity a WHERE a.fecha = :fecha") })
public class AnalisisSueloEntity implements Serializable {

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
    private Collection<RecomendacionEntity> recomendacionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAnalisisSuelo")
    private Collection<AnalisisElementosEntity> analisisElementoCollection;
    @JoinColumn(name = "id_clase_textural", referencedColumnName = "id_clase_textural")
    @ManyToOne(optional = false)
    private ClaseTexturalEntity idClaseTextural;
    @JoinColumn(name = "id_cultivo", referencedColumnName = "id_cultivo")
    @ManyToOne(optional = false)
    private CultivoEntity idCultivo;
    @JoinColumn(name = "id_densidad", referencedColumnName = "id_densidad")
    @ManyToOne(optional = false)
    private DensidadEntity idDensidad;
    @JoinColumn(name = "id_profundidad", referencedColumnName = "id_profundidad_muestra")
    @ManyToOne(optional = false)
    private ProfundidadMuestraEntity idProfundidad;

    public AnalisisSueloEntity() {
    }

    public AnalisisSueloEntity(Integer idAnalisisSuelo) {
        this.idAnalisisSuelo = idAnalisisSuelo;
    }

    public AnalisisSueloEntity(Integer idAnalisisSuelo, float porcentArena, float porcentLimos, float porcentArcilla,
            Date fecha) {
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

    public Collection<RecomendacionEntity> getRecomendacionCollection() {
        return recomendacionCollection;
    }

    public void setRecomendacionCollection(Collection<RecomendacionEntity> recomendacionCollection) {
        this.recomendacionCollection = recomendacionCollection;
    }

    public Collection<AnalisisElementosEntity> analisisElementoCollection() {
        return analisisElementoCollection;
    }

    public void setAnalisisElementoCollection(Collection<AnalisisElementosEntity> analisisElementoCollection) {
        this.analisisElementoCollection = analisisElementoCollection;
    }

    public ClaseTexturalEntity getIdClaseTextural() {
        return idClaseTextural;
    }

    public void setIdClaseTextural(ClaseTexturalEntity idClaseTextural) {
        this.idClaseTextural = idClaseTextural;
    }

    public CultivoEntity getIdCultivo() {
        return idCultivo;
    }

    public void setIdCultivo(CultivoEntity idCultivo) {
        this.idCultivo = idCultivo;
    }

    public DensidadEntity getIdDensidad() {
        return idDensidad;
    }

    public void setIdDensidad(DensidadEntity idDensidad) {
        this.idDensidad = idDensidad;
    }

    public ProfundidadMuestraEntity getIdProfundidad() {
        return idProfundidad;
    }

    public void setIdProfundidad(ProfundidadMuestraEntity idProfundidad) {
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

        if (!(object instanceof AnalisisSueloEntity)) {
            return false;
        }
        AnalisisSueloEntity other = (AnalisisSueloEntity) object;
        if ((this.idAnalisisSuelo == null && other.idAnalisisSuelo != null)
                || (this.idAnalisisSuelo != null && !this.idAnalisisSuelo.equals(other.idAnalisisSuelo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.AnalisisSuelo[ idAnalisisSuelo=" + idAnalisisSuelo + " ]";
    }

}