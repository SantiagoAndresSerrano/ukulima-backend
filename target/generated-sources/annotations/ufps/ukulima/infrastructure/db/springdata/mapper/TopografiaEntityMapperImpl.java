package ufps.ukulima.infrastructure.db.springdata.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.model.Topografia.Topografia;
import ufps.ukulima.infrastructure.db.springdata.entity.Topografia.TopografiaEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-15T17:31:04-0500",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.4.200.v20220802-0458, environment: Java 17.0.4.1 (Eclipse Adoptium)"
)
@Component
public class TopografiaEntityMapperImpl implements TopografiaEntityMapper {

    @Override
    public Topografia toDomain(TopografiaEntity TopografiaEntity) {
        if ( TopografiaEntity == null ) {
            return null;
        }

        Topografia topografia = new Topografia();

        topografia.setDescripcion( TopografiaEntity.getDescripcion() );
        topografia.setId( TopografiaEntity.getId() );

        return topografia;
    }

    @Override
    public TopografiaEntity toEntity(Topografia Topografia) {
        if ( Topografia == null ) {
            return null;
        }

        TopografiaEntity topografiaEntity = new TopografiaEntity();

        topografiaEntity.setDescripcion( Topografia.getDescripcion() );
        topografiaEntity.setId( Topografia.getId() );

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
