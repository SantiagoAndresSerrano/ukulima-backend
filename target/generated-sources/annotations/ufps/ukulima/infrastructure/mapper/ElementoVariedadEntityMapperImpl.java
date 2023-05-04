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
import ufps.ukulima.domain.model.AnalisisElementoInterpretacion.AnalisisElementoInterpretacion;
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
import ufps.ukulima.domain.model.ElementoVariedad.ElementoVariedad;
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
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisElementoInterpretacion.AnalisisElementoInterpretacionEntity;
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
import ufps.ukulima.infrastructure.db.springdata.entity.ElementoVariedad.ElementoVariedadEntity;
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
    date = "2023-05-04T16:08:30-0500",
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

    protected AnalisisSuelo analisisSueloEntityToAnalisisSuelo(AnalisisSueloEntity analisisSueloEntity) {
        if ( analisisSueloEntity == null ) {
            return null;
        }

        AnalisisSuelo analisisSuelo = new AnalisisSuelo();

        analisisSuelo.setAnalisisSueloRelacionBaseEntities( analisisSueloRelacionBaseEntityCollectionToAnalisisSueloRelacionBaseCollection( analisisSueloEntity.getAnalisisSueloRelacionBaseEntities() ) );
        analisisSuelo.setPhSuelo( analisisSueloEntity.getPhSuelo() );
        analisisSuelo.setAluminioIntercambiable( analisisSueloEntity.getAluminioIntercambiable() );
        analisisSuelo.setIdPhSuelo( phSueloEntityToPhSuelo( analisisSueloEntity.getIdPhSuelo() ) );
        analisisSuelo.setIdAluminioIntercambiable( aluminioIntercambiableEntityToAluminioIntercambiable( analisisSueloEntity.getIdAluminioIntercambiable() ) );
        analisisSuelo.setIdConductividadElectrica( conductividadElectricaEntityToConductividadElectrica( analisisSueloEntity.getIdConductividadElectrica() ) );
        analisisSuelo.setIdMateriaOrganica( materiaOrganicaEntityToMateriaOrganica( analisisSueloEntity.getIdMateriaOrganica() ) );
        analisisSuelo.setIdIntercambioCationico( intercambioCationicoEntityToIntercambioCationico( analisisSueloEntity.getIdIntercambioCationico() ) );
        analisisSuelo.setConductividadElectrica( analisisSueloEntity.getConductividadElectrica() );
        analisisSuelo.setMateriaOrganica( analisisSueloEntity.getMateriaOrganica() );
        analisisSuelo.setIntercambioCationico( analisisSueloEntity.getIntercambioCationico() );
        analisisSuelo.setIdAnalisisSuelo( analisisSueloEntity.getIdAnalisisSuelo() );
        analisisSuelo.setPorcentArena( analisisSueloEntity.getPorcentArena() );
        analisisSuelo.setPorcentLimos( analisisSueloEntity.getPorcentLimos() );
        analisisSuelo.setPorcentArcilla( analisisSueloEntity.getPorcentArcilla() );
        analisisSuelo.setFecha( analisisSueloEntity.getFecha() );
        analisisSuelo.setAnalisisElementoCollection( analisisElementosEntityCollectionToAnalisisElementoCollection( analisisSueloEntity.getAnalisisElementoCollection() ) );
        analisisSuelo.setIdClaseTextural( claseTexturalEntityToClaseTextural( analisisSueloEntity.getIdClaseTextural() ) );
        analisisSuelo.setIdCultivo( cultivoEntityToCultivo( analisisSueloEntity.getIdCultivo() ) );
        analisisSuelo.setIdDensidad( densidadEntityToDensidad( analisisSueloEntity.getIdDensidad() ) );
        analisisSuelo.setIdProfundidad( profundidadMuestraEntityToProfundidadMuestra( analisisSueloEntity.getIdProfundidad() ) );
        analisisSuelo.setIdGrupoTextural( grupoTexturalEntityToGrupoTextural( analisisSueloEntity.getIdGrupoTextural() ) );

        return analisisSuelo;
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
        recomendacion.setIdAnalisisSuelo( analisisSueloEntityToAnalisisSuelo( recomendacionEntity.getIdAnalisisSuelo() ) );
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
