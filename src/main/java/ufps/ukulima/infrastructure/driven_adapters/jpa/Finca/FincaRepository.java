package ufps.ukulima.infrastructure.driven_adapters.jpa.Finca;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.domain.model.Agricultor.Agricultor;
import ufps.ukulima.domain.model.Finca.Finca;
import ufps.ukulima.infrastructure.db.springdata.entity.Finca.FincaEntity;

public interface FincaRepository extends JpaRepository<FincaEntity, Integer> {
    public Finca getFincaByIdAgricultor(Agricultor idAgricultor);
}
