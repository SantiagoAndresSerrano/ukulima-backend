package ufps.ukulima.infrastructure.driven_adapters.jpa.Fuente;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.infrastructure.db.springdata.entity.Fuente.FuenteEntity;

public interface FuenteRepository extends JpaRepository<FuenteEntity, Integer> {
}
