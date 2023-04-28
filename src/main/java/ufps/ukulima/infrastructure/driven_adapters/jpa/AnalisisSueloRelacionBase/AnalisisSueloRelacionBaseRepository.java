package ufps.ukulima.infrastructure.driven_adapters.jpa.AnalisisSueloRelacionBase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisSuelo.AnalisisSueloEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisSueloRelacionBases.AnalisisSueloRelacionBaseEntity;

import java.util.List;

public interface AnalisisSueloRelacionBaseRepository
        extends JpaRepository<AnalisisSueloRelacionBaseEntity, Integer> {
    List<AnalisisSueloRelacionBaseEntity> getAllByIdAnalisisSuelo(@Param("idAnalisisSuelo") AnalisisSueloEntity idAnalisisSuelo);
}
