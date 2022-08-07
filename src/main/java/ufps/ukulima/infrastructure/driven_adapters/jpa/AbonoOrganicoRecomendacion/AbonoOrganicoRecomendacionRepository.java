package ufps.ukulima.infrastructure.driven_adapters.jpa.AbonoOrganicoRecomendacion;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.infrastructure.db.springdata.entity.AbonoOrganicoRecomendacion.AbonoOrganicoRecomendacionEntity;

public interface AbonoOrganicoRecomendacionRepository extends JpaRepository<AbonoOrganicoRecomendacionEntity, Integer> {
}
