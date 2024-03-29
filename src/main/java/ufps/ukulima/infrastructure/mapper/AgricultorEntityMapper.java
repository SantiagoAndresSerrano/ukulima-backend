package ufps.ukulima.infrastructure.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.Agricultor.Agricultor;
import ufps.ukulima.infrastructure.db.springdata.entity.Agricultor.AgricultorEntity;

import java.util.List;
//@Service
@Mapper(componentModel = "spring")
public interface AgricultorEntityMapper{
    Agricultor toDomain(AgricultorEntity AgricultorEntity);
    AgricultorEntity toEntity(Agricultor Agricultor);
    List<Agricultor> AgricultorToDomain(List<AgricultorEntity> abonoOrganicoEntities);

}
