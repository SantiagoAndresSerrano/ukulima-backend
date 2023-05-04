package ufps.ukulima.infrastructure.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.model.TipoCultivo.TipoCultivo;
import ufps.ukulima.infrastructure.db.springdata.entity.TipoCultivo.TipoCultivoEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-04T16:08:31-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class TipoCultivoEntityMapperImpl implements TipoCultivoEntityMapper {

    @Override
    public TipoCultivo toDomain(TipoCultivoEntity TipoCultivoEntity) {
        if ( TipoCultivoEntity == null ) {
            return null;
        }

        TipoCultivo tipoCultivo = new TipoCultivo();

        tipoCultivo.setId( TipoCultivoEntity.getId() );
        tipoCultivo.setDescripcion( TipoCultivoEntity.getDescripcion() );

        return tipoCultivo;
    }

    @Override
    public TipoCultivoEntity toEntity(TipoCultivo TipoCultivo) {
        if ( TipoCultivo == null ) {
            return null;
        }

        TipoCultivoEntity tipoCultivoEntity = new TipoCultivoEntity();

        tipoCultivoEntity.setId( TipoCultivo.getId() );
        tipoCultivoEntity.setDescripcion( TipoCultivo.getDescripcion() );

        return tipoCultivoEntity;
    }

    @Override
    public List<TipoCultivo> abonosOrganicosRecomendacionToDomain(List<TipoCultivoEntity> abonoOrganicoEntities) {
        if ( abonoOrganicoEntities == null ) {
            return null;
        }

        List<TipoCultivo> list = new ArrayList<TipoCultivo>( abonoOrganicoEntities.size() );
        for ( TipoCultivoEntity tipoCultivoEntity : abonoOrganicoEntities ) {
            list.add( toDomain( tipoCultivoEntity ) );
        }

        return list;
    }
}
