package ufps.ukulima.infrastructure.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.model.PhSuelo.PhSuelo;
import ufps.ukulima.infrastructure.db.springdata.entity.PhSuelo.PhSueloEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-05T23:58:32-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.11 (Amazon.com Inc.)"
)
@Component
public class PhSueloEntityMapperImpl implements PhSueloEntityMapper {

    @Override
    public PhSuelo toDomain(PhSueloEntity PhSueloEntity) {
        if ( PhSueloEntity == null ) {
            return null;
        }

        PhSuelo phSuelo = new PhSuelo();

        phSuelo.setId( PhSueloEntity.getId() );
        phSuelo.setValorMin( PhSueloEntity.getValorMin() );
        phSuelo.setValorMax( PhSueloEntity.getValorMax() );
        phSuelo.setInterpretacion( PhSueloEntity.getInterpretacion() );

        return phSuelo;
    }

    @Override
    public PhSueloEntity toEntity(PhSuelo PhSuelo) {
        if ( PhSuelo == null ) {
            return null;
        }

        PhSueloEntity phSueloEntity = new PhSueloEntity();

        phSueloEntity.setInterpretacion( PhSuelo.getInterpretacion() );
        phSueloEntity.setId( PhSuelo.getId() );
        phSueloEntity.setValorMin( PhSuelo.getValorMin() );
        phSueloEntity.setValorMax( PhSuelo.getValorMax() );

        return phSueloEntity;
    }

    @Override
    public List<PhSuelo> toDomain(List<PhSueloEntity> materiaOrganicaEntities) {
        if ( materiaOrganicaEntities == null ) {
            return null;
        }

        List<PhSuelo> list = new ArrayList<PhSuelo>( materiaOrganicaEntities.size() );
        for ( PhSueloEntity phSueloEntity : materiaOrganicaEntities ) {
            list.add( toDomain( phSueloEntity ) );
        }

        return list;
    }
}
