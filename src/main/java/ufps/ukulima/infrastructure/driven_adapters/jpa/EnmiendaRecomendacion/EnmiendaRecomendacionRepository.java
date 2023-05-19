package ufps.ukulima.infrastructure.driven_adapters.jpa.EnmiendaRecomendacion;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.infrastructure.db.springdata.entity.EnmiendaRecomendacion.EnmiendaRecomendacionEntity;

public interface EnmiendaRecomendacionRepository extends JpaRepository<EnmiendaRecomendacionEntity, Integer> {
}

