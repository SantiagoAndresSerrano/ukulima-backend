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
import ufps.ukulima.domain.model.Fuente.Fuente;
import ufps.ukulima.domain.model.FuenteRecomendacion.FuenteRecomendacion;
import ufps.ukulima.domain.model.Recomendacion.Recomendacion;
import ufps.ukulima.infrastructure.db.springdata.entity.AbonoOrganico.AbonoOrganicoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AbonoOrganicoRecomendacion.AbonoOrganicoRecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AbonoQuimicoRecomendacion.AbonoQuimicoRecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Elemento.ElementoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Enmienda.EnmiendaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.EnmiendaRecomendacion.EnmiendaRecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Fuente.FuenteEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.FuenteRecomendacion.FuenteRecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Recomendacion.RecomendacionEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-18T20:38:51-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class FuenteRecomendacionEntityMapperImpl implements FuenteRecomendacionEntityMapper {

    @Override
    public FuenteRecomendacion toDomain(FuenteRecomendacionEntity FuenteRecomendacionEntity) {
        if ( FuenteRecomendacionEntity == null ) {
            return null;
        }

        FuenteRecomendacion fuenteRecomendacion = new FuenteRecomendacion();

        fuenteRecomendacion.setId( FuenteRecomendacionEntity.getId() );
        fuenteRecomendacion.setCantidad( FuenteRecomendacionEntity.getCantidad() );
        fuenteRecomendacion.setIdElemento( elementoEntityToElemento( FuenteRecomendacionEntity.getIdElemento() ) );
        fuenteRecomendacion.setIdFuente( fuenteEntityToFuente( FuenteRecomendacionEntity.getIdFuente() ) );
        fuenteRecomendacion.setIdRecomendacion( recomendacionEntityToRecomendacion( FuenteRecomendacionEntity.getIdRecomendacion() ) );

        return fuenteRecomendacion;
    }

    @Override
    public FuenteRecomendacionEntity toEntity(FuenteRecomendacion FuenteRecomendacion) {
        if ( FuenteRecomendacion == null ) {
            return null;
        }

        FuenteRecomendacionEntity fuenteRecomendacionEntity = new FuenteRecomendacionEntity();

        fuenteRecomendacionEntity.setId( FuenteRecomendacion.getId() );
        fuenteRecomendacionEntity.setCantidad( FuenteRecomendacion.getCantidad() );
        fuenteRecomendacionEntity.setIdElemento( elementoToElementoEntity( FuenteRecomendacion.getIdElemento() ) );
        fuenteRecomendacionEntity.setIdFuente( fuenteToFuenteEntity( FuenteRecomendacion.getIdFuente() ) );
        fuenteRecomendacionEntity.setIdRecomendacion( recomendacionToRecomendacionEntity( FuenteRecomendacion.getIdRecomendacion() ) );

        return fuenteRecomendacionEntity;
    }

    @Override
    public List<FuenteRecomendacion> abonosOrganicosRecomendacionToDomain(List<FuenteRecomendacionEntity> abonoOrganicoEntities) {
        if ( abonoOrganicoEntities == null ) {
            return null;
        }

        List<FuenteRecomendacion> list = new ArrayList<FuenteRecomendacion>( abonoOrganicoEntities.size() );
        for ( FuenteRecomendacionEntity fuenteRecomendacionEntity : abonoOrganicoEntities ) {
            list.add( toDomain( fuenteRecomendacionEntity ) );
        }

        return list;
    }

    protected Collection<FuenteRecomendacion> fuenteRecomendacionEntityCollectionToFuenteRecomendacionCollection(Collection<FuenteRecomendacionEntity> collection) {
        if ( collection == null ) {
            return null;
        }

        Collection<FuenteRecomendacion> collection1 = new ArrayList<FuenteRecomendacion>( collection.size() );
        for ( FuenteRecomendacionEntity fuenteRecomendacionEntity : collection ) {
            collection1.add( toDomain( fuenteRecomendacionEntity ) );
        }

        return collection1;
    }

    protected Elemento elementoEntityToElemento(ElementoEntity elementoEntity) {
        if ( elementoEntity == null ) {
            return null;
        }

        Elemento elemento = new Elemento();

        elemento.setId( elementoEntity.getId() );
        elemento.setNombre( elementoEntity.getNombre() );
        elemento.setUnidad( elementoEntity.getUnidad() );
        elemento.setFuenteRecomendacionCollection( fuenteRecomendacionEntityCollectionToFuenteRecomendacionCollection( elementoEntity.getFuenteRecomendacionCollection() ) );

        return elemento;
    }

    protected Fuente fuenteEntityToFuente(FuenteEntity fuenteEntity) {
        if ( fuenteEntity == null ) {
            return null;
        }

        Fuente fuente = new Fuente();

        fuente.setId( fuenteEntity.getId() );
        fuente.setDescripcion( fuenteEntity.getDescripcion() );
        fuente.setFuenteRecomendacionCollection( fuenteRecomendacionEntityCollectionToFuenteRecomendacionCollection( fuenteEntity.getFuenteRecomendacionCollection() ) );

        return fuente;
    }

    protected AbonoQuimicoRecomendacion abonoQuimicoRecomendacionEntityToAbonoQuimicoRecomendacion(AbonoQuimicoRecomendacionEntity abonoQuimicoRecomendacionEntity) {
        if ( abonoQuimicoRecomendacionEntity == null ) {
            return null;
        }

        AbonoQuimicoRecomendacion abonoQuimicoRecomendacion = new AbonoQuimicoRecomendacion();

        abonoQuimicoRecomendacion.setDosis( abonoQuimicoRecomendacionEntity.getDosis() );
        abonoQuimicoRecomendacion.setId( abonoQuimicoRecomendacionEntity.getId() );
        abonoQuimicoRecomendacion.setElemento( elementoEntityToElemento( abonoQuimicoRecomendacionEntity.getElemento() ) );
        abonoQuimicoRecomendacion.setDisponibilidad( abonoQuimicoRecomendacionEntity.getDisponibilidad() );
        abonoQuimicoRecomendacion.setEficiencia( abonoQuimicoRecomendacionEntity.getEficiencia() );

        return abonoQuimicoRecomendacion;
    }

    protected Collection<AbonoQuimicoRecomendacion> abonoQuimicoRecomendacionEntityCollectionToAbonoQuimicoRecomendacionCollection(Collection<AbonoQuimicoRecomendacionEntity> collection) {
        if ( collection == null ) {
            return null;
        }

        Collection<AbonoQuimicoRecomendacion> collection1 = new ArrayList<AbonoQuimicoRecomendacion>( collection.size() );
        for ( AbonoQuimicoRecomendacionEntity abonoQuimicoRecomendacionEntity : collection ) {
            collection1.add( abonoQuimicoRecomendacionEntityToAbonoQuimicoRecomendacion( abonoQuimicoRecomendacionEntity ) );
        }

        return collection1;
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

    protected Recomendacion recomendacionEntityToRecomendacion(RecomendacionEntity recomendacionEntity) {
        if ( recomendacionEntity == null ) {
            return null;
        }

        Recomendacion recomendacion = new Recomendacion();

        recomendacion.setAbonoQuimicoRecomendacionEntities( abonoQuimicoRecomendacionEntityCollectionToAbonoQuimicoRecomendacionCollection( recomendacionEntity.getAbonoQuimicoRecomendacionEntities() ) );
        recomendacion.setEnmiendaRecomendacionEntityCollection( enmiendaRecomendacionEntityCollectionToEnmiendaRecomendacionCollection( recomendacionEntity.getEnmiendaRecomendacionEntityCollection() ) );
        recomendacion.setId( recomendacionEntity.getId() );
        recomendacion.setCantidadEnmienda( recomendacionEntity.getCantidadEnmienda() );
        recomendacion.setPreparacionSuelo( recomendacionEntity.getPreparacionSuelo() );
        recomendacion.setAbonoOrganicoRecomendacionCollection( abonoOrganicoRecomendacionEntityCollectionToAbonoOrganicoRecomendacionCollection( recomendacionEntity.getAbonoOrganicoRecomendacionCollection() ) );

        return recomendacion;
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

    protected FuenteEntity fuenteToFuenteEntity(Fuente fuente) {
        if ( fuente == null ) {
            return null;
        }

        FuenteEntity fuenteEntity = new FuenteEntity();

        fuenteEntity.setId( fuente.getId() );
        fuenteEntity.setDescripcion( fuente.getDescripcion() );

        return fuenteEntity;
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
        recomendacionEntity.setId( recomendacion.getId() );
        recomendacionEntity.setCantidadEnmienda( recomendacion.getCantidadEnmienda() );
        recomendacionEntity.setPreparacionSuelo( recomendacion.getPreparacionSuelo() );
        recomendacionEntity.setAbonoQuimicoRecomendacionEntities( abonoQuimicoRecomendacionCollectionToAbonoQuimicoRecomendacionEntityCollection( recomendacion.getAbonoQuimicoRecomendacionEntities() ) );
        recomendacionEntity.setAbonoOrganicoRecomendacionCollection( abonoOrganicoRecomendacionCollectionToAbonoOrganicoRecomendacionEntityCollection( recomendacion.getAbonoOrganicoRecomendacionCollection() ) );

        return recomendacionEntity;
    }
}
