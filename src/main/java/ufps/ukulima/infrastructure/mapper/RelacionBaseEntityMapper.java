package ufps.ukulima.infrastructure.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.RelacionBase.RelacionBase;
import ufps.ukulima.infrastructure.db.springdata.entity.RelacionBase.RelacionBaseEntity;

import java.util.List;
@Mapper(componentModel = "spring")
public interface RelacionBaseEntityMapper {

    RelacionBase toDomain(RelacionBaseEntity relacionBaseEntity);
    RelacionBaseEntity toEntity(RelacionBase relacionBase);
    List<RelacionBase> toDomain(List<RelacionBaseEntity> relacionBaseEntities);
}
