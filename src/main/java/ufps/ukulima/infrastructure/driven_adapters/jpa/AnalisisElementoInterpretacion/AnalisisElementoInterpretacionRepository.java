package ufps.ukulima.infrastructure.driven_adapters.jpa.AnalisisElementoInterpretacion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ufps.ukulima.domain.model.AnalisisElementoInterpretacion.dto.AnalisisElementoInterpretacionDTO;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisElemento.AnalisisElementosEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisElementoInterpretacion.AnalisisElementoInterpretacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Elemento.ElementoEntity;

import java.util.List;

public interface AnalisisElementoInterpretacionRepository extends JpaRepository<AnalisisElementoInterpretacionEntity, Integer> {

    @Query(value = "SELECT valor_magnesio.aei_interpretacion as interpretacion,valor_magnesio.aei_id as id," +
            "valor_magnesio.aei_id_elemento as id_elemento,0 as valor_max,0 as valor_min\n" +
            "FROM (\n" +
            "  SELECT aei.id AS aei_id, aei.id_elemento AS aei_id_elemento, aei.valor_min AS aei_valor_min, aei.valor_max AS aei_valor_max, aei.interpretacion AS aei_interpretacion\n" +
            "  FROM analisis_elemento_interpretacion aei\n" +
            "  JOIN elemento el ON el.id = aei.id_elemento\n" +
            "  WHERE aei.valor_min <= :valorF AND aei.valor_max >= :valorF AND el.nombre = 'FÓSFORO (P)'\n" +
            ") AS valor_fosforo\n" +
            "JOIN (\n" +
            "  SELECT aei.id AS aei_id, aei.id_elemento AS aei_id_elemento, aei.valor_min AS aei_valor_min, aei.valor_max AS aei_valor_max, aei.interpretacion AS aei_interpretacion\n" +
            "  FROM analisis_elemento_interpretacion aei\n" +
            "  JOIN elemento el ON el.id = aei.id_elemento\n" +
            "  WHERE aei.valor_min <= :valorP AND aei.valor_max >= :valorP AND el.nombre = 'POTASIO (K)'\n" +
            ") AS valor_potasio\n" +
            "ON valor_fosforo.aei_interpretacion = valor_potasio.aei_interpretacion\n" +
            "JOIN (\n" +
            "  SELECT aei.id AS aei_id, aei.id_elemento AS aei_id_elemento, aei.valor_min AS aei_valor_min, aei.valor_max AS aei_valor_max, aei.interpretacion AS aei_interpretacion\n" +
            "  FROM analisis_elemento_interpretacion aei\n" +
            "  JOIN elemento el ON el.id = aei.id_elemento\n" +
            "  WHERE aei.valor_min <= :valorM AND aei.valor_max >= :valorM AND el.nombre = 'MAGNESIO (Mg)'\n" +
            ") AS valor_magnesio\n" +
            "ON valor_potasio.aei_interpretacion = valor_magnesio.aei_interpretacion\n" +
            "JOIN (\n" +
            "  SELECT aei.id AS aei_id, aei.id_elemento AS aei_id_elemento, aei.valor_min AS aei_valor_min, aei.valor_max AS aei_valor_max, aei.interpretacion AS aei_interpretacion\n" +
            "  FROM analisis_elemento_interpretacion aei\n" +
            "  JOIN elemento el ON el.id = aei.id_elemento\n" +
            "  WHERE aei.valor_min <= :valorC AND aei.valor_max >= :valorC AND el.nombre = 'CALCIO (Ca)'\n" +
            ") AS valor_calcio\n" +
            "ON valor_magnesio.aei_interpretacion = valor_calcio.aei_interpretacion and valor_calcio.aei_interpretacion = \"Muy Bajo\"\n", nativeQuery = true)
    List<AnalisisElementoInterpretacionEntity> obtenerInterpretacionMuyBajos(@Param("valorF") float valorF,
                                                                             @Param("valorP") float valorP,
                                                                             @Param("valorC") float valorC,
                                                                             @Param("valorM") float valorM);


