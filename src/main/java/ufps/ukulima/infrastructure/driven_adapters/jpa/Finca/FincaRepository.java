package ufps.ukulima.infrastructure.driven_adapters.jpa.Finca;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.domain.model.Finca.Finca;

public interface FincaRepository extends JpaRepository<Finca, Integer> {
}
