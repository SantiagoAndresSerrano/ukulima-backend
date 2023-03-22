package ufps.ukulima.infrastructure.driven_adapters.jpa.Suelo;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.infrastructure.db.springdata.entity.Suelo.SueloEntity;

public interface SueloRepository extends JpaRepository<SueloEntity, Integer> {
}

