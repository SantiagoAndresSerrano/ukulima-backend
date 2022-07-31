package ufps.ukulima.infrastructure.driven_adapters.jpa.Vereda;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.domain.model.Vereda.Vereda;

public interface VeredaRepository extends JpaRepository<Vereda, Integer> {
}
