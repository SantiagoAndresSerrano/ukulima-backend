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

@Generated(value = "org.mapstruct.ap.MappingProcessor", date = "2022-10-15T16:20:02-0500", comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.4.200.v20220802-0458, environment: Java 17.0.4.1 (Eclipse Adoptium)")
@Component
public class AnalisisSueloEntityMapperImpl implements AnalisisSueloEntityMapper {

    @Override
    public AnalisisSuelo toDomain(AnalisisSueloEntity AnalisisSueloEntity) {
        if (AnalisisSueloEntity == null) {
            return null;
        }

        AnalisisSuelo analisisSuelo = new AnalisisSuelo();

        analisisSuelo.setFecha(AnalisisSueloEntity.getFecha());
        analisisSuelo.setIdAnalisisSuelo(AnalisisSueloEntity.getIdAnalisisSuelo());
        analisisSuelo.setIdClaseTextural(claseTexturalEntityToClaseTextural(AnalisisSueloEntity.getIdClaseTextural()));
        analisisSuelo.setIdCultivo(cultivoEntityToCultivo(AnalisisSueloEntity.getIdCultivo()));
        analisisSuelo.setIdDensidad(densidadEntityToDensidad(AnalisisSueloEntity.getIdDensidad()));
        analisisSuelo
                .setIdProfundidad(profundidadMuestraEntityToProfundidadMuestra(AnalisisSueloEntity.getIdProfundidad()));
        analisisSuelo.setPorcentArcilla(AnalisisSueloEntity.getPorcentArcilla());
        analisisSuelo.setPorcentArena(AnalisisSueloEntity.getPorcentArena());
        analisisSuelo.setPorcentLimos(AnalisisSueloEntity.getPorcentLimos());
        analisisSuelo.setRecomendacionCollection(recomendacionEntityCollectionToRecomendacionCollection(
                AnalisisSueloEntity.getRecomendacionCollection()));

        return analisisSuelo;
    }

    @Override
    public AnalisisSueloEntity toEntity(AnalisisSuelo AnalisisSuelo) {
        if (AnalisisSuelo == null) {
            return null;
        }

        AnalisisSueloEntity analisisSueloEntity = new AnalisisSueloEntity();

        analisisSueloEntity.setFecha(AnalisisSuelo.getFecha());
        analisisSueloEntity.setIdAnalisisSuelo(AnalisisSuelo.getIdAnalisisSuelo());
        analisisSueloEntity.setIdClaseTextural(claseTexturalToClaseTexturalEntity(AnalisisSuelo.getIdClaseTextural()));
        analisisSueloEntity.setIdCultivo(cultivoToCultivoEntity(AnalisisSuelo.getIdCultivo()));
        analisisSueloEntity.setIdDensidad(densidadToDensidadEntity(AnalisisSuelo.getIdDensidad()));
        analisisSueloEntity
                .setIdProfundidad(profundidadMuestraToProfundidadMuestraEntity(AnalisisSuelo.getIdProfundidad()));
        analisisSueloEntity.setPorcentArcilla(AnalisisSuelo.getPorcentArcilla());
        analisisSueloEntity.setPorcentArena(AnalisisSuelo.getPorcentArena());
        analisisSueloEntity.setPorcentLimos(AnalisisSuelo.getPorcentLimos());
        analisisSueloEntity.setRecomendacionCollection(
                recomendacionCollectionToRecomendacionEntityCollection(AnalisisSuelo.getRecomendacionCollection()));

        return analisisSueloEntity;
    }

    @Override
    public List<AnalisisSuelo> abonosOrganicosRecomendacionToDomain(List<AnalisisSueloEntity> abonoOrganicoEntities) {
        if (abonoOrganicoEntities == null) {
            return null;
        }

        List<AnalisisSuelo> list = new ArrayList<AnalisisSuelo>(abonoOrganicoEntities.size());
        for (AnalisisSueloEntity analisisSueloEntity : abonoOrganicoEntities) {
            list.add(toDomain(analisisSueloEntity));
        }

        return list;
    }

    protected ClaseTextural claseTexturalEntityToClaseTextural(ClaseTexturalEntity claseTexturalEntity) {
        if (claseTexturalEntity == null) {
            return null;
        }

        ClaseTextural claseTextural = new ClaseTextural();

        claseTextural.setIdClaseTextural(claseTexturalEntity.getIdClaseTextural());
        claseTextural.setNombre(claseTexturalEntity.getNombre());
        claseTextural.setSigla(claseTexturalEntity.getSigla());

        return claseTextural;
    }

    protected DistanciaSiembra distanciaSiembraEntityToDistanciaSiembra(DistanciaSiembraEntity distanciaSiembraEntity) {
        if (distanciaSiembraEntity == null) {
            return null;
        }

        DistanciaSiembra distanciaSiembra = new DistanciaSiembra();

        distanciaSiembra.setDescripcion(distanciaSiembraEntity.getDescripcion());
        distanciaSiembra.setId(distanciaSiembraEntity.getId());

        return distanciaSiembra;
    }

    protected EtapaFenologica etapaFenologicaEntityToEtapaFenologica(EtapaFenologicaEntity etapaFenologicaEntity) {
        if (etapaFenologicaEntity == null) {
            return null;
        }

        EtapaFenologica etapaFenologica = new EtapaFenologica();

        etapaFenologica.setDescripcion(etapaFenologicaEntity.getDescripcion());
        etapaFenologica.setId(etapaFenologicaEntity.getId());

        return etapaFenologica;
    }

    protected TipoIdentificacion tipoIdentificacionEntityToTipoIdentificacion(
            TipoIdentificacionEntity tipoIdentificacionEntity) {
        if (tipoIdentificacionEntity == null) {
            return null;
        }

        TipoIdentificacion tipoIdentificacion = new TipoIdentificacion();

        tipoIdentificacion.setIdTipo(tipoIdentificacionEntity.getIdTipo());
        tipoIdentificacion.setNombre(tipoIdentificacionEntity.getNombre());

        return tipoIdentificacion;
    }

    protected Agricultor agricultorEntityToAgricultor(AgricultorEntity agricultorEntity) {
        if (agricultorEntity == null) {
            return null;
        }

        Agricultor agricultor = new Agricultor();

        agricultor.setApellidos(agricultorEntity.getApellidos());
        agricultor.setConfirmationToken(agricultorEntity.getConfirmationToken());
        agricultor.setEmail(agricultorEntity.getEmail());
        agricultor.setEstado(agricultorEntity.getEstado());
        agricultor.setFechaNacimiento(agricultorEntity.getFechaNacimiento());
        agricultor.setIdTipoIdentificacion(
                tipoIdentificacionEntityToTipoIdentificacion(agricultorEntity.getIdTipoIdentificacion()));
        agricultor.setIdentificacion(agricultorEntity.getIdentificacion());
        agricultor.setNombres(agricultorEntity.getNombres());
        agricultor.setPassword(agricultorEntity.getPassword());
        agricultor.setTelefono(agricultorEntity.getTelefono());

        return agricultor;
    }

    protected Departamento departamentoEntityToDepartamento(DepartamentoEntity departamentoEntity) {
        if (departamentoEntity == null) {
            return null;
        }

        Departamento departamento = new Departamento();

        departamento.setIdDepto(departamentoEntity.getIdDepto());
        departamento.setNombre(departamentoEntity.getNombre());

        return departamento;
    }

    protected Municipio municipioEntityToMunicipio(MunicipioEntity municipioEntity) {
        if (municipioEntity == null) {
            return null;
        }

        Municipio municipio = new Municipio();

        municipio.setIdDepartamento(departamentoEntityToDepartamento(municipioEntity.getIdDepartamento()));
        municipio.setIdMunicipio(municipioEntity.getIdMunicipio());

        return municipio;
    }

    protected Corregimiento corregimientoEntityToCorregimiento(CorregimientoEntity corregimientoEntity) {
        if (corregimientoEntity == null) {
            return null;
        }

        Corregimiento corregimiento = new Corregimiento();

        corregimiento.setIdCorregimiento(corregimientoEntity.getIdCorregimiento());
        corregimiento.setIdMunicipio(municipioEntityToMunicipio(corregimientoEntity.getIdMunicipio()));
        corregimiento.setNombre(corregimientoEntity.getNombre());

        return corregimiento;
    }

    protected Vereda veredaEntityToVereda(VeredaEntity veredaEntity) {
        if (veredaEntity == null) {
            return null;
        }

        Vereda vereda = new Vereda();

        vereda.setIdCorregimiento(corregimientoEntityToCorregimiento(veredaEntity.getIdCorregimiento()));
        vereda.setIdVereda(veredaEntity.getIdVereda());
        vereda.setNombre(veredaEntity.getNombre());

        return vereda;
    }

    protected Finca fincaEntityToFinca(FincaEntity fincaEntity) {
        if (fincaEntity == null) {
            return null;
        }

        Finca finca = new Finca();

        finca.setAreaEnUso(fincaEntity.getAreaEnUso());
        finca.setAreaTotal(fincaEntity.getAreaTotal());
        finca.setGeolocalizacion(fincaEntity.getGeolocalizacion());
        finca.setIdAgricultor(agricultorEntityToAgricultor(fincaEntity.getIdAgricultor()));
        finca.setIdCorregimiento(corregimientoEntityToCorregimiento(fincaEntity.getIdCorregimiento()));
        finca.setIdFinca(fincaEntity.getIdFinca());
        finca.setIdMunicipio(municipioEntityToMunicipio(fincaEntity.getIdMunicipio()));
        finca.setIdVereda(veredaEntityToVereda(fincaEntity.getIdVereda()));
        finca.setNombre(fincaEntity.getNombre());

        return finca;
    }

    protected Topografia topografiaEntityToTopografia(TopografiaEntity topografiaEntity) {
        if (topografiaEntity == null) {
            return null;
        }

        Topografia topografia = new Topografia();

        topografia.setDescripcion(topografiaEntity.getDescripcion());
        topografia.setId(topografiaEntity.getId());

        return topografia;
    }

    protected TipoCultivo tipoCultivoEntityToTipoCultivo(TipoCultivoEntity tipoCultivoEntity) {
        if (tipoCultivoEntity == null) {
            return null;
        }

        TipoCultivo tipoCultivo = new TipoCultivo();

        tipoCultivo.setDescripcion(tipoCultivoEntity.getDescripcion());
        tipoCultivo.setId(tipoCultivoEntity.getId());

        return tipoCultivo;
    }

    protected Variedad variedadEntityToVariedad(VariedadEntity variedadEntity) {
        if (variedadEntity == null) {
            return null;
        }

        Variedad variedad = new Variedad();

        variedad.setDescripcion(variedadEntity.getDescripcion());
        variedad.setId(variedadEntity.getId());
        variedad.setIdTipoCultivo(tipoCultivoEntityToTipoCultivo(variedadEntity.getIdTipoCultivo()));

        return variedad;
    }

    protected Cultivo cultivoEntityToCultivo(CultivoEntity cultivoEntity) {
        if (cultivoEntity == null) {
            return null;
        }

        Cultivo cultivo = new Cultivo();

        cultivo.setIdCultivo(cultivoEntity.getIdCultivo());
        cultivo.setDescripcion(cultivoEntity.getDescripcion());
        cultivo.setPlantasPorHectarea(cultivoEntity.getPlantasPorHectarea());
        cultivo.setIdDistanciaSiembra(distanciaSiembraEntityToDistanciaSiembra(cultivoEntity.getIdDistanciaSiembra()));
        cultivo.setIdEtapaFenologica(etapaFenologicaEntityToEtapaFenologica(cultivoEntity.getIdEtapaFenologica()));
        cultivo.setIdFinca(fincaEntityToFinca(cultivoEntity.getIdFinca()));
        cultivo.setIdTopografia(topografiaEntityToTopografia(cultivoEntity.getIdTopografia()));
        cultivo.setIdVariedad(variedadEntityToVariedad(cultivoEntity.getIdVariedad()));

        return cultivo;
    }

    protected Densidad densidadEntityToDensidad(DensidadEntity densidadEntity) {
        if (densidadEntity == null) {
            return null;
        }

        Densidad densidad = new Densidad();

        densidad.setIdDensidad(densidadEntity.getIdDensidad());
        densidad.setValor(densidadEntity.getValor());

        return densidad;
    }

    protected ProfundidadMuestra profundidadMuestraEntityToProfundidadMuestra(
            ProfundidadMuestraEntity profundidadMuestraEntity) {
        if (profundidadMuestraEntity == null) {
            return null;
        }

        ProfundidadMuestra profundidadMuestra = new ProfundidadMuestra();

        profundidadMuestra.setIdProfundidadMuestra(profundidadMuestraEntity.getIdProfundidadMuestra());
        profundidadMuestra.setProfundidad(profundidadMuestraEntity.getProfundidad());

        return profundidadMuestra;
    }

    protected Collection<Recomendacion> recomendacionEntityCollectionToRecomendacionCollection(
            Collection<RecomendacionEntity> collection) {
        if (collection == null) {
            return null;
        }

        Collection<Recomendacion> collection1 = new ArrayList<Recomendacion>(collection.size());
        for (RecomendacionEntity recomendacionEntity : collection) {
            collection1.add(recomendacionEntityToRecomendacion(recomendacionEntity));
        }

        return collection1;
    }

    protected Enmienda enmiendaEntityToEnmienda(EnmiendaEntity enmiendaEntity) {
        if (enmiendaEntity == null) {
            return null;
        }

        Enmienda enmienda = new Enmienda();

        enmienda.setDescripcion(enmiendaEntity.getDescripcion());
        enmienda.setId(enmiendaEntity.getId());
        enmienda.setRecomendacionCollection(
                recomendacionEntityCollectionToRecomendacionCollection(enmiendaEntity.getRecomendacionCollection()));

        return enmienda;
    }

    protected AbonoOrganico abonoOrganicoEntityToAbonoOrganico(AbonoOrganicoEntity abonoOrganicoEntity) {
        if (abonoOrganicoEntity == null) {
            return null;
        }

        AbonoOrganico abonoOrganico = new AbonoOrganico();

        abonoOrganico.setDescripcion(abonoOrganicoEntity.getDescripcion());
        abonoOrganico.setId(abonoOrganicoEntity.getId());

        return abonoOrganico;
    }

    protected AbonoOrganicoRecomendacion abonoOrganicoRecomendacionEntityToAbonoOrganicoRecomendacion(
            AbonoOrganicoRecomendacionEntity abonoOrganicoRecomendacionEntity) {
        if (abonoOrganicoRecomendacionEntity == null) {
            return null;
        }

        AbonoOrganicoRecomendacion abonoOrganicoRecomendacion = new AbonoOrganicoRecomendacion();

        abonoOrganicoRecomendacion.setCantidad(abonoOrganicoRecomendacionEntity.getCantidad());
        abonoOrganicoRecomendacion.setId(abonoOrganicoRecomendacionEntity.getId());
        abonoOrganicoRecomendacion.setIdAbonoOrganico(
                abonoOrganicoEntityToAbonoOrganico(abonoOrganicoRecomendacionEntity.getIdAbonoOrganico()));
        abonoOrganicoRecomendacion.setIdRecomendacion(
                recomendacionEntityToRecomendacion(abonoOrganicoRecomendacionEntity.getIdRecomendacion()));

        return abonoOrganicoRecomendacion;
    }

    protected Collection<AbonoOrganicoRecomendacion> abonoOrganicoRecomendacionEntityCollectionToAbonoOrganicoRecomendacionCollection(
            Collection<AbonoOrganicoRecomendacionEntity> collection) {
        if (collection == null) {
            return null;
        }

        Collection<AbonoOrganicoRecomendacion> collection1 = new ArrayList<AbonoOrganicoRecomendacion>(
                collection.size());
        for (AbonoOrganicoRecomendacionEntity abonoOrganicoRecomendacionEntity : collection) {
            collection1.add(
                    abonoOrganicoRecomendacionEntityToAbonoOrganicoRecomendacion(abonoOrganicoRecomendacionEntity));
        }

        return collection1;
    }

    protected AnalisisElemento analisisElementosEntityToAnalisisElemento(
            AnalisisElementosEntity analisisElementosEntity) {
        if (analisisElementosEntity == null) {
            return null;
        }

        AnalisisElemento analisisElemento = new AnalisisElemento();

        analisisElemento.setId(analisisElementosEntity.getId());
        analisisElemento.setValor(analisisElementosEntity.getValor());
        analisisElemento.setIdAnalisisSuelo(toDomain(analisisElementosEntity.getIdAnalisisSuelo()));
        analisisElemento.setIdElemento(elementoEntityToElemento(analisisElementosEntity.getIdElemento()));

        return analisisElemento;
    }

    protected Collection<AnalisisElemento> analisisElementosEntityCollectionToAnalisisElementoCollection(
            Collection<AnalisisElementosEntity> collection) {
        if (collection == null) {
            return null;
        }

        Collection<AnalisisElemento> collection1 = new ArrayList<AnalisisElemento>(collection.size());
        for (AnalisisElementosEntity analisisElementosEntity : collection) {
            collection1.add(analisisElementosEntityToAnalisisElemento(analisisElementosEntity));
        }

        return collection1;
    }

    protected Collection<FuenteRecomendacion> fuenteRecomendacionEntityCollectionToFuenteRecomendacionCollection(
            Collection<FuenteRecomendacionEntity> collection) {
        if (collection == null) {
            return null;
        }

        Collection<FuenteRecomendacion> collection1 = new ArrayList<FuenteRecomendacion>(collection.size());
        for (FuenteRecomendacionEntity fuenteRecomendacionEntity : collection) {
            collection1.add(fuenteRecomendacionEntityToFuenteRecomendacion(fuenteRecomendacionEntity));
        }

        return collection1;
    }

    protected Elemento elementoEntityToElemento(ElementoEntity elementoEntity) {
        if (elementoEntity == null) {
            return null;
        }

        Elemento elemento = new Elemento();

        elemento.setAnalisisElementoCollection(analisisElementosEntityCollectionToAnalisisElementoCollection(
                elementoEntity.analisisElementoCollection()));
        elemento.setFuenteRecomendacionCollection(fuenteRecomendacionEntityCollectionToFuenteRecomendacionCollection(
                elementoEntity.getFuenteRecomendacionCollection()));
        elemento.setId(elementoEntity.getId());
        elemento.setNombre(elementoEntity.getNombre());
        elemento.setUnidad(elementoEntity.getUnidad());

        return elemento;
    }

    protected Fuente fuenteEntityToFuente(FuenteEntity fuenteEntity) {
        if (fuenteEntity == null) {
            return null;
        }

        Fuente fuente = new Fuente();

        fuente.setDescripcion(fuenteEntity.getDescripcion());
        fuente.setFuenteRecomendacionCollection(fuenteRecomendacionEntityCollectionToFuenteRecomendacionCollection(
                fuenteEntity.getFuenteRecomendacionCollection()));
        fuente.setId(fuenteEntity.getId());

        return fuente;
    }

    protected FuenteRecomendacion fuenteRecomendacionEntityToFuenteRecomendacion(
            FuenteRecomendacionEntity fuenteRecomendacionEntity) {
        if (fuenteRecomendacionEntity == null) {
            return null;
        }

        FuenteRecomendacion fuenteRecomendacion = new FuenteRecomendacion();

        fuenteRecomendacion.setCantidad(fuenteRecomendacionEntity.getCantidad());
        fuenteRecomendacion.setId(fuenteRecomendacionEntity.getId());
        fuenteRecomendacion.setIdElemento(elementoEntityToElemento(fuenteRecomendacionEntity.getIdElemento()));
        fuenteRecomendacion.setIdFuente(fuenteEntityToFuente(fuenteRecomendacionEntity.getIdFuente()));
        fuenteRecomendacion
                .setIdRecomendacion(recomendacionEntityToRecomendacion(fuenteRecomendacionEntity.getIdRecomendacion()));

        return fuenteRecomendacion;
    }

    protected Recomendacion recomendacionEntityToRecomendacion(RecomendacionEntity recomendacionEntity) {
        if (recomendacionEntity == null) {
            return null;
        }

        Recomendacion recomendacion = new Recomendacion();

        recomendacion.setId(recomendacionEntity.getId());
        recomendacion.setCantidadEnmienda(recomendacionEntity.getCantidadEnmienda());
        recomendacion.setPreparacionSuelo(recomendacionEntity.getPreparacionSuelo());
        recomendacion.setIdAnalisisSuelo(toDomain(recomendacionEntity.getIdAnalisisSuelo()));
        recomendacion.setIdEnmienda(enmiendaEntityToEnmienda(recomendacionEntity.getIdEnmienda()));
        recomendacion.setAbonoOrganicoRecomendacionCollection(
                abonoOrganicoRecomendacionEntityCollectionToAbonoOrganicoRecomendacionCollection(
                        recomendacionEntity.abonoOrganicoRecomendacionCollection()));
        recomendacion
                .setFuenteRecomendacionCollection(fuenteRecomendacionEntityCollectionToFuenteRecomendacionCollection(
                        recomendacionEntity.getFuenteRecomendacionCollection()));

        return recomendacion;
    }

    protected ClaseTexturalEntity claseTexturalToClaseTexturalEntity(ClaseTextural claseTextural) {
        if (claseTextural == null) {
            return null;
        }

        ClaseTexturalEntity claseTexturalEntity = new ClaseTexturalEntity();

        claseTexturalEntity.setIdClaseTextural(claseTextural.getIdClaseTextural());
        claseTexturalEntity.setNombre(claseTextural.getNombre());
        claseTexturalEntity.setSigla(claseTextural.getSigla());

        return claseTexturalEntity;
    }

    protected DistanciaSiembraEntity distanciaSiembraToDistanciaSiembraEntity(DistanciaSiembra distanciaSiembra) {
        if (distanciaSiembra == null) {
            return null;
        }

        DistanciaSiembraEntity distanciaSiembraEntity = new DistanciaSiembraEntity();

        distanciaSiembraEntity.setDescripcion(distanciaSiembra.getDescripcion());
        distanciaSiembraEntity.setId(distanciaSiembra.getId());

        return distanciaSiembraEntity;
    }

    protected EtapaFenologicaEntity etapaFenologicaToEtapaFenologicaEntity(EtapaFenologica etapaFenologica) {
        if (etapaFenologica == null) {
            return null;
        }

        EtapaFenologicaEntity etapaFenologicaEntity = new EtapaFenologicaEntity();

        etapaFenologicaEntity.setDescripcion(etapaFenologica.getDescripcion());
        etapaFenologicaEntity.setId(etapaFenologica.getId());

        return etapaFenologicaEntity;
    }

    protected TipoIdentificacionEntity tipoIdentificacionToTipoIdentificacionEntity(
            TipoIdentificacion tipoIdentificacion) {
        if (tipoIdentificacion == null) {
            return null;
        }

        TipoIdentificacionEntity tipoIdentificacionEntity = new TipoIdentificacionEntity();

        tipoIdentificacionEntity.setIdTipo(tipoIdentificacion.getIdTipo());
        tipoIdentificacionEntity.setNombre(tipoIdentificacion.getNombre());

        return tipoIdentificacionEntity;
    }

    protected AgricultorEntity agricultorToAgricultorEntity(Agricultor agricultor) {
        if (agricultor == null) {
            return null;
        }

        AgricultorEntity agricultorEntity = new AgricultorEntity();

        agricultorEntity.setApellidos(agricultor.getApellidos());
        agricultorEntity.setConfirmationToken(agricultor.getConfirmationToken());
        agricultorEntity.setEmail(agricultor.getEmail());
        agricultorEntity.setEstado(agricultor.getEstado());
        agricultorEntity.setFechaNacimiento(agricultor.getFechaNacimiento());
        agricultorEntity.setIdTipoIdentificacion(
                tipoIdentificacionToTipoIdentificacionEntity(agricultor.getIdTipoIdentificacion()));
        agricultorEntity.setIdentificacion(agricultor.getIdentificacion());
        agricultorEntity.setNombres(agricultor.getNombres());
        agricultorEntity.setPassword(agricultor.getPassword());
        agricultorEntity.setTelefono(agricultor.getTelefono());

        return agricultorEntity;
    }

    protected DepartamentoEntity departamentoToDepartamentoEntity(Departamento departamento) {
        if (departamento == null) {
            return null;
        }

        DepartamentoEntity departamentoEntity = new DepartamentoEntity();

        departamentoEntity.setIdDepto(departamento.getIdDepto());
        departamentoEntity.setNombre(departamento.getNombre());

        return departamentoEntity;
    }

    protected MunicipioEntity municipioToMunicipioEntity(Municipio municipio) {
        if (municipio == null) {
            return null;
        }

        MunicipioEntity municipioEntity = new MunicipioEntity();

        municipioEntity.setIdDepartamento(departamentoToDepartamentoEntity(municipio.getIdDepartamento()));
        municipioEntity.setIdMunicipio(municipio.getIdMunicipio());

        return municipioEntity;
    }

    protected CorregimientoEntity corregimientoToCorregimientoEntity(Corregimiento corregimiento) {
        if (corregimiento == null) {
            return null;
        }

        CorregimientoEntity corregimientoEntity = new CorregimientoEntity();

        corregimientoEntity.setIdCorregimiento(corregimiento.getIdCorregimiento());
        corregimientoEntity.setIdMunicipio(municipioToMunicipioEntity(corregimiento.getIdMunicipio()));
        corregimientoEntity.setNombre(corregimiento.getNombre());

        return corregimientoEntity;
    }

    protected VeredaEntity veredaToVeredaEntity(Vereda vereda) {
        if (vereda == null) {
            return null;
        }

        VeredaEntity veredaEntity = new VeredaEntity();

        veredaEntity.setIdCorregimiento(corregimientoToCorregimientoEntity(vereda.getIdCorregimiento()));
        veredaEntity.setIdVereda(vereda.getIdVereda());
        veredaEntity.setNombre(vereda.getNombre());

        return veredaEntity;
    }

    protected FincaEntity fincaToFincaEntity(Finca finca) {
        if (finca == null) {
            return null;
        }

        FincaEntity fincaEntity = new FincaEntity();

        fincaEntity.setAreaEnUso(finca.getAreaEnUso());
        fincaEntity.setAreaTotal(finca.getAreaTotal());
        fincaEntity.setGeolocalizacion(finca.getGeolocalizacion());
        fincaEntity.setIdAgricultor(agricultorToAgricultorEntity(finca.getIdAgricultor()));
        fincaEntity.setIdCorregimiento(corregimientoToCorregimientoEntity(finca.getIdCorregimiento()));
        fincaEntity.setIdFinca(finca.getIdFinca());
        fincaEntity.setIdMunicipio(municipioToMunicipioEntity(finca.getIdMunicipio()));
        fincaEntity.setIdVereda(veredaToVeredaEntity(finca.getIdVereda()));
        fincaEntity.setNombre(finca.getNombre());

        return fincaEntity;
    }

    protected TopografiaEntity topografiaToTopografiaEntity(Topografia topografia) {
        if (topografia == null) {
            return null;
        }

        TopografiaEntity topografiaEntity = new TopografiaEntity();

        topografiaEntity.setDescripcion(topografia.getDescripcion());
        topografiaEntity.setId(topografia.getId());

        return topografiaEntity;
    }

    protected TipoCultivoEntity tipoCultivoToTipoCultivoEntity(TipoCultivo tipoCultivo) {
        if (tipoCultivo == null) {
            return null;
        }

        TipoCultivoEntity tipoCultivoEntity = new TipoCultivoEntity();

        tipoCultivoEntity.setDescripcion(tipoCultivo.getDescripcion());
        tipoCultivoEntity.setId(tipoCultivo.getId());

        return tipoCultivoEntity;
    }

    protected VariedadEntity variedadToVariedadEntity(Variedad variedad) {
        if (variedad == null) {
            return null;
        }

        VariedadEntity variedadEntity = new VariedadEntity();

        variedadEntity.setDescripcion(variedad.getDescripcion());
        variedadEntity.setId(variedad.getId());
        variedadEntity.setIdTipoCultivo(tipoCultivoToTipoCultivoEntity(variedad.getIdTipoCultivo()));

        return variedadEntity;
    }

    protected CultivoEntity cultivoToCultivoEntity(Cultivo cultivo) {
        if (cultivo == null) {
            return null;
        }

        CultivoEntity cultivoEntity = new CultivoEntity();

        cultivoEntity.setDescripcion(cultivo.getDescripcion());
        cultivoEntity.setIdCultivo(cultivo.getIdCultivo());
        cultivoEntity.setIdDistanciaSiembra(distanciaSiembraToDistanciaSiembraEntity(cultivo.getIdDistanciaSiembra()));
        cultivoEntity.setIdEtapaFenologica(etapaFenologicaToEtapaFenologicaEntity(cultivo.getIdEtapaFenologica()));
        cultivoEntity.setIdFinca(fincaToFincaEntity(cultivo.getIdFinca()));
        cultivoEntity.setIdTopografia(topografiaToTopografiaEntity(cultivo.getIdTopografia()));
        cultivoEntity.setIdVariedad(variedadToVariedadEntity(cultivo.getIdVariedad()));
        cultivoEntity.setPlantasPorHectarea(cultivo.getPlantasPorHectarea());

        return cultivoEntity;
    }

    protected DensidadEntity densidadToDensidadEntity(Densidad densidad) {
        if (densidad == null) {
            return null;
        }

        DensidadEntity densidadEntity = new DensidadEntity();

        densidadEntity.setIdDensidad(densidad.getIdDensidad());
        densidadEntity.setValor(densidad.getValor());

        return densidadEntity;
    }

    protected ProfundidadMuestraEntity profundidadMuestraToProfundidadMuestraEntity(
            ProfundidadMuestra profundidadMuestra) {
        if (profundidadMuestra == null) {
            return null;
        }

        ProfundidadMuestraEntity profundidadMuestraEntity = new ProfundidadMuestraEntity();

        profundidadMuestraEntity.setIdProfundidadMuestra(profundidadMuestra.getIdProfundidadMuestra());
        profundidadMuestraEntity.setProfundidad(profundidadMuestra.getProfundidad());

        return profundidadMuestraEntity;
    }

    protected AbonoOrganicoEntity abonoOrganicoToAbonoOrganicoEntity(AbonoOrganico abonoOrganico) {
        if (abonoOrganico == null) {
            return null;
        }

        AbonoOrganicoEntity abonoOrganicoEntity = new AbonoOrganicoEntity();

        abonoOrganicoEntity.setDescripcion(abonoOrganico.getDescripcion());
        abonoOrganicoEntity.setId(abonoOrganico.getId());

        return abonoOrganicoEntity;
    }

    protected AbonoOrganicoRecomendacionEntity abonoOrganicoRecomendacionToAbonoOrganicoRecomendacionEntity(
            AbonoOrganicoRecomendacion abonoOrganicoRecomendacion) {
        if (abonoOrganicoRecomendacion == null) {
            return null;
        }

        AbonoOrganicoRecomendacionEntity abonoOrganicoRecomendacionEntity = new AbonoOrganicoRecomendacionEntity();

        abonoOrganicoRecomendacionEntity.setCantidad(abonoOrganicoRecomendacion.getCantidad());
        abonoOrganicoRecomendacionEntity.setId(abonoOrganicoRecomendacion.getId());
        abonoOrganicoRecomendacionEntity.setIdAbonoOrganico(
                abonoOrganicoToAbonoOrganicoEntity(abonoOrganicoRecomendacion.getIdAbonoOrganico()));
        abonoOrganicoRecomendacionEntity.setIdRecomendacion(
                recomendacionToRecomendacionEntity(abonoOrganicoRecomendacion.getIdRecomendacion()));

        return abonoOrganicoRecomendacionEntity;
    }

    protected Collection<AbonoOrganicoRecomendacionEntity> abonoOrganicoRecomendacionCollectionToAbonoOrganicoRecomendacionEntityCollection(
            Collection<AbonoOrganicoRecomendacion> collection) {
        if (collection == null) {
            return null;
        }

        Collection<AbonoOrganicoRecomendacionEntity> collection1 = new ArrayList<AbonoOrganicoRecomendacionEntity>(
                collection.size());
        for (AbonoOrganicoRecomendacion abonoOrganicoRecomendacion : collection) {
            collection1.add(abonoOrganicoRecomendacionToAbonoOrganicoRecomendacionEntity(abonoOrganicoRecomendacion));
        }

        return collection1;
    }

    protected AnalisisElementosEntity analisisElementoToAnalisisElementosEntity(AnalisisElemento analisisElemento) {
        if (analisisElemento == null) {
            return null;
        }

        AnalisisElementosEntity analisisElementosEntity = new AnalisisElementosEntity();

        analisisElementosEntity.setId(analisisElemento.getId());
        analisisElementosEntity.setIdAnalisisSuelo(toEntity(analisisElemento.getIdAnalisisSuelo()));
        analisisElementosEntity.setIdElemento(elementoToElementoEntity(analisisElemento.getIdElemento()));
        analisisElementosEntity.setValor(analisisElemento.getValor());

        return analisisElementosEntity;
    }

    protected Collection<AnalisisElementosEntity> analisisElementoCollectionToAnalisisElementosEntityCollection(
            Collection<AnalisisElemento> collection) {
        if (collection == null) {
            return null;
        }

        Collection<AnalisisElementosEntity> collection1 = new ArrayList<AnalisisElementosEntity>(collection.size());
        for (AnalisisElemento analisisElemento : collection) {
            collection1.add(analisisElementoToAnalisisElementosEntity(analisisElemento));
        }

        return collection1;
    }

    protected Collection<FuenteRecomendacionEntity> fuenteRecomendacionCollectionToFuenteRecomendacionEntityCollection(
            Collection<FuenteRecomendacion> collection) {
        if (collection == null) {
            return null;
        }

        Collection<FuenteRecomendacionEntity> collection1 = new ArrayList<FuenteRecomendacionEntity>(collection.size());
        for (FuenteRecomendacion fuenteRecomendacion : collection) {
            collection1.add(fuenteRecomendacionToFuenteRecomendacionEntity(fuenteRecomendacion));
        }

        return collection1;
    }

    protected ElementoEntity elementoToElementoEntity(Elemento elemento) {
        if (elemento == null) {
            return null;
        }

        ElementoEntity elementoEntity = new ElementoEntity();

        elementoEntity.setAnalisisElementoCollection(analisisElementoCollectionToAnalisisElementosEntityCollection(
                elemento.analisisElementoCollection()));
        elementoEntity
                .setFuenteRecomendacionCollection(fuenteRecomendacionCollectionToFuenteRecomendacionEntityCollection(
                        elemento.fuenteRecomendacionCollection()));
        elementoEntity.setId(elemento.getId());
        elementoEntity.setNombre(elemento.getNombre());
        elementoEntity.setUnidad(elemento.getUnidad());

        return elementoEntity;
    }

    protected FuenteEntity fuenteToFuenteEntity(Fuente fuente) {
        if (fuente == null) {
            return null;
        }

        FuenteEntity fuenteEntity = new FuenteEntity();

        fuenteEntity.setDescripcion(fuente.getDescripcion());
        fuenteEntity
                .setFuenteRecomendacionCollection(fuenteRecomendacionCollectionToFuenteRecomendacionEntityCollection(
                        fuente.fuenteRecomendacionCollection()));
        fuenteEntity.setId(fuente.getId());

        return fuenteEntity;
    }

    protected FuenteRecomendacionEntity fuenteRecomendacionToFuenteRecomendacionEntity(
            FuenteRecomendacion fuenteRecomendacion) {
        if (fuenteRecomendacion == null) {
            return null;
        }

        FuenteRecomendacionEntity fuenteRecomendacionEntity = new FuenteRecomendacionEntity();

        fuenteRecomendacionEntity.setCantidad(fuenteRecomendacion.getCantidad());
        fuenteRecomendacionEntity.setId(fuenteRecomendacion.getId());
        fuenteRecomendacionEntity.setIdElemento(elementoToElementoEntity(fuenteRecomendacion.getIdElemento()));
        fuenteRecomendacionEntity.setIdFuente(fuenteToFuenteEntity(fuenteRecomendacion.getIdFuente()));
        fuenteRecomendacionEntity
                .setIdRecomendacion(recomendacionToRecomendacionEntity(fuenteRecomendacion.getIdRecomendacion()));

        return fuenteRecomendacionEntity;
    }

    protected Collection<RecomendacionEntity> recomendacionCollectionToRecomendacionEntityCollection(
            Collection<Recomendacion> collection) {
        if (collection == null) {
            return null;
        }

        Collection<RecomendacionEntity> collection1 = new ArrayList<RecomendacionEntity>(collection.size());
        for (Recomendacion recomendacion : collection) {
            collection1.add(recomendacionToRecomendacionEntity(recomendacion));
        }

        return collection1;
    }

    protected EnmiendaEntity enmiendaToEnmiendaEntity(Enmienda enmienda) {
        if (enmienda == null) {
            return null;
        }

        EnmiendaEntity enmiendaEntity = new EnmiendaEntity();

        enmiendaEntity.setDescripcion(enmienda.getDescripcion());
        enmiendaEntity.setId(enmienda.getId());
        enmiendaEntity.setRecomendacionCollection(
                recomendacionCollectionToRecomendacionEntityCollection(enmienda.recomendacionCollection()));

        return enmiendaEntity;
    }

    protected RecomendacionEntity recomendacionToRecomendacionEntity(Recomendacion recomendacion) {
        if (recomendacion == null) {
            return null;
        }

        RecomendacionEntity recomendacionEntity = new RecomendacionEntity();

        recomendacionEntity.setAbonoOrganicoRecomendacionCollection(
                abonoOrganicoRecomendacionCollectionToAbonoOrganicoRecomendacionEntityCollection(
                        recomendacion.abonoOrganicoRecomendacionCollection()));
        recomendacionEntity.setCantidadEnmienda(recomendacion.getCantidadEnmienda());
        recomendacionEntity
                .setFuenteRecomendacionCollection(fuenteRecomendacionCollectionToFuenteRecomendacionEntityCollection(
                        recomendacion.fuenteRecomendacionCollection()));
        recomendacionEntity.setId(recomendacion.getId());
        recomendacionEntity.setIdAnalisisSuelo(toEntity(recomendacion.getIdAnalisisSuelo()));
        recomendacionEntity.setIdEnmienda(enmiendaToEnmiendaEntity(recomendacion.getIdEnmienda()));
        recomendacionEntity.setPreparacionSuelo(recomendacion.getPreparacionSuelo());

        return recomendacionEntity;
    }
}
