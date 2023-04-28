package ufps.ukulima.infrastructure.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.Enmienda.Enmienda;
import ufps.ukulima.infrastructure.db.springdata.entity.Enmienda.EnmiendaEntity;

import java.util.List;
//@Service

@Mapper(componentModel = "spring")
public interface EnmiendaEntityMapper{
    Enmienda toDomain(EnmiendaEntity EnmiendaEntity);
    EnmiendaEntity toEntity(Enmienda Enmienda);
    List<Enmienda> abonosOrganicosRecomendacionToDomain(List<EnmiendaEntity> abonoOrganicoEntities);

}