package ufps.ukulima.infrastructure.db.springdata.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.AluminioIntercambiable.AluminioIntercambiable;
import ufps.ukulima.infrastructure.db.springdata.entity.AluminioIntercambiable.AluminioIntercambiableEntity;

import java.util.List;
@Mapper(componentModel = "spring")
public interface AluminioIntercambiableEntityMapper {
        AluminioIntercambiable toDomain(AluminioIntercambiableEntity AluminioIntercambiableEntity);
        AluminioIntercambiableEntity toEntity(AluminioIntercambiable AluminioIntercambiable);
        List<AluminioIntercambiable> toDomain(List<AluminioIntercambiableEntity> aluminioIntercambiableEntities);
}