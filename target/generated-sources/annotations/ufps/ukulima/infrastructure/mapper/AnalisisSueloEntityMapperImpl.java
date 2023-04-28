package ufps.ukulima.infrastructure.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.EtapaFenologica.EtapaFenologica;
import ufps.ukulima.domain.model.Agricultor.Agricultor;
import ufps.ukulima.domain.model.AluminioIntercambiable.AluminioIntercambiable;
import ufps.ukulima.domain.model.AnalisisElemento.AnalisisElemento;
import ufps.ukulima.domain.model.AnalisisSuelo.AnalisisSuelo;
import ufps.ukulima.domain.model.AnalisisSueloRelacionBase.AnalisisSueloRelacionBase;
import ufps.ukulima.domain.model.ClaseTextural.ClaseTextural;
import ufps.ukulima.domain.model.ConductividadElectrica.ConductividadElectrica;
import ufps.ukulima.domain.model.Corregimiento.Corregimiento;
import ufps.ukulima.domain.model.Cultivo.Cultivo;
import ufps.ukulima.domain.model.Densidad.Densidad;
import ufps.ukulima.domain.model.Departamento.Departamento;
import ufps.ukulima.domain.model.DistanciaSiembra.DistanciaSiembra;
import ufps.ukulima.domain.model.Elemento.Elemento;
import ufps.ukulima.domain.model.Enmienda.Enmienda;
import ufps.ukulima.domain.model.Finca.Finca;
import ufps.ukulima.domain.model.Fuente.Fuente;
import ufps.ukulima.domain.model.FuenteRecomendacion.FuenteRecomendacion;
import ufps.ukulima.domain.model.GrupoTextural.GrupoTextural;
import ufps.ukulima.domain.model.IntercambioCationico.IntercambioCationico;
import ufps.ukulima.domain.model.MateriaOrganica.MateriaOrganica;
import ufps.ukulima.domain.model.Municipio.Municipio;
import ufps.ukulima.domain.model.PhSuelo.PhSuelo;
import ufps.ukulima.domain.model.ProfundidadMuestra.ProfundidadMuestra;
import ufps.ukulima.domain.model.Recomendacion.Recomendacion;
import ufps.ukulima.domain.model.RelacionBase.RelacionBase;
import ufps.ukulima.domain.model.TipoCultivo.TipoCultivo;
import ufps.ukulima.domain.model.TipoIdentificacion.TipoIdentificacion;
import ufps.ukulima.domain.model.Topografia.Topografia;
import ufps.ukulima.domain.model.Variedad.Variedad;
import ufps.ukulima.domain.model.Vereda.Vereda;
import ufps.ukulima.infrastructure.db.springdata.entity.Agricultor.AgricultorEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AluminioIntercambiable.AluminioIntercambiableEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisElemento.AnalisisElementosEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisSuelo.AnalisisSueloEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisSueloRelacionBases.AnalisisSueloRelacionBaseEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.ClaseTextural.ClaseTexturalEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.ConductividadElectrica.ConductividadElectricaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Corregimiento.CorregimientoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Cultivo.CultivoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Densidad.DensidadEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Departamento.DepartamentoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.DistanciaSiembra.DistanciaSiembraEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Elemento.ElementoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Enmienda.EnmiendaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.EtapaFenologica.EtapaFenologicaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Finca.FincaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Fuente.FuenteEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.FuenteRecomendacion.FuenteRecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.GrupoTextural.GrupoTexturalEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.IntercambioCationico.IntercambioCationicoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.MateriaOrganica.MateriaOrganicaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Municipio.MunicipioEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.PhSuelo.PhSueloEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.ProfundidadMuestra.ProfundidadMuestraEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Recomendacion.RecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.RelacionBase.RelacionBaseEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.TipoCultivo.TipoCultivoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.TipoIdentificacion.TipoIdentificacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Topografia.TopografiaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Variedad.VariedadEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Vereda.VeredaEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-28T00:48:55-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class AnalisisSueloEntityMapperImpl implements AnalisisSueloEntityMapper {

    @Override
    public AnalisisSuelo toDomain(AnalisisSueloEntity AnalisisSueloEntity) {
        if ( AnalisisSueloEntity == null ) {
            return null;
        }

        AnalisisSuelo analisisSuelo = new AnalisisSuelo();

        analisisSuelo.setAnalisisSueloRelacionBaseEntities( analisisSueloRelacionBaseEntityCollectionToAnalisisSueloRelacionBaseCollection( AnalisisSueloEntity.getAnalisisSueloRelacionBaseEntities() ) );
        analisisSuelo.setPhSuelo( AnalisisSueloEntity.getPhSuelo() );
        analisisSuelo.setAluminioIntercambiable( AnalisisSueloEntity.getAluminioIntercambiable() );
        analisisSuelo.setIdPhSuelo( phSueloEntityToPhSuelo( AnalisisSueloEntity.getIdPhSuelo() ) );
        analisisSuelo.setIdAluminioIntercambiable( aluminioIntercambiableEntityToAluminioIntercambiable( AnalisisSueloEntity.getIdAluminioIntercambiable() ) );
        analisisSuelo.setIdConductividadElectrica( conductividadElectricaEntityToConductividadElectrica( AnalisisSueloEntity.getIdConductividadElectrica() ) );
        analisisSuelo.setIdMateriaOrganica( materiaOrganicaEntityToMateriaOrganica( AnalisisSueloEntity.getIdMateriaOrganica() ) );
        analisisSuelo.setIdIntercambioCationico( intercambioCationicoEntityToIntercambioCationico( AnalisisSueloEntity.getIdIntercambioCationico() ) );
        analisisSuelo.setConductividadElectrica( AnalisisSueloEntity.getConductividadElectrica() );
        analisisSuelo.setMateriaOrganica( AnalisisSueloEntity.getMateriaOrganica() );
        analisisSuelo.setIntercambioCationico( AnalisisSueloEntity.getIntercambioCationico() );
        analisisSuelo.setIdAnalisisSuelo( AnalisisSueloEntity.getIdAnalisisSuelo() );
        analisisSuelo.setPorcentArena( AnalisisSueloEntity.getPorcentArena() );
        analisisSuelo.setPorcentLimos( AnalisisSueloEntity.getPorcentLimos() );
        analisisSuelo.setPorcentArcilla( AnalisisSueloEntity.getPorcentArcilla() );
        analisisSuelo.setFecha( AnalisisSueloEntity.getFecha() );
        analisisSuelo.setAnalisisElementoCollection( analisisElementosEntityCollectionToAnalisisElementoCollection( AnalisisSueloEntity.getAnalisisElementoCollection() ) );
        analisisSuelo.setIdClaseTextural( claseTexturalEntityToClaseTextural( AnalisisSueloEntity.getIdClaseTextural() ) );
        analisisSuelo.setIdCultivo( cultivoEntityToCultivo( AnalisisSueloEntity.getIdCultivo() ) );
        analisisSuelo.setIdDensidad( densidadEntityToDensidad( AnalisisSueloEntity.getIdDensidad() ) );
        analisisSuelo.setIdProfundidad( profundidadMuestraEntityToProfundidadMuestra( AnalisisSueloEntity.getIdProfundidad() ) );
        analisisSuelo.setIdGrupoTextural( grupoTexturalEntityToGrupoTextural( AnalisisSueloEntity.getIdGrupoTextural() ) );

        return analisisSuelo;
    }

    @Override
    public AnalisisSueloEntity toEntity(AnalisisSuelo AnalisisSuelo) {
        if ( AnalisisSuelo == null ) {
            return null;
        }

        AnalisisSueloEntity analisisSueloEntity = new AnalisisSueloEntity();

        analisisSueloEntity.setPhSuelo( AnalisisSuelo.getPhSuelo() );
        analisisSueloEntity.setAluminioIntercambiable( AnalisisSuelo.getAluminioIntercambiable() );
        analisisSueloEntity.setIdGrupoTextural( grupoTexturalToGrupoTexturalEntity( AnalisisSuelo.getIdGrupoTextural() ) );
        analisisSueloEntity.setConductividadElectrica( AnalisisSuelo.getConductividadElectrica() );
        analisisSueloEntity.setAnalisisSueloRelacionBaseEntities( analisisSueloRelacionBaseCollectionToAnalisisSueloRelacionBaseEntityCollection( AnalisisSuelo.getAnalisisSueloRelacionBaseEntities() ) );
        analisisSueloEntity.setMateriaOrganica( AnalisisSuelo.getMateriaOrganica() );
        analisisSueloEntity.setIntercambioCationico( AnalisisSuelo.getIntercambioCationico() );
        analisisSueloEntity.setIdConductividadElectrica( conductividadElectricaToConductividadElectricaEntity( AnalisisSuelo.getIdConductividadElectrica() ) );
        analisisSueloEntity.setIdMateriaOrganica( materiaOrganicaToMateriaOrganicaEntity( AnalisisSuelo.getIdMateriaOrganica() ) );
        analisisSueloEntity.setIdIntercambioCationico( intercambioCationicoToIntercambioCationicoEntity( AnalisisSuelo.getIdIntercambioCationico() ) );
        analisisSueloEntity.setIdPhSuelo( phSueloToPhSueloEntity( AnalisisSuelo.getIdPhSuelo() ) );
        analisisSueloEntity.setIdAluminioIntercambiable( aluminioIntercambiableToAluminioIntercambiableEntity( AnalisisSuelo.getIdAluminioIntercambiable() ) );
        analisisSueloEntity.setIdAnalisisSuelo( AnalisisSuelo.getIdAnalisisSuelo() );
        analisisSueloEntity.setPorcentArena( AnalisisSuelo.getPorcentArena() );
        analisisSueloEntity.setPorcentLimos( AnalisisSuelo.getPorcentLimos() );
        analisisSueloEntity.setPorcentArcilla( AnalisisSuelo.getPorcentArcilla() );
        analisisSueloEntity.setFecha( AnalisisSuelo.getFecha() );
        analisisSueloEntity.setAnalisisElementoCollection( analisisElementoCollectionToAnalisisElementosEntityCollection( AnalisisSuelo.getAnalisisElementoCollection() ) );
        analisisSueloEntity.setIdClaseTextural( claseTexturalToClaseTexturalEntity( AnalisisSuelo.getIdClaseTextural() ) );
        analisisSueloEntity.setIdCultivo( cultivoToCultivoEntity( AnalisisSuelo.getIdCultivo() ) );
        analisisSueloEntity.setIdDensidad( densidadToDensidadEntity( AnalisisSuelo.getIdDensidad() ) );
        analisisSueloEntity.setIdProfundidad( profundidadMuestraToProfundidadMuestraEntity( AnalisisSuelo.getIdProfundidad() ) );

        return analisisSueloEntity;
    }

    @Override
    public List<AnalisisSuelo> toDomain(List<AnalisisSueloEntity> analisisSueloEntities) {
        if ( analisisSueloEntities == null ) {
            return null;
        }

        List<AnalisisSuelo> list = new ArrayList<AnalisisSuelo>( analisisSueloEntities.size() );
        for ( AnalisisSueloEntity analisisSueloEntity : analisisSueloEntities ) {
            list.add( toDomain( analisisSueloEntity ) );
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

    protected Collection<Recomendacion> recomendacionEntityCollectionToRecomendacionCollection(Collection<RecomendacionEntity> collection) {
        if ( collection == null ) {
            return null;
        }

        Collection<Recomendacion> collection1 = new ArrayList<Recomendacion>( collection.size() );
        for ( RecomendacionEntity recomendacionEntity : collection ) {
            collection1.add( recomendacionEntityToRecomendacion( recomendacionEntity ) );
        }

        return collection1;
    }

    protected Enmienda enmiendaEntityToEnmienda(EnmiendaEntity enmiendaEntity) {
        if ( enmiendaEntity == null ) {
            return null;
        }

        Enmienda enmienda = new Enmienda();

        enmienda.setId( enmiendaEntity.getId() );
        enmienda.setDescripcion( enmiendaEntity.getDescripcion() );
        enmienda.setRecomendacionCollection( recomendacionEntityCollectionToRecomendacionCollection( enmiendaEntity.getRecomendacionCollection() ) );

        return enmienda;
    }

    protected Recomendacion recomendacionEntityToRecomendacion(RecomendacionEntity recomendacionEntity) {
        if ( recomendacionEntity == null ) {
            return null;
        }

        Recomendacion recomendacion = new Recomendacion();

        recomendacion.setId( recomendacionEntity.getId() );
        recomendacion.setCantidadEnmienda( recomendacionEntity.getCantidadEnmienda() );
        recomendacion.setPreparacionSuelo( recomendacionEntity.getPreparacionSuelo() );
        recomendacion.setIdAnalisisSuelo( toDomain( recomendacionEntity.getIdAnalisisSuelo() ) );
        recomendacion.setIdEnmienda( enmiendaEntityToEnmienda( recomendacionEntity.getIdEnmienda() ) );
        recomendacion.setFuenteRecomendacionCollection( fuenteRecomendacionEntityCollectionToFuenteRecomendacionCollection( recomendacionEntity.getFuenteRecomendacionCollection() ) );

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

    protected RelacionBase relacionBaseEntityToRelacionBase(RelacionBaseEntity relacionBaseEntity) {
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

    protected AnalisisSueloRelacionBase analisisSueloRelacionBaseEntityToAnalisisSueloRelacionBase(AnalisisSueloRelacionBaseEntity analisisSueloRelacionBaseEntity) {
        if ( analisisSueloRelacionBaseEntity == null ) {
            return null;
        }

        AnalisisSueloRelacionBase analisisSueloRelacionBase = new AnalisisSueloRelacionBase();

        if ( analisisSueloRelacionBaseEntity.getValor() != null ) {
            analisisSueloRelacionBase.setValor( analisisSueloRelacionBaseEntity.getValor() );
        }
        analisisSueloRelacionBase.setId( analisisSueloRelacionBaseEntity.getId() );
        analisisSueloRelacionBase.setIdRelacionBase( relacionBaseEntityToRelacionBase( analisisSueloRelacionBaseEntity.getIdRelacionBase() ) );

        return analisisSueloRelacionBase;
    }

    protected Collection<AnalisisSueloRelacionBase> analisisSueloRelacionBaseEntityCollectionToAnalisisSueloRelacionBaseCollection(Collection<AnalisisSueloRelacionBaseEntity> collection) {
        if ( collection == null ) {
            return null;
        }

        Collection<AnalisisSueloRelacionBase> collection1 = new ArrayList<AnalisisSueloRelacionBase>( collection.size() );
        for ( AnalisisSueloRelacionBaseEntity analisisSueloRelacionBaseEntity : collection ) {
            collection1.add( analisisSueloRelacionBaseEntityToAnalisisSueloRelacionBase( analisisSueloRelacionBaseEntity ) );
        }

        return collection1;
    }

    protected PhSuelo phSueloEntityToPhSuelo(PhSueloEntity phSueloEntity) {
        if ( phSueloEntity == null ) {
            return null;
        }

        PhSuelo phSuelo = new PhSuelo();

        phSuelo.setId( phSueloEntity.getId() );
        phSuelo.setValorMin( phSueloEntity.getValorMin() );
        phSuelo.setValorMax( phSueloEntity.getValorMax() );
        phSuelo.setInterpretacion( phSueloEntity.getInterpretacion() );

        return phSuelo;
    }

    protected AluminioIntercambiable aluminioIntercambiableEntityToAluminioIntercambiable(AluminioIntercambiableEntity aluminioIntercambiableEntity) {
        if ( aluminioIntercambiableEntity == null ) {
            return null;
        }

        AluminioIntercambiable aluminioIntercambiable = new AluminioIntercambiable();

        aluminioIntercambiable.setId( aluminioIntercambiableEntity.getId() );
        aluminioIntercambiable.setValorMin( aluminioIntercambiableEntity.getValorMin() );
        aluminioIntercambiable.setValorMax( aluminioIntercambiableEntity.getValorMax() );
        aluminioIntercambiable.setInterpretacion( aluminioIntercambiableEntity.getInterpretacion() );

        return aluminioIntercambiable;
    }

    protected ConductividadElectrica conductividadElectricaEntityToConductividadElectrica(ConductividadElectricaEntity conductividadElectricaEntity) {
        if ( conductividadElectricaEntity == null ) {
            return null;
        }

        ConductividadElectrica conductividadElectrica = new ConductividadElectrica();

        conductividadElectrica.setId( conductividadElectricaEntity.getId() );
        conductividadElectrica.setValorMin( conductividadElectricaEntity.getValorMin() );
        conductividadElectrica.setValorMax( conductividadElectricaEntity.getValorMax() );
        conductividadElectrica.setInterpretacion( conductividadElectricaEntity.getInterpretacion() );

        return conductividadElectrica;
    }

    protected MateriaOrganica materiaOrganicaEntityToMateriaOrganica(MateriaOrganicaEntity materiaOrganicaEntity) {
        if ( materiaOrganicaEntity == null ) {
            return null;
        }

        MateriaOrganica materiaOrganica = new MateriaOrganica();

        materiaOrganica.setClima( materiaOrganicaEntity.getClima() );
        materiaOrganica.setId( materiaOrganicaEntity.getId() );
        materiaOrganica.setValorMin( materiaOrganicaEntity.getValorMin() );
        materiaOrganica.setValorMax( materiaOrganicaEntity.getValorMax() );
        materiaOrganica.setInterpretacion( materiaOrganicaEntity.getInterpretacion() );

        return materiaOrganica;
    }

    protected IntercambioCationico intercambioCationicoEntityToIntercambioCationico(IntercambioCationicoEntity intercambioCationicoEntity) {
        if ( intercambioCationicoEntity == null ) {
            return null;
        }

        IntercambioCationico intercambioCationico = new IntercambioCationico();

        intercambioCationico.setId( intercambioCationicoEntity.getId() );
        intercambioCationico.setValorMin( intercambioCationicoEntity.getValorMin() );
        intercambioCationico.setValorMax( intercambioCationicoEntity.getValorMax() );
        intercambioCationico.setInterpretacion( intercambioCationicoEntity.getInterpretacion() );

        return intercambioCationico;
    }

    protected AnalisisElemento analisisElementosEntityToAnalisisElemento(AnalisisElementosEntity analisisElementosEntity) {
        if ( analisisElementosEntity == null ) {
            return null;
        }

        AnalisisElemento analisisElemento = new AnalisisElemento();

        analisisElemento.setId( analisisElementosEntity.getId() );
        analisisElemento.setValor( analisisElementosEntity.getValor() );
        analisisElemento.setIdAnalisisElementoInterpretacion( analisisElementosEntity.getIdAnalisisElementoInterpretacion() );
        analisisElemento.setIdAnalisisSuelo( analisisElementosEntity.getIdAnalisisSuelo() );
        analisisElemento.setIdElemento( analisisElementosEntity.getIdElemento() );

        return analisisElemento;
    }

    protected Collection<AnalisisElemento> analisisElementosEntityCollectionToAnalisisElementoCollection(Collection<AnalisisElementosEntity> collection) {
        if ( collection == null ) {
            return null;
        }

        Collection<AnalisisElemento> collection1 = new ArrayList<AnalisisElemento>( collection.size() );
        for ( AnalisisElementosEntity analisisElementosEntity : collection ) {
            collection1.add( analisisElementosEntityToAnalisisElemento( analisisElementosEntity ) );
        }

        return collection1;
    }

    protected ClaseTextural claseTexturalEntityToClaseTextural(ClaseTexturalEntity claseTexturalEntity) {
        if ( claseTexturalEntity == null ) {
            return null;
        }

        ClaseTextural claseTextural = new ClaseTextural();

        claseTextural.setIdClaseTextural( claseTexturalEntity.getIdClaseTextural() );
        claseTextural.setNombre( claseTexturalEntity.getNombre() );
        claseTextural.setSigla( claseTexturalEntity.getSigla() );

        return claseTextural;
    }

    protected DistanciaSiembra distanciaSiembraEntityToDistanciaSiembra(DistanciaSiembraEntity distanciaSiembraEntity) {
        if ( distanciaSiembraEntity == null ) {
            return null;
        }

        DistanciaSiembra distanciaSiembra = new DistanciaSiembra();

        distanciaSiembra.setId( distanciaSiembraEntity.getId() );
        distanciaSiembra.setDescripcion( distanciaSiembraEntity.getDescripcion() );

        return distanciaSiembra;
    }

    protected EtapaFenologica etapaFenologicaEntityToEtapaFenologica(EtapaFenologicaEntity etapaFenologicaEntity) {
        if ( etapaFenologicaEntity == null ) {
            return null;
        }

        EtapaFenologica etapaFenologica = new EtapaFenologica();

        etapaFenologica.setId( etapaFenologicaEntity.getId() );
        etapaFenologica.setDescripcion( etapaFenologicaEntity.getDescripcion() );

        return etapaFenologica;
    }

    protected TipoIdentificacion tipoIdentificacionEntityToTipoIdentificacion(TipoIdentificacionEntity tipoIdentificacionEntity) {
        if ( tipoIdentificacionEntity == null ) {
            return null;
        }

        TipoIdentificacion tipoIdentificacion = new TipoIdentificacion();

        tipoIdentificacion.setIdTipo( tipoIdentificacionEntity.getIdTipo() );
        tipoIdentificacion.setNombre( tipoIdentificacionEntity.getNombre() );

        return tipoIdentificacion;
    }

    protected Agricultor agricultorEntityToAgricultor(AgricultorEntity agricultorEntity) {
        if ( agricultorEntity == null ) {
            return null;
        }

        Agricultor agricultor = new Agricultor();

        agricultor.setConfirmationToken( agricultorEntity.getConfirmationToken() );
        agricultor.setEstado( agricultorEntity.getEstado() );
        agricultor.setIdentificacion( agricultorEntity.getIdentificacion() );
        agricultor.setNombres( agricultorEntity.getNombres() );
        agricultor.setApellidos( agricultorEntity.getApellidos() );
        agricultor.setTelefono( agricultorEntity.getTelefono() );
        agricultor.setFechaNacimiento( agricultorEntity.getFechaNacimiento() );
        agricultor.setPassword( agricultorEntity.getPassword() );
        agricultor.setEmail( agricultorEntity.getEmail() );
        agricultor.setIdTipoIdentificacion( tipoIdentificacionEntityToTipoIdentificacion( agricultorEntity.getIdTipoIdentificacion() ) );

        return agricultor;
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

    protected Vereda veredaEntityToVereda(VeredaEntity veredaEntity) {
        if ( veredaEntity == null ) {
            return null;
        }

        Vereda vereda = new Vereda();

        vereda.setIdVereda( veredaEntity.getIdVereda() );
        vereda.setIdCorregimiento( corregimientoEntityToCorregimiento( veredaEntity.getIdCorregimiento() ) );
        vereda.setNombre( veredaEntity.getNombre() );

        return vereda;
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
        finca.setIdAgricultor( agricultorEntityToAgricultor( fincaEntity.getIdAgricultor() ) );
        finca.setIdCorregimiento( corregimientoEntityToCorregimiento( fincaEntity.getIdCorregimiento() ) );
        finca.setIdMunicipio( municipioEntityToMunicipio( fincaEntity.getIdMunicipio() ) );
        finca.setIdVereda( veredaEntityToVereda( fincaEntity.getIdVereda() ) );

        return finca;
    }

    protected Topografia topografiaEntityToTopografia(TopografiaEntity topografiaEntity) {
        if ( topografiaEntity == null ) {
            return null;
        }

        Topografia topografia = new Topografia();

        topografia.setId( topografiaEntity.getId() );
        topografia.setDescripcion( topografiaEntity.getDescripcion() );

        return topografia;
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

    protected Cultivo cultivoEntityToCultivo(CultivoEntity cultivoEntity) {
        if ( cultivoEntity == null ) {
            return null;
        }

        Cultivo cultivo = new Cultivo();

        cultivo.setIdCultivo( cultivoEntity.getIdCultivo() );
        cultivo.setDescripcion( cultivoEntity.getDescripcion() );
        cultivo.setPlantasPorHectarea( cultivoEntity.getPlantasPorHectarea() );
        cultivo.setIdDistanciaSiembra( distanciaSiembraEntityToDistanciaSiembra( cultivoEntity.getIdDistanciaSiembra() ) );
        cultivo.setIdEtapaFenologica( etapaFenologicaEntityToEtapaFenologica( cultivoEntity.getIdEtapaFenologica() ) );
        cultivo.setIdFinca( fincaEntityToFinca( cultivoEntity.getIdFinca() ) );
        cultivo.setIdTopografia( topografiaEntityToTopografia( cultivoEntity.getIdTopografia() ) );
        cultivo.setIdVariedad( variedadEntityToVariedad( cultivoEntity.getIdVariedad() ) );

        return cultivo;
    }

    protected Densidad densidadEntityToDensidad(DensidadEntity densidadEntity) {
        if ( densidadEntity == null ) {
            return null;
        }

        Densidad densidad = new Densidad();

        densidad.setIdDensidad( densidadEntity.getIdDensidad() );
        densidad.setValor( densidadEntity.getValor() );

        return densidad;
    }

    protected ProfundidadMuestra profundidadMuestraEntityToProfundidadMuestra(ProfundidadMuestraEntity profundidadMuestraEntity) {
        if ( profundidadMuestraEntity == null ) {
            return null;
        }

        ProfundidadMuestra profundidadMuestra = new ProfundidadMuestra();

        profundidadMuestra.setIdProfundidadMuestra( profundidadMuestraEntity.getIdProfundidadMuestra() );
        profundidadMuestra.setProfundidad( profundidadMuestraEntity.getProfundidad() );

        return profundidadMuestra;
    }

    protected GrupoTextural grupoTexturalEntityToGrupoTextural(GrupoTexturalEntity grupoTexturalEntity) {
        if ( grupoTexturalEntity == null ) {
            return null;
        }

        GrupoTextural grupoTextural = new GrupoTextural();

        if ( grupoTexturalEntity.getId() != null ) {
            grupoTextural.setId( grupoTexturalEntity.getId() );
        }
        grupoTextural.setNombre( grupoTexturalEntity.getNombre() );

        return grupoTextural;
    }

    protected GrupoTexturalEntity grupoTexturalToGrupoTexturalEntity(GrupoTextural grupoTextural) {
        if ( grupoTextural == null ) {
            return null;
        }

        GrupoTexturalEntity grupoTexturalEntity = new GrupoTexturalEntity();

        grupoTexturalEntity.setId( grupoTextural.getId() );
        grupoTexturalEntity.setNombre( grupoTextural.getNombre() );

        return grupoTexturalEntity;
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

    protected RelacionBaseEntity relacionBaseToRelacionBaseEntity(RelacionBase relacionBase) {
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

    protected AnalisisSueloRelacionBaseEntity analisisSueloRelacionBaseToAnalisisSueloRelacionBaseEntity(AnalisisSueloRelacionBase analisisSueloRelacionBase) {
        if ( analisisSueloRelacionBase == null ) {
            return null;
        }

        AnalisisSueloRelacionBaseEntity analisisSueloRelacionBaseEntity = new AnalisisSueloRelacionBaseEntity();

        analisisSueloRelacionBaseEntity.setId( analisisSueloRelacionBase.getId() );
        analisisSueloRelacionBaseEntity.setIdRelacionBase( relacionBaseToRelacionBaseEntity( analisisSueloRelacionBase.getIdRelacionBase() ) );
        analisisSueloRelacionBaseEntity.setIdAnalisisSuelo( toEntity( analisisSueloRelacionBase.getIdAnalisisSuelo() ) );
        analisisSueloRelacionBaseEntity.setValor( analisisSueloRelacionBase.getValor() );

        return analisisSueloRelacionBaseEntity;
    }

    protected Collection<AnalisisSueloRelacionBaseEntity> analisisSueloRelacionBaseCollectionToAnalisisSueloRelacionBaseEntityCollection(Collection<AnalisisSueloRelacionBase> collection) {
        if ( collection == null ) {
            return null;
        }

        Collection<AnalisisSueloRelacionBaseEntity> collection1 = new ArrayList<AnalisisSueloRelacionBaseEntity>( collection.size() );
        for ( AnalisisSueloRelacionBase analisisSueloRelacionBase : collection ) {
            collection1.add( analisisSueloRelacionBaseToAnalisisSueloRelacionBaseEntity( analisisSueloRelacionBase ) );
        }

        return collection1;
    }

    protected ConductividadElectricaEntity conductividadElectricaToConductividadElectricaEntity(ConductividadElectrica conductividadElectrica) {
        if ( conductividadElectrica == null ) {
            return null;
        }

        ConductividadElectricaEntity conductividadElectricaEntity = new ConductividadElectricaEntity();

        conductividadElectricaEntity.setId( conductividadElectrica.getId() );
        conductividadElectricaEntity.setValorMin( conductividadElectrica.getValorMin() );
        conductividadElectricaEntity.setValorMax( conductividadElectrica.getValorMax() );
        conductividadElectricaEntity.setInterpretacion( conductividadElectrica.getInterpretacion() );

        return conductividadElectricaEntity;
    }

    protected MateriaOrganicaEntity materiaOrganicaToMateriaOrganicaEntity(MateriaOrganica materiaOrganica) {
        if ( materiaOrganica == null ) {
            return null;
        }

        MateriaOrganicaEntity materiaOrganicaEntity = new MateriaOrganicaEntity();

        materiaOrganicaEntity.setClima( materiaOrganica.getClima() );
        materiaOrganicaEntity.setInterpretacion( materiaOrganica.getInterpretacion() );
        materiaOrganicaEntity.setId( materiaOrganica.getId() );
        materiaOrganicaEntity.setValorMin( materiaOrganica.getValorMin() );
        materiaOrganicaEntity.setValorMax( materiaOrganica.getValorMax() );

        return materiaOrganicaEntity;
    }

    protected IntercambioCationicoEntity intercambioCationicoToIntercambioCationicoEntity(IntercambioCationico intercambioCationico) {
        if ( intercambioCationico == null ) {
            return null;
        }

        IntercambioCationicoEntity intercambioCationicoEntity = new IntercambioCationicoEntity();

        intercambioCationicoEntity.setInterpretacion( intercambioCationico.getInterpretacion() );
        intercambioCationicoEntity.setId( intercambioCationico.getId() );
        intercambioCationicoEntity.setValorMin( intercambioCationico.getValorMin() );
        intercambioCationicoEntity.setValorMax( intercambioCationico.getValorMax() );

        return intercambioCationicoEntity;
    }

    protected PhSueloEntity phSueloToPhSueloEntity(PhSuelo phSuelo) {
        if ( phSuelo == null ) {
            return null;
        }

        PhSueloEntity phSueloEntity = new PhSueloEntity();

        phSueloEntity.setInterpretacion( phSuelo.getInterpretacion() );
        phSueloEntity.setId( phSuelo.getId() );
        phSueloEntity.setValorMin( phSuelo.getValorMin() );
        phSueloEntity.setValorMax( phSuelo.getValorMax() );

        return phSueloEntity;
    }

    protected AluminioIntercambiableEntity aluminioIntercambiableToAluminioIntercambiableEntity(AluminioIntercambiable aluminioIntercambiable) {
        if ( aluminioIntercambiable == null ) {
            return null;
        }

        AluminioIntercambiableEntity aluminioIntercambiableEntity = new AluminioIntercambiableEntity();

        aluminioIntercambiableEntity.setId( aluminioIntercambiable.getId() );
        aluminioIntercambiableEntity.setValorMin( aluminioIntercambiable.getValorMin() );
        aluminioIntercambiableEntity.setValorMax( aluminioIntercambiable.getValorMax() );
        aluminioIntercambiableEntity.setInterpretacion( aluminioIntercambiable.getInterpretacion() );

        return aluminioIntercambiableEntity;
    }

    protected AnalisisElementosEntity analisisElementoToAnalisisElementosEntity(AnalisisElemento analisisElemento) {
        if ( analisisElemento == null ) {
            return null;
        }

        AnalisisElementosEntity analisisElementosEntity = new AnalisisElementosEntity();

        analisisElementosEntity.setId( analisisElemento.getId() );
        analisisElementosEntity.setValor( analisisElemento.getValor() );
        analisisElementosEntity.setIdAnalisisElementoInterpretacion( analisisElemento.getIdAnalisisElementoInterpretacion() );
        analisisElementosEntity.setIdAnalisisSuelo( analisisElemento.getIdAnalisisSuelo() );
        analisisElementosEntity.setIdElemento( analisisElemento.getIdElemento() );

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

    protected ClaseTexturalEntity claseTexturalToClaseTexturalEntity(ClaseTextural claseTextural) {
        if ( claseTextural == null ) {
            return null;
        }

        ClaseTexturalEntity claseTexturalEntity = new ClaseTexturalEntity();

        claseTexturalEntity.setIdClaseTextural( claseTextural.getIdClaseTextural() );
        claseTexturalEntity.setNombre( claseTextural.getNombre() );
        claseTexturalEntity.setSigla( claseTextural.getSigla() );

        return claseTexturalEntity;
    }

    protected DistanciaSiembraEntity distanciaSiembraToDistanciaSiembraEntity(DistanciaSiembra distanciaSiembra) {
        if ( distanciaSiembra == null ) {
            return null;
        }

        DistanciaSiembraEntity distanciaSiembraEntity = new DistanciaSiembraEntity();

        distanciaSiembraEntity.setId( distanciaSiembra.getId() );
        distanciaSiembraEntity.setDescripcion( distanciaSiembra.getDescripcion() );

        return distanciaSiembraEntity;
    }

    protected EtapaFenologicaEntity etapaFenologicaToEtapaFenologicaEntity(EtapaFenologica etapaFenologica) {
        if ( etapaFenologica == null ) {
            return null;
        }

        EtapaFenologicaEntity etapaFenologicaEntity = new EtapaFenologicaEntity();

        etapaFenologicaEntity.setId( etapaFenologica.getId() );
        etapaFenologicaEntity.setDescripcion( etapaFenologica.getDescripcion() );

        return etapaFenologicaEntity;
    }

    protected TipoIdentificacionEntity tipoIdentificacionToTipoIdentificacionEntity(TipoIdentificacion tipoIdentificacion) {
        if ( tipoIdentificacion == null ) {
            return null;
        }

        TipoIdentificacionEntity tipoIdentificacionEntity = new TipoIdentificacionEntity();

        tipoIdentificacionEntity.setIdTipo( tipoIdentificacion.getIdTipo() );
        tipoIdentificacionEntity.setNombre( tipoIdentificacion.getNombre() );

        return tipoIdentificacionEntity;
    }

    protected AgricultorEntity agricultorToAgricultorEntity(Agricultor agricultor) {
        if ( agricultor == null ) {
            return null;
        }

        AgricultorEntity agricultorEntity = new AgricultorEntity();

        agricultorEntity.setEstado( agricultor.getEstado() );
        agricultorEntity.setConfirmationToken( agricultor.getConfirmationToken() );
        agricultorEntity.setIdentificacion( agricultor.getIdentificacion() );
        agricultorEntity.setNombres( agricultor.getNombres() );
        agricultorEntity.setApellidos( agricultor.getApellidos() );
        agricultorEntity.setTelefono( agricultor.getTelefono() );
        agricultorEntity.setFechaNacimiento( agricultor.getFechaNacimiento() );
        agricultorEntity.setPassword( agricultor.getPassword() );
        agricultorEntity.setEmail( agricultor.getEmail() );
        agricultorEntity.setIdTipoIdentificacion( tipoIdentificacionToTipoIdentificacionEntity( agricultor.getIdTipoIdentificacion() ) );

        return agricultorEntity;
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

    protected VeredaEntity veredaToVeredaEntity(Vereda vereda) {
        if ( vereda == null ) {
            return null;
        }

        VeredaEntity veredaEntity = new VeredaEntity();

        veredaEntity.setIdVereda( vereda.getIdVereda() );
        veredaEntity.setIdCorregimiento( corregimientoToCorregimientoEntity( vereda.getIdCorregimiento() ) );
        veredaEntity.setNombre( vereda.getNombre() );

        return veredaEntity;
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
        fincaEntity.setIdAgricultor( agricultorToAgricultorEntity( finca.getIdAgricultor() ) );
        fincaEntity.setIdCorregimiento( corregimientoToCorregimientoEntity( finca.getIdCorregimiento() ) );
        fincaEntity.setIdMunicipio( municipioToMunicipioEntity( finca.getIdMunicipio() ) );
        fincaEntity.setIdVereda( veredaToVeredaEntity( finca.getIdVereda() ) );

        return fincaEntity;
    }

    protected TopografiaEntity topografiaToTopografiaEntity(Topografia topografia) {
        if ( topografia == null ) {
            return null;
        }

        TopografiaEntity topografiaEntity = new TopografiaEntity();

        topografiaEntity.setId( topografia.getId() );
        topografiaEntity.setDescripcion( topografia.getDescripcion() );

        return topografiaEntity;
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

    protected CultivoEntity cultivoToCultivoEntity(Cultivo cultivo) {
        if ( cultivo == null ) {
            return null;
        }

        CultivoEntity cultivoEntity = new CultivoEntity();

        cultivoEntity.setIdCultivo( cultivo.getIdCultivo() );
        cultivoEntity.setDescripcion( cultivo.getDescripcion() );
        cultivoEntity.setPlantasPorHectarea( cultivo.getPlantasPorHectarea() );
        cultivoEntity.setIdDistanciaSiembra( distanciaSiembraToDistanciaSiembraEntity( cultivo.getIdDistanciaSiembra() ) );
        cultivoEntity.setIdEtapaFenologica( etapaFenologicaToEtapaFenologicaEntity( cultivo.getIdEtapaFenologica() ) );
        cultivoEntity.setIdFinca( fincaToFincaEntity( cultivo.getIdFinca() ) );
        cultivoEntity.setIdTopografia( topografiaToTopografiaEntity( cultivo.getIdTopografia() ) );
        cultivoEntity.setIdVariedad( variedadToVariedadEntity( cultivo.getIdVariedad() ) );

        return cultivoEntity;
    }

    protected DensidadEntity densidadToDensidadEntity(Densidad densidad) {
        if ( densidad == null ) {
            return null;
        }

        DensidadEntity densidadEntity = new DensidadEntity();

        densidadEntity.setIdDensidad( densidad.getIdDensidad() );
        densidadEntity.setValor( densidad.getValor() );

        return densidadEntity;
    }

    protected ProfundidadMuestraEntity profundidadMuestraToProfundidadMuestraEntity(ProfundidadMuestra profundidadMuestra) {
        if ( profundidadMuestra == null ) {
            return null;
        }

        ProfundidadMuestraEntity profundidadMuestraEntity = new ProfundidadMuestraEntity();

        profundidadMuestraEntity.setIdProfundidadMuestra( profundidadMuestra.getIdProfundidadMuestra() );
        profundidadMuestraEntity.setProfundidad( profundidadMuestra.getProfundidad() );

        return profundidadMuestraEntity;
    }
}
