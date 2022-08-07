package ufps.ukulima.infrastructure.db.springdata.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;
import ufps.ukulima.domain.model.FuenteRecomendacion.FuenteRecomendacion;
import ufps.ukulima.domain.model.FuenteRecomendacion.FuenteRecomendacion;
import ufps.ukulima.infrastructure.db.springdata.entity.FuenteRecomendacion.FuenteRecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.FuenteRecomendacion.FuenteRecomendacionEntity;

import java.util.List;
//@Service

@Mapper(componentModel = "spring")
public interface FuenteRecomendacionEntityMapper{
    FuenteRecomendacion toDomain(FuenteRecomendacionEntity FuenteRecomendacionEntity);
    FuenteRecomendacionEntity toEntity(FuenteRecomendacion FuenteRecomendacion);
    List<FuenteRecomendacion> abonosOrganicosRecomendacionToDomain(List<FuenteRecomendacionEntity> abonoOrganicoEntities);

}
