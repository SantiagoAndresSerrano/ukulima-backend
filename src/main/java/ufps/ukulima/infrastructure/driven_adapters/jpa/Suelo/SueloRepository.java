package ufps.ukulima.infrastructure.driven_adapters.jpa.Suelo;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ufps.ukulima.infrastructure.db.springdata.entity.Suelo.SueloEntity;

import java.util.List;

public interface SueloRepository extends JpaRepository<SueloEntity, Integer> {

    @Query(value = "select * from suelo where suelo.id_lote =:idLote",nativeQuery = true)
    List<SueloEntity> getAllByLote(@Param("idLote") int idLote);
}

