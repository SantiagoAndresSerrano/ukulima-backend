package ufps.ukulima.infrastructure.db.springdata.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.GrupoTextural.GrupoTextural;
import ufps.ukulima.infrastructure.db.springdata.entity.GrupoTextural.GrupoTexturalEntity;

import java.util.List;
@Mapper(componentModel = "spring")
public interface GrupoTexturalEntityMapper {
    GrupoTextural toDomain(GrupoTexturalEntity GrupoTexturalEntity);
    GrupoTexturalEntity toEntity(GrupoTextural GrupoTextural);
    List<GrupoTextural> grupoTexturalToDomain(List<GrupoTexturalEntity> grupoTexturalEntities);

}
