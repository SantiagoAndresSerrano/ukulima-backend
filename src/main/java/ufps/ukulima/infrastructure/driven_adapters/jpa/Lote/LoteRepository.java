package ufps.ukulima.infrastructure.driven_adapters.jpa.Lote;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.infrastructure.db.springdata.entity.Finca.FincaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Lote.LoteEntity;

import java.util.List;

public interface LoteRepository extends JpaRepository<LoteEntity, Integer> {

    List<LoteEntity> getAllByIdFinca(FincaEntity idFinca);
}
