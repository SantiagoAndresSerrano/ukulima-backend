package ufps.ukulima.infrastructure.db.springdata.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.model.Agricultor.Agricultor;
import ufps.ukulima.domain.model.Corregimiento.Corregimiento;
import ufps.ukulima.domain.model.Departamento.Departamento;
import ufps.ukulima.domain.model.Finca.Finca;
import ufps.ukulima.domain.model.Municipio.Municipio;
import ufps.ukulima.domain.model.TipoIdentificacion.TipoIdentificacion;
import ufps.ukulima.domain.model.Vereda.Vereda;
import ufps.ukulima.infrastructure.db.springdata.entity.Agricultor.AgricultorEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Corregimiento.CorregimientoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Departamento.DepartamentoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Finca.FincaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Municipio.MunicipioEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.TipoIdentificacion.TipoIdentificacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Vereda.VeredaEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-15T16:08:44-0500",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.4.200.v20220802-0458, environment: Java 17.0.4.1 (Eclipse Adoptium)"
)
@Component
public class FincaEntityMapperImpl implements FincaEntityMapper {

    @Override
    public Finca toDomain(FincaEntity FincaEntity) {
        if ( FincaEntity == null ) {
            return null;
        }

        Finca finca = new Finca();

        finca.setAreaEnUso( FincaEntity.getAreaEnUso() );
        finca.setAreaTotal( FincaEntity.getAreaTotal() );
        finca.setGeolocalizacion( FincaEntity.getGeolocalizacion() );
        finca.setIdAgricultor( agricultorEntityToAgricultor( FincaEntity.getIdAgricultor() ) );
        finca.setIdCorregimiento( corregimientoEntityToCorregimiento( FincaEntity.getIdCorregimiento() ) );
        finca.setIdFinca( FincaEntity.getIdFinca() );
        finca.setIdMunicipio( municipioEntityToMunicipio( FincaEntity.getIdMunicipio() ) );
        finca.setIdVereda( veredaEntityToVereda( FincaEntity.getIdVereda() ) );
        finca.setNombre( FincaEntity.getNombre() );

        return finca;
    }

    @Override
    public FincaEntity toEntity(Finca Finca) {
        if ( Finca == null ) {
            return null;
        }

        FincaEntity fincaEntity = new FincaEntity();

        fincaEntity.setAreaEnUso( Finca.getAreaEnUso() );
        fincaEntity.setAreaTotal( Finca.getAreaTotal() );
        fincaEntity.setGeolocalizacion( Finca.getGeolocalizacion() );
        fincaEntity.setIdAgricultor( agricultorToAgricultorEntity( Finca.getIdAgricultor() ) );
        fincaEntity.setIdCorregimiento( corregimientoToCorregimientoEntity( Finca.getIdCorregimiento() ) );
        fincaEntity.setIdFinca( Finca.getIdFinca() );
        fincaEntity.setIdMunicipio( municipioToMunicipioEntity( Finca.getIdMunicipio() ) );
        fincaEntity.setIdVereda( veredaToVeredaEntity( Finca.getIdVereda() ) );
        fincaEntity.setNombre( Finca.getNombre() );

        return fincaEntity;
    }

    @Override
    public List<Finca> abonosOrganicosRecomendacionToDomain(List<FincaEntity> abonoOrganicoEntities) {
        if ( abonoOrganicoEntities == null ) {
            return null;
        }

        List<Finca> list = new ArrayList<Finca>( abonoOrganicoEntities.size() );
        for ( FincaEntity fincaEntity : abonoOrganicoEntities ) {
            list.add( toDomain( fincaEntity ) );
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

    protected Departamento departamentoEntityToDepartamento(DepartamentoEntity departamentoEntity) {
        if ( departamentoEntity == null ) {
            return null;
        }

        Departamento departamento = new Departamento();

        departamento.setIdDepto( departamentoEntity.getIdDepto() );
        departamento.setNombre( departamentoEntity.getNombre() );

        return departamento;
    }

    protected Municipio municipioEntityToMunicipio(MunicipioEntity municipioEntity) {
        if ( municipioEntity == null ) {
            return null;
        }

        Municipio municipio = new Municipio();

        municipio.setIdMunicipio( municipioEntity.getIdMunicipio() );
        municipio.setIdDepartamento( departamentoEntityToDepartamento( municipioEntity.getIdDepartamento() ) );

        return municipio;
    }

    protected Corregimiento corregimientoEntityToCorregimiento(CorregimientoEntity corregimientoEntity) {
        if ( corregimientoEntity == null ) {
            return null;
        }

        Corregimiento corregimiento = new Corregimiento();

        corregimiento.setIdCorregimiento( corregimientoEntity.getIdCorregimiento() );
        corregimiento.setNombre( corregimientoEntity.getNombre() );
        corregimiento.setIdMunicipio( municipioEntityToMunicipio( corregimientoEntity.getIdMunicipio() ) );

        return corregimiento;
    }

    protected Vereda veredaEntityToVereda(VeredaEntity veredaEntity) {
        if ( veredaEntity == null ) {
            return null;
        }

        Vereda vereda = new Vereda();

        vereda.setIdVereda( veredaEntity.getIdVereda() );
        vereda.setIdCorregimiento( corregimientoEntityToCorregimiento( veredaEntity.getIdCorregimiento() ) );
        vereda.setNombre( veredaEntity.getNombre() );

        return vereda;
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
        agricultorEntity.setIdentificacion( agricultor.getIdentificacion() );
        agricultorEntity.setNombres( agricultor.getNombres() );
        agricultorEntity.setPassword( agricultor.getPassword() );
        agricultorEntity.setTelefono( agricultor.getTelefono() );

        return agricultorEntity;
    }

    protected DepartamentoEntity departamentoToDepartamentoEntity(Departamento departamento) {
        if ( departamento == null ) {
            return null;
        }

        DepartamentoEntity departamentoEntity = new DepartamentoEntity();

        departamentoEntity.setIdDepto( departamento.getIdDepto() );
        departamentoEntity.setNombre( departamento.getNombre() );

        return departamentoEntity;
    }

    protected MunicipioEntity municipioToMunicipioEntity(Municipio municipio) {
        if ( municipio == null ) {
            return null;
        }

        MunicipioEntity municipioEntity = new MunicipioEntity();

        municipioEntity.setIdDepartamento( departamentoToDepartamentoEntity( municipio.getIdDepartamento() ) );
        municipioEntity.setIdMunicipio( municipio.getIdMunicipio() );

        return municipioEntity;
    }

    protected CorregimientoEntity corregimientoToCorregimientoEntity(Corregimiento corregimiento) {
        if ( corregimiento == null ) {
            return null;
        }

        CorregimientoEntity corregimientoEntity = new CorregimientoEntity();

        corregimientoEntity.setIdCorregimiento( corregimiento.getIdCorregimiento() );
        corregimientoEntity.setIdMunicipio( municipioToMunicipioEntity( corregimiento.getIdMunicipio() ) );
        corregimientoEntity.setNombre( corregimiento.getNombre() );

        return corregimientoEntity;
    }

    protected VeredaEntity veredaToVeredaEntity(Vereda vereda) {
        if ( vereda == null ) {
            return null;
        }

        VeredaEntity veredaEntity = new VeredaEntity();

        veredaEntity.setIdCorregimiento( corregimientoToCorregimientoEntity( vereda.getIdCorregimiento() ) );
        veredaEntity.setIdVereda( vereda.getIdVereda() );
        veredaEntity.setNombre( vereda.getNombre() );

        return veredaEntity;
    }
}
