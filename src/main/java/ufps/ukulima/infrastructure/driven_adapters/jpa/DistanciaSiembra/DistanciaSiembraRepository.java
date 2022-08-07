package ufps.ukulima.infrastructure.driven_adapters.jpa.DistanciaSiembra;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.infrastructure.db.springdata.entity.DistanciaSiembra.DistanciaSiembraEntity;

public interface DistanciaSiembraRepository extends JpaRepository<DistanciaSiembraEntity, Integer> {
}
