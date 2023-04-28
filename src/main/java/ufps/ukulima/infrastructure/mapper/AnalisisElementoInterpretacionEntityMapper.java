package ufps.ukulima.infrastructure.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.AnalisisElementoInterpretacion.AnalisisElementoInterpretacion;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisElementoInterpretacion.AnalisisElementoInterpretacionEntity;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AnalisisElementoInterpretacionEntityMapper {
    AnalisisElementoInterpretacion toDomain(AnalisisElementoInterpretacionEntity AnalisisElementoInterpretacionEntity);
    AnalisisElementoInterpretacionEntity toEntity(AnalisisElementoInterpretacion AnalisisElementoInterpretacion);
    List<AnalisisElementoInterpretacion> toDomain(List<AnalisisElementoInterpretacionEntity> analisisSueloEntities);
}
