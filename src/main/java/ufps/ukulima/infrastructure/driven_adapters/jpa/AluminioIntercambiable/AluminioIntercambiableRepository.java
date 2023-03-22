package ufps.ukulima.infrastructure.driven_adapters.jpa.AluminioIntercambiable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ufps.ukulima.infrastructure.db.springdata.entity.AluminioIntercambiable.AluminioIntercambiableEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.PhSuelo.PhSueloEntity;

public interface AluminioIntercambiableRepository extends JpaRepository<AluminioIntercambiableEntity, Integer> {
    @Query(value = "SELECT * FROM aluminio_intercambiable where aluminio_intercambiable.valor_min <= :aluminio_intercambiable and " +
            "aluminio_intercambiable.valor_max >= :aluminio_intercambiable ;",nativeQuery = true)
    AluminioIntercambiableEntity determinarAluminioIntercambiable(@Param("aluminio_intercambiable") float aluminio_intercambiable);

}
