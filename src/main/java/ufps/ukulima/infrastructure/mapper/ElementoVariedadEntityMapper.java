package ufps.ukulima.infrastructure.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.Elemento.Elemento;
import ufps.ukulima.domain.model.ElementoVariedad.ElementoVariedad;
import ufps.ukulima.infrastructure.db.springdata.entity.Elemento.ElementoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.ElementoVariedad.ElementoVariedadEntity;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ElementoVariedadEntityMapper {
    ElementoVariedad toDomain(ElementoVariedadEntity elementoVariedadEntity);
    ElementoVariedadEntity toEntity(ElementoVariedad elementoVariedad);
    List<ElementoVariedad> elementoVariedadToDomain(List<ElementoVariedadEntity> elementoVariedadEntities);

}
