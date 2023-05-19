package ufps.ukulima.infrastructure.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.model.ConductividadElectrica.ConductividadElectrica;
import ufps.ukulima.infrastructure.db.springdata.entity.ConductividadElectrica.ConductividadElectricaEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-18T20:40:42-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class ConductividadElectricaEntityMapperImpl implements ConductividadElectricaEntityMapper {

    @Override
    public ConductividadElectrica toDomain(ConductividadElectricaEntity conductividadElectrica) {
        if ( conductividadElectrica == null ) {
            return null;
        }

        ConductividadElectrica conductividadElectrica1 = new ConductividadElectrica();

        conductividadElectrica1.setId( conductividadElectrica.getId() );
        conductividadElectrica1.setValorMin( conductividadElectrica.getValorMin() );
        conductividadElectrica1.setValorMax( conductividadElectrica.getValorMax() );
        conductividadElectrica1.setInterpretacion( conductividadElectrica.getInterpretacion() );

        return conductividadElectrica1;
    }

    @Override
    public ConductividadElectricaEntity toEntity(ConductividadElectrica conductividadElectrica) {
        if ( conductividadElectrica == null ) {
            return null;
        }

        ConductividadElectricaEntity conductividadElectricaEntity = new ConductividadElectricaEntity();

        conductividadElectricaEntity.setId( conductividadElectrica.getId() );
        conductividadElectricaEntity.setValorMin( conductividadElectrica.getValorMin() );
        conductividadElectricaEntity.setValorMax( conductividadElectrica.getValorMax() );
        conductividadElectricaEntity.setInterpretacion( conductividadElectrica.getInterpretacion() );

        return conductividadElectricaEntity;
    }

    @Override
    public List<ConductividadElectrica> abonosOrganicosRecomendacionToDomain(List<ConductividadElectricaEntity> conductividadElectrica) {
        if ( conductividadElectrica == null ) {
            return null;
        }

        List<ConductividadElectrica> list = new ArrayList<ConductividadElectrica>( conductividadElectrica.size() );
        for ( ConductividadElectricaEntity conductividadElectricaEntity : conductividadElectrica ) {
            list.add( toDomain( conductividadElectricaEntity ) );
        }

        return list;
    }
}
