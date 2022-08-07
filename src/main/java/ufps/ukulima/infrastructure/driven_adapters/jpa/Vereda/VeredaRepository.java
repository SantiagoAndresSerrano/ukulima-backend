package ufps.ukulima.infrastructure.driven_adapters.jpa.Vereda;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.infrastructure.db.springdata.entity.Vereda.VeredaEntity;

public interface VeredaRepository extends JpaRepository<VeredaEntity, Integer> {
}
