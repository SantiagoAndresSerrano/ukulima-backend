package ufps.ukulima.infrastructure.db.springdata.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.model.ClaseTextural.ClaseTextural;
import ufps.ukulima.infrastructure.db.springdata.entity.ClaseTextural.ClaseTexturalEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-15T16:10:05-0500",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.4.200.v20220802-0458, environment: Java 17.0.4.1 (Eclipse Adoptium)"
)
@Component
public class ClaseTexturalEntityMapperImpl implements ClaseTexturalEntityMapper {

    @Override
    public ClaseTextural toDomain(ClaseTexturalEntity ClaseTexturalEntity) {
        if ( ClaseTexturalEntity == null ) {
            return null;
        }

        ClaseTextural claseTextural = new ClaseTextural();

        claseTextural.setIdClaseTextural( ClaseTexturalEntity.getIdClaseTextural() );
        claseTextural.setNombre( ClaseTexturalEntity.getNombre() );
        claseTextural.setSigla( ClaseTexturalEntity.getSigla() );

        return claseTextural;
    }

    @Override
    public ClaseTexturalEntity toEntity(ClaseTextural ClaseTextural) {
        if ( ClaseTextural == null ) {
            return null;
        }

        ClaseTexturalEntity claseTexturalEntity = new ClaseTexturalEntity();

        claseTexturalEntity.setIdClaseTextural( ClaseTextural.getIdClaseTextural() );
        claseTexturalEntity.setNombre( ClaseTextural.getNombre() );
        claseTexturalEntity.setSigla( ClaseTextural.getSigla() );

        return claseTexturalEntity;
    }

    @Override
    public List<ClaseTextural> abonosOrganicosRecomendacionToDomain(List<ClaseTexturalEntity> abonoOrganicoEntities) {
        if ( abonoOrganicoEntities == null ) {
            return null;
        }

        List<ClaseTextural> list = new ArrayList<ClaseTextural>( abonoOrganicoEntities.size() );
        for ( ClaseTexturalEntity claseTexturalEntity : abonoOrganicoEntities ) {
            list.add( toDomain( claseTexturalEntity ) );
        }

        return list;
    }
}
