package ufps.ukulima.infrastructure.driven_adapters.jpa.ElementoVariedad;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.domain.model.ElementoVariedad.ElementoVariedad;
import ufps.ukulima.infrastructure.db.springdata.entity.ElementoVariedad.ElementoVariedadEntity;

public interface ElementoVariedadRepository extends JpaRepository<ElementoVariedadEntity, Integer> {
}
