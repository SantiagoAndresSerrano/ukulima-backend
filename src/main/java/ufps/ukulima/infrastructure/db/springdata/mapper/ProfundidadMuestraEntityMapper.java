package ufps.ukulima.infrastructure.db.springdata.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.ProfundidadMuestra.ProfundidadMuestra;
import ufps.ukulima.infrastructure.db.springdata.entity.ProfundidadMuestra.ProfundidadMuestraEntity;

import java.util.List;
//@Service

@Mapper(componentModel = "spring")
public interface ProfundidadMuestraEntityMapper{
    ProfundidadMuestra toDomain(ProfundidadMuestraEntity ProfundidadMuestraEntity);
    ProfundidadMuestraEntity toEntity(ProfundidadMuestra ProfundidadMuestra);
    List<ProfundidadMuestra> abonosOrganicosRecomendacionToDomain(List<ProfundidadMuestraEntity> abonoOrganicoEntities);

}
