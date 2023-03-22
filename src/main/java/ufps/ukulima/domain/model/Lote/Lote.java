package ufps.ukulima.domain.model.Lote;

import ufps.ukulima.domain.model.Finca.Finca;

public class Lote {

    private Integer id;
    private Finca idFinca;

    public Lote() {
    }

    public Lote(Integer id, Finca idFinca) {
        this.id = id;
        this.idFinca = idFinca;
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
