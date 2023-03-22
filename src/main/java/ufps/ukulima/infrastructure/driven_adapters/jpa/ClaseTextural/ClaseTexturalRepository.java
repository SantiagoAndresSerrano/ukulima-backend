package ufps.ukulima.infrastructure.driven_adapters.jpa.ClaseTextural;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ufps.ukulima.infrastructure.db.springdata.entity.ClaseTextural.ClaseTexturalEntity;

import java.util.List;

public interface ClaseTexturalRepository extends JpaRepository<ClaseTexturalEntity, Integer> {
    @Query(value = "SELECT clase_textural.id_clase_textural, clase_textural.nombre, clase_textural.sigla FROM (SELECT" +
            " * FROM determinacion_clase_textural as dtc WHERE dtc.valor_min <= :porcent_arena AND dtc.valor_max >= " +
            ":porcent_arena AND dtc.contenido = 'ARENA') as valor_arena JOIN (SELECT * FROM " +
            "determinacion_clase_textural as dtc WHERE dtc.valor_min <= :porcent_limo AND dtc.valor_max >= " +
            ":porcent_limo AND dtc.contenido = 'LIMO') as valor_limos ON valor_arena.id_clase_textural = valor_limos" +
            ".id_clase_textural JOIN (SELECT * FROM determinacion_clase_textural as dtc WHERE dtc.valor_min <= " +
            ":porcent_arcilla AND dtc.valor_max >= :porcent_arcilla AND dtc.contenido = 'ARCILLA') as valor_arcilla " +
            "ON valor_limos.id_clase_textural = valor_arcilla.id_clase_textural inner join clase_textural ON " +
            "valor_arena.id_clase_textural=clase_textural.id_clase_textural limit 1;", nativeQuery = true)

    ClaseTexturalEntity getClaseTexturalByRangos(@Param("porcent_arena") float porcent_arena,
                                                      @Param("porcent_limo") float porcent_limo,
                                                      @Param("porcent_arcilla") float porcent_arcilla);
}
