/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.infrastructure.db.springdata.entity.Enmienda;

import ufps.ukulima.infrastructure.db.springdata.entity.Recomendacion.RecomendacionEntity;

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

/**
 *
 * @author santi
 */
@Entity
@Table(name = "enmienda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Enmienda.findAll", query = "SELECT e FROM EnmiendaEntity e"),
    @NamedQuery(name = "Enmienda.findById", query = "SELECT e FROM EnmiendaEntity e WHERE e.id = :id")})
public class EnmiendaEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;

    @Basic(optional = false)
    @Column(name = "formula")
    private String formula;

    @Basic(optional = false)
    @Column(name = "valor")
    private String valor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "id")
    private Collection<RecomendacionEntity> recomendacionCollection;

    public EnmiendaEntity() {
    }

    public EnmiendaEntity(Integer id) {
        this.id = id;
    }

    public EnmiendaEntity(Integer id, String nombre, String formula, String valor) {
        this.id = id;
        this.nombre = nombre;
        this.formula = formula;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Collection<RecomendacionEntity> recomendacionCollection() {
        return recomendacionCollection;
    }

    public void setRecomendacionCollection(Collection<RecomendacionEntity> recomendacionCollection) {
        this.recomendacionCollection = recomendacionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof EnmiendaEntity)) {
            return false;
        }
        EnmiendaEntity other = (EnmiendaEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EnmiendaEntity{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", formula='" + formula + '\'' +
                ", valor='" + valor + '\'' +
                '}';
    }
}
