package ufps.ukulima.infrastructure.db.springdata.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.Vereda.Vereda;
import ufps.ukulima.infrastructure.db.springdata.entity.Vereda.VeredaEntity;

import java.util.List;
//@Service

@Mapper(componentModel = "spring")
public interface VeredaEntityMapper{
    Vereda toDomain(VeredaEntity VeredaEntity);
    VeredaEntity toEntity(Vereda Vereda);
    List<Vereda> abonosOrganicosRecomendacionToDomain(List<VeredaEntity> abonoOrganicoEntities);

}