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
import ufps.ukulima.domain.model.RelacionBase.RelacionBase;
import ufps.ukulima.infrastructure.db.springdata.entity.AbonoOrganico.AbonoOrganicoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AbonoOrganicoRecomendacion.AbonoOrganicoRecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AbonoQuimicoRecomendacion.AbonoQuimicoRecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Elemento.ElementoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Enmienda.EnmiendaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.EnmiendaRecomendacion.EnmiendaRecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Fuente.FuenteEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.FuenteRecomendacion.FuenteRecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Recomendacion.RecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.RelacionBase.RelacionBaseEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-05T23:58:32-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.11 (Amazon.com Inc.)"
)
@Component
public class RelacionBaseEntityMapperImpl implements RelacionBaseEntityMapper {

    @Override
    public RelacionBase toDomain(RelacionBaseEntity relacionBaseEntity) {
        if ( relacionBaseEntity == null ) {
            return null;
        }

        RelacionBase relacionBase = new RelacionBase();

        relacionBase.setId( relacionBaseEntity.getId() );
        relacionBase.setIdElemento1( elementoEntityToElemento( relacionBaseEntity.getIdElemento1() ) );
        relacionBase.setIdElemento2( elementoEntityToElemento( relacionBaseEntity.getIdElemento2() ) );
        relacionBase.setIdElemento3( elementoEntityToElemento( relacionBaseEntity.getIdElemento3() ) );
        relacionBase.setValorMin( relacionBaseEntity.getValorMin() );
        relacionBase.setValorMax( relacionBaseEntity.getValorMax() );
        relacionBase.setInterpretacion( relacionBaseEntity.getInterpretacion() );
        relacionBase.setFormula( relacionBaseEntity.getFormula() );

        return relacionBase;
    }

    @Override
    public RelacionBaseEntity toEntity(RelacionBase relacionBase) {
        if ( relacionBase == null ) {
            return null;
        }

        RelacionBaseEntity relacionBaseEntity = new RelacionBaseEntity();

        relacionBaseEntity.setId( relacionBase.getId() );
        relacionBaseEntity.setIdElemento1( elementoToElementoEntity( relacionBase.getIdElemento1() ) );
        relacionBaseEntity.setIdElemento2( elementoToElementoEntity( relacionBase.getIdElemento2() ) );
        relacionBaseEntity.setIdElemento3( elementoToElementoEntity( relacionBase.getIdElemento3() ) );
        relacionBaseEntity.setValorMin( relacionBase.getValorMin() );
        relacionBaseEntity.setValorMax( relacionBase.getValorMax() );
        relacionBaseEntity.setInterpretacion( relacionBase.getInterpretacion() );
        relacionBaseEntity.setFormula( relacionBase.getFormula() );

        return relacionBaseEntity;
    }

    @Override
    public List<RelacionBase> toDomain(List<RelacionBaseEntity> relacionBaseEntities) {
        if ( relacionBaseEntities == null ) {
            return null;
        }

        List<RelacionBase> list = new ArrayList<RelacionBase>( relacionBaseEntities.size() );
        for ( RelacionBaseEntity relacionBaseEntity : relacionBaseEntities ) {
            list.add( toDomain( relacionBaseEntity ) );
        }

        return list;
    }

    protected Collection<FuenteRecomendacion> fuenteRecomendacionEntityCollectionToFuenteRecomendacionCollection(Collection<FuenteRecomendacionEntity> collection) {
        if ( collection == null ) {
            return null;
        }

        Collection<FuenteRecomendacion> collection1 = new ArrayList<FuenteRecomendacion>( collection.size() );
        for ( FuenteRecomendacionEntity fuenteRecomendacionEntity : collection ) {
            collection1.add( fuenteRecomendacionEntityToFuenteRecomendacion( fuenteRecomendacionEntity ) );
        }

        return collection1;
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

        recomendacion.setMateriaOrganica( recomendacionEntity.getMateriaOrganica() );
        recomendacion.setAbonoQuimicoRecomendacionEntities( abonoQuimicoRecomendacionEntityCollectionToAbonoQuimicoRecomendacionCollection( recomendacionEntity.getAbonoQuimicoRecomendacionEntities() ) );
        recomendacion.setLabranza( recomendacionEntity.getLabranza() );
        recomendacion.setEnmiendaRecomendacionEntityCollection( enmiendaRecomendacionEntityCollectionToEnmiendaRecomendacionCollection( recomendacionEntity.getEnmiendaRecomendacionEntityCollection() ) );
        recomendacion.setId( recomendacionEntity.getId() );
        recomendacion.setCantidadEnmienda( recomendacionEntity.getCantidadEnmienda() );
        recomendacion.setPreparacionSuelo( recomendacionEntity.getPreparacionSuelo() );
        recomendacion.setAbonoOrganicoRecomendacionCollection( abonoOrganicoRecomendacionEntityCollectionToAbonoOrganicoRecomendacionCollection( recomendacionEntity.getAbonoOrganicoRecomendacionCollection() ) );

        return recomendacion;
    }

    protected FuenteRecomendacion fuenteRecomendacionEntityToFuenteRecomendacion(FuenteRecomendacionEntity fuenteRecomendacionEntity) {
        if ( fuenteRecomendacionEntity == null ) {
            return null;
        }

        FuenteRecomendacion fuenteRecomendacion = new FuenteRecomendacion();

        fuenteRecomendacion.setId( fuenteRecomendacionEntity.getId() );
        fuenteRecomendacion.setCantidad( fuenteRecomendacionEntity.getCantidad() );
        fuenteRecomendacion.setIdElemento( elementoEntityToElemento( fuenteRecomendacionEntity.getIdElemento() ) );
        fuenteRecomendacion.setIdFuente( fuenteEntityToFuente( fuenteRecomendacionEntity.getIdFuente() ) );
        fuenteRecomendacion.setIdRecomendacion( recomendacionEntityToRecomendacion( fuenteRecomendacionEntity.getIdRecomendacion() ) );

        return fuenteRecomendacion;
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
}
