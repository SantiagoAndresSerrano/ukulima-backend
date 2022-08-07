package ufps.ukulima.infrastructure.db.springdata.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.Corregimiento.Corregimiento;
import ufps.ukulima.infrastructure.db.springdata.entity.Corregimiento.CorregimientoEntity;

import java.util.List;
//@Service

@Mapper(componentModel = "spring")
public interface CorregimientoEntityMapper{
    Corregimiento toDomain(CorregimientoEntity CorregimientoEntity);
    CorregimientoEntity toEntity(Corregimiento Corregimiento);
    List<Corregimiento> abonosOrganicosRecomendacionToDomain(List<CorregimientoEntity> abonoOrganicoEntities);

}
