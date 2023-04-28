package ufps.ukulima.infrastructure.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.model.AnalisisElementoInterpretacion.AnalisisElementoInterpretacion;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisElementoInterpretacion.AnalisisElementoInterpretacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Elemento.ElementoEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-28T09:39:51-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class AnalisisElementoInterpretacionEntityMapperImpl implements AnalisisElementoInterpretacionEntityMapper {

    @Override
    public AnalisisElementoInterpretacion toDomain(AnalisisElementoInterpretacionEntity AnalisisElementoInterpretacionEntity) {
        if ( AnalisisElementoInterpretacionEntity == null ) {
            return null;
        }

        Integer id = null;
        Integer valorMin = null;
        Integer valorMax = null;
        Integer interpretacion = null;
        ElementoEntity idElemento = null;

        id = AnalisisElementoInterpretacionEntity.getId();
        valorMin = AnalisisElementoInterpretacionEntity.getValorMin();
        valorMax = AnalisisElementoInterpretacionEntity.getValorMax();
        if ( AnalisisElementoInterpretacionEntity.getInterpretacion() != null ) {
            interpretacion = Integer.parseInt( AnalisisElementoInterpretacionEntity.getInterpretacion() );
        }
        idElemento = AnalisisElementoInterpretacionEntity.getIdElemento();

        AnalisisElementoInterpretacion analisisElementoInterpretacion = new AnalisisElementoInterpretacion( id, valorMin, valorMax, interpretacion, idElemento );

        return analisisElementoInterpretacion;
    }

    @Override
    public AnalisisElementoInterpretacionEntity toEntity(AnalisisElementoInterpretacion AnalisisElementoInterpretacion) {
        if ( AnalisisElementoInterpretacion == null ) {
            return null;
        }

        AnalisisElementoInterpretacionEntity analisisElementoInterpretacionEntity = new AnalisisElementoInterpretacionEntity();

        analisisElementoInterpretacionEntity.setId( AnalisisElementoInterpretacion.getId() );
        analisisElementoInterpretacionEntity.setValorMin( AnalisisElementoInterpretacion.getValorMin() );
        analisisElementoInterpretacionEntity.setValorMax( AnalisisElementoInterpretacion.getValorMax() );
        if ( AnalisisElementoInterpretacion.getInterpretacion() != null ) {
            analisisElementoInterpretacionEntity.setInterpretacion( String.valueOf( AnalisisElementoInterpretacion.getInterpretacion() ) );
        }
        analisisElementoInterpretacionEntity.setIdElemento( AnalisisElementoInterpretacion.getIdElemento() );

        return analisisElementoInterpretacionEntity;
    }

    @Override
    public List<AnalisisElementoInterpretacion> toDomain(List<AnalisisElementoInterpretacionEntity> analisisSueloEntities) {
        if ( analisisSueloEntities == null ) {
            return null;
        }

        List<AnalisisElementoInterpretacion> list = new ArrayList<AnalisisElementoInterpretacion>( analisisSueloEntities.size() );
        for ( AnalisisElementoInterpretacionEntity analisisElementoInterpretacionEntity : analisisSueloEntities ) {
            list.add( toDomain( analisisElementoInterpretacionEntity ) );
        }

        return list;
    }
}
