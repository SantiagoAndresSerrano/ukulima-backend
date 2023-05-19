package ufps.ukulima.infrastructure.db.springdata.entity.EnmiendaRecomendacion;
import ufps.ukulima.infrastructure.db.springdata.entity.Enmienda.EnmiendaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Recomendacion.RecomendacionEntity;

import javax.persistence.*;

@Entity
@Table(name = "enmienda_recomendacion")
public class EnmiendaRecomendacionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_enmienda", referencedColumnName = "id")
    private EnmiendaEntity enmienda;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_recomendacion", referencedColumnName = "id")
    private RecomendacionEntity recomendacion;

    private Float valor;

    public EnmiendaRecomendacionEntity() {
    }

    public EnmiendaRecomendacionEntity(EnmiendaEntity enmienda, RecomendacionEntity recomendacion, Float valor) {
        this.enmienda = enmienda;
        this.recomendacion = recomendacion;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EnmiendaEntity getEnmienda() {
        return enmienda;
    }

    public void setEnmienda(EnmiendaEntity enmienda) {
        this.enmienda = enmienda;
    }

    public RecomendacionEntity recomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(RecomendacionEntity recomendacion) {
        this.recomendacion = recomendacion;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
}
