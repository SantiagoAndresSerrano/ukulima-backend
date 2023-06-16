package ufps.ukulima.infrastructure.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.model.Corregimiento.Corregimiento;
import ufps.ukulima.domain.model.Departamento.Departamento;
import ufps.ukulima.domain.model.Municipio.Municipio;
import ufps.ukulima.infrastructure.db.springdata.entity.Corregimiento.CorregimientoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Departamento.DepartamentoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Municipio.MunicipioEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-15T20:22:51-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class CorregimientoEntityMapperImpl implements CorregimientoEntityMapper {

    @Override
    public Corregimiento toDomain(CorregimientoEntity CorregimientoEntity) {
        if ( CorregimientoEntity == null ) {
            return null;
        }

        Corregimiento corregimiento = new Corregimiento();

        corregimiento.setIdCorregimiento( CorregimientoEntity.getIdCorregimiento() );
        corregimiento.setNombre( CorregimientoEntity.getNombre() );
        corregimiento.setIdMunicipio( municipioEntityToMunicipio( CorregimientoEntity.getIdMunicipio() ) );

        return corregimiento;
    }

    @Override
    public CorregimientoEntity toEntity(Corregimiento Corregimiento) {
        if ( Corregimiento == null ) {
            return null;
        }

        CorregimientoEntity corregimientoEntity = new CorregimientoEntity();

        corregimientoEntity.setIdCorregimiento( Corregimiento.getIdCorregimiento() );
        corregimientoEntity.setNombre( Corregimiento.getNombre() );
        corregimientoEntity.setIdMunicipio( municipioToMunicipioEntity( Corregimiento.getIdMunicipio() ) );

        return corregimientoEntity;
    }

    @Override
    public List<Corregimiento> abonosOrganicosRecomendacionToDomain(List<CorregimientoEntity> abonoOrganicoEntities) {
        if ( abonoOrganicoEntities == null ) {
            return null;
        }

        List<Corregimiento> list = new ArrayList<Corregimiento>( abonoOrganicoEntities.size() );
        for ( CorregimientoEntity corregimientoEntity : abonoOrganicoEntities ) {
            list.add( toDomain( corregimientoEntity ) );
        }

        return list;
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
        municipio.setNombre( municipioEntity.getNombre() );

        return municipio;
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

        municipioEntity.setIdMunicipio( municipio.getIdMunicipio() );
        municipioEntity.setIdDepartamento( departamentoToDepartamentoEntity( municipio.getIdDepartamento() ) );
        municipioEntity.setNombre( municipio.getNombre() );

        return municipioEntity;
    }
}
