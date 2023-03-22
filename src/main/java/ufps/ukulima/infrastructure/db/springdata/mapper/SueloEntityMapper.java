package ufps.ukulima.infrastructure.db.springdata.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.Suelo.Suelo;
import ufps.ukulima.infrastructure.db.springdata.entity.Suelo.SueloEntity;
import java.util.List;

@Mapper(componentModel = "spring")
public interface SueloEntityMapper {
    Suelo toDomain(SueloEntity SueloEntity);
    SueloEntity toEntity(Suelo Suelo);
    List<Suelo> toDomain(List<SueloEntity> loteEntities);
}