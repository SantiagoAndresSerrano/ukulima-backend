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

    @Query(value = "select c from CultivoEntity c where c.idSuelo.idLote.idFinca.idAgricultor.email=:idAgriltor or " +
            "c.idSuelo.idLote.idFinca.idAgricultor.telefono=:idAgriltor")
    List<CultivoEntity> getAllByAgricultor(@Param("idAgriltor") String idAgriltor);

}
