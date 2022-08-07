package ufps.ukulima.infrastructure.driven_adapters.jpa.AnalisisSuelo;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisSuelo.AnalisisSueloEntity;

public interface AnalisisSueloRepository extends JpaRepository<AnalisisSueloEntity, Integer> {
}
