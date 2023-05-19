/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.Enmienda;

import ufps.ukulima.domain.model.Recomendacion.Recomendacion;

import java.util.Collection;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 *
 * @author santi
 */
public class Enmienda {

    private Integer id;
    @NotBlank(message = "El nombre no puede estar en blanco")
    @NotNull(message = "El nombre no puede estar vacía")
    private String nombre;
    private String valor;
    private String formula;
    private Collection<Recomendacion> recomendacionCollection;

    public Enmienda() {
    }

    public Enmienda(Integer id) {
        this.id = id;
    }

    public Enmienda(Integer id, String nombre, String valor, String formula) {
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
        this.formula = formula;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public Collection<Recomendacion> getRecomendacionCollection() {
        return recomendacionCollection;
    }

    public void setRecomendacionCollection(Collection<Recomendacion> recomendacionCollection) {
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

        if (!(object instanceof Enmienda)) {
            return false;
        }
        Enmienda other = (Enmienda) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Enmienda{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", valor='" + valor + '\'' +
                ", formula='" + formula + '\'' +
                '}';
    }
}
