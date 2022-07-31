package ufps.ukulima.infrastructure.driven_adapters.jpa.Densidad;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.domain.model.Densidad.Densidad;

public interface DensidadRepository extends JpaRepository<Densidad, Integer> {
}
