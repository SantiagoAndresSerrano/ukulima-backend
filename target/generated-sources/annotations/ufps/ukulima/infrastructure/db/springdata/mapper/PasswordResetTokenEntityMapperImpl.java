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
    date = "2022-08-10T10:56:11-0500",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.4.100.v20220318-0906, environment: Java 17.0.3 (Eclipse Adoptium)"
)
@Component
public class PasswordResetTokenEntityMapperImpl implements PasswordResetTokenEntityMapper {

    @Override
    public PasswordResetToken toDomain(PasswordResetTokenEntity passwordResetTokenEntity) {
        if ( passwordResetTokenEntity == null ) {
            return null;
        }

        PasswordResetToken passwordResetToken = new PasswordResetToken();

        passwordResetToken.setAgricultor( agricultorEntityToAgricultor( passwordResetTokenEntity.getAgricultor() ) );
        passwordResetToken.setFechaExpiracion( passwordResetTokenEntity.getFechaExpiracion() );
        passwordResetToken.setId( passwordResetTokenEntity.getId() );
        passwordResetToken.setToken( passwordResetTokenEntity.getToken() );

        return passwordResetToken;
    }

    @Override
    public PasswordResetTokenEntity toEntity(PasswordResetToken passwordResetToken) {
        if ( passwordResetToken == null ) {
            return null;
        }

        PasswordResetTokenEntity passwordResetTokenEntity = new PasswordResetTokenEntity();

        passwordResetTokenEntity.setAgricultor( agricultorToAgricultorEntity( passwordResetToken.getAgricultor() ) );
        passwordResetTokenEntity.setFechaExpiracion( passwordResetToken.getFechaExpiracion() );
        passwordResetTokenEntity.setId( passwordResetToken.getId() );
        passwordResetTokenEntity.setToken( passwordResetToken.getToken() );

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

        agricultor.setApellidos( agricultorEntity.getApellidos() );
        agricultor.setConfirmationToken( agricultorEntity.getConfirmationToken() );
        agricultor.setEmail( agricultorEntity.getEmail() );
        agricultor.setEstado( agricultorEntity.getEstado() );
        agricultor.setFechaNacimiento( agricultorEntity.getFechaNacimiento() );
        agricultor.setIdTipoIdentificacion( tipoIdentificacionEntityToTipoIdentificacion( agricultorEntity.getIdTipoIdentificacion() ) );
        agricultor.setIdentifiacion( agricultorEntity.getIdentifiacion() );
        agricultor.setNombres( agricultorEntity.getNombres() );
        agricultor.setPassword( agricultorEntity.getPassword() );
        agricultor.setTelefono( agricultorEntity.getTelefono() );

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

        agricultorEntity.setApellidos( agricultor.getApellidos() );
        agricultorEntity.setConfirmationToken( agricultor.getConfirmationToken() );
        agricultorEntity.setEmail( agricultor.getEmail() );
        agricultorEntity.setEstado( agricultor.getEstado() );
        agricultorEntity.setFechaNacimiento( agricultor.getFechaNacimiento() );
        agricultorEntity.setIdTipoIdentificacion( tipoIdentificacionToTipoIdentificacionEntity( agricultor.getIdTipoIdentificacion() ) );
        agricultorEntity.setIdentifiacion( agricultor.getIdentifiacion() );
        agricultorEntity.setNombres( agricultor.getNombres() );
        agricultorEntity.setPassword( agricultor.getPassword() );
        agricultorEntity.setTelefono( agricultor.getTelefono() );

        return agricultorEntity;
    }
}
