package ufps.ukulima.infrastructure.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.model.Topografia.Topografia;
import ufps.ukulima.infrastructure.db.springdata.entity.Topografia.TopografiaEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-18T20:38:46-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class TopografiaEntityMapperImpl implements TopografiaEntityMapper {

    @Override
    public Topografia toDomain(TopografiaEntity TopografiaEntity) {
        if ( TopografiaEntity == null ) {
            return null;
        }

        Topografia topografia = new Topografia();

        topografia.setId( TopografiaEntity.getId() );
        topografia.setDescripcion( TopografiaEntity.getDescripcion() );

        return topografia;
    }

    @Override
    public TopografiaEntity toEntity(Topografia Topografia) {
        if ( Topografia == null ) {
            return null;
        }

        TopografiaEntity topografiaEntity = new TopografiaEntity();

        topografiaEntity.setId( Topografia.getId() );
        topografiaEntity.setDescripcion( Topografia.getDescripcion() );

        return topografiaEntity;
    }

    @Override
    public List<Topografia> abonosOrganicosRecomendacionToDomain(List<TopografiaEntity> abonoOrganicoEntities) {
        if ( abonoOrganicoEntities == null ) {
            return null;
        }

        List<Topografia> list = new ArrayList<Topografia>( abonoOrganicoEntities.size() );
        for ( TopografiaEntity topografiaEntity : abonoOrganicoEntities ) {
            list.add( toDomain( topografiaEntity ) );
        }

        return list;
    }
}
