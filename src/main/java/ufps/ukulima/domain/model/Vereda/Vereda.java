/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.ukulima.domain.model.Vereda;

import ufps.ukulima.domain.model.Corregimiento.Corregimiento;
import ufps.ukulima.domain.model.Finca.Finca;
import java.util.Collection;

/**
 *
 * @author santi
 */
public class Vereda {

    private Integer idVereda;
    private Corregimiento idCorregimiento;
    private String nombre;
    private Collection<Finca> fincaCollection;

    public Vereda() {
    }

    public Vereda(Integer idVereda) {
        this.idVereda = idVereda;
    }

    public Vereda(Integer idVereda, Corregimiento idCorregimiento, String nombre) {
        this.idVereda = idVereda;
        this.idCorregimiento = idCorregimiento;
        this.nombre = nombre;
    }

    public Integer getIdVereda() {
        return idVereda;
    }

    public void setIdVereda(Integer idVereda) {
        this.idVereda = idVereda;
    }

    public Corregimiento getIdCorregimiento() {
        return idCorregimiento;
    }

    public void setIdCorregimiento(Corregimiento idCorregimiento) {
        this.idCorregimiento = idCorregimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Finca> fincaCollection() {
        return fincaCollection;
    }

    public void fincaCollection(Collection<Finca> fincaCollection) {
        this.fincaCollection = fincaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVereda != null ? idVereda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Vereda)) {
            return false;
        }
        Vereda other = (Vereda) object;
        if ((this.idVereda == null && other.idVereda != null)
                || (this.idVereda != null && !this.idVereda.equals(other.idVereda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejercicios.pkgfinal.Vereda[ idVereda=" + idVereda + " ]";
    }

}
