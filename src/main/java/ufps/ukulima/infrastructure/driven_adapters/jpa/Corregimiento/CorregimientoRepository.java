package ufps.ukulima.infrastructure.driven_adapters.jpa.Corregimiento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ufps.ukulima.infrastructure.db.springdata.entity.Corregimiento.CorregimientoEntity;

import java.util.List;

public interface CorregimientoRepository extends JpaRepository<CorregimientoEntity, Integer> {

    @Query(value="select * from corregimiento c where c.id_municipio=:idMunicipio", nativeQuery = true)
    List<CorregimientoEntity> getAllByIdMunicipio(@Param("idMunicipio")int idMunicipio);
}
