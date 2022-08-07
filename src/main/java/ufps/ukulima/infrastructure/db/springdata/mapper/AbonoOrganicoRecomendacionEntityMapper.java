package ufps.ukulima.infrastructure.db.springdata.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;
import ufps.ukulima.domain.model.AbonoOrganico.AbonoOrganico;
import ufps.ukulima.domain.model.AbonoOrganicoRecomendacion.AbonoOrganicoRecomendacion;
import ufps.ukulima.infrastructure.db.springdata.entity.AbonoOrganico.AbonoOrganicoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AbonoOrganicoRecomendacion.AbonoOrganicoRecomendacionEntity;

import java.util.List;
//@Service

@Mapper(componentModel = "spring")
public interface AbonoOrganicoRecomendacionEntityMapper{
    AbonoOrganicoRecomendacion toDomain(AbonoOrganicoRecomendacionEntity AbonoOrganicoRecomendacionEntity);
    AbonoOrganicoRecomendacionEntity toEntity(AbonoOrganicoRecomendacion AbonoOrganicoRecomendacion);
    List<AbonoOrganicoRecomendacion> abonosOrganicosRecomendacionToDomain(List<AbonoOrganicoRecomendacionEntity> abonoOrganicoEntities);

}
