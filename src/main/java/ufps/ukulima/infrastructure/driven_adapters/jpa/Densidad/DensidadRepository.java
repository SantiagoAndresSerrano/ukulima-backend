package ufps.ukulima.infrastructure.driven_adapters.jpa.Densidad;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.infrastructure.db.springdata.entity.Densidad.DensidadEntity;

public interface DensidadRepository extends JpaRepository<DensidadEntity, Integer> {
}
