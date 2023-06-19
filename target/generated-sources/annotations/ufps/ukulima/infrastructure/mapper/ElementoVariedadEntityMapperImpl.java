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
import ufps.ukulima.domain.model.ElementoVariedad.ElementoVariedad;
import ufps.ukulima.domain.model.Enmienda.Enmienda;
import ufps.ukulima.domain.model.EnmiendaRecomendacion.EnmiendaRecomendacion;
import ufps.ukulima.domain.model.Fuente.Fuente;
import ufps.ukulima.domain.model.FuenteRecomendacion.FuenteRecomendacion;
import ufps.ukulima.domain.model.Recomendacion.Recomendacion;
import ufps.ukulima.domain.model.TipoCultivo.TipoCultivo;
import ufps.ukulima.domain.model.Variedad.Variedad;
import ufps.ukulima.infrastructure.db.springdata.entity.AbonoOrganico.AbonoOrganicoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AbonoOrganicoRecomendacion.AbonoOrganicoRecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AbonoQuimicoRecomendacion.AbonoQuimicoRecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Elemento.ElementoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.ElementoVariedad.ElementoVariedadEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Enmienda.EnmiendaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.EnmiendaRecomendacion.EnmiendaRecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Fuente.FuenteEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.FuenteRecomendacion.FuenteRecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Recomendacion.RecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.TipoCultivo.TipoCultivoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Variedad.VariedadEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-19T01:41:49-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class ElementoVariedadEntityMapperImpl implements ElementoVariedadEntityMapper {

    @Override
    public ElementoVariedad toDomain(ElementoVariedadEntity elementoVariedadEntity) {
        if ( elementoVariedadEntity == null ) {
            return null;
        }

        ElementoVariedad elementoVariedad = new ElementoVariedad();

        elementoVariedad.setIdElementoVariedad( elementoVariedadEntity.getIdElementoVariedad() );
        elementoVariedad.setNombre( elementoVariedadEntity.getNombre() );
        elementoVariedad.setValorMinimo( elementoVariedadEntity.getValorMinimo() );
        elementoVariedad.setValorMaximo( elementoVariedadEntity.getValorMaximo() );
        elementoVariedad.setIdElemento( elementoEntityToElemento( elementoVariedadEntity.getIdElemento() ) );
        elementoVariedad.setIdVariedad( variedadEntityToVariedad( elementoVariedadEntity.getIdVariedad() ) );
        elementoVariedad.setValorOptimo( elementoVariedadEntity.getValorOptimo() );

        return elementoVariedad;
    }

    @Override
    public ElementoVariedadEntity toEntity(ElementoVariedad elementoVariedad) {
        if ( elementoVariedad == null ) {
            return null;
        }

        ElementoVariedadEntity elementoVariedadEntity = new ElementoVariedadEntity();

        elementoVariedadEntity.setIdElementoVariedad( elementoVariedad.getIdElementoVariedad() );
        elementoVariedadEntity.setNombre( elementoVariedad.getNombre() );
        elementoVariedadEntity.setValorMinimo( elementoVariedad.getValorMinimo() );
        elementoVariedadEntity.setValorMaximo( elementoVariedad.getValorMaximo() );
        elementoVariedadEntity.setValorOptimo( elementoVariedad.getValorOptimo() );
        elementoVariedadEntity.setIdElemento( elementoToElementoEntity( elementoVariedad.getIdElemento() ) );
        elementoVariedadEntity.setIdVariedad( variedadToVariedadEntity( elementoVariedad.getIdVariedad() ) );

        return elementoVariedadEntity;
    }

    @Override
    public List<ElementoVariedad> elementoVariedadToDomain(List<ElementoVariedadEntity> elementoVariedadEntities) {
        if ( elementoVariedadEntities == null ) {
            return null;
        }

        List<ElementoVariedad> list = new ArrayList<ElementoVariedad>( elementoVariedadEntities.size() );
        for ( ElementoVariedadEntity elementoVariedadEntity : elementoVariedadEntities ) {
            list.add( toDomain( elementoVariedadEntity ) );
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

    protected TipoCultivo tipoCultivoEntityToTipoCultivo(TipoCultivoEntity tipoCultivoEntity) {
        if ( tipoCultivoEntity == null ) {
            return null;
        }

        TipoCultivo tipoCultivo = new TipoCultivo();

        tipoCultivo.setId( tipoCultivoEntity.getId() );
        tipoCultivo.setDescripcion( tipoCultivoEntity.getDescripcion() );

        return tipoCultivo;
    }

    protected Variedad variedadEntityToVariedad(VariedadEntity variedadEntity) {
        if ( variedadEntity == null ) {
            return null;
        }

        Variedad variedad = new Variedad();

        variedad.setId( variedadEntity.getId() );
        variedad.setDescripcion( variedadEntity.getDescripcion() );
        variedad.setIdTipoCultivo( tipoCultivoEntityToTipoCultivo( variedadEntity.getIdTipoCultivo() ) );

        return variedad;
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

    protected TipoCultivoEntity tipoCultivoToTipoCultivoEntity(TipoCultivo tipoCultivo) {
        if ( tipoCultivo == null ) {
            return null;
        }

        TipoCultivoEntity tipoCultivoEntity = new TipoCultivoEntity();

        tipoCultivoEntity.setId( tipoCultivo.getId() );
        tipoCultivoEntity.setDescripcion( tipoCultivo.getDescripcion() );

        return tipoCultivoEntity;
    }

    protected VariedadEntity variedadToVariedadEntity(Variedad variedad) {
        if ( variedad == null ) {
            return null;
        }

        VariedadEntity variedadEntity = new VariedadEntity();

        variedadEntity.setId( variedad.getId() );
        variedadEntity.setDescripcion( variedad.getDescripcion() );
        variedadEntity.setIdTipoCultivo( tipoCultivoToTipoCultivoEntity( variedad.getIdTipoCultivo() ) );

        return variedadEntity;
    }
}
