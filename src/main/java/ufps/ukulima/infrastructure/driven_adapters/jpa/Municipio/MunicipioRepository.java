package ufps.ukulima.infrastructure.driven_adapters.jpa.Municipio;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.infrastructure.db.springdata.entity.Municipio.MunicipioEntity;

public interface MunicipioRepository extends JpaRepository<MunicipioEntity, Integer> {
}
