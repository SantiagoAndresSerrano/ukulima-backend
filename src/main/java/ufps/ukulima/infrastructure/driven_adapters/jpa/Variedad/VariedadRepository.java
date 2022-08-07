package ufps.ukulima.infrastructure.driven_adapters.jpa.Variedad;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.infrastructure.db.springdata.entity.Variedad.VariedadEntity;

public interface VariedadRepository extends JpaRepository<VariedadEntity, Integer> {
}
