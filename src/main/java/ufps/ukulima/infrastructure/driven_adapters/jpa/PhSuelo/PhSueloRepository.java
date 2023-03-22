package ufps.ukulima.infrastructure.driven_adapters.jpa.PhSuelo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ufps.ukulima.infrastructure.db.springdata.entity.PhSuelo.PhSueloEntity;

public interface PhSueloRepository extends JpaRepository<PhSueloEntity, Integer> {
    @Query(value = "SELECT * FROM ph_suelo where ph_suelo.valor_min <= :valor_ph and ph_suelo.valor_max >= :valor_ph ;",
            nativeQuery = true)
    PhSueloEntity determinarPhSuelo(@Param("valor_ph") float valor_ph);
}
