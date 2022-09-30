package ufps.ukulima.infrastructure.db.springdata.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.model.Agricultor.Agricultor;
import ufps.ukulima.domain.model.TipoIdentificacion.TipoIdentificacion;
import ufps.ukulima.infrastructure.db.springdata.entity.Agricultor.AgricultorEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.TipoIdentificacion.TipoIdentificacionEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-30T08:07:22-0500",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.4.200.v20220719-0747, environment: Java 17.0.4 (Eclipse Adoptium)"
)
@Component
public class AgricultorEntityMapperImpl implements AgricultorEntityMapper {

    @Override
    public Agricultor toDomain(AgricultorEntity AgricultorEntity) {
        if ( AgricultorEntity == null ) {
            return null;
        }

        Agricultor agricultor = new Agricultor();

        agricultor.setApellidos( AgricultorEntity.getApellidos() );
        agricultor.setConfirmationToken( AgricultorEntity.getConfirmationToken() );
        agricultor.setEmail( AgricultorEntity.getEmail() );
        agricultor.setEstado( AgricultorEntity.getEstado() );
        agricultor.setFechaNacimiento( AgricultorEntity.getFechaNacimiento() );
        agricultor.setIdTipoIdentificacion( tipoIdentificacionEntityToTipoIdentificacion( AgricultorEntity.getIdTipoIdentificacion() ) );
        agricultor.setIdentificacion( AgricultorEntity.getIdentificacion() );
        agricultor.setNombres( AgricultorEntity.getNombres() );
        agricultor.setPassword( AgricultorEntity.getPassword() );
        agricultor.setTelefono( AgricultorEntity.getTelefono() );

        return agricultor;
    }

    @Override
    public AgricultorEntity toEntity(Agricultor Agricultor) {
        if ( Agricultor == null ) {
            return null;
        }

        AgricultorEntity agricultorEntity = new AgricultorEntity();

        agricultorEntity.setApellidos( Agricultor.getApellidos() );
        agricultorEntity.setConfirmationToken( Agricultor.getConfirmationToken() );
        agricultorEntity.setEmail( Agricultor.getEmail() );
        agricultorEntity.setEstado( Agricultor.getEstado() );
        agricultorEntity.setFechaNacimiento( Agricultor.getFechaNacimiento() );
        agricultorEntity.setIdentificacion( Agricultor.getIdentificacion() );
        agricultorEntity.setNombres( Agricultor.getNombres() );
        agricultorEntity.setPassword( Agricultor.getPassword() );
        agricultorEntity.setTelefono( Agricultor.getTelefono() );

        return agricultorEntity;
    }

    @Override
    public List<Agricultor> AgricultorToDomain(List<AgricultorEntity> abonoOrganicoEntities) {
        if ( abonoOrganicoEntities == null ) {
            return null;
        }

        List<Agricultor> list = new ArrayList<Agricultor>( abonoOrganicoEntities.size() );
        for ( AgricultorEntity agricultorEntity : abonoOrganicoEntities ) {
            list.add( toDomain( agricultorEntity ) );
        }

        return list;
    }

    protected TipoIdentificacion tipoIdentificacionEntityToTipoIdentificacion(TipoIdentificacionEntity tipoIdentificacionEntity) {
        if ( tipoIdentificacionEntity == null ) {
            return null;
        }

        TipoIdentificacion tipoIdentificacion = new TipoIdentificacion();

        tipoIdentificacion.setIdTipo( tipoIdentificacionEntity.getIdTipo() );
        tipoIdentificacion.setNombre( tipoIdentificacionEntity.getNombre() );

        return tipoIdentificacion;
    }
}
