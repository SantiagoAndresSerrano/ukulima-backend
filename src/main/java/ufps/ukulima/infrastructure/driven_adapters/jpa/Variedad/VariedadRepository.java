package ufps.ukulima.infrastructure.driven_adapters.jpa.Variedad;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.domain.model.Variedad.Variedad;

public interface VariedadRepository extends JpaRepository<Variedad, Integer> {
}
