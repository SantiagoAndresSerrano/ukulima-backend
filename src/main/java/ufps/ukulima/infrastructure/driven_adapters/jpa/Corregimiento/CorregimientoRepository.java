package ufps.ukulima.infrastructure.driven_adapters.jpa.Corregimiento;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.domain.model.Corregimiento.Corregimiento;

public interface CorregimientoRepository extends JpaRepository<Corregimiento, Integer> {
}
