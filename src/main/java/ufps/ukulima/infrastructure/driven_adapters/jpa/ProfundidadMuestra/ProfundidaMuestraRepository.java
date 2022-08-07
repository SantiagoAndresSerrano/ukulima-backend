package ufps.ukulima.infrastructure.driven_adapters.jpa.ProfundidadMuestra;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.infrastructure.db.springdata.entity.ProfundidadMuestra.ProfundidadMuestraEntity;

public interface ProfundidaMuestraRepository extends JpaRepository<ProfundidadMuestraEntity, Integer> {
}
