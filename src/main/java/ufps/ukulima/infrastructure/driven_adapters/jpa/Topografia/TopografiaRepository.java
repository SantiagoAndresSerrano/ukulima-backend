package ufps.ukulima.infrastructure.driven_adapters.jpa.Topografia;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.infrastructure.db.springdata.entity.Topografia.TopografiaEntity;

public interface TopografiaRepository extends JpaRepository<TopografiaEntity, Integer> {
}
