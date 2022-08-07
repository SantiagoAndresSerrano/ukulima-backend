package ufps.ukulima.infrastructure.db.springdata.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;
import ufps.ukulima.domain.model.Finca.Finca;
import ufps.ukulima.domain.model.Finca.Finca;
import ufps.ukulima.infrastructure.db.springdata.entity.Finca.FincaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Finca.FincaEntity;

import java.util.List;
//@Service

@Mapper(componentModel = "spring")
public interface FincaEntityMapper{
    Finca toDomain(FincaEntity FincaEntity);
    FincaEntity toEntity(Finca Finca);
    List<Finca> abonosOrganicosRecomendacionToDomain(List<FincaEntity> abonoOrganicoEntities);

}
