package ufps.ukulima.infrastructure.db.springdata.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.ConductividadElectrica.ConductividadElectrica;
import ufps.ukulima.infrastructure.db.springdata.entity.ConductividadElectrica.ConductividadElectricaEntity;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ConductividadElectricaEntityMapper {
    ConductividadElectrica toDomain(ConductividadElectricaEntity conductividadElectrica);
    ConductividadElectricaEntity toEntity(ConductividadElectrica conductividadElectrica);
    List<ConductividadElectrica> abonosOrganicosRecomendacionToDomain(
            List<ConductividadElectricaEntity> conductividadElectrica);
}
