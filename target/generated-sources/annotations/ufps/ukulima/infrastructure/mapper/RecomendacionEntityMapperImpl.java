package ufps.ukulima.infrastructure.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.model.AbonoOrganico.AbonoOrganico;
import ufps.ukulima.domain.model.AbonoOrganicoRecomendacion.AbonoOrganicoRecomendacion;
import ufps.ukulima.domain.model.Enmienda.Enmienda;
import ufps.ukulima.domain.model.EnmiendaRecomendacion.EnmiendaRecomendacion;
import ufps.ukulima.domain.model.Recomendacion.Recomendacion;
import ufps.ukulima.infrastructure.db.springdata.entity.AbonoOrganico.AbonoOrganicoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AbonoOrganicoRecomendacion.AbonoOrganicoRecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Enmienda.EnmiendaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.EnmiendaRecomendacion.EnmiendaRecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Recomendacion.RecomendacionEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-29T23:53:50-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class RecomendacionEntityMapperImpl implements RecomendacionEntityMapper {

    @Override
    public Recomendacion toDomain(RecomendacionEntity RecomendacionEntity) {
        if ( RecomendacionEntity == null ) {
            return null;
        }

        Recomendacion recomendacion = new Recomendacion();

        recomendacion.setEnmiendaRecomendacionEntityCollection( enmiendaRecomendacionEntityCollectionToEnmiendaRecomendacionCollection( RecomendacionEntity.getEnmiendaRecomendacionEntityCollection() ) );
        recomendacion.setId( RecomendacionEntity.getId() );
        recomendacion.setCantidadEnmienda( RecomendacionEntity.getCantidadEnmienda() );
        recomendacion.setPreparacionSuelo( RecomendacionEntity.getPreparacionSuelo() );
        recomendacion.setAbonoOrganicoRecomendacionCollection( abonoOrganicoRecomendacionEntityCollectionToAbonoOrganicoRecomendacionCollection( RecomendacionEntity.getAbonoOrganicoRecomendacionCollection() ) );

        return recomendacion;
    }

    @Override
    public RecomendacionEntity toEntity(Recomendacion Recomendacion) {
        if ( Recomendacion == null ) {
            return null;
        }

        RecomendacionEntity recomendacionEntity = new RecomendacionEntity();

        recomendacionEntity.setEnmiendaRecomendacionEntityCollection( enmiendaRecomendacionCollectionToEnmiendaRecomendacionEntityCollection( Recomendacion.getEnmiendaRecomendacionEntityCollection() ) );
        recomendacionEntity.setId( Recomendacion.getId() );
        recomendacionEntity.setCantidadEnmienda( Recomendacion.getCantidadEnmienda() );
        recomendacionEntity.setPreparacionSuelo( Recomendacion.getPreparacionSuelo() );
        recomendacionEntity.setAbonoOrganicoRecomendacionCollection( abonoOrganicoRecomendacionCollectionToAbonoOrganicoRecomendacionEntityCollection( Recomendacion.getAbonoOrganicoRecomendacionCollection() ) );

        return recomendacionEntity;
    }

    @Override
    public List<Recomendacion> abonosOrganicosRecomendacionToDomain(List<RecomendacionEntity> abonoOrganicoEntities) {
        if ( abonoOrganicoEntities == null ) {
            return null;
        }

        List<Recomendacion> list = new ArrayList<Recomendacion>( abonoOrganicoEntities.size() );
        for ( RecomendacionEntity recomendacionEntity : abonoOrganicoEntities ) {
            list.add( toDomain( recomendacionEntity ) );
        }

        return list;
    }

    protected Enmienda enmiendaEntityToEnmienda(EnmiendaEntity enmiendaEntity) {
        if ( enmiendaEntity == null ) {
            return null;
        }

        Enmienda enmienda = new Enmienda();

        enmienda.setId( enmiendaEntity.getId() );
        enmienda.setNombre( enmiendaEntity.getNombre() );
        enmienda.setValor( enmiendaEntity.getValor() );
        enmienda.setFormula( enmiendaEntity.getFormula() );

        return enmienda;
    }

    protected EnmiendaRecomendacion enmiendaRecomendacionEntityToEnmiendaRecomendacion(EnmiendaRecomendacionEntity enmiendaRecomendacionEntity) {
        if ( enmiendaRecomendacionEntity == null ) {
            return null;
        }

        EnmiendaRecomendacion enmiendaRecomendacion = new EnmiendaRecomendacion();

        enmiendaRecomendacion.setId( enmiendaRecomendacionEntity.getId() );
        enmiendaRecomendacion.setEnmienda( enmiendaEntityToEnmienda( enmiendaRecomendacionEntity.getEnmienda() ) );
        enmiendaRecomendacion.setValor( enmiendaRecomendacionEntity.getValor() );

        return enmiendaRecomendacion;
    }

    protected Collection<EnmiendaRecomendacion> enmiendaRecomendacionEntityCollectionToEnmiendaRecomendacionCollection(Collection<EnmiendaRecomendacionEntity> collection) {
        if ( collection == null ) {
            return null;
        }

        Collection<EnmiendaRecomendacion> collection1 = new ArrayList<EnmiendaRecomendacion>( collection.size() );
        for ( EnmiendaRecomendacionEntity enmiendaRecomendacionEntity : collection ) {
            collection1.add( enmiendaRecomendacionEntityToEnmiendaRecomendacion( enmiendaRecomendacionEntity ) );
        }

        return collection1;
    }

    protected AbonoOrganico abonoOrganicoEntityToAbonoOrganico(AbonoOrganicoEntity abonoOrganicoEntity) {
        if ( abonoOrganicoEntity == null ) {
            return null;
        }

        AbonoOrganico abonoOrganico = new AbonoOrganico();

        abonoOrganico.setId( abonoOrganicoEntity.getId() );
        abonoOrganico.setDescripcion( abonoOrganicoEntity.getDescripcion() );

        return abonoOrganico;
    }

    protected AbonoOrganicoRecomendacion abonoOrganicoRecomendacionEntityToAbonoOrganicoRecomendacion(AbonoOrganicoRecomendacionEntity abonoOrganicoRecomendacionEntity) {
        if ( abonoOrganicoRecomendacionEntity == null ) {
            return null;
        }

        AbonoOrganicoRecomendacion abonoOrganicoRecomendacion = new AbonoOrganicoRecomendacion();

        abonoOrganicoRecomendacion.setId( abonoOrganicoRecomendacionEntity.getId() );
        abonoOrganicoRecomendacion.setCantidad( abonoOrganicoRecomendacionEntity.getCantidad() );
        abonoOrganicoRecomendacion.setIdAbonoOrganico( abonoOrganicoEntityToAbonoOrganico( abonoOrganicoRecomendacionEntity.getIdAbonoOrganico() ) );

        return abonoOrganicoRecomendacion;
    }

    protected Collection<AbonoOrganicoRecomendacion> abonoOrganicoRecomendacionEntityCollectionToAbonoOrganicoRecomendacionCollection(Collection<AbonoOrganicoRecomendacionEntity> collection) {
        if ( collection == null ) {
            return null;
        }

        Collection<AbonoOrganicoRecomendacion> collection1 = new ArrayList<AbonoOrganicoRecomendacion>( collection.size() );
        for ( AbonoOrganicoRecomendacionEntity abonoOrganicoRecomendacionEntity : collection ) {
            collection1.add( abonoOrganicoRecomendacionEntityToAbonoOrganicoRecomendacion( abonoOrganicoRecomendacionEntity ) );
        }

        return collection1;
    }

    protected Collection<RecomendacionEntity> recomendacionCollectionToRecomendacionEntityCollection(Collection<Recomendacion> collection) {
        if ( collection == null ) {
            return null;
        }

        Collection<RecomendacionEntity> collection1 = new ArrayList<RecomendacionEntity>( collection.size() );
        for ( Recomendacion recomendacion : collection ) {
            collection1.add( toEntity( recomendacion ) );
        }

        return collection1;
    }

    protected EnmiendaEntity enmiendaToEnmiendaEntity(Enmienda enmienda) {
        if ( enmienda == null ) {
            return null;
        }

        EnmiendaEntity enmiendaEntity = new EnmiendaEntity();

        enmiendaEntity.setNombre( enmienda.getNombre() );
        enmiendaEntity.setFormula( enmienda.getFormula() );
        enmiendaEntity.setValor( enmienda.getValor() );
        enmiendaEntity.setId( enmienda.getId() );
        enmiendaEntity.setRecomendacionCollection( recomendacionCollectionToRecomendacionEntityCollection( enmienda.getRecomendacionCollection() ) );

        return enmiendaEntity;
    }

    protected EnmiendaRecomendacionEntity enmiendaRecomendacionToEnmiendaRecomendacionEntity(EnmiendaRecomendacion enmiendaRecomendacion) {
        if ( enmiendaRecomendacion == null ) {
            return null;
        }

        EnmiendaRecomendacionEntity enmiendaRecomendacionEntity = new EnmiendaRecomendacionEntity();

        enmiendaRecomendacionEntity.setId( enmiendaRecomendacion.getId() );
        enmiendaRecomendacionEntity.setEnmienda( enmiendaToEnmiendaEntity( enmiendaRecomendacion.getEnmienda() ) );
        enmiendaRecomendacionEntity.setRecomendacion( toEntity( enmiendaRecomendacion.getRecomendacion() ) );
        enmiendaRecomendacionEntity.setValor( enmiendaRecomendacion.getValor() );

        return enmiendaRecomendacionEntity;
    }

    protected Collection<EnmiendaRecomendacionEntity> enmiendaRecomendacionCollectionToEnmiendaRecomendacionEntityCollection(Collection<EnmiendaRecomendacion> collection) {
        if ( collection == null ) {
            return null;
        }

        Collection<EnmiendaRecomendacionEntity> collection1 = new ArrayList<EnmiendaRecomendacionEntity>( collection.size() );
        for ( EnmiendaRecomendacion enmiendaRecomendacion : collection ) {
            collection1.add( enmiendaRecomendacionToEnmiendaRecomendacionEntity( enmiendaRecomendacion ) );
        }

        return collection1;
    }

    protected AbonoOrganicoEntity abonoOrganicoToAbonoOrganicoEntity(AbonoOrganico abonoOrganico) {
        if ( abonoOrganico == null ) {
            return null;
        }

        AbonoOrganicoEntity abonoOrganicoEntity = new AbonoOrganicoEntity();

        abonoOrganicoEntity.setId( abonoOrganico.getId() );
        abonoOrganicoEntity.setDescripcion( abonoOrganico.getDescripcion() );

        return abonoOrganicoEntity;
    }

    protected AbonoOrganicoRecomendacionEntity abonoOrganicoRecomendacionToAbonoOrganicoRecomendacionEntity(AbonoOrganicoRecomendacion abonoOrganicoRecomendacion) {
        if ( abonoOrganicoRecomendacion == null ) {
            return null;
        }

        AbonoOrganicoRecomendacionEntity abonoOrganicoRecomendacionEntity = new AbonoOrganicoRecomendacionEntity();

        abonoOrganicoRecomendacionEntity.setId( abonoOrganicoRecomendacion.getId() );
        abonoOrganicoRecomendacionEntity.setCantidad( abonoOrganicoRecomendacion.getCantidad() );
        abonoOrganicoRecomendacionEntity.setIdAbonoOrganico( abonoOrganicoToAbonoOrganicoEntity( abonoOrganicoRecomendacion.getIdAbonoOrganico() ) );
        abonoOrganicoRecomendacionEntity.setIdRecomendacion( toEntity( abonoOrganicoRecomendacion.getIdRecomendacion() ) );

        return abonoOrganicoRecomendacionEntity;
    }

    protected Collection<AbonoOrganicoRecomendacionEntity> abonoOrganicoRecomendacionCollectionToAbonoOrganicoRecomendacionEntityCollection(Collection<AbonoOrganicoRecomendacion> collection) {
        if ( collection == null ) {
            return null;
        }

        Collection<AbonoOrganicoRecomendacionEntity> collection1 = new ArrayList<AbonoOrganicoRecomendacionEntity>( collection.size() );
        for ( AbonoOrganicoRecomendacion abonoOrganicoRecomendacion : collection ) {
            collection1.add( abonoOrganicoRecomendacionToAbonoOrganicoRecomendacionEntity( abonoOrganicoRecomendacion ) );
        }

        return collection1;
    }
}
