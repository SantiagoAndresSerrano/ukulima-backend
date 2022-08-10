package ufps.ukulima.infrastructure.db.springdata.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.model.Vereda.Vereda;
import ufps.ukulima.infrastructure.db.springdata.entity.Vereda.VeredaEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-10T10:50:48-0500",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.4.100.v20220318-0906, environment: Java 17.0.3 (Eclipse Adoptium)"
)
@Component
public class VeredaEntityMapperImpl implements VeredaEntityMapper {

    @Override
    public Vereda toDomain(VeredaEntity VeredaEntity) {
        if ( VeredaEntity == null ) {
            return null;
        }

        Vereda vereda = new Vereda();

        vereda.setIdVereda( VeredaEntity.getIdVereda() );
        vereda.setIdCorregimiento( VeredaEntity.getIdCorregimiento() );
        vereda.setNombre( VeredaEntity.getNombre() );

        return vereda;
    }

    @Override
    public VeredaEntity toEntity(Vereda Vereda) {
        if ( Vereda == null ) {
            return null;
        }

        VeredaEntity veredaEntity = new VeredaEntity();

        veredaEntity.setIdVereda( Vereda.getIdVereda() );
        veredaEntity.setIdCorregimiento( Vereda.getIdCorregimiento() );
        veredaEntity.setNombre( Vereda.getNombre() );

        return veredaEntity;
    }

    @Override
    public List<Vereda> abonosOrganicosRecomendacionToDomain(List<VeredaEntity> abonoOrganicoEntities) {
        if ( abonoOrganicoEntities == null ) {
            return null;
        }

        List<Vereda> list = new ArrayList<Vereda>( abonoOrganicoEntities.size() );
        for ( VeredaEntity veredaEntity : abonoOrganicoEntities ) {
            list.add( toDomain( veredaEntity ) );
        }

        return list;
    }
}
