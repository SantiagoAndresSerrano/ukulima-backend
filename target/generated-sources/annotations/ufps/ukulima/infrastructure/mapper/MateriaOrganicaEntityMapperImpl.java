package ufps.ukulima.infrastructure.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.model.MateriaOrganica.MateriaOrganica;
import ufps.ukulima.infrastructure.db.springdata.entity.MateriaOrganica.MateriaOrganicaEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-05T23:58:32-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.11 (Amazon.com Inc.)"
)
@Component
public class MateriaOrganicaEntityMapperImpl implements MateriaOrganicaEntityMapper {

    @Override
    public MateriaOrganica toDomain(MateriaOrganicaEntity MateriaOrganicaEntity) {
        if ( MateriaOrganicaEntity == null ) {
            return null;
        }

        MateriaOrganica materiaOrganica = new MateriaOrganica();

        materiaOrganica.setClima( MateriaOrganicaEntity.getClima() );
        materiaOrganica.setId( MateriaOrganicaEntity.getId() );
        materiaOrganica.setValorMin( MateriaOrganicaEntity.getValorMin() );
        materiaOrganica.setValorMax( MateriaOrganicaEntity.getValorMax() );
        materiaOrganica.setInterpretacion( MateriaOrganicaEntity.getInterpretacion() );

        return materiaOrganica;
    }

    @Override
    public MateriaOrganicaEntity toEntity(MateriaOrganica MateriaOrganica) {
        if ( MateriaOrganica == null ) {
            return null;
        }

        MateriaOrganicaEntity materiaOrganicaEntity = new MateriaOrganicaEntity();

        materiaOrganicaEntity.setClima( MateriaOrganica.getClima() );
        materiaOrganicaEntity.setInterpretacion( MateriaOrganica.getInterpretacion() );
        materiaOrganicaEntity.setId( MateriaOrganica.getId() );
        materiaOrganicaEntity.setValorMin( MateriaOrganica.getValorMin() );
        materiaOrganicaEntity.setValorMax( MateriaOrganica.getValorMax() );

        return materiaOrganicaEntity;
    }

    @Override
    public List<MateriaOrganica> toDomain(List<MateriaOrganicaEntity> materiaOrganicaEntities) {
        if ( materiaOrganicaEntities == null ) {
            return null;
        }

        List<MateriaOrganica> list = new ArrayList<MateriaOrganica>( materiaOrganicaEntities.size() );
        for ( MateriaOrganicaEntity materiaOrganicaEntity : materiaOrganicaEntities ) {
            list.add( toDomain( materiaOrganicaEntity ) );
        }

        return list;
    }
}
