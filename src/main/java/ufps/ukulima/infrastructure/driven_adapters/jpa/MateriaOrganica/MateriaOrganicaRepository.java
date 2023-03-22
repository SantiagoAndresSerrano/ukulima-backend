package ufps.ukulima.infrastructure.driven_adapters.jpa.MateriaOrganica;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.infrastructure.db.springdata.entity.AluminioIntercambiable.AluminioIntercambiableEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.MateriaOrganica.MateriaOrganicaEntity;

public interface MateriaOrganicaRepository extends JpaRepository<MateriaOrganicaEntity, Integer> {
}
