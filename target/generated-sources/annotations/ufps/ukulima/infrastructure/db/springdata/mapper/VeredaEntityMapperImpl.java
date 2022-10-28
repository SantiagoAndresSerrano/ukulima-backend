package ufps.ukulima.infrastructure.db.springdata.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.model.Corregimiento.Corregimiento;
import ufps.ukulima.domain.model.Departamento.Departamento;
import ufps.ukulima.domain.model.Municipio.Municipio;
import ufps.ukulima.domain.model.Vereda.Vereda;
import ufps.ukulima.infrastructure.db.springdata.entity.Corregimiento.CorregimientoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Departamento.DepartamentoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Municipio.MunicipioEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Vereda.VeredaEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-28T11:43:59-0500",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.4.200.v20221012-0724, environment: Java 17.0.4.1 (Eclipse Adoptium)"
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
        vereda.setIdCorregimiento( corregimientoEntityToCorregimiento( VeredaEntity.getIdCorregimiento() ) );
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
        veredaEntity.setIdCorregimiento( corregimientoToCorregimientoEntity( Vereda.getIdCorregimiento() ) );
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

    protected CorregimientoEntity corregimientoToCorregimientoEntity(Corregimiento corregimiento) {
        if ( corregimiento == null ) {
            return null;
        }

        CorregimientoEntity corregimientoEntity = new CorregimientoEntity();

        corregimientoEntity.setIdCorregimiento( corregimiento.getIdCorregimiento() );
        corregimientoEntity.setNombre( corregimiento.getNombre() );
        corregimientoEntity.setIdMunicipio( municipioToMunicipioEntity( corregimiento.getIdMunicipio() ) );

        return corregimientoEntity;
    }
}
