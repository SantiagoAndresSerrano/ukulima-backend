package ufps.ukulima.infrastructure.driven_adapters.jpa.Corregimiento;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.infrastructure.db.springdata.entity.Corregimiento.CorregimientoEntity;

public interface CorregimientoRepository extends JpaRepository<CorregimientoEntity, Integer> {
}
