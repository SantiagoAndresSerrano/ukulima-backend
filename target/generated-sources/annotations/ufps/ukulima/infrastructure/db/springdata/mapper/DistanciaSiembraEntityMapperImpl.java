package ufps.ukulima.infrastructure.db.springdata.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.model.DistanciaSiembra.DistanciaSiembra;
import ufps.ukulima.infrastructure.db.springdata.entity.DistanciaSiembra.DistanciaSiembraEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-17T17:35:55-0500",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.4.200.v20220802-0458, environment: Java 17.0.4.1 (Eclipse Adoptium)"
)
@Component
public class DistanciaSiembraEntityMapperImpl implements DistanciaSiembraEntityMapper {

    @Override
    public DistanciaSiembra toDomain(DistanciaSiembraEntity DistanciaSiembraEntity) {
        if ( DistanciaSiembraEntity == null ) {
            return null;
        }

        DistanciaSiembra distanciaSiembra = new DistanciaSiembra();

        distanciaSiembra.setId( DistanciaSiembraEntity.getId() );
        distanciaSiembra.setDescripcion( DistanciaSiembraEntity.getDescripcion() );

        return distanciaSiembra;
    }

    @Override
    public DistanciaSiembraEntity toEntity(DistanciaSiembra DistanciaSiembra) {
        if ( DistanciaSiembra == null ) {
            return null;
        }

        DistanciaSiembraEntity distanciaSiembraEntity = new DistanciaSiembraEntity();

        distanciaSiembraEntity.setId( DistanciaSiembra.getId() );
        distanciaSiembraEntity.setDescripcion( DistanciaSiembra.getDescripcion() );

        return distanciaSiembraEntity;
    }

    @Override
    public List<DistanciaSiembra> abonosOrganicosRecomendacionToDomain(List<DistanciaSiembraEntity> abonoOrganicoEntities) {
        if ( abonoOrganicoEntities == null ) {
            return null;
        }

        List<DistanciaSiembra> list = new ArrayList<DistanciaSiembra>( abonoOrganicoEntities.size() );
        for ( DistanciaSiembraEntity distanciaSiembraEntity : abonoOrganicoEntities ) {
            list.add( toDomain( distanciaSiembraEntity ) );
        }

        return list;
    }
}
