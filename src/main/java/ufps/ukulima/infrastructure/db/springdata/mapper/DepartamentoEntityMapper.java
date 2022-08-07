package ufps.ukulima.infrastructure.db.springdata.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.Departamento.Departamento;
import ufps.ukulima.infrastructure.db.springdata.entity.Departamento.DepartamentoEntity;

import java.util.List;
//@Service

@Mapper(componentModel = "spring")
public interface DepartamentoEntityMapper{
    Departamento toDomain(DepartamentoEntity DepartamentoEntity);
    DepartamentoEntity toEntity(Departamento Departamento);
    List<Departamento> abonosOrganicosRecomendacionToDomain(List<DepartamentoEntity> abonoOrganicoEntities);

}
