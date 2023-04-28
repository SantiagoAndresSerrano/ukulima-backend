package ufps.ukulima.infrastructure.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.TipoCultivo.TipoCultivo;
import ufps.ukulima.infrastructure.db.springdata.entity.TipoCultivo.TipoCultivoEntity;

import java.util.List;
//@Service

@Mapper(componentModel = "spring")
public interface TipoCultivoEntityMapper{
    TipoCultivo toDomain(TipoCultivoEntity TipoCultivoEntity);
    TipoCultivoEntity toEntity(TipoCultivo TipoCultivo);
    List<TipoCultivo> abonosOrganicosRecomendacionToDomain(List<TipoCultivoEntity> abonoOrganicoEntities);

}
