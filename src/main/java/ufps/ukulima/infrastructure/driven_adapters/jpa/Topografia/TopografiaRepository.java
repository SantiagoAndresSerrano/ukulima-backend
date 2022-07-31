package ufps.ukulima.infrastructure.driven_adapters.jpa.Topografia;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.domain.model.Topografia.Topografia;

public interface TopografiaRepository extends JpaRepository<Topografia, Integer> {
}
