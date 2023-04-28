package ufps.ukulima.infrastructure.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.DeterminacionClaseTextural.DeterminacionClaseTextural;
import ufps.ukulima.infrastructure.db.springdata.entity.DeterminacionClaseTextural.DeterminacionClaseTexturalEntity;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DeterminacionClaseTexturalEntityMapper {
    DeterminacionClaseTextural toDomain(DeterminacionClaseTexturalEntity DeterminacionClaseTexturalEntity);
    DeterminacionClaseTexturalEntity toEntity(DeterminacionClaseTextural DeterminacionClaseTextural);
    List<DeterminacionClaseTextural> toDomain(List<DeterminacionClaseTexturalEntity> determinacionClaseTexturalEntityList);
}