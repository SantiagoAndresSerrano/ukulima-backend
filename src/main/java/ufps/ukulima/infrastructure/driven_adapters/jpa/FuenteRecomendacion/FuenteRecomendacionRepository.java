package ufps.ukulima.infrastructure.driven_adapters.jpa.FuenteRecomendacion;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.domain.model.FuenteRecomendacion.FuenteRecomendacion;

public interface FuenteRecomendacionRepository extends JpaRepository<FuenteRecomendacion, Integer> {
}
