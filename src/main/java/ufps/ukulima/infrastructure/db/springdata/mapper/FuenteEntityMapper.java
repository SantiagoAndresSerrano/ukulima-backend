package ufps.ukulima.infrastructure.db.springdata.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.Fuente.Fuente;
import ufps.ukulima.infrastructure.db.springdata.entity.Fuente.FuenteEntity;

import java.util.List;
//@Service

@Mapper(componentModel = "spring")
public interface FuenteEntityMapper{
    Fuente toDomain(FuenteEntity FuenteEntity);
    FuenteEntity toEntity(Fuente Fuente);
    List<Fuente> abonosOrganicosRecomendacionToDomain(List<FuenteEntity> abonoOrganicoEntities);

}
