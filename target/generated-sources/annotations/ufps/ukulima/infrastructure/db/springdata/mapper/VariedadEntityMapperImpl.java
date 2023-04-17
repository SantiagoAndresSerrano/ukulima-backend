package ufps.ukulima.infrastructure.db.springdata.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.model.TipoCultivo.TipoCultivo;
import ufps.ukulima.domain.model.Variedad.Variedad;
import ufps.ukulima.infrastructure.db.springdata.entity.TipoCultivo.TipoCultivoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Variedad.VariedadEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-17T01:51:27-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class VariedadEntityMapperImpl implements VariedadEntityMapper {

    @Override
    public Variedad toDomain(VariedadEntity VariedadEntity) {
        if ( VariedadEntity == null ) {
            return null;
        }

        Variedad variedad = new Variedad();

        variedad.setId( VariedadEntity.getId() );
        variedad.setDescripcion( VariedadEntity.getDescripcion() );
        variedad.setIdTipoCultivo( tipoCultivoEntityToTipoCultivo( VariedadEntity.getIdTipoCultivo() ) );

        return variedad;
    }

    @Override
    public VariedadEntity toEntity(Variedad Variedad) {
        if ( Variedad == null ) {
            return null;
        }

        VariedadEntity variedadEntity = new VariedadEntity();

        variedadEntity.setId( Variedad.getId() );
        variedadEntity.setDescripcion( Variedad.getDescripcion() );
        variedadEntity.setIdTipoCultivo( tipoCultivoToTipoCultivoEntity( Variedad.getIdTipoCultivo() ) );

        return variedadEntity;
    }

    @Override
    public List<Variedad> abonosOrganicosRecomendacionToDomain(List<VariedadEntity> abonoOrganicoEntities) {
        if ( abonoOrganicoEntities == null ) {
            return null;
        }

        List<Variedad> list = new ArrayList<Variedad>( abonoOrganicoEntities.size() );
        for ( VariedadEntity variedadEntity : abonoOrganicoEntities ) {
            list.add( toDomain( variedadEntity ) );
        }

        return list;
    }

    protected TipoCultivo tipoCultivoEntityToTipoCultivo(TipoCultivoEntity tipoCultivoEntity) {
        if ( tipoCultivoEntity == null ) {
            return null;
        }

        TipoCultivo tipoCultivo = new TipoCultivo();

        tipoCultivo.setId( tipoCultivoEntity.getId() );
        tipoCultivo.setDescripcion( tipoCultivoEntity.getDescripcion() );

        return tipoCultivo;
    }

    protected TipoCultivoEntity tipoCultivoToTipoCultivoEntity(TipoCultivo tipoCultivo) {
        if ( tipoCultivo == null ) {
            return null;
        }

        TipoCultivoEntity tipoCultivoEntity = new TipoCultivoEntity();

        tipoCultivoEntity.setId( tipoCultivo.getId() );
        tipoCultivoEntity.setDescripcion( tipoCultivo.getDescripcion() );

        return tipoCultivoEntity;
    }
}
