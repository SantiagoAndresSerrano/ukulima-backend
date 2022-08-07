package ufps.ukulima.infrastructure.db.springdata.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.TipoIdentificacion.TipoIdentificacion;
import ufps.ukulima.infrastructure.db.springdata.entity.TipoIdentificacion.TipoIdentificacionEntity;

import java.util.List;
//@Service

@Mapper(componentModel = "spring")
public interface TipoIdentificacionEntityMapper{
    TipoIdentificacion toDomain(TipoIdentificacionEntity TipoIdentificacionEntity);
    TipoIdentificacionEntity toEntity(TipoIdentificacion TipoIdentificacion);
    List<TipoIdentificacion> abonosOrganicosRecomendacionToDomain(List<TipoIdentificacionEntity> abonoOrganicoEntities);

}
