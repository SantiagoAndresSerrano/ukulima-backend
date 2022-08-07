package ufps.ukulima.infrastructure.db.springdata.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.AnalisisElemento.AnalisisElemento;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisElemento.AnalisisElementosEntity;

import java.util.List;
//@Service

@Mapper(componentModel = "spring")
public interface AnalisisElementoEntityMapper{
    AnalisisElemento toDomain(AnalisisElementosEntity AnalisisElementoEntity);
    AnalisisElementosEntity toEntity(AnalisisElemento AnalisisElemento);
    List<AnalisisElemento> abonosOrganicosRecomendacionToDomain(List<AnalisisElementosEntity> abonoOrganicoEntities);

}