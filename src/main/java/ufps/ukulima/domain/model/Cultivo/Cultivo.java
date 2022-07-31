/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.Cultivo;

import ufps.ukulima.domain.model.AnalisisSuelo.AnalisisSuelo;
import ufps.ukulima.domain.model.DistanciaSiembra.DistanciaSiembra;
import ufps.ukulima.domain.model.EtapaFenologica.EtapaFenologica;
import ufps.ukulima.domain.model.Finca.Finca;
import ufps.ukulima.domain.model.Topografia.Topografia;
import ufps.ukulima.domain.model.Variedad.Variedad;

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
@Table(name = "cultivo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cultivo.findAll", query = "SELECT c FROM Cultivo c"),
    @NamedQuery(name = "Cultivo.findByIdCultivo", query = "SELECT c FROM Cultivo c WHERE c.idCultivo = :idCultivo"),
    @NamedQuery(name = "Cultivo.findByDescripcion", query = "SELECT c FROM Cultivo c WHERE c.descripcion = :descripcion"),
    @NamedQuery(name = "Cultivo.findByPlantasPorHectarea", query = "SELECT c FROM Cultivo c WHERE c.plantasPorHectarea = :plantasPorHectarea")})
public class Cultivo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cultivo")
    private Integer idCultivo;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private int descripcion;
    @Basic(optional = false)
    @Column(name = "plantas_por_hectarea")
    private int plantasPorHectarea;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCultivo")
    private Collection<AnalisisSuelo> analisisSueloCollection;
    @JoinColumn(name = "id_distancia_siembra", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private DistanciaSiembra idDistanciaSiembra;
    @JoinColumn(name = "id_etapa_fenologica", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private EtapaFenologica idEtapaFenologica;
    @JoinColumn(name = "id_finca", referencedColumnName = "id_finca")
    @ManyToOne(optional = false)
    private Finca idFinca;
    @JoinColumn(name = "id_topografia", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Topografia idTopografia;
    @JoinColumn(name = "id_variedad", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Variedad idVariedad;

    public Cultivo() {
    }

    public Cultivo(Integer idCultivo) {
        this.idCultivo = idCultivo;
    }

    public Cultivo(Integer idCultivo, int descripcion, int plantasPorHectarea) {
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

    public int getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(int descripcion) {
        this.descripcion = descripcion;
    }

    public int getPlantasPorHectarea() {
        return plantasPorHectarea;
    }

    public void setPlantasPorHectarea(int plantasPorHectarea) {
        this.plantasPorHectarea = plantasPorHectarea;
    }

    @XmlTransient
    public Collection<AnalisisSuelo> getAnalisisSueloCollection() {
        return analisisSueloCollection;
    }

    public void setAnalisisSueloCollection(Collection<AnalisisSuelo> analisisSueloCollection) {
        this.analisisSueloCollection = analisisSueloCollection;
    }

    public DistanciaSiembra getIdDistanciaSiembra() {
        return idDistanciaSiembra;
    }

    public void setIdDistanciaSiembra(DistanciaSiembra idDistanciaSiembra) {
        this.idDistanciaSiembra = idDistanciaSiembra;
    }

    public EtapaFenologica getIdEtapaFenologica() {
        return idEtapaFenologica;
    }

    public void setIdEtapaFenologica(EtapaFenologica idEtapaFenologica) {
        this.idEtapaFenologica = idEtapaFenologica;
    }

    public Finca getIdFinca() {
        return idFinca;
    }

    public void setIdFinca(Finca idFinca) {
        this.idFinca = idFinca;
    }

    public Topografia getIdTopografia() {
        return idTopografia;
    }

    public void setIdTopografia(Topografia idTopografia) {
        this.idTopografia = idTopografia;
    }

    public Variedad getIdVariedad() {
        return idVariedad;
    }

    public void setIdVariedad(Variedad idVariedad) {
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
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cultivo)) {
            return false;
        }
        Cultivo other = (Cultivo) object;
        if ((this.idCultivo == null && other.idCultivo != null) || (this.idCultivo != null && !this.idCultivo.equals(other.idCultivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.Cultivo[ idCultivo=" + idCultivo + " ]";
    }
    
}
