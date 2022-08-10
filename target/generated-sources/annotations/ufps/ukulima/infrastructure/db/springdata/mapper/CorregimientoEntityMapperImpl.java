package ufps.ukulima.infrastructure.db.springdata.mapper;

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
    date = "2022-08-09T19:16:53-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.16 (Oracle Corporation)"
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

        return municipioEntity;
    }
}