package ufps.ukulima.infrastructure.driven_adapters.jpa.Lote;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.infrastructure.db.springdata.entity.Lote.LoteEntity;

public interface LoteRepository extends JpaRepository<LoteEntity, Integer> {
}
