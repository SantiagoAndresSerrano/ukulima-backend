package ufps.ukulima.infrastructure.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.model.Densidad.Densidad;
import ufps.ukulima.infrastructure.db.springdata.entity.Densidad.DensidadEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-17T01:21:51-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class DensidadEntityMapperImpl implements DensidadEntityMapper {

    @Override
    public Densidad toDomain(DensidadEntity DensidadEntity) {
        if ( DensidadEntity == null ) {
            return null;
        }

        Densidad densidad = new Densidad();

        densidad.setIdDensidad( DensidadEntity.getIdDensidad() );
        densidad.setValor( DensidadEntity.getValor() );

        return densidad;
    }

    @Override
    public DensidadEntity toEntity(Densidad Densidad) {
        if ( Densidad == null ) {
            return null;
        }

        DensidadEntity densidadEntity = new DensidadEntity();

        densidadEntity.setIdDensidad( Densidad.getIdDensidad() );
        densidadEntity.setValor( Densidad.getValor() );

        return densidadEntity;
    }

    @Override
    public List<Densidad> abonosOrganicosRecomendacionToDomain(List<DensidadEntity> abonoOrganicoEntities) {
        if ( abonoOrganicoEntities == null ) {
            return null;
        }

        List<Densidad> list = new ArrayList<Densidad>( abonoOrganicoEntities.size() );
        for ( DensidadEntity densidadEntity : abonoOrganicoEntities ) {
            list.add( toDomain( densidadEntity ) );
        }

        return list;
    }
}
