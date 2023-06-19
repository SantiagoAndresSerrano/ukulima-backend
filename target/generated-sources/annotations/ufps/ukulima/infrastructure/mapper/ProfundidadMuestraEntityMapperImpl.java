package ufps.ukulima.infrastructure.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.model.ProfundidadMuestra.ProfundidadMuestra;
import ufps.ukulima.infrastructure.db.springdata.entity.ProfundidadMuestra.ProfundidadMuestraEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-18T20:38:44-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class ProfundidadMuestraEntityMapperImpl implements ProfundidadMuestraEntityMapper {

    @Override
    public ProfundidadMuestra toDomain(ProfundidadMuestraEntity ProfundidadMuestraEntity) {
        if ( ProfundidadMuestraEntity == null ) {
            return null;
        }

        ProfundidadMuestra profundidadMuestra = new ProfundidadMuestra();

        profundidadMuestra.setIdProfundidadMuestra( ProfundidadMuestraEntity.getIdProfundidadMuestra() );
        profundidadMuestra.setProfundidad( ProfundidadMuestraEntity.getProfundidad() );

        return profundidadMuestra;
    }

    @Override
    public ProfundidadMuestraEntity toEntity(ProfundidadMuestra ProfundidadMuestra) {
        if ( ProfundidadMuestra == null ) {
            return null;
        }

        ProfundidadMuestraEntity profundidadMuestraEntity = new ProfundidadMuestraEntity();

        profundidadMuestraEntity.setIdProfundidadMuestra( ProfundidadMuestra.getIdProfundidadMuestra() );
        profundidadMuestraEntity.setProfundidad( ProfundidadMuestra.getProfundidad() );

        return profundidadMuestraEntity;
    }

    @Override
    public List<ProfundidadMuestra> abonosOrganicosRecomendacionToDomain(List<ProfundidadMuestraEntity> abonoOrganicoEntities) {
        if ( abonoOrganicoEntities == null ) {
            return null;
        }

        List<ProfundidadMuestra> list = new ArrayList<ProfundidadMuestra>( abonoOrganicoEntities.size() );
        for ( ProfundidadMuestraEntity profundidadMuestraEntity : abonoOrganicoEntities ) {
            list.add( toDomain( profundidadMuestraEntity ) );
        }

        return list;
    }
}
