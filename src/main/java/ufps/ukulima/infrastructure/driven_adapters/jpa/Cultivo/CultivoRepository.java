package ufps.ukulima.infrastructure.driven_adapters.jpa.Cultivo;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.domain.model.Cultivo.Cultivo;
import ufps.ukulima.infrastructure.db.springdata.entity.Cultivo.CultivoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Finca.FincaEntity;

import java.util.List;

public interface CultivoRepository extends JpaRepository<CultivoEntity, Integer> {
    List<CultivoEntity> getAllByIdFinca(FincaEntity idFinca);
}
