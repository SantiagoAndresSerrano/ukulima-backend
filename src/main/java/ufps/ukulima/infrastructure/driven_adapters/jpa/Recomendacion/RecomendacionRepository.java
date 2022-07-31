package ufps.ukulima.infrastructure.driven_adapters.jpa.Recomendacion;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.domain.model.Recomendacion.Recomendacion;

public interface RecomendacionRepository extends JpaRepository<Recomendacion, Integer> {
}
