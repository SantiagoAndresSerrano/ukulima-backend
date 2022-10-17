package ufps.ukulima.infrastructure.db.springdata.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.model.TipoIdentificacion.TipoIdentificacion;
import ufps.ukulima.infrastructure.db.springdata.entity.TipoIdentificacion.TipoIdentificacionEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-17T17:35:56-0500",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.4.200.v20220802-0458, environment: Java 17.0.4.1 (Eclipse Adoptium)"
)
@Component
public class TipoIdentificacionEntityMapperImpl implements TipoIdentificacionEntityMapper {

    @Override
    public TipoIdentificacion toDomain(TipoIdentificacionEntity TipoIdentificacionEntity) {
        if ( TipoIdentificacionEntity == null ) {
            return null;
        }

        TipoIdentificacion tipoIdentificacion = new TipoIdentificacion();

        tipoIdentificacion.setIdTipo( TipoIdentificacionEntity.getIdTipo() );
        tipoIdentificacion.setNombre( TipoIdentificacionEntity.getNombre() );

        return tipoIdentificacion;
    }

    @Override
    public TipoIdentificacionEntity toEntity(TipoIdentificacion TipoIdentificacion) {
        if ( TipoIdentificacion == null ) {
            return null;
        }

        TipoIdentificacionEntity tipoIdentificacionEntity = new TipoIdentificacionEntity();

        tipoIdentificacionEntity.setIdTipo( TipoIdentificacion.getIdTipo() );
        tipoIdentificacionEntity.setNombre( TipoIdentificacion.getNombre() );

        return tipoIdentificacionEntity;
    }

    @Override
    public List<TipoIdentificacion> abonosOrganicosRecomendacionToDomain(List<TipoIdentificacionEntity> abonoOrganicoEntities) {
        if ( abonoOrganicoEntities == null ) {
            return null;
        }

        List<TipoIdentificacion> list = new ArrayList<TipoIdentificacion>( abonoOrganicoEntities.size() );
        for ( TipoIdentificacionEntity tipoIdentificacionEntity : abonoOrganicoEntities ) {
            list.add( toDomain( tipoIdentificacionEntity ) );
        }

        return list;
    }
}
