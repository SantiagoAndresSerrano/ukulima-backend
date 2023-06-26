package ufps.ukulima.infrastructure.driven_adapters.jpa.GrupoTextural;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ufps.ukulima.infrastructure.db.springdata.entity.GrupoTextural.GrupoTexturalEntity;

public interface GrupoTexturalRepository extends JpaRepository<GrupoTexturalEntity, Integer> {
    @Query(value = "SELECT * FROM grupo_textural gt where gt.nombre = :nombre limit 1", nativeQuery = true)
    GrupoTexturalEntity getGrupoTexturalByNombre(@Param("nombre") String nombre);
}
