package ufps.ukulima.infrastructure.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.AbonoQuimicoRecomendacion.AbonoQuimicoRecomendacion;
import ufps.ukulima.infrastructure.db.springdata.entity.AbonoQuimicoRecomendacion.AbonoQuimicoRecomendacionEntity;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AbonoQuimicoRecomendacionEntityMapper {

    AbonoQuimicoRecomendacion toDomain(AbonoQuimicoRecomendacionEntity entity);

    AbonoQuimicoRecomendacionEntity toEntity(AbonoQuimicoRecomendacion domain);

    List<AbonoQuimicoRecomendacion> toDomainList(List<AbonoQuimicoRecomendacionEntity> entityList);

    List<AbonoQuimicoRecomendacionEntity> toEntityList(List<AbonoQuimicoRecomendacion> domainList);

}
