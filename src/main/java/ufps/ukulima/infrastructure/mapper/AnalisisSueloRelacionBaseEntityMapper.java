package ufps.ukulima.infrastructure.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.AnalisisSueloRelacionBase.AnalisisSueloRelacionBase;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisSueloRelacionBases.AnalisisSueloRelacionBaseEntity;

import java.util.List;
@Mapper(componentModel = "spring")
public interface AnalisisSueloRelacionBaseEntityMapper {
    AnalisisSueloRelacionBase toDomain(AnalisisSueloRelacionBaseEntity analisisSueloAnalisisSueloRelacionBaseEntity);
    AnalisisSueloRelacionBaseEntity toEntity(AnalisisSueloRelacionBase analisisSueloAnalisisSueloRelacionBase);
    List<AnalisisSueloRelacionBase> toDomain(List<AnalisisSueloRelacionBaseEntity> analisisSueloAnalisisSueloRelacionBaseEntities);
}
