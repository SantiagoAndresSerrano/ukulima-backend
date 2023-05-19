package ufps.ukulima.infrastructure.mapper;


import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.EnmiendaRecomendacion.EnmiendaRecomendacion;
import ufps.ukulima.infrastructure.db.springdata.entity.EnmiendaRecomendacion.EnmiendaRecomendacionEntity;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EnmiendaRecomendacionEntityMapper {

    EnmiendaRecomendacion toDomain(EnmiendaRecomendacionEntity enmiendaRecomendacionEntity);
    EnmiendaRecomendacionEntity toEntity(EnmiendaRecomendacion enmiendaRecomendacion);
    List<EnmiendaRecomendacion> toDomainList(List<EnmiendaRecomendacionEntity> enmiendaRecomendacionEntities);

}

