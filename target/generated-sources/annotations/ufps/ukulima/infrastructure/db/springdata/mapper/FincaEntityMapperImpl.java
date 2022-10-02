package ufps.ukulima.infrastructure.db.springdata.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.model.AbonoOrganico.AbonoOrganico;
import ufps.ukulima.domain.model.AbonoOrganicoRecomendacion.AbonoOrganicoRecomendacion;
import ufps.ukulima.domain.model.Agricultor.Agricultor;
import ufps.ukulima.domain.model.AnalisisElemento.AnalisisElemento;
import ufps.ukulima.domain.model.AnalisisSuelo.AnalisisSuelo;
import ufps.ukulima.domain.model.ClaseTextural.ClaseTextural;
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
import ufps.ukulima.domain.model.Municipio.Municipio;
import ufps.ukulima.domain.model.ProfundidadMuestra.ProfundidadMuestra;
import ufps.ukulima.domain.model.Recomendacion.EtapaFenologica.EtapaFenologica;
import ufps.ukulima.domain.model.Recomendacion.Recomendacion;
import ufps.ukulima.domain.model.TipoCultivo.TipoCultivo;
import ufps.ukulima.domain.model.TipoIdentificacion.TipoIdentificacion;
import ufps.ukulima.domain.model.Topografia.Topografia;
import ufps.ukulima.domain.model.Variedad.Variedad;
import ufps.ukulima.domain.model.Vereda.Vereda;
import ufps.ukulima.infrastructure.db.springdata.entity.AbonoOrganico.AbonoOrganicoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AbonoOrganicoRecomendacion.AbonoOrganicoRecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Agricultor.AgricultorEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisElemento.AnalisisElementosEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisSuelo.AnalisisSueloEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.ClaseTextural.ClaseTexturalEntity;
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
import ufps.ukulima.infrastructure.db.springdata.entity.Municipio.MunicipioEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.ProfundidadMuestra.ProfundidadMuestraEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Recomendacion.RecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.TipoCultivo.TipoCultivoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.TipoIdentificacion.TipoIdentificacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Topografia.TopografiaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Variedad.VariedadEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Vereda.VeredaEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-01T22:29:42-0500",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.4.200.v20220802-0458, environment: Java 17.0.4.1 (Eclipse Adoptium)"
)
@Component
public class FincaEntityMapperImpl implements FincaEntityMapper {

    @Override
    public Finca toDomain(FincaEntity FincaEntity) {
        if ( FincaEntity == null ) {
            return null;
        }

        Finca finca = new Finca();

        finca.setAreaEnUso( FincaEntity.getAreaEnUso() );
        finca.setAreaTotal( FincaEntity.getAreaTotal() );
        finca.setGeolocalizacion( FincaEntity.getGeolocalizacion() );
        finca.setIdAgricultor( agricultorEntityToAgricultor( FincaEntity.getIdAgricultor() ) );
        finca.setIdCorregimiento( corregimientoEntityToCorregimiento( FincaEntity.getIdCorregimiento() ) );
        finca.setIdFinca( FincaEntity.getIdFinca() );
        finca.setIdMunicipio( municipioEntityToMunicipio( FincaEntity.getIdMunicipio() ) );
        finca.setIdVereda( veredaEntityToVereda( FincaEntity.getIdVereda() ) );
        finca.setNombre( FincaEntity.getNombre() );

        return finca;
    }

    @Override
    public FincaEntity toEntity(Finca Finca) {
        if ( Finca == null ) {
            return null;
        }

        FincaEntity fincaEntity = new FincaEntity();

        fincaEntity.setAreaEnUso( Finca.getAreaEnUso() );
        fincaEntity.setAreaTotal( Finca.getAreaTotal() );
        fincaEntity.setCultivoCollection( cultivoCollectionToCultivoEntityCollection( Finca.getCultivoCollection() ) );
        fincaEntity.setGeolocalizacion( Finca.getGeolocalizacion() );
        fincaEntity.setIdAgricultor( agricultorToAgricultorEntity( Finca.getIdAgricultor() ) );
        fincaEntity.setIdCorregimiento( corregimientoToCorregimientoEntity( Finca.getIdCorregimiento() ) );
        fincaEntity.setIdFinca( Finca.getIdFinca() );
        fincaEntity.setIdMunicipio( municipioToMunicipioEntity( Finca.getIdMunicipio() ) );
        fincaEntity.setIdVereda( veredaToVeredaEntity( Finca.getIdVereda() ) );
        fincaEntity.setNombre( Finca.getNombre() );

        return fincaEntity;
    }

