package ufps.ukulima.infrastructure.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.model.GrupoTextural.GrupoTextural;
import ufps.ukulima.infrastructure.db.springdata.entity.GrupoTextural.GrupoTexturalEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-05T23:58:31-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.11 (Amazon.com Inc.)"
)
@Component
public class GrupoTexturalEntityMapperImpl implements GrupoTexturalEntityMapper {

    @Override
    public GrupoTextural toDomain(GrupoTexturalEntity GrupoTexturalEntity) {
        if ( GrupoTexturalEntity == null ) {
            return null;
        }

        GrupoTextural grupoTextural = new GrupoTextural();

        if ( GrupoTexturalEntity.getId() != null ) {
            grupoTextural.setId( GrupoTexturalEntity.getId() );
        }
        grupoTextural.setNombre( GrupoTexturalEntity.getNombre() );

        return grupoTextural;
    }

    @Override
    public GrupoTexturalEntity toEntity(GrupoTextural GrupoTextural) {
        if ( GrupoTextural == null ) {
            return null;
        }

        GrupoTexturalEntity grupoTexturalEntity = new GrupoTexturalEntity();

        grupoTexturalEntity.setId( GrupoTextural.getId() );
        grupoTexturalEntity.setNombre( GrupoTextural.getNombre() );

        return grupoTexturalEntity;
    }

    @Override
    public List<GrupoTextural> grupoTexturalToDomain(List<GrupoTexturalEntity> grupoTexturalEntities) {
        if ( grupoTexturalEntities == null ) {
            return null;
        }

        List<GrupoTextural> list = new ArrayList<GrupoTextural>( grupoTexturalEntities.size() );
        for ( GrupoTexturalEntity grupoTexturalEntity : grupoTexturalEntities ) {
            list.add( toDomain( grupoTexturalEntity ) );
        }

        return list;
    }
}
