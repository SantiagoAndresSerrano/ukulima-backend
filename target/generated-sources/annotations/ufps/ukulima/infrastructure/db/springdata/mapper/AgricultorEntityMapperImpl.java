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
    date = "2023-04-13T01:32:45-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class AgricultorEntityMapperImpl implements AgricultorEntityMapper {

    @Override
    public Agricultor toDomain(AgricultorEntity AgricultorEntity) {
        if ( AgricultorEntity == null ) {
            return null;
        }

        Agricultor agricultor = new Agricultor();

        agricultor.setConfirmationToken( AgricultorEntity.getConfirmationToken() );
        agricultor.setEstado( AgricultorEntity.getEstado() );
        agricultor.setIdentificacion( AgricultorEntity.getIdentificacion() );
        agricultor.setNombres( AgricultorEntity.getNombres() );
        agricultor.setApellidos( AgricultorEntity.getApellidos() );
        agricultor.setTelefono( AgricultorEntity.getTelefono() );
        agricultor.setFechaNacimiento( AgricultorEntity.getFechaNacimiento() );
        agricultor.setPassword( AgricultorEntity.getPassword() );
        agricultor.setEmail( AgricultorEntity.getEmail() );
        agricultor.setIdTipoIdentificacion( tipoIdentificacionEntityToTipoIdentificacion( AgricultorEntity.getIdTipoIdentificacion() ) );

        return agricultor;
    }

    @Override
    public AgricultorEntity toEntity(Agricultor Agricultor) {
        if ( Agricultor == null ) {
            return null;
        }

        AgricultorEntity agricultorEntity = new AgricultorEntity();

        agricultorEntity.setEstado( Agricultor.getEstado() );
        agricultorEntity.setConfirmationToken( Agricultor.getConfirmationToken() );
        agricultorEntity.setIdentificacion( Agricultor.getIdentificacion() );
        agricultorEntity.setNombres( Agricultor.getNombres() );
        agricultorEntity.setApellidos( Agricultor.getApellidos() );
        agricultorEntity.setTelefono( Agricultor.getTelefono() );
        agricultorEntity.setFechaNacimiento( Agricultor.getFechaNacimiento() );
        agricultorEntity.setPassword( Agricultor.getPassword() );
        agricultorEntity.setEmail( Agricultor.getEmail() );
        agricultorEntity.setIdTipoIdentificacion( tipoIdentificacionToTipoIdentificacionEntity( Agricultor.getIdTipoIdentificacion() ) );

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

    protected TipoIdentificacionEntity tipoIdentificacionToTipoIdentificacionEntity(TipoIdentificacion tipoIdentificacion) {
        if ( tipoIdentificacion == null ) {
            return null;
        }

        TipoIdentificacionEntity tipoIdentificacionEntity = new TipoIdentificacionEntity();

        tipoIdentificacionEntity.setIdTipo( tipoIdentificacion.getIdTipo() );
        tipoIdentificacionEntity.setNombre( tipoIdentificacion.getNombre() );

        return tipoIdentificacionEntity;
    }
}
