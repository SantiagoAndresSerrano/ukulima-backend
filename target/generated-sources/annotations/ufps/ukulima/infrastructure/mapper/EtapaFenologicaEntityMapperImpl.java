package ufps.ukulima.infrastructure.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.EtapaFenologica.EtapaFenologica;
import ufps.ukulima.infrastructure.db.springdata.entity.EtapaFenologica.EtapaFenologicaEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-28T09:39:51-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class EtapaFenologicaEntityMapperImpl implements EtapaFenologicaEntityMapper {

    @Override
    public EtapaFenologica toDomain(EtapaFenologicaEntity EtapaFenologicaEntity) {
        if ( EtapaFenologicaEntity == null ) {
            return null;
        }

        EtapaFenologica etapaFenologica = new EtapaFenologica();

        etapaFenologica.setId( EtapaFenologicaEntity.getId() );
        etapaFenologica.setDescripcion( EtapaFenologicaEntity.getDescripcion() );

        return etapaFenologica;
    }

    @Override
    public EtapaFenologicaEntity toEntity(EtapaFenologica EtapaFenologica) {
        if ( EtapaFenologica == null ) {
            return null;
        }

        EtapaFenologicaEntity etapaFenologicaEntity = new EtapaFenologicaEntity();

        etapaFenologicaEntity.setId( EtapaFenologica.getId() );
        etapaFenologicaEntity.setDescripcion( EtapaFenologica.getDescripcion() );

        return etapaFenologicaEntity;
    }

    @Override
    public List<EtapaFenologica> abonosOrganicosRecomendacionToDomain(List<EtapaFenologicaEntity> abonoOrganicoEntities) {
        if ( abonoOrganicoEntities == null ) {
            return null;
        }

        List<EtapaFenologica> list = new ArrayList<EtapaFenologica>( abonoOrganicoEntities.size() );
        for ( EtapaFenologicaEntity etapaFenologicaEntity : abonoOrganicoEntities ) {
            list.add( toDomain( etapaFenologicaEntity ) );
        }

        return list;
    }
}
