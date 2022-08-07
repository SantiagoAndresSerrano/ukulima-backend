/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.AnalisisElemento;
import ufps.ukulima.domain.model.AnalisisSuelo.AnalisisSuelo;
import ufps.ukulima.domain.model.Elemento.Elemento;


/**
 *
 * @author santi
 */
public class AnalisisElemento  {

    private Integer id;
    private float valor;
    private AnalisisSuelo idAnalisisSuelo;
    private Elemento idElemento;

    public AnalisisElemento() {
    }

    public AnalisisElemento(Integer id) {
        this.id = id;
    }

    public AnalisisElemento(Integer id, float valor) {
        this.id = id;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public AnalisisSuelo getIdAnalisisSuelo() {
        return idAnalisisSuelo;
    }

    public void setIdAnalisisSuelo(AnalisisSuelo idAnalisisSuelo) {
        this.idAnalisisSuelo = idAnalisisSuelo;
    }

    public Elemento getIdElemento() {
        return idElemento;
    }

    public void setIdElemento(Elemento idElemento) {
        this.idElemento = idElemento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof AnalisisElemento)) {
            return false;
        }
        AnalisisElemento other = (AnalisisElemento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.AnalisisElemento[ id=" + id + " ]";
    }
    
}
