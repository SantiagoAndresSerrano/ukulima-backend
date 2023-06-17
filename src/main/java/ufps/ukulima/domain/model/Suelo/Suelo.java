package ufps.ukulima.domain.model.Suelo;
import ufps.ukulima.domain.model.Finca.Finca;
import ufps.ukulima.domain.model.Lote.Lote;

public class Suelo {
    private Integer id;
    private Lote idLote;

    private String descripcion;
    public Suelo() {
    }

    public Suelo(Integer id, Lote idLote) {
        this.id = id;
        this.idLote = idLote;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Lote getIdLote() {
        return idLote;
    }

    public void setIdLote(Lote idLote) {
        this.idLote = idLote;
    }
}
