package ufps.ukulima.infrastructure.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.model.AbonoOrganico.AbonoOrganico;
import ufps.ukulima.domain.model.AbonoOrganicoRecomendacion.AbonoOrganicoRecomendacion;
import ufps.ukulima.domain.model.AbonoQuimicoRecomendacion.AbonoQuimicoRecomendacion;
import ufps.ukulima.domain.model.Elemento.Elemento;
import ufps.ukulima.domain.model.Enmienda.Enmienda;
import ufps.ukulima.domain.model.EnmiendaRecomendacion.EnmiendaRecomendacion;
import ufps.ukulima.domain.model.Recomendacion.Recomendacion;
import ufps.ukulima.infrastructure.db.springdata.entity.AbonoOrganico.AbonoOrganicoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AbonoOrganicoRecomendacion.AbonoOrganicoRecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AbonoQuimicoRecomendacion.AbonoQuimicoRecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Elemento.ElementoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Enmienda.EnmiendaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.EnmiendaRecomendacion.EnmiendaRecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Recomendacion.RecomendacionEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-19T01:41:50-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class EnmiendaEntityMapperImpl implements EnmiendaEntityMapper {

    @Override
    public Enmienda toDomain(EnmiendaEntity EnmiendaEntity) {
        if ( EnmiendaEntity == null ) {
            return null;
        }

        Enmienda enmienda = new Enmienda();

        enmienda.setId( EnmiendaEntity.getId() );
        enmienda.setNombre( EnmiendaEntity.getNombre() );
        enmienda.setValor( EnmiendaEntity.getValor() );
        enmienda.setFormula( EnmiendaEntity.getFormula() );

        return enmienda;
    }

    @Override
    public EnmiendaEntity toEntity(Enmienda Enmienda) {
        if ( Enmienda == null ) {
            return null;
        }

        EnmiendaEntity enmiendaEntity = new EnmiendaEntity();

        enmiendaEntity.setNombre( Enmienda.getNombre() );
        enmiendaEntity.setFormula( Enmienda.getFormula() );
        enmiendaEntity.setValor( Enmienda.getValor() );
        enmiendaEntity.setId( Enmienda.getId() );
        enmiendaEntity.setRecomendacionCollection( recomendacionCollectionToRecomendacionEntityCollection( Enmienda.getRecomendacionCollection() ) );

        return enmiendaEntity;
    }

    @Override
    public List<Enmienda> abonosOrganicosRecomendacionToDomain(List<EnmiendaEntity> abonoOrganicoEntities) {
        if ( abonoOrganicoEntities == null ) {
            return null;
        }

        List<Enmienda> list = new ArrayList<Enmienda>( abonoOrganicoEntities.size() );
        for ( EnmiendaEntity enmiendaEntity : abonoOrganicoEntities ) {
            list.add( toDomain( enmiendaEntity ) );
        }

        return list;
    }

    protected EnmiendaRecomendacionEntity enmiendaRecomendacionToEnmiendaRecomendacionEntity(EnmiendaRecomendacion enmiendaRecomendacion) {
        if ( enmiendaRecomendacion == null ) {
            return null;
        }

        EnmiendaRecomendacionEntity enmiendaRecomendacionEntity = new EnmiendaRecomendacionEntity();

        enmiendaRecomendacionEntity.setId( enmiendaRecomendacion.getId() );
        enmiendaRecomendacionEntity.setEnmienda( toEntity( enmiendaRecomendacion.getEnmienda() ) );
        enmiendaRecomendacionEntity.setRecomendacion( recomendacionToRecomendacionEntity( enmiendaRecomendacion.getRecomendacion() ) );
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

    protected ElementoEntity elementoToElementoEntity(Elemento elemento) {
        if ( elemento == null ) {
            return null;
        }

        ElementoEntity elementoEntity = new ElementoEntity();

        elementoEntity.setId( elemento.getId() );
        elementoEntity.setNombre( elemento.getNombre() );
        elementoEntity.setUnidad( elemento.getUnidad() );

        return elementoEntity;
    }

    protected AbonoQuimicoRecomendacionEntity abonoQuimicoRecomendacionToAbonoQuimicoRecomendacionEntity(AbonoQuimicoRecomendacion abonoQuimicoRecomendacion) {
        if ( abonoQuimicoRecomendacion == null ) {
            return null;
        }

        AbonoQuimicoRecomendacionEntity abonoQuimicoRecomendacionEntity = new AbonoQuimicoRecomendacionEntity();

        abonoQuimicoRecomendacionEntity.setDosis( abonoQuimicoRecomendacion.getDosis() );
        abonoQuimicoRecomendacionEntity.setId( abonoQuimicoRecomendacion.getId() );
        abonoQuimicoRecomendacionEntity.setRecomendacion( recomendacionToRecomendacionEntity( abonoQuimicoRecomendacion.getRecomendacion() ) );
        abonoQuimicoRecomendacionEntity.setElemento( elementoToElementoEntity( abonoQuimicoRecomendacion.getElemento() ) );
        abonoQuimicoRecomendacionEntity.setDisponibilidad( abonoQuimicoRecomendacion.getDisponibilidad() );
        abonoQuimicoRecomendacionEntity.setEficiencia( abonoQuimicoRecomendacion.getEficiencia() );

        return abonoQuimicoRecomendacionEntity;
    }

    protected Collection<AbonoQuimicoRecomendacionEntity> abonoQuimicoRecomendacionCollectionToAbonoQuimicoRecomendacionEntityCollection(Collection<AbonoQuimicoRecomendacion> collection) {
        if ( collection == null ) {
            return null;
        }

        Collection<AbonoQuimicoRecomendacionEntity> collection1 = new ArrayList<AbonoQuimicoRecomendacionEntity>( collection.size() );
        for ( AbonoQuimicoRecomendacion abonoQuimicoRecomendacion : collection ) {
            collection1.add( abonoQuimicoRecomendacionToAbonoQuimicoRecomendacionEntity( abonoQuimicoRecomendacion ) );
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
        abonoOrganicoRecomendacionEntity.setIdRecomendacion( recomendacionToRecomendacionEntity( abonoOrganicoRecomendacion.getIdRecomendacion() ) );

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

    protected RecomendacionEntity recomendacionToRecomendacionEntity(Recomendacion recomendacion) {
        if ( recomendacion == null ) {
            return null;
        }

        RecomendacionEntity recomendacionEntity = new RecomendacionEntity();

        recomendacionEntity.setEnmiendaRecomendacionEntityCollection( enmiendaRecomendacionCollectionToEnmiendaRecomendacionEntityCollection( recomendacion.getEnmiendaRecomendacionEntityCollection() ) );
        recomendacionEntity.setLabranza( recomendacion.getLabranza() );
        recomendacionEntity.setId( recomendacion.getId() );
        recomendacionEntity.setCantidadEnmienda( recomendacion.getCantidadEnmienda() );
        recomendacionEntity.setPreparacionSuelo( recomendacion.getPreparacionSuelo() );
        recomendacionEntity.setAbonoQuimicoRecomendacionEntities( abonoQuimicoRecomendacionCollectionToAbonoQuimicoRecomendacionEntityCollection( recomendacion.getAbonoQuimicoRecomendacionEntities() ) );
        recomendacionEntity.setAbonoOrganicoRecomendacionCollection( abonoOrganicoRecomendacionCollectionToAbonoOrganicoRecomendacionEntityCollection( recomendacion.getAbonoOrganicoRecomendacionCollection() ) );

        return recomendacionEntity;
    }

    protected Collection<RecomendacionEntity> recomendacionCollectionToRecomendacionEntityCollection(Collection<Recomendacion> collection) {
        if ( collection == null ) {
            return null;
        }

        Collection<RecomendacionEntity> collection1 = new ArrayList<RecomendacionEntity>( collection.size() );
        for ( Recomendacion recomendacion : collection ) {
            collection1.add( recomendacionToRecomendacionEntity( recomendacion ) );
        }

        return collection1;
    }
}
