package ufps.ukulima.infrastructure.db.springdata.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.model.GrupoTextural.GrupoTextural;
import ufps.ukulima.infrastructure.db.springdata.entity.GrupoTextural.GrupoTexturalEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-12T22:45:33-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class GrupoTexturalEntityMapperImpl implements GrupoTexturalEntityMapper {

    @Override
    public GrupoTextural toDomain(GrupoTexturalEntity GrupoTexturalEntity) {
        if ( GrupoTexturalEntity == null ) {
            return null;
        }

        int id = 0;
        String nombre = null;

        if ( GrupoTexturalEntity.getId() != null ) {
            id = GrupoTexturalEntity.getId();
        }
        nombre = GrupoTexturalEntity.getNombre();

        GrupoTextural grupoTextural = new GrupoTextural( id, nombre );

        return grupoTextural;
    }

    @Override
    public GrupoTexturalEntity toEntity(GrupoTextural GrupoTextural) {
        if ( GrupoTextural == null ) {
            return null;
        }

        Integer id = null;
        String nombre = null;

        id = GrupoTextural.getId();
        nombre = GrupoTextural.getNombre();

        GrupoTexturalEntity grupoTexturalEntity = new GrupoTexturalEntity( id, nombre );

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
