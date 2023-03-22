package ufps.ukulima.infrastructure.db.springdata.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.IntercambioCationico.IntercambioCationico;
import ufps.ukulima.infrastructure.db.springdata.entity.IntercambioCationico.IntercambioCationicoEntity;

import java.util.List;
@Mapper(componentModel = "spring")
public interface IntercambioCationicoEntityMapper {
    IntercambioCationico toDomain(IntercambioCationicoEntity IntercambioCationicoEntity);
    IntercambioCationicoEntity toEntity(IntercambioCationico IntercambioCationico);
    List<IntercambioCationico> toDomain(List<IntercambioCationicoEntity> intercambioCationicoEntities);
}