    @Override
    public List<Finca> abonosOrganicosRecomendacionToDomain(List<FincaEntity> abonoOrganicoEntities) {
        if ( abonoOrganicoEntities == null ) {
            return null;
        }

        List<Finca> list = new ArrayList<Finca>( abonoOrganicoEntities.size() );
        for ( FincaEntity fincaEntity : abonoOrganicoEntities ) {
            list.add( toDomain( fincaEntity ) );
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

    protected FuenteEntity fuenteToFuenteEntity(Fuente fuente) {
        if ( fuente == null ) {
            return null;
        }

        FuenteEntity fuenteEntity = new FuenteEntity();

        fuenteEntity.setDescripcion( fuente.getDescripcion() );
        fuenteEntity.setFuenteRecomendacionCollection( fuenteRecomendacionCollectionToFuenteRecomendacionEntityCollection( fuente.getFuenteRecomendacionCollection() ) );
        fuenteEntity.setId( fuente.getId() );

        return fuenteEntity;
    }

    protected AbonoOrganicoEntity abonoOrganicoToAbonoOrganicoEntity(AbonoOrganico abonoOrganico) {
        if ( abonoOrganico == null ) {
            return null;
        }

        AbonoOrganicoEntity abonoOrganicoEntity = new AbonoOrganicoEntity();

        abonoOrganicoEntity.setDescripcion( abonoOrganico.getDescripcion() );
        abonoOrganicoEntity.setId( abonoOrganico.getId() );

        return abonoOrganicoEntity;
    }

    protected AbonoOrganicoRecomendacionEntity abonoOrganicoRecomendacionToAbonoOrganicoRecomendacionEntity(AbonoOrganicoRecomendacion abonoOrganicoRecomendacion) {
        if ( abonoOrganicoRecomendacion == null ) {
            return null;
        }

        AbonoOrganicoRecomendacionEntity abonoOrganicoRecomendacionEntity = new AbonoOrganicoRecomendacionEntity();

        abonoOrganicoRecomendacionEntity.setCantidad( abonoOrganicoRecomendacion.getCantidad() );
        abonoOrganicoRecomendacionEntity.setId( abonoOrganicoRecomendacion.getId() );
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

        enmiendaEntity.setDescripcion( enmienda.getDescripcion() );
        enmiendaEntity.setId( enmienda.getId() );
        enmiendaEntity.setRecomendacionCollection( recomendacionCollectionToRecomendacionEntityCollection( enmienda.getRecomendacionCollection() ) );

        return enmiendaEntity;
    }

    protected RecomendacionEntity recomendacionToRecomendacionEntity(Recomendacion recomendacion) {
        if ( recomendacion == null ) {
            return null;
        }

        RecomendacionEntity recomendacionEntity = new RecomendacionEntity();

        recomendacionEntity.setAbonoOrganicoRecomendacionCollection( abonoOrganicoRecomendacionCollectionToAbonoOrganicoRecomendacionEntityCollection( recomendacion.getAbonoOrganicoRecomendacionCollection() ) );
        recomendacionEntity.setCantidadEnmienda( recomendacion.getCantidadEnmienda() );
        recomendacionEntity.setFuenteRecomendacionCollection( fuenteRecomendacionCollectionToFuenteRecomendacionEntityCollection( recomendacion.getFuenteRecomendacionCollection() ) );
        recomendacionEntity.setId( recomendacion.getId() );
        recomendacionEntity.setIdAnalisisSuelo( analisisSueloToAnalisisSueloEntity( recomendacion.getIdAnalisisSuelo() ) );
        recomendacionEntity.setIdEnmienda( enmiendaToEnmiendaEntity( recomendacion.getIdEnmienda() ) );
        recomendacionEntity.setPreparacionSuelo( recomendacion.getPreparacionSuelo() );

        return recomendacionEntity;
    }

    protected FuenteRecomendacionEntity fuenteRecomendacionToFuenteRecomendacionEntity(FuenteRecomendacion fuenteRecomendacion) {
        if ( fuenteRecomendacion == null ) {
            return null;
        }

        FuenteRecomendacionEntity fuenteRecomendacionEntity = new FuenteRecomendacionEntity();

        fuenteRecomendacionEntity.setCantidad( fuenteRecomendacion.getCantidad() );
        fuenteRecomendacionEntity.setId( fuenteRecomendacion.getId() );
        fuenteRecomendacionEntity.setIdElemento( elementoToElementoEntity( fuenteRecomendacion.getIdElemento() ) );
        fuenteRecomendacionEntity.setIdFuente( fuenteToFuenteEntity( fuenteRecomendacion.getIdFuente() ) );
        fuenteRecomendacionEntity.setIdRecomendacion( recomendacionToRecomendacionEntity( fuenteRecomendacion.getIdRecomendacion() ) );

        return fuenteRecomendacionEntity;
    }

    protected ElementoEntity elementoToElementoEntity(Elemento elemento) {
        if ( elemento == null ) {
            return null;
        }

        ElementoEntity elementoEntity = new ElementoEntity();

        elementoEntity.setAnalisisElementoCollection( analisisElementoCollectionToAnalisisElementosEntityCollection( elemento.getAnalisisElementoCollection() ) );
        elementoEntity.setFuenteRecomendacionCollection( fuenteRecomendacionCollectionToFuenteRecomendacionEntityCollection( elemento.getFuenteRecomendacionCollection() ) );
        elementoEntity.setId( elemento.getId() );
        elementoEntity.setNombre( elemento.getNombre() );
        elementoEntity.setUnidad( elemento.getUnidad() );

        return elementoEntity;
    }

    protected AnalisisElementosEntity analisisElementoToAnalisisElementosEntity(AnalisisElemento analisisElemento) {
        if ( analisisElemento == null ) {
            return null;
        }

        AnalisisElementosEntity analisisElementosEntity = new AnalisisElementosEntity();

        analisisElementosEntity.setId( analisisElemento.getId() );
        analisisElementosEntity.setIdAnalisisSuelo( analisisSueloToAnalisisSueloEntity( analisisElemento.getIdAnalisisSuelo() ) );
        analisisElementosEntity.setIdElemento( elementoToElementoEntity( analisisElemento.getIdElemento() ) );
        analisisElementosEntity.setValor( analisisElemento.getValor() );

        return analisisElementosEntity;
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

    protected ClaseTexturalEntity claseTexturalToClaseTexturalEntity(ClaseTextural claseTextural) {
        if ( claseTextural == null ) {
            return null;
        }

        ClaseTexturalEntity claseTexturalEntity = new ClaseTexturalEntity();

        claseTexturalEntity.setAnalisisSueloCollection( analisisSueloCollectionToAnalisisSueloEntityCollection( claseTextural.getAnalisisSueloCollection() ) );
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

        densidadEntity.setAnalisisSueloCollection( analisisSueloCollectionToAnalisisSueloEntityCollection( densidad.getAnalisisSueloCollection() ) );
        densidadEntity.setIdDensidad( densidad.getIdDensidad() );
        densidadEntity.setValor( densidad.getValor() );

        return densidadEntity;
    }

    protected ProfundidadMuestraEntity profundidadMuestraToProfundidadMuestraEntity(ProfundidadMuestra profundidadMuestra) {
        if ( profundidadMuestra == null ) {
            return null;
        }

        ProfundidadMuestraEntity profundidadMuestraEntity = new ProfundidadMuestraEntity();

        profundidadMuestraEntity.setAnalisisSueloCollection( analisisSueloCollectionToAnalisisSueloEntityCollection( profundidadMuestra.getAnalisisSueloCollection() ) );
        profundidadMuestraEntity.setIdProfundidadMuestra( profundidadMuestra.getIdProfundidadMuestra() );
        profundidadMuestraEntity.setProfundidad( profundidadMuestra.getProfundidad() );

        return profundidadMuestraEntity;
    }

    protected AnalisisSueloEntity analisisSueloToAnalisisSueloEntity(AnalisisSuelo analisisSuelo) {
        if ( analisisSuelo == null ) {
            return null;
        }

        AnalisisSueloEntity analisisSueloEntity = new AnalisisSueloEntity();

        analisisSueloEntity.setAnalisisElementoCollection( analisisElementoCollectionToAnalisisElementosEntityCollection( analisisSuelo.getAnalisisElementoCollection() ) );
        analisisSueloEntity.setFecha( analisisSuelo.getFecha() );
        analisisSueloEntity.setIdAnalisisSuelo( analisisSuelo.getIdAnalisisSuelo() );
        analisisSueloEntity.setIdClaseTextural( claseTexturalToClaseTexturalEntity( analisisSuelo.getIdClaseTextural() ) );
        analisisSueloEntity.setIdCultivo( cultivoToCultivoEntity( analisisSuelo.getIdCultivo() ) );
        analisisSueloEntity.setIdDensidad( densidadToDensidadEntity( analisisSuelo.getIdDensidad() ) );
        analisisSueloEntity.setIdProfundidad( profundidadMuestraToProfundidadMuestraEntity( analisisSuelo.getIdProfundidad() ) );
        analisisSueloEntity.setPorcentArcilla( analisisSuelo.getPorcentArcilla() );
        analisisSueloEntity.setPorcentArena( analisisSuelo.getPorcentArena() );
        analisisSueloEntity.setPorcentLimos( analisisSuelo.getPorcentLimos() );
        analisisSueloEntity.setRecomendacionCollection( recomendacionCollectionToRecomendacionEntityCollection( analisisSuelo.getRecomendacionCollection() ) );

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

        distanciaSiembraEntity.setCultivoCollection( cultivoCollectionToCultivoEntityCollection( distanciaSiembra.getCultivoCollection() ) );
        distanciaSiembraEntity.setDescripcion( distanciaSiembra.getDescripcion() );
        distanciaSiembraEntity.setId( distanciaSiembra.getId() );

        return distanciaSiembraEntity;
    }

    protected EtapaFenologicaEntity etapaFenologicaToEtapaFenologicaEntity(EtapaFenologica etapaFenologica) {
        if ( etapaFenologica == null ) {
            return null;
        }

        EtapaFenologicaEntity etapaFenologicaEntity = new EtapaFenologicaEntity();

        etapaFenologicaEntity.setCultivoCollection( cultivoCollectionToCultivoEntityCollection( etapaFenologica.getCultivoCollection() ) );
        etapaFenologicaEntity.setDescripcion( etapaFenologica.getDescripcion() );
        etapaFenologicaEntity.setId( etapaFenologica.getId() );

        return etapaFenologicaEntity;
    }

    protected TopografiaEntity topografiaToTopografiaEntity(Topografia topografia) {
        if ( topografia == null ) {
            return null;
        }

        TopografiaEntity topografiaEntity = new TopografiaEntity();

        topografiaEntity.setCultivoCollection( cultivoCollectionToCultivoEntityCollection( topografia.getCultivoCollection() ) );
        topografiaEntity.setDescripcion( topografia.getDescripcion() );
        topografiaEntity.setId( topografia.getId() );

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

        tipoCultivoEntity.setDescripcion( tipoCultivo.getDescripcion() );
        tipoCultivoEntity.setId( tipoCultivo.getId() );
        tipoCultivoEntity.setVariedadCollection( variedadCollectionToVariedadEntityCollection( tipoCultivo.getVariedadCollection() ) );

        return tipoCultivoEntity;
    }

    protected VariedadEntity variedadToVariedadEntity(Variedad variedad) {
        if ( variedad == null ) {
            return null;
        }

        VariedadEntity variedadEntity = new VariedadEntity();

        variedadEntity.setCultivoCollection( cultivoCollectionToCultivoEntityCollection( variedad.getCultivoCollection() ) );
        variedadEntity.setDescripcion( variedad.getDescripcion() );
        variedadEntity.setId( variedad.getId() );
        variedadEntity.setIdTipoCultivo( tipoCultivoToTipoCultivoEntity( variedad.getIdTipoCultivo() ) );

        return variedadEntity;
    }

    protected CultivoEntity cultivoToCultivoEntity(Cultivo cultivo) {
        if ( cultivo == null ) {
            return null;
        }

        CultivoEntity cultivoEntity = new CultivoEntity();

        cultivoEntity.setAnalisisSueloCollection( analisisSueloCollectionToAnalisisSueloEntityCollection( cultivo.getAnalisisSueloCollection() ) );
        cultivoEntity.setDescripcion( cultivo.getDescripcion() );
        cultivoEntity.setIdCultivo( cultivo.getIdCultivo() );
        cultivoEntity.setIdDistanciaSiembra( distanciaSiembraToDistanciaSiembraEntity( cultivo.getIdDistanciaSiembra() ) );
        cultivoEntity.setIdEtapaFenologica( etapaFenologicaToEtapaFenologicaEntity( cultivo.getIdEtapaFenologica() ) );
        cultivoEntity.setIdFinca( toEntity( cultivo.getIdFinca() ) );
        cultivoEntity.setIdTopografia( topografiaToTopografiaEntity( cultivo.getIdTopografia() ) );
        cultivoEntity.setIdVariedad( variedadToVariedadEntity( cultivo.getIdVariedad() ) );
        cultivoEntity.setPlantasPorHectarea( cultivo.getPlantasPorHectarea() );

        return cultivoEntity;
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

        agricultorEntity.setApellidos( agricultor.getApellidos() );
        agricultorEntity.setConfirmationToken( agricultor.getConfirmationToken() );
        agricultorEntity.setEmail( agricultor.getEmail() );
        agricultorEntity.setEstado( agricultor.getEstado() );
        agricultorEntity.setFechaNacimiento( agricultor.getFechaNacimiento() );
        agricultorEntity.setIdTipoIdentificacion( tipoIdentificacionToTipoIdentificacionEntity( agricultor.getIdTipoIdentificacion() ) );
        agricultorEntity.setIdentificacion( agricultor.getIdentificacion() );
        agricultorEntity.setNombres( agricultor.getNombres() );
        agricultorEntity.setPassword( agricultor.getPassword() );
        agricultorEntity.setTelefono( agricultor.getTelefono() );

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

        municipioEntity.setIdDepartamento( departamentoToDepartamentoEntity( municipio.getIdDepartamento() ) );
        municipioEntity.setIdMunicipio( municipio.getIdMunicipio() );

        return municipioEntity;
    }

    protected CorregimientoEntity corregimientoToCorregimientoEntity(Corregimiento corregimiento) {
        if ( corregimiento == null ) {
            return null;
        }

        CorregimientoEntity corregimientoEntity = new CorregimientoEntity();

        corregimientoEntity.setIdCorregimiento( corregimiento.getIdCorregimiento() );
        corregimientoEntity.setIdMunicipio( municipioToMunicipioEntity( corregimiento.getIdMunicipio() ) );
        corregimientoEntity.setNombre( corregimiento.getNombre() );

        return corregimientoEntity;
    }

    protected VeredaEntity veredaToVeredaEntity(Vereda vereda) {
        if ( vereda == null ) {
            return null;
        }

        VeredaEntity veredaEntity = new VeredaEntity();

        veredaEntity.setIdCorregimiento( corregimientoToCorregimientoEntity( vereda.getIdCorregimiento() ) );
        veredaEntity.setIdVereda( vereda.getIdVereda() );
        veredaEntity.setNombre( vereda.getNombre() );

        return veredaEntity;
    }
}
