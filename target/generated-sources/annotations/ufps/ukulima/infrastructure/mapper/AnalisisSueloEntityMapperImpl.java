package ufps.ukulima.infrastructure.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.model.AbonoOrganico.AbonoOrganico;
import ufps.ukulima.domain.model.AbonoOrganicoRecomendacion.AbonoOrganicoRecomendacion;
import ufps.ukulima.domain.model.AbonoQuimicoRecomendacion.AbonoQuimicoRecomendacion;
import ufps.ukulima.domain.model.Agricultor.Agricultor;
import ufps.ukulima.domain.model.AluminioIntercambiable.AluminioIntercambiable;
import ufps.ukulima.domain.model.AnalisisElemento.AnalisisElemento;
import ufps.ukulima.domain.model.AnalisisElementoInterpretacion.AnalisisElementoInterpretacion;
import ufps.ukulima.domain.model.AnalisisSuelo.AnalisisSuelo;
import ufps.ukulima.domain.model.AnalisisSueloRelacionBase.AnalisisSueloRelacionBase;
import ufps.ukulima.domain.model.ClaseTextural.ClaseTextural;
import ufps.ukulima.domain.model.ConductividadElectrica.ConductividadElectrica;
import ufps.ukulima.domain.model.Corregimiento.Corregimiento;
import ufps.ukulima.domain.model.Densidad.Densidad;
import ufps.ukulima.domain.model.Departamento.Departamento;
import ufps.ukulima.domain.model.Elemento.Elemento;
import ufps.ukulima.domain.model.Enmienda.Enmienda;
import ufps.ukulima.domain.model.EnmiendaRecomendacion.EnmiendaRecomendacion;
import ufps.ukulima.domain.model.Finca.Finca;
import ufps.ukulima.domain.model.Fuente.Fuente;
import ufps.ukulima.domain.model.FuenteRecomendacion.FuenteRecomendacion;
import ufps.ukulima.domain.model.GrupoTextural.GrupoTextural;
import ufps.ukulima.domain.model.IntercambioCationico.IntercambioCationico;
import ufps.ukulima.domain.model.Lote.Lote;
import ufps.ukulima.domain.model.MateriaOrganica.MateriaOrganica;
import ufps.ukulima.domain.model.Municipio.Municipio;
import ufps.ukulima.domain.model.PhSuelo.PhSuelo;
import ufps.ukulima.domain.model.ProfundidadMuestra.ProfundidadMuestra;
import ufps.ukulima.domain.model.Recomendacion.Recomendacion;
import ufps.ukulima.domain.model.RelacionBase.RelacionBase;
import ufps.ukulima.domain.model.Suelo.Suelo;
import ufps.ukulima.domain.model.TipoIdentificacion.TipoIdentificacion;
import ufps.ukulima.domain.model.Vereda.Vereda;
import ufps.ukulima.infrastructure.db.springdata.entity.AbonoOrganico.AbonoOrganicoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AbonoOrganicoRecomendacion.AbonoOrganicoRecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AbonoQuimicoRecomendacion.AbonoQuimicoRecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Agricultor.AgricultorEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AluminioIntercambiable.AluminioIntercambiableEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisElemento.AnalisisElementosEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisElementoInterpretacion.AnalisisElementoInterpretacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisSuelo.AnalisisSueloEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisSueloRelacionBases.AnalisisSueloRelacionBaseEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.ClaseTextural.ClaseTexturalEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.ConductividadElectrica.ConductividadElectricaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Corregimiento.CorregimientoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Densidad.DensidadEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Departamento.DepartamentoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Elemento.ElementoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Enmienda.EnmiendaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.EnmiendaRecomendacion.EnmiendaRecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Finca.FincaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Fuente.FuenteEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.FuenteRecomendacion.FuenteRecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.GrupoTextural.GrupoTexturalEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.IntercambioCationico.IntercambioCationicoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Lote.LoteEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.MateriaOrganica.MateriaOrganicaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Municipio.MunicipioEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.PhSuelo.PhSueloEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.ProfundidadMuestra.ProfundidadMuestraEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Recomendacion.RecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.RelacionBase.RelacionBaseEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Suelo.SueloEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.TipoIdentificacion.TipoIdentificacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Vereda.VeredaEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-19T01:41:48-0500",
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

        analisisSuelo.setIdSuelo( sueloEntityToSuelo( AnalisisSueloEntity.getIdSuelo() ) );
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
        analisisSuelo.setRecomendacionCollection( recomendacionEntityCollectionToRecomendacionCollection( AnalisisSueloEntity.getRecomendacionCollection() ) );
        analisisSuelo.setAnalisisElementoCollection( analisisElementosEntityCollectionToAnalisisElementoCollection( AnalisisSueloEntity.getAnalisisElementoCollection() ) );
        analisisSuelo.setIdClaseTextural( claseTexturalEntityToClaseTextural( AnalisisSueloEntity.getIdClaseTextural() ) );
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

        analisisSueloEntity.setIdSuelo( sueloToSueloEntity( AnalisisSuelo.getIdSuelo() ) );
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
        analisisSueloEntity.setRecomendacionCollection( recomendacionCollectionToRecomendacionEntityCollection( AnalisisSuelo.getRecomendacionCollection() ) );
        analisisSueloEntity.setAnalisisElementoCollection( analisisElementoCollectionToAnalisisElementosEntityCollection( AnalisisSuelo.getAnalisisElementoCollection() ) );
        analisisSueloEntity.setIdClaseTextural( claseTexturalToClaseTexturalEntity( AnalisisSuelo.getIdClaseTextural() ) );
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

        finca.setPrecipitacion( fincaEntity.getPrecipitacion() );
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

    protected Lote loteEntityToLote(LoteEntity loteEntity) {
        if ( loteEntity == null ) {
            return null;
        }

        Lote lote = new Lote();

        lote.setDescripcion( loteEntity.getDescripcion() );
        lote.setId( loteEntity.getId() );
        lote.setIdFinca( fincaEntityToFinca( loteEntity.getIdFinca() ) );

        return lote;
    }

    protected Suelo sueloEntityToSuelo(SueloEntity sueloEntity) {
        if ( sueloEntity == null ) {
            return null;
        }

        Suelo suelo = new Suelo();

        suelo.setDescripcion( sueloEntity.getDescripcion() );
        suelo.setId( sueloEntity.getId() );
        suelo.setIdLote( loteEntityToLote( sueloEntity.getIdLote() ) );

        return suelo;
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

    protected AnalisisElementoInterpretacion analisisElementoInterpretacionEntityToAnalisisElementoInterpretacion(AnalisisElementoInterpretacionEntity analisisElementoInterpretacionEntity) {
        if ( analisisElementoInterpretacionEntity == null ) {
            return null;
        }

        Elemento idElemento = null;
        Integer id = null;
        Integer valorMin = null;
        Integer valorMax = null;
        String interpretacion = null;

        idElemento = elementoEntityToElemento( analisisElementoInterpretacionEntity.getIdElemento() );
        id = analisisElementoInterpretacionEntity.getId();
        valorMin = analisisElementoInterpretacionEntity.getValorMin();
        valorMax = analisisElementoInterpretacionEntity.getValorMax();
        interpretacion = analisisElementoInterpretacionEntity.getInterpretacion();

        AnalisisElementoInterpretacion analisisElementoInterpretacion = new AnalisisElementoInterpretacion( id, valorMin, valorMax, interpretacion, idElemento );

        return analisisElementoInterpretacion;
    }

    protected AnalisisElemento analisisElementosEntityToAnalisisElemento(AnalisisElementosEntity analisisElementosEntity) {
        if ( analisisElementosEntity == null ) {
            return null;
        }

        AnalisisElemento analisisElemento = new AnalisisElemento();

        analisisElemento.setIdAnalisisElementoInterpretacion( analisisElementoInterpretacionEntityToAnalisisElementoInterpretacion( analisisElementosEntity.getIdAnalisisElementoInterpretacion() ) );
        analisisElemento.setId( analisisElementosEntity.getId() );
        analisisElemento.setValor( analisisElementosEntity.getValor() );
        analisisElemento.setIdElemento( elementoEntityToElemento( analisisElementosEntity.getIdElemento() ) );

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

        fincaEntity.setPrecipitacion( finca.getPrecipitacion() );
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

    protected LoteEntity loteToLoteEntity(Lote lote) {
        if ( lote == null ) {
            return null;
        }

        LoteEntity loteEntity = new LoteEntity();

        loteEntity.setDescripcion( lote.getDescripcion() );
        loteEntity.setId( lote.getId() );
        loteEntity.setIdFinca( fincaToFincaEntity( lote.getIdFinca() ) );

        return loteEntity;
    }

    protected SueloEntity sueloToSueloEntity(Suelo suelo) {
        if ( suelo == null ) {
            return null;
        }

        SueloEntity sueloEntity = new SueloEntity();

        sueloEntity.setDescripcion( suelo.getDescripcion() );
        sueloEntity.setId( suelo.getId() );
        sueloEntity.setIdLote( loteToLoteEntity( suelo.getIdLote() ) );

        return sueloEntity;
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
        recomendacionEntity.setLabranza( recomendacion.getLabranza() );
        recomendacionEntity.setId( recomendacion.getId() );
        recomendacionEntity.setCantidadEnmienda( recomendacion.getCantidadEnmienda() );
        recomendacionEntity.setPreparacionSuelo( recomendacion.getPreparacionSuelo() );
        recomendacionEntity.setAbonoQuimicoRecomendacionEntities( abonoQuimicoRecomendacionCollectionToAbonoQuimicoRecomendacionEntityCollection( recomendacion.getAbonoQuimicoRecomendacionEntities() ) );
        recomendacionEntity.setAbonoOrganicoRecomendacionCollection( abonoOrganicoRecomendacionCollectionToAbonoOrganicoRecomendacionEntityCollection( recomendacion.getAbonoOrganicoRecomendacionCollection() ) );

        return recomendacionEntity;
    }

    protected AnalisisElementoInterpretacionEntity analisisElementoInterpretacionToAnalisisElementoInterpretacionEntity(AnalisisElementoInterpretacion analisisElementoInterpretacion) {
        if ( analisisElementoInterpretacion == null ) {
            return null;
        }

        AnalisisElementoInterpretacionEntity analisisElementoInterpretacionEntity = new AnalisisElementoInterpretacionEntity();

        analisisElementoInterpretacionEntity.setId( analisisElementoInterpretacion.getId() );
        analisisElementoInterpretacionEntity.setValorMin( analisisElementoInterpretacion.getValorMin() );
        analisisElementoInterpretacionEntity.setValorMax( analisisElementoInterpretacion.getValorMax() );
        analisisElementoInterpretacionEntity.setInterpretacion( analisisElementoInterpretacion.getInterpretacion() );
        analisisElementoInterpretacionEntity.setIdElemento( elementoToElementoEntity( analisisElementoInterpretacion.getIdElemento() ) );

        return analisisElementoInterpretacionEntity;
    }

    protected AnalisisElementosEntity analisisElementoToAnalisisElementosEntity(AnalisisElemento analisisElemento) {
        if ( analisisElemento == null ) {
            return null;
        }

        AnalisisElementosEntity analisisElementosEntity = new AnalisisElementosEntity();

        analisisElementosEntity.setId( analisisElemento.getId() );
        analisisElementosEntity.setValor( analisisElemento.getValor() );
        analisisElementosEntity.setIdAnalisisElementoInterpretacion( analisisElementoInterpretacionToAnalisisElementoInterpretacionEntity( analisisElemento.getIdAnalisisElementoInterpretacion() ) );
        analisisElementosEntity.setIdAnalisisSuelo( toEntity( analisisElemento.getIdAnalisisSuelo() ) );
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
