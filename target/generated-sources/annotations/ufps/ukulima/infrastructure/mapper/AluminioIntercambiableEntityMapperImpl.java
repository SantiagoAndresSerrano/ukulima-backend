package ufps.ukulima.infrastructure.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.model.AluminioIntercambiable.AluminioIntercambiable;
import ufps.ukulima.infrastructure.db.springdata.entity.AluminioIntercambiable.AluminioIntercambiableEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-18T20:40:44-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class AluminioIntercambiableEntityMapperImpl implements AluminioIntercambiableEntityMapper {

    @Override
    public AluminioIntercambiable toDomain(AluminioIntercambiableEntity AluminioIntercambiableEntity) {
        if ( AluminioIntercambiableEntity == null ) {
            return null;
        }

        AluminioIntercambiable aluminioIntercambiable = new AluminioIntercambiable();

        aluminioIntercambiable.setId( AluminioIntercambiableEntity.getId() );
        aluminioIntercambiable.setValorMin( AluminioIntercambiableEntity.getValorMin() );
        aluminioIntercambiable.setValorMax( AluminioIntercambiableEntity.getValorMax() );
        aluminioIntercambiable.setInterpretacion( AluminioIntercambiableEntity.getInterpretacion() );

        return aluminioIntercambiable;
    }

    @Override
    public AluminioIntercambiableEntity toEntity(AluminioIntercambiable AluminioIntercambiable) {
        if ( AluminioIntercambiable == null ) {
            return null;
        }

        AluminioIntercambiableEntity aluminioIntercambiableEntity = new AluminioIntercambiableEntity();

        aluminioIntercambiableEntity.setId( AluminioIntercambiable.getId() );
        aluminioIntercambiableEntity.setValorMin( AluminioIntercambiable.getValorMin() );
        aluminioIntercambiableEntity.setValorMax( AluminioIntercambiable.getValorMax() );
        aluminioIntercambiableEntity.setInterpretacion( AluminioIntercambiable.getInterpretacion() );

        return aluminioIntercambiableEntity;
    }

    @Override
    public List<AluminioIntercambiable> toDomain(List<AluminioIntercambiableEntity> aluminioIntercambiableEntities) {
        if ( aluminioIntercambiableEntities == null ) {
            return null;
        }

        List<AluminioIntercambiable> list = new ArrayList<AluminioIntercambiable>( aluminioIntercambiableEntities.size() );
        for ( AluminioIntercambiableEntity aluminioIntercambiableEntity : aluminioIntercambiableEntities ) {
            list.add( toDomain( aluminioIntercambiableEntity ) );
        }

        return list;
    }
}
