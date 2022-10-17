package ufps.ukulima.infrastructure.db.springdata.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.model.TipoCultivo.TipoCultivo;
import ufps.ukulima.infrastructure.db.springdata.entity.TipoCultivo.TipoCultivoEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-17T17:35:55-0500",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.4.200.v20220802-0458, environment: Java 17.0.4.1 (Eclipse Adoptium)"
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
