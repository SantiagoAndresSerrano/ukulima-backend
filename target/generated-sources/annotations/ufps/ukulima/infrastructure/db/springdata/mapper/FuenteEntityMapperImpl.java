package ufps.ukulima.infrastructure.db.springdata.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.EtapaFenologica.EtapaFenologica;
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
    date = "2022-10-12T20:14:16-0500",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.4.200.v20220802-0458, environment: Java 17.0.4.1 (Eclipse Adoptium)"
)
@Component
public class FuenteEntityMapperImpl implements FuenteEntityMapper {

    @Override
    public Fuente toDomain(FuenteEntity FuenteEntity) {
        if ( FuenteEntity == null ) {
            return null;
        }

        Fuente fuente = new Fuente();

        fuente.setId( FuenteEntity.getId() );
        fuente.setDescripcion( FuenteEntity.getDescripcion() );
        fuente.setFuenteRecomendacionCollection( fuenteRecomendacionEntityCollectionToFuenteRecomendacionCollection( FuenteEntity.getFuenteRecomendacionCollection() ) );

        return fuente;
    }

    @Override
    public FuenteEntity toEntity(Fuente Fuente) {
        if ( Fuente == null ) {
            return null;
        }

        FuenteEntity fuenteEntity = new FuenteEntity();

        fuenteEntity.setId( Fuente.getId() );
        fuenteEntity.setDescripcion( Fuente.getDescripcion() );
        fuenteEntity.setFuenteRecomendacionCollection( fuenteRecomendacionCollectionToFuenteRecomendacionEntityCollection( Fuente.getFuenteRecomendacionCollection() ) );

        return fuenteEntity;
    }

