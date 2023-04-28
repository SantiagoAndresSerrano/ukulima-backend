package ufps.ukulima.infrastructure.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.DistanciaSiembra.DistanciaSiembra;
import ufps.ukulima.infrastructure.db.springdata.entity.DistanciaSiembra.DistanciaSiembraEntity;

import java.util.List;
//@Service

@Mapper(componentModel = "spring")
public interface DistanciaSiembraEntityMapper{
    DistanciaSiembra toDomain(DistanciaSiembraEntity DistanciaSiembraEntity);
    DistanciaSiembraEntity toEntity(DistanciaSiembra DistanciaSiembra);
    List<DistanciaSiembra> abonosOrganicosRecomendacionToDomain(List<DistanciaSiembraEntity> abonoOrganicoEntities);

}
