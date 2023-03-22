package ufps.ukulima.infrastructure.driven_adapters.jpa.DeterminacionClaseTextural;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.infrastructure.db.springdata.entity.AluminioIntercambiable.AluminioIntercambiableEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.DeterminacionClaseTextural.DeterminacionClaseTexturalEntity;

public interface DeterminacionClaseTexturalRepository extends JpaRepository<DeterminacionClaseTexturalEntity, Integer> {
}
