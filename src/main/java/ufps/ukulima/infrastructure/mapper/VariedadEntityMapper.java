package ufps.ukulima.infrastructure.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.Variedad.Variedad;
import ufps.ukulima.infrastructure.db.springdata.entity.Variedad.VariedadEntity;

import java.util.List;
//@Service

@Mapper(componentModel = "spring")
public interface VariedadEntityMapper{
    Variedad toDomain(VariedadEntity VariedadEntity);
    VariedadEntity toEntity(Variedad Variedad);
    List<Variedad> abonosOrganicosRecomendacionToDomain(List<VariedadEntity> abonoOrganicoEntities);

}
