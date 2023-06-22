package ufps.ukulima.infrastructure.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.model.Departamento.Departamento;
import ufps.ukulima.infrastructure.db.springdata.entity.Departamento.DepartamentoEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-22T13:15:26-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class DepartamentoEntityMapperImpl implements DepartamentoEntityMapper {

    @Override
    public Departamento toDomain(DepartamentoEntity DepartamentoEntity) {
        if ( DepartamentoEntity == null ) {
            return null;
        }

        Departamento departamento = new Departamento();

        departamento.setIdDepto( DepartamentoEntity.getIdDepto() );
        departamento.setNombre( DepartamentoEntity.getNombre() );

        return departamento;
    }

    @Override
    public DepartamentoEntity toEntity(Departamento Departamento) {
        if ( Departamento == null ) {
            return null;
        }

        DepartamentoEntity departamentoEntity = new DepartamentoEntity();

        departamentoEntity.setIdDepto( Departamento.getIdDepto() );
        departamentoEntity.setNombre( Departamento.getNombre() );

        return departamentoEntity;
    }

    @Override
    public List<Departamento> abonosOrganicosRecomendacionToDomain(List<DepartamentoEntity> abonoOrganicoEntities) {
        if ( abonoOrganicoEntities == null ) {
            return null;
        }

        List<Departamento> list = new ArrayList<Departamento>( abonoOrganicoEntities.size() );
        for ( DepartamentoEntity departamentoEntity : abonoOrganicoEntities ) {
            list.add( toDomain( departamentoEntity ) );
        }

        return list;
    }
}
