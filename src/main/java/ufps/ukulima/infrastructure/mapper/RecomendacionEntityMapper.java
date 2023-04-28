package ufps.ukulima.infrastructure.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.Recomendacion.Recomendacion;
import ufps.ukulima.infrastructure.db.springdata.entity.Recomendacion.RecomendacionEntity;

import java.util.List;
//@Service

@Mapper(componentModel = "spring")
public interface RecomendacionEntityMapper{
    Recomendacion toDomain(RecomendacionEntity RecomendacionEntity);
    RecomendacionEntity toEntity(Recomendacion Recomendacion);
    List<Recomendacion> abonosOrganicosRecomendacionToDomain(List<RecomendacionEntity> abonoOrganicoEntities);

}