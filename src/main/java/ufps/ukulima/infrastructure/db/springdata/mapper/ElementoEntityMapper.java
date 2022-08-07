package ufps.ukulima.infrastructure.db.springdata.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.Elemento.Elemento;
import ufps.ukulima.infrastructure.db.springdata.entity.Elemento.ElementoEntity;

import java.util.List;
//@Service

@Mapper(componentModel = "spring")
public interface ElementoEntityMapper{
    Elemento toDomain(ElementoEntity ElementoEntity);
    ElementoEntity toEntity(Elemento Elemento);
    List<Elemento> abonosOrganicosRecomendacionToDomain(List<ElementoEntity> abonoOrganicoEntities);

}
