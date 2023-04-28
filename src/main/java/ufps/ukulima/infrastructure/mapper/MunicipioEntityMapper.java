package ufps.ukulima.infrastructure.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.Municipio.Municipio;
import ufps.ukulima.infrastructure.db.springdata.entity.Municipio.MunicipioEntity;

import java.util.List;
//@Service

@Mapper(componentModel = "spring")
public interface MunicipioEntityMapper{
    Municipio toDomain(MunicipioEntity MunicipioEntity);
    MunicipioEntity toEntity(Municipio Municipio);
    List<Municipio> abonosOrganicosRecomendacionToDomain(List<MunicipioEntity> abonoOrganicoEntities);

}
