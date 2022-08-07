package ufps.ukulima.infrastructure.db.springdata.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;
import ufps.ukulima.domain.model.Topografia.Topografia;
import ufps.ukulima.domain.model.Topografia.Topografia;
import ufps.ukulima.infrastructure.db.springdata.entity.Topografia.TopografiaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Topografia.TopografiaEntity;

import java.util.List;
//@Service

@Mapper(componentModel = "spring")
public interface TopografiaEntityMapper{
    Topografia toDomain(TopografiaEntity TopografiaEntity);
    TopografiaEntity toEntity(Topografia Topografia);
    List<Topografia> abonosOrganicosRecomendacionToDomain(List<TopografiaEntity> abonoOrganicoEntities);

}