    @Query(value = "SELECT valor_magnesio.aei_interpretacion as interpretacion,valor_magnesio.aei_id as id," +
            "valor_magnesio.aei_id_elemento as id_elemento,0 as valor_max,0 as valor_min\n" +
            "FROM (\n" +
            "  SELECT aei.id AS aei_id, aei.id_elemento AS aei_id_elemento, aei.valor_min AS aei_valor_min, aei.valor_max AS aei_valor_max, aei.interpretacion AS aei_interpretacion\n" +
            "  FROM analisis_elemento_interpretacion aei\n" +
            "  JOIN elemento el ON el.id = aei.id_elemento\n" +
            "  WHERE aei.valor_min <= :valorF AND aei.valor_max >= :valorF AND el.nombre = 'FÓSFORO (P)'\n" +
            ") AS valor_fosforo\n" +
            "JOIN (\n" +
            "  SELECT aei.id AS aei_id, aei.id_elemento AS aei_id_elemento, aei.valor_min AS aei_valor_min, aei.valor_max AS aei_valor_max, aei.interpretacion AS aei_interpretacion\n" +
            "  FROM analisis_elemento_interpretacion aei\n" +
            "  JOIN elemento el ON el.id = aei.id_elemento\n" +
            "  WHERE aei.valor_min <= :valorP AND aei.valor_max >= :valorP AND el.nombre = 'POTASIO (K)'\n" +
            ") AS valor_potasio\n" +
            "ON valor_fosforo.aei_interpretacion = valor_potasio.aei_interpretacion\n" +
            "JOIN (\n" +
            "  SELECT aei.id AS aei_id, aei.id_elemento AS aei_id_elemento, aei.valor_min AS aei_valor_min, aei.valor_max AS aei_valor_max, aei.interpretacion AS aei_interpretacion\n" +
            "  FROM analisis_elemento_interpretacion aei\n" +
            "  JOIN elemento el ON el.id = aei.id_elemento\n" +
            "  WHERE aei.valor_min <= :valorM AND aei.valor_max >= :valorM AND el.nombre = 'MAGNESIO (Mg)'\n" +
            ") AS valor_magnesio\n" +
            "ON valor_potasio.aei_interpretacion = valor_magnesio.aei_interpretacion\n" +
            "JOIN (\n" +
            "  SELECT aei.id AS aei_id, aei.id_elemento AS aei_id_elemento, aei.valor_min AS aei_valor_min, aei.valor_max AS aei_valor_max, aei.interpretacion AS aei_interpretacion\n" +
            "  FROM analisis_elemento_interpretacion aei\n" +
            "  JOIN elemento el ON el.id = aei.id_elemento\n" +
            "  WHERE aei.valor_min <= :valorC AND aei.valor_max >= :valorC AND el.nombre = 'CALCIO (Ca)'\n" +
            ") AS valor_calcio\n" +
            "ON valor_magnesio.aei_interpretacion = valor_calcio.aei_interpretacion\n" +
            "JOIN (\n" +
            "  SELECT aei.id AS aei_id, aei.id_elemento AS aei_id_elemento, aei.valor_min AS aei_valor_min, aei.valor_max AS aei_valor_max, aei.interpretacion AS aei_interpretacion\n" +
            "  FROM analisis_elemento_interpretacion aei\n" +
            "  JOIN elemento el ON el.id = aei.id_elemento\n" +
            "  WHERE aei.valor_min <= :valorS AND aei.valor_max >= :valorS AND el.nombre = 'SODIO (Na)'\n" +
            ") AS valor_sodio\n" +
            "ON valor_fosforo.aei_interpretacion = valor_sodio.aei_interpretacion\n" +
            "JOIN (\n" +
            "  SELECT aei.id AS aei_id, aei.id_elemento AS aei_id_elemento, aei.valor_min AS aei_valor_min, aei.valor_max AS aei_valor_max, aei.interpretacion AS aei_interpretacion\n" +
            "  FROM analisis_elemento_interpretacion aei\n" +
            "  JOIN elemento el ON el.id = aei.id_elemento\n" +
            "  WHERE aei.valor_min <= :valorA AND aei.valor_max >= :valorA AND el.nombre = 'AZUFRE (S)'\n" +
            ") AS valor_azufre\n" +
            "ON valor_fosforo.aei_interpretacion = valor_sodio.aei_interpretacion;", nativeQuery = true)
    List<AnalisisElementoInterpretacionEntity> obtenerInterpretacionVarias(@Param("valorF") float valorF,
                                                                           @Param("valorP") float valorP,
                                                                           @Param("valorC") float valorC,
                                                                           @Param("valorM") float valorM,
                                                                           @Param("valorS") float valorS,
                                                                           @Param("valorA") float valorA);

    AnalisisElementoInterpretacionEntity getAnalisisElementoInterpretacionEntityByIdElementoAndInterpretacion(
            @Param("idElemento") ElementoEntity idElemento, @Param("interpretacion") String interpretacion);
}
