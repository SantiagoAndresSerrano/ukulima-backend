package ufps.ukulima.infrastructure.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.Cultivo.Cultivo;
import ufps.ukulima.infrastructure.db.springdata.entity.Cultivo.CultivoEntity;

import java.util.List;
//@Service

@Mapper(componentModel = "spring")
public interface CultivoEntityMapper{
    Cultivo toDomain(CultivoEntity CultivoEntity);
    CultivoEntity toEntity(Cultivo Cultivo);
    List<Cultivo> abonosOrganicosRecomendacionToDomain(List<CultivoEntity> abonoOrganicoEntities);

}
