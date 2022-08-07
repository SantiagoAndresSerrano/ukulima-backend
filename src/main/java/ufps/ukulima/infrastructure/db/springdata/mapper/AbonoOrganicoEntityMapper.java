package ufps.ukulima.infrastructure.db.springdata.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.AbonoOrganico.AbonoOrganico;
import ufps.ukulima.infrastructure.db.springdata.entity.AbonoOrganico.AbonoOrganicoEntity;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AbonoOrganicoEntityMapper{
    AbonoOrganico toDomain(AbonoOrganicoEntity abonoOrganicoEntity);
    List<AbonoOrganico> toDomain(List<AbonoOrganicoEntity> abonoOrganicoEntities);
    AbonoOrganicoEntity toEntity(AbonoOrganico abonoOrganico);
}
