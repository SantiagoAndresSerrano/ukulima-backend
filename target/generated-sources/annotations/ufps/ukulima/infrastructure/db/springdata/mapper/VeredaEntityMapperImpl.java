package ufps.ukulima.infrastructure.db.springdata.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.model.AbonoOrganico.AbonoOrganico;
import ufps.ukulima.domain.model.AbonoOrganicoRecomendacion.AbonoOrganicoRecomendacion;
import ufps.ukulima.domain.model.AnalisisElemento.AnalisisElemento;
import ufps.ukulima.domain.model.AnalisisSuelo.AnalisisSuelo;
import ufps.ukulima.domain.model.Cultivo.Cultivo;
import ufps.ukulima.domain.model.Densidad.Densidad;
import ufps.ukulima.domain.model.DistanciaSiembra.DistanciaSiembra;
import ufps.ukulima.domain.model.Elemento.Elemento;
import ufps.ukulima.domain.model.Enmienda.Enmienda;
import ufps.ukulima.domain.model.Finca.Finca;
import ufps.ukulima.domain.model.Fuente.Fuente;
import ufps.ukulima.domain.model.FuenteRecomendacion.FuenteRecomendacion;
import ufps.ukulima.domain.model.ProfundidadMuestra.ProfundidadMuestra;
import ufps.ukulima.domain.model.Recomendacion.EtapaFenologica.EtapaFenologica;
import ufps.ukulima.domain.model.Recomendacion.Recomendacion;
import ufps.ukulima.domain.model.TipoCultivo.TipoCultivo;
import ufps.ukulima.domain.model.Topografia.Topografia;
import ufps.ukulima.domain.model.Variedad.Variedad;
import ufps.ukulima.domain.model.Vereda.Vereda;
import ufps.ukulima.infrastructure.db.springdata.entity.AbonoOrganico.AbonoOrganicoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AbonoOrganicoRecomendacion.AbonoOrganicoRecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisElemento.AnalisisElementosEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisSuelo.AnalisisSueloEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Cultivo.CultivoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Densidad.DensidadEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.DistanciaSiembra.DistanciaSiembraEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Elemento.ElementoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Enmienda.EnmiendaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.EtapaFenologica.EtapaFenologicaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Finca.FincaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Fuente.FuenteEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.FuenteRecomendacion.FuenteRecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.ProfundidadMuestra.ProfundidadMuestraEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Recomendacion.RecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.TipoCultivo.TipoCultivoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Topografia.TopografiaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Variedad.VariedadEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Vereda.VeredaEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-07T13:46:31-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.16 (Oracle Corporation)"
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
        vereda.setIdCorregimiento( VeredaEntity.getIdCorregimiento() );
        vereda.setNombre( VeredaEntity.getNombre() );
        vereda.setFincaCollection( fincaEntityCollectionToFincaCollection( VeredaEntity.getFincaCollection() ) );

        return vereda;
    }

    @Override
    public VeredaEntity toEntity(Vereda Vereda) {
        if ( Vereda == null ) {
            return null;
        }

        VeredaEntity veredaEntity = new VeredaEntity();

        veredaEntity.setIdVereda( Vereda.getIdVereda() );
        veredaEntity.setIdCorregimiento( Vereda.getIdCorregimiento() );
        veredaEntity.setNombre( Vereda.getNombre() );
        veredaEntity.setFincaCollection( fincaCollectionToFincaEntityCollection( Vereda.getFincaCollection() ) );

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

    protected Finca fincaEntityToFinca(FincaEntity fincaEntity) {
        if ( fincaEntity == null ) {
            return null;
        }

        Finca finca = new Finca();

        finca.setIdFinca( fincaEntity.getIdFinca() );
        finca.setNombre( fincaEntity.getNombre() );
        finca.setAreaTotal( fincaEntity.getAreaTotal() );
        finca.setAreaEnUso( fincaEntity.getAreaEnUso() );
        finca.setGeolocalizacion( fincaEntity.getGeolocalizacion() );
        finca.setIdAgricultor( fincaEntity.getIdAgricultor() );
        finca.setIdCorregimiento( fincaEntity.getIdCorregimiento() );
        finca.setIdMunicipio( fincaEntity.getIdMunicipio() );
        finca.setIdVereda( toDomain( fincaEntity.getIdVereda() ) );

        return finca;
    }

    protected Collection<Finca> fincaEntityCollectionToFincaCollection(Collection<FincaEntity> collection) {
        if ( collection == null ) {
            return null;
        }

        Collection<Finca> collection1 = new ArrayList<Finca>( collection.size() );
        for ( FincaEntity fincaEntity : collection ) {
            collection1.add( fincaEntityToFinca( fincaEntity ) );
        }

        return collection1;
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

        enmiendaEntity.setId( enmienda.getId() );
        enmiendaEntity.setDescripcion( enmienda.getDescripcion() );
        enmiendaEntity.setRecomendacionCollection( recomendacionCollectionToRecomendacionEntityCollection( enmienda.getRecomendacionCollection() ) );

        return enmiendaEntity;
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

    protected AnalisisElementosEntity analisisElementoToAnalisisElementosEntity(AnalisisElemento analisisElemento) {
        if ( analisisElemento == null ) {
            return null;
        }

        AnalisisElementosEntity analisisElementosEntity = new AnalisisElementosEntity();

        analisisElementosEntity.setId( analisisElemento.getId() );
        analisisElementosEntity.setValor( analisisElemento.getValor() );
        analisisElementosEntity.setIdAnalisisSuelo( analisisSueloToAnalisisSueloEntity( analisisElemento.getIdAnalisisSuelo() ) );
        analisisElementosEntity.setIdElemento( elementoToElementoEntity( analisisElemento.getIdElemento() ) );

        return analisisElementosEntity;
    }

    protected Collection<AnalisisElementosEntity> analisisElementoCollectionToAnalisisElementosEntityCollection(Collection<AnalisisElemento> collection) {
        if ( collection == null ) {
            return null;
        }

        Collection<AnalisisElementosEntity> collection1 = new ArrayList<AnalisisElementosEntity>( collection.size() );
        for ( AnalisisElemento analisisElemento : collection ) {
            collection1.add( analisisElementoToAnalisisElementosEntity( analisisElemento ) );
        }

        return collection1;
    }

    protected Collection<FuenteRecomendacionEntity> fuenteRecomendacionCollectionToFuenteRecomendacionEntityCollection(Collection<FuenteRecomendacion> collection) {
        if ( collection == null ) {
            return null;
        }

        Collection<FuenteRecomendacionEntity> collection1 = new ArrayList<FuenteRecomendacionEntity>( collection.size() );
        for ( FuenteRecomendacion fuenteRecomendacion : collection ) {
            collection1.add( fuenteRecomendacionToFuenteRecomendacionEntity( fuenteRecomendacion ) );
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
        elementoEntity.setAnalisisElementoCollection( analisisElementoCollectionToAnalisisElementosEntityCollection( elemento.getAnalisisElementoCollection() ) );
        elementoEntity.setFuenteRecomendacionCollection( fuenteRecomendacionCollectionToFuenteRecomendacionEntityCollection( elemento.getFuenteRecomendacionCollection() ) );

        return elementoEntity;
    }

    protected FuenteEntity fuenteToFuenteEntity(Fuente fuente) {
        if ( fuente == null ) {
            return null;
        }

        FuenteEntity fuenteEntity = new FuenteEntity();

        fuenteEntity.setId( fuente.getId() );
        fuenteEntity.setDescripcion( fuente.getDescripcion() );
        fuenteEntity.setFuenteRecomendacionCollection( fuenteRecomendacionCollectionToFuenteRecomendacionEntityCollection( fuente.getFuenteRecomendacionCollection() ) );

        return fuenteEntity;
    }

    protected FuenteRecomendacionEntity fuenteRecomendacionToFuenteRecomendacionEntity(FuenteRecomendacion fuenteRecomendacion) {
        if ( fuenteRecomendacion == null ) {
            return null;
        }

        FuenteRecomendacionEntity fuenteRecomendacionEntity = new FuenteRecomendacionEntity();

        fuenteRecomendacionEntity.setId( fuenteRecomendacion.getId() );
        fuenteRecomendacionEntity.setCantidad( fuenteRecomendacion.getCantidad() );
        fuenteRecomendacionEntity.setIdElemento( elementoToElementoEntity( fuenteRecomendacion.getIdElemento() ) );
        fuenteRecomendacionEntity.setIdFuente( fuenteToFuenteEntity( fuenteRecomendacion.getIdFuente() ) );
        fuenteRecomendacionEntity.setIdRecomendacion( recomendacionToRecomendacionEntity( fuenteRecomendacion.getIdRecomendacion() ) );

        return fuenteRecomendacionEntity;
    }

    protected RecomendacionEntity recomendacionToRecomendacionEntity(Recomendacion recomendacion) {
        if ( recomendacion == null ) {
            return null;
        }

        RecomendacionEntity recomendacionEntity = new RecomendacionEntity();

        recomendacionEntity.setId( recomendacion.getId() );
        recomendacionEntity.setCantidadEnmienda( recomendacion.getCantidadEnmienda() );
        recomendacionEntity.setPreparacionSuelo( recomendacion.getPreparacionSuelo() );
        recomendacionEntity.setIdAnalisisSuelo( analisisSueloToAnalisisSueloEntity( recomendacion.getIdAnalisisSuelo() ) );
        recomendacionEntity.setIdEnmienda( enmiendaToEnmiendaEntity( recomendacion.getIdEnmienda() ) );
        recomendacionEntity.setAbonoOrganicoRecomendacionCollection( abonoOrganicoRecomendacionCollectionToAbonoOrganicoRecomendacionEntityCollection( recomendacion.getAbonoOrganicoRecomendacionCollection() ) );
        recomendacionEntity.setFuenteRecomendacionCollection( fuenteRecomendacionCollectionToFuenteRecomendacionEntityCollection( recomendacion.getFuenteRecomendacionCollection() ) );

        return recomendacionEntity;
    }

    protected Collection<AnalisisSueloEntity> analisisSueloCollectionToAnalisisSueloEntityCollection(Collection<AnalisisSuelo> collection) {
        if ( collection == null ) {
            return null;
        }

        Collection<AnalisisSueloEntity> collection1 = new ArrayList<AnalisisSueloEntity>( collection.size() );
        for ( AnalisisSuelo analisisSuelo : collection ) {
            collection1.add( analisisSueloToAnalisisSueloEntity( analisisSuelo ) );
        }

        return collection1;
    }

    protected DensidadEntity densidadToDensidadEntity(Densidad densidad) {
        if ( densidad == null ) {
            return null;
        }

        DensidadEntity densidadEntity = new DensidadEntity();

        densidadEntity.setIdDensidad( densidad.getIdDensidad() );
        densidadEntity.setValor( densidad.getValor() );
        densidadEntity.setAnalisisSueloCollection( analisisSueloCollectionToAnalisisSueloEntityCollection( densidad.getAnalisisSueloCollection() ) );

        return densidadEntity;
    }

    protected ProfundidadMuestraEntity profundidadMuestraToProfundidadMuestraEntity(ProfundidadMuestra profundidadMuestra) {
        if ( profundidadMuestra == null ) {
            return null;
        }

        ProfundidadMuestraEntity profundidadMuestraEntity = new ProfundidadMuestraEntity();

        profundidadMuestraEntity.setIdProfundidadMuestra( profundidadMuestra.getIdProfundidadMuestra() );
        profundidadMuestraEntity.setProfundidad( profundidadMuestra.getProfundidad() );
        profundidadMuestraEntity.setAnalisisSueloCollection( analisisSueloCollectionToAnalisisSueloEntityCollection( profundidadMuestra.getAnalisisSueloCollection() ) );

        return profundidadMuestraEntity;
    }

    protected AnalisisSueloEntity analisisSueloToAnalisisSueloEntity(AnalisisSuelo analisisSuelo) {
        if ( analisisSuelo == null ) {
            return null;
        }

        AnalisisSueloEntity analisisSueloEntity = new AnalisisSueloEntity();

        analisisSueloEntity.setIdAnalisisSuelo( analisisSuelo.getIdAnalisisSuelo() );
        analisisSueloEntity.setPorcentArena( analisisSuelo.getPorcentArena() );
        analisisSueloEntity.setPorcentLimos( analisisSuelo.getPorcentLimos() );
        analisisSueloEntity.setPorcentArcilla( analisisSuelo.getPorcentArcilla() );
        analisisSueloEntity.setFecha( analisisSuelo.getFecha() );
        analisisSueloEntity.setRecomendacionCollection( recomendacionCollectionToRecomendacionEntityCollection( analisisSuelo.getRecomendacionCollection() ) );
        analisisSueloEntity.setAnalisisElementoCollection( analisisElementoCollectionToAnalisisElementosEntityCollection( analisisSuelo.getAnalisisElementoCollection() ) );
        analisisSueloEntity.setIdClaseTextural( analisisSuelo.getIdClaseTextural() );
        analisisSueloEntity.setIdCultivo( cultivoToCultivoEntity( analisisSuelo.getIdCultivo() ) );
        analisisSueloEntity.setIdDensidad( densidadToDensidadEntity( analisisSuelo.getIdDensidad() ) );
        analisisSueloEntity.setIdProfundidad( profundidadMuestraToProfundidadMuestraEntity( analisisSuelo.getIdProfundidad() ) );

        return analisisSueloEntity;
    }

    protected Collection<CultivoEntity> cultivoCollectionToCultivoEntityCollection(Collection<Cultivo> collection) {
        if ( collection == null ) {
            return null;
        }

        Collection<CultivoEntity> collection1 = new ArrayList<CultivoEntity>( collection.size() );
        for ( Cultivo cultivo : collection ) {
            collection1.add( cultivoToCultivoEntity( cultivo ) );
        }

        return collection1;
    }

    protected DistanciaSiembraEntity distanciaSiembraToDistanciaSiembraEntity(DistanciaSiembra distanciaSiembra) {
        if ( distanciaSiembra == null ) {
            return null;
        }

        DistanciaSiembraEntity distanciaSiembraEntity = new DistanciaSiembraEntity();

        distanciaSiembraEntity.setId( distanciaSiembra.getId() );
        distanciaSiembraEntity.setDescripcion( distanciaSiembra.getDescripcion() );
        distanciaSiembraEntity.setCultivoCollection( cultivoCollectionToCultivoEntityCollection( distanciaSiembra.getCultivoCollection() ) );

        return distanciaSiembraEntity;
    }

    protected EtapaFenologicaEntity etapaFenologicaToEtapaFenologicaEntity(EtapaFenologica etapaFenologica) {
        if ( etapaFenologica == null ) {
            return null;
        }

        EtapaFenologicaEntity etapaFenologicaEntity = new EtapaFenologicaEntity();

        etapaFenologicaEntity.setId( etapaFenologica.getId() );
        etapaFenologicaEntity.setDescripcion( etapaFenologica.getDescripcion() );
        etapaFenologicaEntity.setCultivoCollection( cultivoCollectionToCultivoEntityCollection( etapaFenologica.getCultivoCollection() ) );

        return etapaFenologicaEntity;
    }

    protected TopografiaEntity topografiaToTopografiaEntity(Topografia topografia) {
        if ( topografia == null ) {
            return null;
        }

        TopografiaEntity topografiaEntity = new TopografiaEntity();

        topografiaEntity.setId( topografia.getId() );
        topografiaEntity.setDescripcion( topografia.getDescripcion() );
        topografiaEntity.setCultivoCollection( cultivoCollectionToCultivoEntityCollection( topografia.getCultivoCollection() ) );

        return topografiaEntity;
    }

    protected Collection<VariedadEntity> variedadCollectionToVariedadEntityCollection(Collection<Variedad> collection) {
        if ( collection == null ) {
            return null;
        }

        Collection<VariedadEntity> collection1 = new ArrayList<VariedadEntity>( collection.size() );
        for ( Variedad variedad : collection ) {
            collection1.add( variedadToVariedadEntity( variedad ) );
        }

        return collection1;
    }

    protected TipoCultivoEntity tipoCultivoToTipoCultivoEntity(TipoCultivo tipoCultivo) {
        if ( tipoCultivo == null ) {
            return null;
        }

        TipoCultivoEntity tipoCultivoEntity = new TipoCultivoEntity();

        tipoCultivoEntity.setId( tipoCultivo.getId() );
        tipoCultivoEntity.setDescripcion( tipoCultivo.getDescripcion() );
        tipoCultivoEntity.setVariedadCollection( variedadCollectionToVariedadEntityCollection( tipoCultivo.getVariedadCollection() ) );

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
        variedadEntity.setCultivoCollection( cultivoCollectionToCultivoEntityCollection( variedad.getCultivoCollection() ) );

        return variedadEntity;
    }

    protected CultivoEntity cultivoToCultivoEntity(Cultivo cultivo) {
        if ( cultivo == null ) {
            return null;
        }

        CultivoEntity cultivoEntity = new CultivoEntity();

        cultivoEntity.setIdCultivo( cultivo.getIdCultivo() );
        cultivoEntity.setDescripcion( cultivo.getDescripcion() );
        cultivoEntity.setPlantasPorHectarea( cultivo.getPlantasPorHectarea() );
        cultivoEntity.setAnalisisSueloCollection( analisisSueloCollectionToAnalisisSueloEntityCollection( cultivo.getAnalisisSueloCollection() ) );
        cultivoEntity.setIdDistanciaSiembra( distanciaSiembraToDistanciaSiembraEntity( cultivo.getIdDistanciaSiembra() ) );
        cultivoEntity.setIdEtapaFenologica( etapaFenologicaToEtapaFenologicaEntity( cultivo.getIdEtapaFenologica() ) );
        cultivoEntity.setIdFinca( fincaToFincaEntity( cultivo.getIdFinca() ) );
        cultivoEntity.setIdTopografia( topografiaToTopografiaEntity( cultivo.getIdTopografia() ) );
        cultivoEntity.setIdVariedad( variedadToVariedadEntity( cultivo.getIdVariedad() ) );

        return cultivoEntity;
    }

    protected FincaEntity fincaToFincaEntity(Finca finca) {
        if ( finca == null ) {
            return null;
        }

        FincaEntity fincaEntity = new FincaEntity();

        fincaEntity.setIdFinca( finca.getIdFinca() );
        fincaEntity.setNombre( finca.getNombre() );
        fincaEntity.setAreaTotal( finca.getAreaTotal() );
        fincaEntity.setAreaEnUso( finca.getAreaEnUso() );
        fincaEntity.setGeolocalizacion( finca.getGeolocalizacion() );
        fincaEntity.setIdAgricultor( finca.getIdAgricultor() );
        fincaEntity.setCultivoCollection( cultivoCollectionToCultivoEntityCollection( finca.getCultivoCollection() ) );
        fincaEntity.setIdCorregimiento( finca.getIdCorregimiento() );
        fincaEntity.setIdMunicipio( finca.getIdMunicipio() );
        fincaEntity.setIdVereda( toEntity( finca.getIdVereda() ) );

        return fincaEntity;
    }

    protected Collection<FincaEntity> fincaCollectionToFincaEntityCollection(Collection<Finca> collection) {
        if ( collection == null ) {
            return null;
        }

        Collection<FincaEntity> collection1 = new ArrayList<FincaEntity>( collection.size() );
        for ( Finca finca : collection ) {
            collection1.add( fincaToFincaEntity( finca ) );
        }

        return collection1;
    }
}
