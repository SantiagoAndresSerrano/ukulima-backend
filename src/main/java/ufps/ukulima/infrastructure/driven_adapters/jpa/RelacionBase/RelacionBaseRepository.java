package ufps.ukulima.infrastructure.driven_adapters.jpa.RelacionBase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ufps.ukulima.infrastructure.db.springdata.entity.RelacionBase.RelacionBaseEntity;

public interface RelacionBaseRepository extends JpaRepository<RelacionBaseEntity, Integer> {

    @Query(value = "select rb.interpretacion, rb.formula,rb.id,rb.valor_min ,rb.valor_max ,rb.id_elemento_1 ,rb.id_elemento2 ,rb.id_elemento_3\n" +
            "from relacion_base rb \n" +
            " join elemento el on el.id = rb.id_elemento_1 and el.nombre = \"CALCIO (Ca)\"\n" +
            " join elemento el2 on el2.id = rb.id_elemento2  and el2.nombre = \"MAGNESIO (Mg)\"\n" +
            "where rb.valor_min <= :value and rb.valor_max >= :value and rb.id_elemento_3 = 0",nativeQuery = true)
    RelacionBaseEntity findRelacionCalMag(@Param("value") float value);
    @Query(value = "select rb.interpretacion, rb.formula,rb.id,rb.valor_min ,rb.valor_max ,rb.id_elemento_1 ,rb.id_elemento2 ,rb.id_elemento_3\n" +
            "from relacion_base rb \n" +
            " join elemento el on el.id = rb.id_elemento_1 and el.nombre = \"CALCIO (Ca)\"\n" +
            " join elemento el2 on el2.id = rb.id_elemento2  and el2.nombre = \"POTASIO (K)\"\n" +
            "where rb.valor_min <= :value and rb.valor_max >= :value and rb.id_elemento_3 = 0",nativeQuery = true)
    RelacionBaseEntity findRelacionCalPot(@Param("value") float value);

    @Query(value = "select rb.interpretacion, rb.formula,rb.id,rb.valor_min ,rb.valor_max ,rb.id_elemento_1 ,rb.id_elemento2 ,rb.id_elemento_3\n" +
            "    from relacion_base rb\n" +
            "    join elemento el on el.id = rb.id_elemento_1 and el.nombre = \"CALCIO (Ca)\"\n" +
            "    join elemento el2 on el2.id = rb.id_elemento2  and el2.nombre = \"MAGNESIO (Mg)\"\n" +
            "    join elemento el3 on el3.id = rb.id_elemento_3  and el3.nombre = \"POTASIO (K)\"\n" +
            "    where rb.valor_min <= :value and rb.valor_max >= :value",nativeQuery = true)
    RelacionBaseEntity findRelacionBasesPrincipales(@Param("value") float value);


}
