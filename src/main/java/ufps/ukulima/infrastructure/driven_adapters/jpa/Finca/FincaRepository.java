package ufps.ukulima.infrastructure.driven_adapters.jpa.Finca;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.domain.model.Agricultor.Agricultor;
import ufps.ukulima.domain.model.Finca.Finca;
import ufps.ukulima.infrastructure.db.springdata.entity.Agricultor.AgricultorEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Finca.FincaEntity;

import java.util.List;

public interface FincaRepository extends JpaRepository<FincaEntity, Integer> {
    public List<FincaEntity> getAllByIdAgricultor(AgricultorEntity idAgricultor);
}
