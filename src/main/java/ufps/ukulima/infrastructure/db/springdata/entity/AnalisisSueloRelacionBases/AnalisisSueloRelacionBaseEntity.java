package ufps.ukulima.infrastructure.db.springdata.entity.AnalisisSueloRelacionBases;

import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisSuelo.AnalisisSueloEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.RelacionBase.RelacionBaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "analisis_suelo_relacion_bases")
public class AnalisisSueloRelacionBaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne( optional = false)
    @JoinColumn(name = "id_relacion_base", nullable = false)
    private RelacionBaseEntity idRelacionBase;


    @JoinColumn(name = "id_analisis_suelo", referencedColumnName = "id_analisis_suelo")
    @ManyToOne(optional = false)
    private AnalisisSueloEntity idAnalisisSuelo;

    public AnalisisSueloRelacionBaseEntity() {
    }

    public AnalisisSueloRelacionBaseEntity(Integer id) {
        this.id = id;
    }

    public AnalisisSueloRelacionBaseEntity(Integer id, RelacionBaseEntity idRelacionBase, AnalisisSueloEntity idAnalisisSuelo, Float valor) {
        this.id = id;
        this.idRelacionBase = idRelacionBase;
        this.idAnalisisSuelo = idAnalisisSuelo;
        this.valor = valor;
    }

    @Column(name = "valor", nullable = false)
    private Float valor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RelacionBaseEntity getIdRelacionBase() {
        return idRelacionBase;
    }

    public void setIdRelacionBase(RelacionBaseEntity idRelacionBase) {
        this.idRelacionBase = idRelacionBase;
    }

    public AnalisisSueloEntity analisisSuelo() {
        return idAnalisisSuelo;
    }

    public void setIdAnalisisSuelo(AnalisisSueloEntity idAnalisisSuelo) {
        this.idAnalisisSuelo = idAnalisisSuelo;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "AnalisisSueloRelacionBase{" +
                "id=" + id +
                ", idRelacionBase=" + idRelacionBase +
                ", idAnalisisSuelo=" + idAnalisisSuelo +
                ", valor=" + valor +
                '}';
    }
}