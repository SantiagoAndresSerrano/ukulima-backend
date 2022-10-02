/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.infrastructure.db.springdata.entity.Cultivo;

import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisSuelo.AnalisisSueloEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.DistanciaSiembra.DistanciaSiembraEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.EtapaFenologica.EtapaFenologicaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Finca.FincaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Topografia.TopografiaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Variedad.VariedadEntity;

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
@Table(name = "cultivo")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "Cultivo.findAll", query = "SELECT c FROM CultivoEntity c"),
        @NamedQuery(name = "Cultivo.findByIdCultivo", query = "SELECT c FROM CultivoEntity c WHERE c.idCultivo = :idCultivo"),
        @NamedQuery(name = "Cultivo.findByDescripcion", query = "SELECT c FROM CultivoEntity c WHERE c.descripcion = :descripcion"),
        @NamedQuery(name = "Cultivo.findByPlantasPorHectarea", query = "SELECT c FROM CultivoEntity c WHERE c.plantasPorHectarea = :plantasPorHectarea") })
public class CultivoEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cultivo")
    private Integer idCultivo;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "plantas_por_hectarea")
    private int plantasPorHectarea;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCultivo")
    private Collection<AnalisisSueloEntity> analisisSueloCollection;
    @JoinColumn(name = "id_distancia_siembra", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private DistanciaSiembraEntity idDistanciaSiembra;
    @JoinColumn(name = "id_etapa_fenologica", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private EtapaFenologicaEntity idEtapaFenologica;
    @JoinColumn(name = "id_finca", referencedColumnName = "id_finca")
    @ManyToOne(optional = false)
    private FincaEntity idFinca;
    @JoinColumn(name = "id_topografia", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TopografiaEntity idTopografia;
    @JoinColumn(name = "id_variedad", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private VariedadEntity idVariedad;

    public CultivoEntity() {
    }

    public CultivoEntity(Integer idCultivo) {
        this.idCultivo = idCultivo;
    }

    public CultivoEntity(Integer idCultivo, String descripcion, int plantasPorHectarea) {
        this.idCultivo = idCultivo;
        this.descripcion = descripcion;
        this.plantasPorHectarea = plantasPorHectarea;
    }

    public Integer getIdCultivo() {
        return idCultivo;
    }

    public void setIdCultivo(Integer idCultivo) {
        this.idCultivo = idCultivo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPlantasPorHectarea() {
        return plantasPorHectarea;
    }

    public void setPlantasPorHectarea(int plantasPorHectarea) {
        this.plantasPorHectarea = plantasPorHectarea;
    }

    public Collection<AnalisisSueloEntity> getAnalisisSueloCollection() {
        return analisisSueloCollection;
    }

    public void setAnalisisSueloCollection(Collection<AnalisisSueloEntity> analisisSueloCollection) {
        this.analisisSueloCollection = analisisSueloCollection;
    }

    public DistanciaSiembraEntity getIdDistanciaSiembra() {
        return idDistanciaSiembra;
    }

    public void setIdDistanciaSiembra(DistanciaSiembraEntity idDistanciaSiembra) {
        this.idDistanciaSiembra = idDistanciaSiembra;
    }

    public EtapaFenologicaEntity getIdEtapaFenologica() {
        return idEtapaFenologica;
    }

    public void setIdEtapaFenologica(EtapaFenologicaEntity idEtapaFenologica) {
        this.idEtapaFenologica = idEtapaFenologica;
    }

    public FincaEntity getIdFinca() {
        return idFinca;
    }

    public void setIdFinca(FincaEntity idFinca) {
        this.idFinca = idFinca;
    }

    public TopografiaEntity getIdTopografia() {
        return idTopografia;
    }

    public void setIdTopografia(TopografiaEntity idTopografia) {
        this.idTopografia = idTopografia;
    }

    public VariedadEntity getIdVariedad() {
        return idVariedad;
    }

    public void setIdVariedad(VariedadEntity idVariedad) {
        this.idVariedad = idVariedad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCultivo != null ? idCultivo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CultivoEntity)) {
            return false;
        }
        CultivoEntity other = (CultivoEntity) object;
        if ((this.idCultivo == null && other.idCultivo != null)
                || (this.idCultivo != null && !this.idCultivo.equals(other.idCultivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.Cultivo[ idCultivo=" + idCultivo + " ]";
    }

}
