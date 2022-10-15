package ufps.ukulima.domain.model.ElementoVariedad;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ufps.ukulima.domain.model.Elemento.Elemento;
import ufps.ukulima.domain.model.Variedad.Variedad;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotNull;

/**
 *
 * @author santi
 */
public class ElementoVariedad implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idElementoVariedad;
    @NotNull(message = "nombre no puede estar vacío")
    private String nombre;
    private int valorMinimo;
    private int valorMaximo;
    private int valorOptimo;
    @NotNull(message = "El Elemento no puede estar vacío")
    private Elemento idElemento;
    @NotNull(message = "La variedad no puede estar vacío")
    private Variedad idVariedad;

    public ElementoVariedad() {
    }

    public ElementoVariedad(Integer idElementoVariedad) {
        this.idElementoVariedad = idElementoVariedad;
    }

    public ElementoVariedad(Integer idElementoVariedad, String nombre, int valorMinimo, int valorMaximo,
            int valorOptimo) {
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

    public Elemento getIdElemento() {
        return idElemento;
    }

    public void setIdElemento(Elemento idElemento) {
        this.idElemento = idElemento;
    }

    public Variedad getIdVariedad() {
        return idVariedad;
    }

    public void setIdVariedad(Variedad idVariedad) {
        this.idVariedad = idVariedad;
    }

    public void setValorOptimo(int valorOptimo) {
        this.valorOptimo = valorOptimo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idElementoVariedad != null ? idElementoVariedad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ElementoVariedad that = (ElementoVariedad) o;
        return valorMinimo == that.valorMinimo && valorMaximo == that.valorMaximo && valorOptimo == that.valorOptimo
                && Objects.equals(idElementoVariedad, that.idElementoVariedad) && Objects.equals(nombre, that.nombre)
                && Objects.equals(idElemento, that.idElemento) && Objects.equals(idVariedad, that.idVariedad);
    }

    @Override
    public String toString() {
        return "ElementoVariedad[ idElementoVariedad=" + idElementoVariedad + " ]";
    }

}
