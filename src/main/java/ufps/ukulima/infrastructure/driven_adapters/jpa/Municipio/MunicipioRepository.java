package ufps.ukulima.infrastructure.driven_adapters.jpa.Municipio;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.domain.model.Municipio.Municipio;

public interface MunicipioRepository extends JpaRepository<Municipio, Integer> {
}
