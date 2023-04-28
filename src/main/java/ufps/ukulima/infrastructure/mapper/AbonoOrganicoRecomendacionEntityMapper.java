package ufps.ukulima.infrastructure.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.AbonoOrganicoRecomendacion.AbonoOrganicoRecomendacion;
import ufps.ukulima.infrastructure.db.springdata.entity.AbonoOrganicoRecomendacion.AbonoOrganicoRecomendacionEntity;

import java.util.List;
//@Service

@Mapper(componentModel = "spring")
public interface AbonoOrganicoRecomendacionEntityMapper{
    AbonoOrganicoRecomendacion toDomain(AbonoOrganicoRecomendacionEntity AbonoOrganicoRecomendacionEntity);
    AbonoOrganicoRecomendacionEntity toEntity(AbonoOrganicoRecomendacion AbonoOrganicoRecomendacion);
    List<AbonoOrganicoRecomendacion> abonosOrganicosRecomendacionToDomain(List<AbonoOrganicoRecomendacionEntity> abonoOrganicoEntities);

}
