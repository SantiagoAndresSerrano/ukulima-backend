package ufps.ukulima.infrastructure.driven_adapters.jpa.Cultivo;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.domain.model.Cultivo.Cultivo;

public interface CultivoRepository extends JpaRepository<Cultivo, Integer> {
}
