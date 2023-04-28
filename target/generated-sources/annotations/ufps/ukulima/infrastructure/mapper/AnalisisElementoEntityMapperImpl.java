package ufps.ukulima.infrastructure.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.model.AnalisisElemento.AnalisisElemento;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisElemento.AnalisisElementosEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-28T09:39:51-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class AnalisisElementoEntityMapperImpl implements AnalisisElementoEntityMapper {

    @Override
    public AnalisisElemento toDomain(AnalisisElementosEntity AnalisisElementoEntity) {
        if ( AnalisisElementoEntity == null ) {
            return null;
        }

        AnalisisElemento analisisElemento = new AnalisisElemento();

        analisisElemento.setId( AnalisisElementoEntity.getId() );
        analisisElemento.setValor( AnalisisElementoEntity.getValor() );
        analisisElemento.setIdAnalisisElementoInterpretacion( AnalisisElementoEntity.getIdAnalisisElementoInterpretacion() );
        analisisElemento.setIdElemento( AnalisisElementoEntity.getIdElemento() );

        return analisisElemento;
    }

    @Override
    public AnalisisElementosEntity toEntity(AnalisisElemento AnalisisElemento) {
        if ( AnalisisElemento == null ) {
            return null;
        }

        AnalisisElementosEntity analisisElementosEntity = new AnalisisElementosEntity();

        analisisElementosEntity.setId( AnalisisElemento.getId() );
        analisisElementosEntity.setValor( AnalisisElemento.getValor() );
        analisisElementosEntity.setIdAnalisisElementoInterpretacion( AnalisisElemento.getIdAnalisisElementoInterpretacion() );
        analisisElementosEntity.setIdAnalisisSuelo( AnalisisElemento.getIdAnalisisSuelo() );
        analisisElementosEntity.setIdElemento( AnalisisElemento.getIdElemento() );

        return analisisElementosEntity;
    }

    @Override
    public List<AnalisisElemento> abonosOrganicosRecomendacionToDomain(List<AnalisisElementosEntity> abonoOrganicoEntities) {
        if ( abonoOrganicoEntities == null ) {
            return null;
        }

        List<AnalisisElemento> list = new ArrayList<AnalisisElemento>( abonoOrganicoEntities.size() );
        for ( AnalisisElementosEntity analisisElementosEntity : abonoOrganicoEntities ) {
            list.add( toDomain( analisisElementosEntity ) );
        }

        return list;
    }
}
