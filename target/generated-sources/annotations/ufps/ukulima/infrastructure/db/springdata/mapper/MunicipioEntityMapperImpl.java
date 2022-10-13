package ufps.ukulima.infrastructure.db.springdata.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.model.Departamento.Departamento;
import ufps.ukulima.domain.model.Municipio.Municipio;
import ufps.ukulima.infrastructure.db.springdata.entity.Departamento.DepartamentoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Municipio.MunicipioEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-12T20:14:11-0500",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.4.200.v20220802-0458, environment: Java 17.0.4.1 (Eclipse Adoptium)"
)
@Component
public class MunicipioEntityMapperImpl implements MunicipioEntityMapper {

    @Override
    public Municipio toDomain(MunicipioEntity MunicipioEntity) {
        if ( MunicipioEntity == null ) {
            return null;
        }

        Municipio municipio = new Municipio();

        municipio.setIdMunicipio( MunicipioEntity.getIdMunicipio() );
        municipio.setIdDepartamento( departamentoEntityToDepartamento( MunicipioEntity.getIdDepartamento() ) );

        return municipio;
    }

    @Override
    public MunicipioEntity toEntity(Municipio Municipio) {
        if ( Municipio == null ) {
            return null;
        }

        MunicipioEntity municipioEntity = new MunicipioEntity();

        municipioEntity.setIdMunicipio( Municipio.getIdMunicipio() );
        municipioEntity.setIdDepartamento( departamentoToDepartamentoEntity( Municipio.getIdDepartamento() ) );

        return municipioEntity;
    }

    @Override
    public List<Municipio> abonosOrganicosRecomendacionToDomain(List<MunicipioEntity> abonoOrganicoEntities) {
        if ( abonoOrganicoEntities == null ) {
            return null;
        }

        List<Municipio> list = new ArrayList<Municipio>( abonoOrganicoEntities.size() );
        for ( MunicipioEntity municipioEntity : abonoOrganicoEntities ) {
            list.add( toDomain( municipioEntity ) );
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

    protected DepartamentoEntity departamentoToDepartamentoEntity(Departamento departamento) {
        if ( departamento == null ) {
            return null;
        }

        DepartamentoEntity departamentoEntity = new DepartamentoEntity();

        departamentoEntity.setIdDepto( departamento.getIdDepto() );
        departamentoEntity.setNombre( departamento.getNombre() );

        return departamentoEntity;
    }
}