    @Override
    public List<Fuente> abonosOrganicosRecomendacionToDomain(List<FuenteEntity> abonoOrganicoEntities) {
        if ( abonoOrganicoEntities == null ) {
            return null;
        }

        List<Fuente> list = new ArrayList<Fuente>( abonoOrganicoEntities.size() );
        for ( FuenteEntity fuenteEntity : abonoOrganicoEntities ) {
            list.add( toDomain( fuenteEntity ) );
        }

        return list;
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
        abonoOrganicoRecomendacion.setIdRecomendacion( recomendacionEntityToRecomendacion( abonoOrganicoRecomendacionEntity.getIdRecomendacion() ) );

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

    protected Recomendacion recomendacionEntityToRecomendacion(RecomendacionEntity recomendacionEntity) {
        if ( recomendacionEntity == null ) {
            return null;
        }

        Recomendacion recomendacion = new Recomendacion();

        recomendacion.setId( recomendacionEntity.getId() );
        recomendacion.setCantidadEnmienda( recomendacionEntity.getCantidadEnmienda() );
        recomendacion.setPreparacionSuelo( recomendacionEntity.getPreparacionSuelo() );
        recomendacion.setIdAnalisisSuelo( analisisSueloEntityToAnalisisSuelo( recomendacionEntity.getIdAnalisisSuelo() ) );
        recomendacion.setIdEnmienda( enmiendaEntityToEnmienda( recomendacionEntity.getIdEnmienda() ) );
        recomendacion.setAbonoOrganicoRecomendacionCollection( abonoOrganicoRecomendacionEntityCollectionToAbonoOrganicoRecomendacionCollection( recomendacionEntity.getAbonoOrganicoRecomendacionCollection() ) );
        recomendacion.setFuenteRecomendacionCollection( fuenteRecomendacionEntityCollectionToFuenteRecomendacionCollection( recomendacionEntity.getFuenteRecomendacionCollection() ) );

        return recomendacion;
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

    protected Collection<AnalisisSuelo> analisisSueloEntityCollectionToAnalisisSueloCollection(Collection<AnalisisSueloEntity> collection) {
        if ( collection == null ) {
            return null;
        }

        Collection<AnalisisSuelo> collection1 = new ArrayList<AnalisisSuelo>( collection.size() );
        for ( AnalisisSueloEntity analisisSueloEntity : collection ) {
            collection1.add( analisisSueloEntityToAnalisisSuelo( analisisSueloEntity ) );
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
        claseTextural.setAnalisisSueloCollection( analisisSueloEntityCollectionToAnalisisSueloCollection( claseTexturalEntity.getAnalisisSueloCollection() ) );

        return claseTextural;
    }

    protected Collection<Cultivo> cultivoEntityCollectionToCultivoCollection(Collection<CultivoEntity> collection) {
        if ( collection == null ) {
            return null;
        }

        Collection<Cultivo> collection1 = new ArrayList<Cultivo>( collection.size() );
        for ( CultivoEntity cultivoEntity : collection ) {
            collection1.add( cultivoEntityToCultivo( cultivoEntity ) );
        }

        return collection1;
    }

    protected DistanciaSiembra distanciaSiembraEntityToDistanciaSiembra(DistanciaSiembraEntity distanciaSiembraEntity) {
        if ( distanciaSiembraEntity == null ) {
            return null;
        }

        DistanciaSiembra distanciaSiembra = new DistanciaSiembra();

        distanciaSiembra.setId( distanciaSiembraEntity.getId() );
        distanciaSiembra.setDescripcion( distanciaSiembraEntity.getDescripcion() );
        distanciaSiembra.setCultivoCollection( cultivoEntityCollectionToCultivoCollection( distanciaSiembraEntity.getCultivoCollection() ) );

        return distanciaSiembra;
    }

    protected EtapaFenologica etapaFenologicaEntityToEtapaFenologica(EtapaFenologicaEntity etapaFenologicaEntity) {
        if ( etapaFenologicaEntity == null ) {
            return null;
        }

        EtapaFenologica etapaFenologica = new EtapaFenologica();

        etapaFenologica.setId( etapaFenologicaEntity.getId() );
        etapaFenologica.setDescripcion( etapaFenologicaEntity.getDescripcion() );
        etapaFenologica.setCultivoCollection( cultivoEntityCollectionToCultivoCollection( etapaFenologicaEntity.getCultivoCollection() ) );

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
        topografia.setCultivoCollection( cultivoEntityCollectionToCultivoCollection( topografiaEntity.getCultivoCollection() ) );

        return topografia;
    }

    protected Collection<Variedad> variedadEntityCollectionToVariedadCollection(Collection<VariedadEntity> collection) {
        if ( collection == null ) {
            return null;
        }

        Collection<Variedad> collection1 = new ArrayList<Variedad>( collection.size() );
        for ( VariedadEntity variedadEntity : collection ) {
            collection1.add( variedadEntityToVariedad( variedadEntity ) );
        }

        return collection1;
    }

    protected TipoCultivo tipoCultivoEntityToTipoCultivo(TipoCultivoEntity tipoCultivoEntity) {
        if ( tipoCultivoEntity == null ) {
            return null;
        }

        TipoCultivo tipoCultivo = new TipoCultivo();

        tipoCultivo.setId( tipoCultivoEntity.getId() );
        tipoCultivo.setDescripcion( tipoCultivoEntity.getDescripcion() );
        tipoCultivo.setVariedadCollection( variedadEntityCollectionToVariedadCollection( tipoCultivoEntity.getVariedadCollection() ) );

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
        variedad.setCultivoCollection( cultivoEntityCollectionToCultivoCollection( variedadEntity.getCultivoCollection() ) );

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
        cultivo.setAnalisisSueloCollection( analisisSueloEntityCollectionToAnalisisSueloCollection( cultivoEntity.getAnalisisSueloCollection() ) );
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
        densidad.setAnalisisSueloCollection( analisisSueloEntityCollectionToAnalisisSueloCollection( densidadEntity.getAnalisisSueloCollection() ) );

        return densidad;
    }

    protected ProfundidadMuestra profundidadMuestraEntityToProfundidadMuestra(ProfundidadMuestraEntity profundidadMuestraEntity) {
        if ( profundidadMuestraEntity == null ) {
            return null;
        }

        ProfundidadMuestra profundidadMuestra = new ProfundidadMuestra();

        profundidadMuestra.setIdProfundidadMuestra( profundidadMuestraEntity.getIdProfundidadMuestra() );
        profundidadMuestra.setProfundidad( profundidadMuestraEntity.getProfundidad() );
        profundidadMuestra.setAnalisisSueloCollection( analisisSueloEntityCollectionToAnalisisSueloCollection( profundidadMuestraEntity.getAnalisisSueloCollection() ) );

        return profundidadMuestra;
    }

    protected AnalisisSuelo analisisSueloEntityToAnalisisSuelo(AnalisisSueloEntity analisisSueloEntity) {
        if ( analisisSueloEntity == null ) {
            return null;
        }

        AnalisisSuelo analisisSuelo = new AnalisisSuelo();

        analisisSuelo.setIdAnalisisSuelo( analisisSueloEntity.getIdAnalisisSuelo() );
        analisisSuelo.setPorcentArena( analisisSueloEntity.getPorcentArena() );
        analisisSuelo.setPorcentLimos( analisisSueloEntity.getPorcentLimos() );
        analisisSuelo.setPorcentArcilla( analisisSueloEntity.getPorcentArcilla() );
        analisisSuelo.setFecha( analisisSueloEntity.getFecha() );
        analisisSuelo.setRecomendacionCollection( recomendacionEntityCollectionToRecomendacionCollection( analisisSueloEntity.getRecomendacionCollection() ) );
        analisisSuelo.setAnalisisElementoCollection( analisisElementosEntityCollectionToAnalisisElementoCollection( analisisSueloEntity.getAnalisisElementoCollection() ) );
        analisisSuelo.setIdClaseTextural( claseTexturalEntityToClaseTextural( analisisSueloEntity.getIdClaseTextural() ) );
        analisisSuelo.setIdCultivo( cultivoEntityToCultivo( analisisSueloEntity.getIdCultivo() ) );
        analisisSuelo.setIdDensidad( densidadEntityToDensidad( analisisSueloEntity.getIdDensidad() ) );
        analisisSuelo.setIdProfundidad( profundidadMuestraEntityToProfundidadMuestra( analisisSueloEntity.getIdProfundidad() ) );

        return analisisSuelo;
    }

    protected AnalisisElemento analisisElementosEntityToAnalisisElemento(AnalisisElementosEntity analisisElementosEntity) {
        if ( analisisElementosEntity == null ) {
            return null;
        }

        AnalisisElemento analisisElemento = new AnalisisElemento();

        analisisElemento.setId( analisisElementosEntity.getId() );
        analisisElemento.setValor( analisisElementosEntity.getValor() );
        analisisElemento.setIdAnalisisSuelo( analisisSueloEntityToAnalisisSuelo( analisisElementosEntity.getIdAnalisisSuelo() ) );
        analisisElemento.setIdElemento( elementoEntityToElemento( analisisElementosEntity.getIdElemento() ) );

        return analisisElemento;
    }

    protected Elemento elementoEntityToElemento(ElementoEntity elementoEntity) {
        if ( elementoEntity == null ) {
            return null;
        }

        Elemento elemento = new Elemento();

        elemento.setId( elementoEntity.getId() );
        elemento.setNombre( elementoEntity.getNombre() );
        elemento.setUnidad( elementoEntity.getUnidad() );
        elemento.setAnalisisElementoCollection( analisisElementosEntityCollectionToAnalisisElementoCollection( elementoEntity.getAnalisisElementoCollection() ) );
        elemento.setFuenteRecomendacionCollection( fuenteRecomendacionEntityCollectionToFuenteRecomendacionCollection( elementoEntity.getFuenteRecomendacionCollection() ) );

        return elemento;
    }

    protected FuenteRecomendacion fuenteRecomendacionEntityToFuenteRecomendacion(FuenteRecomendacionEntity fuenteRecomendacionEntity) {
        if ( fuenteRecomendacionEntity == null ) {
            return null;
        }

        FuenteRecomendacion fuenteRecomendacion = new FuenteRecomendacion();

        fuenteRecomendacion.setId( fuenteRecomendacionEntity.getId() );
        fuenteRecomendacion.setCantidad( fuenteRecomendacionEntity.getCantidad() );
        fuenteRecomendacion.setIdElemento( elementoEntityToElemento( fuenteRecomendacionEntity.getIdElemento() ) );
        fuenteRecomendacion.setIdFuente( toDomain( fuenteRecomendacionEntity.getIdFuente() ) );
        fuenteRecomendacion.setIdRecomendacion( recomendacionEntityToRecomendacion( fuenteRecomendacionEntity.getIdRecomendacion() ) );

        return fuenteRecomendacion;
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

        claseTexturalEntity.setIdClaseTextural( claseTextural.getIdClaseTextural() );
        claseTexturalEntity.setNombre( claseTextural.getNombre() );
        claseTexturalEntity.setSigla( claseTextural.getSigla() );
        claseTexturalEntity.setAnalisisSueloCollection( analisisSueloCollectionToAnalisisSueloEntityCollection( claseTextural.getAnalisisSueloCollection() ) );

        return claseTexturalEntity;
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
        fincaEntity.setCultivoCollection( cultivoCollectionToCultivoEntityCollection( finca.getCultivoCollection() ) );
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
        analisisSueloEntity.setIdClaseTextural( claseTexturalToClaseTexturalEntity( analisisSuelo.getIdClaseTextural() ) );
        analisisSueloEntity.setIdCultivo( cultivoToCultivoEntity( analisisSuelo.getIdCultivo() ) );
        analisisSueloEntity.setIdDensidad( densidadToDensidadEntity( analisisSuelo.getIdDensidad() ) );
        analisisSueloEntity.setIdProfundidad( profundidadMuestraToProfundidadMuestraEntity( analisisSuelo.getIdProfundidad() ) );

        return analisisSueloEntity;
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

    protected FuenteRecomendacionEntity fuenteRecomendacionToFuenteRecomendacionEntity(FuenteRecomendacion fuenteRecomendacion) {
        if ( fuenteRecomendacion == null ) {
            return null;
        }

        FuenteRecomendacionEntity fuenteRecomendacionEntity = new FuenteRecomendacionEntity();

        fuenteRecomendacionEntity.setId( fuenteRecomendacion.getId() );
        fuenteRecomendacionEntity.setCantidad( fuenteRecomendacion.getCantidad() );
        fuenteRecomendacionEntity.setIdElemento( elementoToElementoEntity( fuenteRecomendacion.getIdElemento() ) );
        fuenteRecomendacionEntity.setIdFuente( toEntity( fuenteRecomendacion.getIdFuente() ) );
        fuenteRecomendacionEntity.setIdRecomendacion( recomendacionToRecomendacionEntity( fuenteRecomendacion.getIdRecomendacion() ) );

        return fuenteRecomendacionEntity;
    }
}
