package ufps.ukulima.infrastructure.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.AnalisisSuelo.AnalisisSuelo;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisSuelo.AnalisisSueloEntity;

import java.util.List;
//TODO: crear las entidades de lote y suelo, con las relaciones necesarias, modificar la relacion de analisis suelo
// que tiene actualmente con cultivo y dejarla con suelo
@Mapper(componentModel = "spring")
public interface AnalisisSueloEntityMapper{
    AnalisisSuelo toDomain(AnalisisSueloEntity AnalisisSueloEntity);
    AnalisisSueloEntity toEntity(AnalisisSuelo AnalisisSuelo);
    List<AnalisisSuelo> toDomain(List<AnalisisSueloEntity> analisisSueloEntities);
}
