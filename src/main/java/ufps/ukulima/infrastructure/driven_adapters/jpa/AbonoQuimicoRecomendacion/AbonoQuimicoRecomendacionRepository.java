package ufps.ukulima.infrastructure.driven_adapters.jpa.AbonoQuimicoRecomendacion;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.infrastructure.db.springdata.entity.AbonoQuimicoRecomendacion.AbonoQuimicoRecomendacionEntity;

public interface AbonoQuimicoRecomendacionRepository extends JpaRepository<AbonoQuimicoRecomendacionEntity, Integer> {
}
