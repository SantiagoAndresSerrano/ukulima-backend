package ufps.ukulima.infrastructure.driven_adapters.jpa.FuenteRecomendacion;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.infrastructure.db.springdata.entity.FuenteRecomendacion.FuenteRecomendacionEntity;

public interface FuenteRecomendacionRepository extends JpaRepository<FuenteRecomendacionEntity, Integer> {
}
