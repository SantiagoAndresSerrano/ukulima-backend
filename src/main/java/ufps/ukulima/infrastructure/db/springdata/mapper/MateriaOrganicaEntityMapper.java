package ufps.ukulima.infrastructure.db.springdata.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.MateriaOrganica.MateriaOrganica;
import ufps.ukulima.infrastructure.db.springdata.entity.MateriaOrganica.MateriaOrganicaEntity;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MateriaOrganicaEntityMapper {
    MateriaOrganica toDomain(MateriaOrganicaEntity MateriaOrganicaEntity);
    MateriaOrganicaEntity toEntity(MateriaOrganica MateriaOrganica);
    List<MateriaOrganica> toDomain(List<MateriaOrganicaEntity> materiaOrganicaEntities);
}
