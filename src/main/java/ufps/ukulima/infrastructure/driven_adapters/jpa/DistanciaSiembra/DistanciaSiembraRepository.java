package ufps.ukulima.infrastructure.driven_adapters.jpa.DistanciaSiembra;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.domain.model.DistanciaSiembra.DistanciaSiembra;

public interface DistanciaSiembraRepository extends JpaRepository<DistanciaSiembra, Integer> {
}
