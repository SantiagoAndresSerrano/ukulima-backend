package ufps.ukulima.infrastructure.driven_adapters.jpa.Cultivo;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.infrastructure.db.springdata.entity.Cultivo.CultivoEntity;

public interface CultivoRepository extends JpaRepository<CultivoEntity, Integer> {
}
