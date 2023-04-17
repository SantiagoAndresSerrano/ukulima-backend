package ufps.ukulima.infrastructure.driven_adapters.jpa.MateriaOrganica;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ufps.ukulima.infrastructure.db.springdata.entity.AluminioIntercambiable.AluminioIntercambiableEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.GrupoTextural.GrupoTexturalEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.MateriaOrganica.MateriaOrganicaEntity;

import java.util.List;

public interface MateriaOrganicaRepository extends JpaRepository<MateriaOrganicaEntity, Integer> {
    @Query(value = "SELECT * FROM materia_organica mo where mo.clima = :clima", nativeQuery = true)
    List<MateriaOrganicaEntity> getMateriaOrganicaByClima(@Param("clima") String clima);
}
