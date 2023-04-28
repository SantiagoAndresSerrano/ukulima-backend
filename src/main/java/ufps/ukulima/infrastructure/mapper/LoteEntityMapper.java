package ufps.ukulima.infrastructure.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.Lote.Lote;
import ufps.ukulima.infrastructure.db.springdata.entity.Lote.LoteEntity;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LoteEntityMapper {
    Lote toDomain(LoteEntity LoteEntity);
    LoteEntity toEntity(Lote Lote);
    List<Lote> toDomain(List<LoteEntity> loteEntities);
}