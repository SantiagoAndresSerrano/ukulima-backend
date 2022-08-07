package ufps.ukulima.infrastructure.driven_adapters.jpa.Recomendacion;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.infrastructure.db.springdata.entity.Recomendacion.RecomendacionEntity;

public interface RecomendacionRepository extends JpaRepository<RecomendacionEntity, Integer> {
}
