package ufps.ukulima.infrastructure.driven_adapters.jpa.AnalisisSuelo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisSuelo.AnalisisSueloEntity;

import java.util.List;

public interface AnalisisSueloRepository extends JpaRepository<AnalisisSueloEntity, Integer> {


    @Query(value="" +
            "select as2.* from analisis_suelo as2\n" +
            "inner join suelo s on s.id = as2.id_suelo\n" +
            "inner join lote l on l.id = s.id_lote \n" +
            "where l.id = :idLote" +
            "",nativeQuery = true)
    List<AnalisisSueloEntity> finAllByLotes(@Param("idLote") int idLote);
}
