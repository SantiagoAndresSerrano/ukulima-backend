package ufps.ukulima.infrastructure.db.springdata.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.model.TipoCultivo.TipoCultivo;
import ufps.ukulima.infrastructure.db.springdata.entity.TipoCultivo.TipoCultivoEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-15T16:08:02-0500",
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

        tipoCultivo.setDescripcion( TipoCultivoEntity.getDescripcion() );
        tipoCultivo.setId( TipoCultivoEntity.getId() );

        return tipoCultivo;
    }

    @Override
    public TipoCultivoEntity toEntity(TipoCultivo TipoCultivo) {
        if ( TipoCultivo == null ) {
            return null;
        }

        TipoCultivoEntity tipoCultivoEntity = new TipoCultivoEntity();

        tipoCultivoEntity.setDescripcion( TipoCultivo.getDescripcion() );
        tipoCultivoEntity.setId( TipoCultivo.getId() );

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
