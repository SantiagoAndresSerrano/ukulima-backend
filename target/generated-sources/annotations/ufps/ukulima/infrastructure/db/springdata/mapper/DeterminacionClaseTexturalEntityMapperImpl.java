package ufps.ukulima.infrastructure.db.springdata.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.model.DeterminacionClaseTextural.DeterminacionClaseTextural;
import ufps.ukulima.infrastructure.db.springdata.entity.DeterminacionClaseTextural.DeterminacionClaseTexturalEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-17T01:51:26-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class DeterminacionClaseTexturalEntityMapperImpl implements DeterminacionClaseTexturalEntityMapper {

    @Override
    public DeterminacionClaseTextural toDomain(DeterminacionClaseTexturalEntity DeterminacionClaseTexturalEntity) {
        if ( DeterminacionClaseTexturalEntity == null ) {
            return null;
        }

        DeterminacionClaseTextural determinacionClaseTextural = new DeterminacionClaseTextural();

        determinacionClaseTextural.setId( DeterminacionClaseTexturalEntity.getId() );
        determinacionClaseTextural.setValorMin( DeterminacionClaseTexturalEntity.getValorMin() );
        determinacionClaseTextural.setValorMax( DeterminacionClaseTexturalEntity.getValorMax() );
        determinacionClaseTextural.setContenido( DeterminacionClaseTexturalEntity.getContenido() );

        return determinacionClaseTextural;
    }

    @Override
    public DeterminacionClaseTexturalEntity toEntity(DeterminacionClaseTextural DeterminacionClaseTextural) {
        if ( DeterminacionClaseTextural == null ) {
            return null;
        }

        DeterminacionClaseTexturalEntity determinacionClaseTexturalEntity = new DeterminacionClaseTexturalEntity();

        determinacionClaseTexturalEntity.setContenido( DeterminacionClaseTextural.getContenido() );
        determinacionClaseTexturalEntity.setId( DeterminacionClaseTextural.getId() );
        determinacionClaseTexturalEntity.setValorMin( DeterminacionClaseTextural.getValorMin() );
        determinacionClaseTexturalEntity.setValorMax( DeterminacionClaseTextural.getValorMax() );

        return determinacionClaseTexturalEntity;
    }

    @Override
    public List<DeterminacionClaseTextural> toDomain(List<DeterminacionClaseTexturalEntity> determinacionClaseTexturalEntityList) {
        if ( determinacionClaseTexturalEntityList == null ) {
            return null;
        }

        List<DeterminacionClaseTextural> list = new ArrayList<DeterminacionClaseTextural>( determinacionClaseTexturalEntityList.size() );
        for ( DeterminacionClaseTexturalEntity determinacionClaseTexturalEntity : determinacionClaseTexturalEntityList ) {
            list.add( toDomain( determinacionClaseTexturalEntity ) );
        }

        return list;
    }
}
