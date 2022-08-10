package ufps.ukulima.infrastructure.db.springdata.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.model.AbonoOrganico.AbonoOrganico;
import ufps.ukulima.infrastructure.db.springdata.entity.AbonoOrganico.AbonoOrganicoEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-09T19:16:43-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.16 (Oracle Corporation)"
)
@Component
public class AbonoOrganicoEntityMapperImpl implements AbonoOrganicoEntityMapper {

    @Override
    public AbonoOrganico toDomain(AbonoOrganicoEntity abonoOrganicoEntity) {
        if ( abonoOrganicoEntity == null ) {
            return null;
        }

        AbonoOrganico abonoOrganico = new AbonoOrganico();

        abonoOrganico.setId( abonoOrganicoEntity.getId() );
        abonoOrganico.setDescripcion( abonoOrganicoEntity.getDescripcion() );

        return abonoOrganico;
    }

    @Override
    public List<AbonoOrganico> toDomain(List<AbonoOrganicoEntity> abonoOrganicoEntities) {
        if ( abonoOrganicoEntities == null ) {
            return null;
        }

        List<AbonoOrganico> list = new ArrayList<AbonoOrganico>( abonoOrganicoEntities.size() );
        for ( AbonoOrganicoEntity abonoOrganicoEntity : abonoOrganicoEntities ) {
            list.add( toDomain( abonoOrganicoEntity ) );
        }

        return list;
    }

    @Override
    public AbonoOrganicoEntity toEntity(AbonoOrganico abonoOrganico) {
        if ( abonoOrganico == null ) {
            return null;
        }

        AbonoOrganicoEntity abonoOrganicoEntity = new AbonoOrganicoEntity();

        abonoOrganicoEntity.setId( abonoOrganico.getId() );
        abonoOrganicoEntity.setDescripcion( abonoOrganico.getDescripcion() );

        return abonoOrganicoEntity;
    }
}