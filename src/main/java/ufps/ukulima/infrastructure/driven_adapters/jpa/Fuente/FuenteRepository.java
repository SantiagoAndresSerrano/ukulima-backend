package ufps.ukulima.infrastructure.driven_adapters.jpa.Fuente;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.domain.model.Fuente.Fuente;

public interface FuenteRepository extends JpaRepository<Fuente, Integer> {
}
