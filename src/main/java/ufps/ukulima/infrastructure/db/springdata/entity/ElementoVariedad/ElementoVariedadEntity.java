package ufps.ukulima.infrastructure.db.springdata.entity.ElementoVariedad;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ufps.ukulima.domain.model.Elemento.Elemento;
import ufps.ukulima.infrastructure.db.springdata.entity.Elemento.ElementoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Variedad.VariedadEntity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author santi
 */
@Entity
@Table(name = "elemento_variedad")
@NamedQueries({
        @NamedQuery(name = "ElementoVariedad.findAll", query = "SELECT e FROM ElementoVariedadEntity e"),
        @NamedQuery(name = "ElementoVariedad.findByIdElementoVariedad", query = "SELECT e FROM ElementoVariedadEntity e WHERE e.idElementoVariedad = :idElementoVariedad"),
        @NamedQuery(name = "ElementoVariedad.findByNombre", query = "SELECT e FROM ElementoVariedadEntity e WHERE e.nombre = :nombre"),
        @NamedQuery(name = "ElementoVariedad.findByValorMinimo", query = "SELECT e FROM ElementoVariedadEntity e WHERE e.valorMinimo = :valorMinimo"),
        @NamedQuery(name = "ElementoVariedad.findByValorMaximo", query = "SELECT e FROM ElementoVariedadEntity e WHERE e.valorMaximo = :valorMaximo"),
        @NamedQuery(name = "ElementoVariedad.findByValorOptimo", query = "SELECT e FROM ElementoVariedadEntity e WHERE e.valorOptimo = :valorOptimo")})
public class ElementoVariedadEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_elemento_variedad")
    private Integer idElementoVariedad;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "valor_minimo")
    private int valorMinimo;
    @Basic(optional = false)
    @Column(name = "valor_maximo")
    private int valorMaximo;
    @Basic(optional = false)
    @Column(name = "valor_optimo")
    private int valorOptimo;
    @JoinColumn(name = "id_elemento", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private ElementoEntity idElemento;
    @JoinColumn(name = "id_variedad", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private VariedadEntity idVariedad;

    public ElementoVariedadEntity() {
    }

    public ElementoVariedadEntity(Integer idElementoVariedad) {
        this.idElementoVariedad = idElementoVariedad;
    }

    public ElementoVariedadEntity(Integer idElementoVariedad, String nombre, int valorMinimo, int valorMaximo, int valorOptimo) {
        this.idElementoVariedad = idElementoVariedad;
        this.nombre = nombre;
        this.valorMinimo = valorMinimo;
        this.valorMaximo = valorMaximo;
        this.valorOptimo = valorOptimo;
    }

    public Integer getIdElementoVariedad() {
        return idElementoVariedad;
    }

    public void setIdElementoVariedad(Integer idElementoVariedad) {
        this.idElementoVariedad = idElementoVariedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(int valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public int getValorMaximo() {
        return valorMaximo;
    }

    public void setValorMaximo(int valorMaximo) {
        this.valorMaximo = valorMaximo;
    }

    public int getValorOptimo() {
        return valorOptimo;
    }

    public void setValorOptimo(int valorOptimo) {
        this.valorOptimo = valorOptimo;
    }


    public ElementoEntity getIdElemento() {
        return idElemento;
    }

    public void setIdElemento(ElementoEntity idElemento) {
        this.idElemento = idElemento;
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
        hash += (idElementoVariedad != null ? idElementoVariedad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElementoVariedadEntity that = (ElementoVariedadEntity) o;
        return valorMinimo == that.valorMinimo && valorMaximo == that.valorMaximo && valorOptimo == that.valorOptimo && Objects.equals(idElementoVariedad, that.idElementoVariedad) && Objects.equals(nombre, that.nombre) && Objects.equals(idElemento, that.idElemento) && Objects.equals(idVariedad, that.idVariedad);
    }

    @Override
    public String toString() {
        return "ElementoVariedad[ idElementoVariedad=" + idElementoVariedad + " ]";
    }

}
