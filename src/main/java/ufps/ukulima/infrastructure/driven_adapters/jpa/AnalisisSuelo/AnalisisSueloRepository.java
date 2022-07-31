package ufps.ukulima.infrastructure.driven_adapters.jpa.AnalisisSuelo;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.domain.model.AnalisisSuelo.AnalisisSuelo;

public interface AnalisisSueloRepository extends JpaRepository<AnalisisSuelo, Integer> {
}
