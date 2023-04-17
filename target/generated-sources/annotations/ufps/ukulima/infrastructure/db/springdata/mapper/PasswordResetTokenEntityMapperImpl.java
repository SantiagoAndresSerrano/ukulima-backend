package ufps.ukulima.infrastructure.db.springdata.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.model.Agricultor.Agricultor;
import ufps.ukulima.domain.model.PasswordResetToken.PasswordResetToken;
import ufps.ukulima.domain.model.TipoIdentificacion.TipoIdentificacion;
import ufps.ukulima.infrastructure.db.springdata.entity.Agricultor.AgricultorEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.PasswordResetToken.PasswordResetTokenEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.TipoIdentificacion.TipoIdentificacionEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-17T01:51:27-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class PasswordResetTokenEntityMapperImpl implements PasswordResetTokenEntityMapper {

    @Override
    public PasswordResetToken toDomain(PasswordResetTokenEntity passwordResetTokenEntity) {
        if ( passwordResetTokenEntity == null ) {
            return null;
        }

        PasswordResetToken passwordResetToken = new PasswordResetToken();

        passwordResetToken.setToken( passwordResetTokenEntity.getToken() );
        passwordResetToken.setFechaExpiracion( passwordResetTokenEntity.getFechaExpiracion() );
        passwordResetToken.setAgricultor( agricultorEntityToAgricultor( passwordResetTokenEntity.getAgricultor() ) );
        passwordResetToken.setId( passwordResetTokenEntity.getId() );

        return passwordResetToken;
    }

    @Override
    public PasswordResetTokenEntity toEntity(PasswordResetToken passwordResetToken) {
        if ( passwordResetToken == null ) {
            return null;
        }

        PasswordResetTokenEntity passwordResetTokenEntity = new PasswordResetTokenEntity();

        passwordResetTokenEntity.setToken( passwordResetToken.getToken() );
        passwordResetTokenEntity.setFechaExpiracion( passwordResetToken.getFechaExpiracion() );
        passwordResetTokenEntity.setAgricultor( agricultorToAgricultorEntity( passwordResetToken.getAgricultor() ) );
        passwordResetTokenEntity.setId( passwordResetToken.getId() );

        return passwordResetTokenEntity;
    }

    @Override
    public List<PasswordResetToken> abonosOrganicosRecomendacionToDomain(List<PasswordResetTokenEntity> abonoOrganicoEntities) {
        if ( abonoOrganicoEntities == null ) {
            return null;
        }

        List<PasswordResetToken> list = new ArrayList<PasswordResetToken>( abonoOrganicoEntities.size() );
        for ( PasswordResetTokenEntity passwordResetTokenEntity : abonoOrganicoEntities ) {
            list.add( toDomain( passwordResetTokenEntity ) );
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

    protected Agricultor agricultorEntityToAgricultor(AgricultorEntity agricultorEntity) {
        if ( agricultorEntity == null ) {
            return null;
        }

        Agricultor agricultor = new Agricultor();

        agricultor.setConfirmationToken( agricultorEntity.getConfirmationToken() );
        agricultor.setEstado( agricultorEntity.getEstado() );
        agricultor.setIdentificacion( agricultorEntity.getIdentificacion() );
        agricultor.setNombres( agricultorEntity.getNombres() );
        agricultor.setApellidos( agricultorEntity.getApellidos() );
        agricultor.setTelefono( agricultorEntity.getTelefono() );
        agricultor.setFechaNacimiento( agricultorEntity.getFechaNacimiento() );
        agricultor.setPassword( agricultorEntity.getPassword() );
        agricultor.setEmail( agricultorEntity.getEmail() );
        agricultor.setIdTipoIdentificacion( tipoIdentificacionEntityToTipoIdentificacion( agricultorEntity.getIdTipoIdentificacion() ) );

        return agricultor;
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

    protected AgricultorEntity agricultorToAgricultorEntity(Agricultor agricultor) {
        if ( agricultor == null ) {
            return null;
        }

        AgricultorEntity agricultorEntity = new AgricultorEntity();

        agricultorEntity.setEstado( agricultor.getEstado() );
        agricultorEntity.setConfirmationToken( agricultor.getConfirmationToken() );
        agricultorEntity.setIdentificacion( agricultor.getIdentificacion() );
        agricultorEntity.setNombres( agricultor.getNombres() );
        agricultorEntity.setApellidos( agricultor.getApellidos() );
        agricultorEntity.setTelefono( agricultor.getTelefono() );
        agricultorEntity.setFechaNacimiento( agricultor.getFechaNacimiento() );
        agricultorEntity.setPassword( agricultor.getPassword() );
        agricultorEntity.setEmail( agricultor.getEmail() );
        agricultorEntity.setIdTipoIdentificacion( tipoIdentificacionToTipoIdentificacionEntity( agricultor.getIdTipoIdentificacion() ) );

        return agricultorEntity;
    }
}
