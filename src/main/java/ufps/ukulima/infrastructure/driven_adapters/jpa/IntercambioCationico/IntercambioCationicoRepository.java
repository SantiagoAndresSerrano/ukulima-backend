package ufps.ukulima.infrastructure.driven_adapters.jpa.IntercambioCationico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ufps.ukulima.infrastructure.db.springdata.entity.AluminioIntercambiable.AluminioIntercambiableEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.IntercambioCationico.IntercambioCationicoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.PhSuelo.PhSueloEntity;

public interface IntercambioCationicoRepository extends JpaRepository<IntercambioCationicoEntity, Integer> {
    @Query(value = "SELECT * FROM intercambio_cationico where intercambio_cationico.valor_min <= :valor_intercambio_cationico and " +
            "intercambio_cationico.valor_max >= :valor_intercambio_cationico limit 1;",
            nativeQuery = true)
    IntercambioCationicoEntity determinarIntercambioCationico(@Param("valor_intercambio_cationico") float valor_intercambio_cationico);
}
