package ufps.ukulima.domain.model.Lote;

import ufps.ukulima.domain.model.Finca.Finca;
import ufps.ukulima.domain.model.Suelo.Suelo;

import java.util.List;

public class Lote {

    private Integer id;
    private Finca idFinca;
    private List<Suelo> suelos;
    private String descripcion;

    public Lote() {
    }
    public Lote(Integer id) {
        this.id = id;
    }
    public Lote(Integer id, Finca idFinca) {
        this.id = id;
        this.idFinca = idFinca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Suelo> getSuelos() {
        return suelos;
    }

    public void setSuelos(List<Suelo> suelos) {
        this.suelos = suelos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Finca getIdFinca() {
        return idFinca;
    }

    public void setIdFinca(Finca idFinca) {
        this.idFinca = idFinca;
    }
}
