package ufps.ukulima.infrastructure.db.springdata.mapper;

import org.mapstruct.Mapper;

import ufps.ukulima.domain.EtapaFenologica.EtapaFenologica;
import ufps.ukulima.infrastructure.db.springdata.entity.EtapaFenologica.EtapaFenologicaEntity;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EtapaFenologicaEntityMapper {
    EtapaFenologica toDomain(EtapaFenologicaEntity EtapaFenologicaEntity);

    EtapaFenologicaEntity toEntity(EtapaFenologica EtapaFenologica);

    List<EtapaFenologica> abonosOrganicosRecomendacionToDomain(List<EtapaFenologicaEntity> abonoOrganicoEntities);

}
