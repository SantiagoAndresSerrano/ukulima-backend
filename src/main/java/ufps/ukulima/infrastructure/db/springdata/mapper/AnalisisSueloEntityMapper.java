package ufps.ukulima.infrastructure.db.springdata.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;
import ufps.ukulima.domain.model.AnalisisSuelo.AnalisisSuelo;
import ufps.ukulima.domain.model.AnalisisSuelo.AnalisisSuelo;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisSuelo.AnalisisSueloEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisSuelo.AnalisisSueloEntity;

import java.util.List;
//@Service

@Mapper(componentModel = "spring")
public interface AnalisisSueloEntityMapper{
    AnalisisSuelo toDomain(AnalisisSueloEntity AnalisisSueloEntity);
    AnalisisSueloEntity toEntity(AnalisisSuelo AnalisisSuelo);
    List<AnalisisSuelo> abonosOrganicosRecomendacionToDomain(List<AnalisisSueloEntity> abonoOrganicoEntities);

}
