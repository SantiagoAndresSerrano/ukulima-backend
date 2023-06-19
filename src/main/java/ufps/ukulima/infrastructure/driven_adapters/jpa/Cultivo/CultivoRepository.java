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

    @Query(value = "select c.* from cultivo c \n" +
            "inner join suelo s on s.id = c.id_suelo \n" +
            "inner join lote l on l.id = s.id_lote\n" +
            "inner join finca f on f.id_finca = l.id_finca \n" +
            "inner join agricultor a on a.identificacion = f.id_agricultor\n" +
            "WHERE a.email = :idAgriltor or a.telefono = :idAgriltor", nativeQuery = true)
    List<CultivoEntity> getAllByAgricultor(@Param("idAgriltor") String idAgriltor);

}
