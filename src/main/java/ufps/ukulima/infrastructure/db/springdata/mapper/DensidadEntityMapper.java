package ufps.ukulima.infrastructure.db.springdata.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.Densidad.Densidad;
import ufps.ukulima.infrastructure.db.springdata.entity.Densidad.DensidadEntity;

import java.util.List;
//@Service

@Mapper(componentModel = "spring")
public interface DensidadEntityMapper{
    Densidad toDomain(DensidadEntity DensidadEntity);
    DensidadEntity toEntity(Densidad Densidad);
    List<Densidad> abonosOrganicosRecomendacionToDomain(List<DensidadEntity> abonoOrganicoEntities);

}