package ufps.ukulima.infrastructure.db.springdata.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.PhSuelo.PhSuelo;
import ufps.ukulima.infrastructure.db.springdata.entity.PhSuelo.PhSueloEntity;

import java.util.List;
@Mapper(componentModel = "spring")
public interface PhSueloEntityMapper {
    PhSuelo toDomain(PhSueloEntity PhSueloEntity);
    PhSueloEntity toEntity(PhSuelo PhSuelo);
    List<PhSuelo> toDomain(List<PhSueloEntity> materiaOrganicaEntities);
}
