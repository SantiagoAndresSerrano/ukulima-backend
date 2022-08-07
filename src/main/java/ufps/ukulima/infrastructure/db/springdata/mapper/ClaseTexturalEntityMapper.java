package ufps.ukulima.infrastructure.db.springdata.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;
import ufps.ukulima.domain.model.ClaseTextural.ClaseTextural;
import ufps.ukulima.domain.model.ClaseTextural.ClaseTextural;
import ufps.ukulima.infrastructure.db.springdata.entity.ClaseTextural.ClaseTexturalEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.ClaseTextural.ClaseTexturalEntity;

import java.util.List;
//@Service

@Mapper(componentModel = "spring")
public interface ClaseTexturalEntityMapper{
    ClaseTextural toDomain(ClaseTexturalEntity ClaseTexturalEntity);
    ClaseTexturalEntity toEntity(ClaseTextural ClaseTextural);
    List<ClaseTextural> abonosOrganicosRecomendacionToDomain(List<ClaseTexturalEntity> abonoOrganicoEntities);

}