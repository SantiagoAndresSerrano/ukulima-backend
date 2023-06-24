package ufps.ukulima.infrastructure.driven_adapters.jpa.Cultivo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ufps.ukulima.domain.model.Cultivo.Cultivo;
import ufps.ukulima.infrastructure.db.springdata.entity.Cultivo.CultivoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Finca.FincaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Suelo.SueloEntity;

import java.util.List;

public interface CultivoRepository extends JpaRepository<CultivoEntity, Integer> {
    List<CultivoEntity> getAllByIdFinca(FincaEntity idFinca);

    CultivoEntity getFirstByIdSuelo(SueloEntity idSuelo);

    @Query(value = "select c from CultivoEntity c where c.idFinca.idAgricultor.telefono=:idAgriltor or  c.idFinca" +
            ".idAgricultor.email=:idAgriltor")
    List<CultivoEntity> getAllByAgricultor(@Param("idAgriltor") String idAgriltor);

    @Query(value = "select * from cultivo c where c.id_suelo=:idSuelo", nativeQuery = true)
    List<CultivoEntity> getAllByIdSuelo(@Param("idSuelo") int idSuelo);

}
