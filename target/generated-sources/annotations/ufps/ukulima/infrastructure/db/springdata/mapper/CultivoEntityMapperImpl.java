package ufps.ukulima.infrastructure.db.springdata.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.EtapaFenologica.EtapaFenologica;
import ufps.ukulima.domain.model.Agricultor.Agricultor;
import ufps.ukulima.domain.model.Corregimiento.Corregimiento;
import ufps.ukulima.domain.model.Cultivo.Cultivo;
import ufps.ukulima.domain.model.Departamento.Departamento;
import ufps.ukulima.domain.model.DistanciaSiembra.DistanciaSiembra;
import ufps.ukulima.domain.model.Finca.Finca;
import ufps.ukulima.domain.model.Municipio.Municipio;
import ufps.ukulima.domain.model.TipoCultivo.TipoCultivo;
import ufps.ukulima.domain.model.TipoIdentificacion.TipoIdentificacion;
import ufps.ukulima.domain.model.Topografia.Topografia;
import ufps.ukulima.domain.model.Variedad.Variedad;
import ufps.ukulima.domain.model.Vereda.Vereda;
import ufps.ukulima.infrastructure.db.springdata.entity.Agricultor.AgricultorEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Corregimiento.CorregimientoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Cultivo.CultivoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Departamento.DepartamentoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.DistanciaSiembra.DistanciaSiembraEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.EtapaFenologica.EtapaFenologicaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Finca.FincaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Municipio.MunicipioEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.TipoCultivo.TipoCultivoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.TipoIdentificacion.TipoIdentificacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Topografia.TopografiaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Variedad.VariedadEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Vereda.VeredaEntity;

@Generated(value = "org.mapstruct.ap.MappingProcessor", date = "2022-10-15T16:07:28-0500", comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.4.200.v20220802-0458, environment: Java 17.0.4.1 (Eclipse Adoptium)")
@Component
public class CultivoEntityMapperImpl implements CultivoEntityMapper {

    @Override
    public Cultivo toDomain(CultivoEntity CultivoEntity) {
        if (CultivoEntity == null) {
            return null;
        }

        Cultivo cultivo = new Cultivo();

        cultivo.setDescripcion(CultivoEntity.getDescripcion());
        cultivo.setIdCultivo(CultivoEntity.getIdCultivo());
        cultivo.setIdDistanciaSiembra(distanciaSiembraEntityToDistanciaSiembra(CultivoEntity.getIdDistanciaSiembra()));
        cultivo.setIdEtapaFenologica(etapaFenologicaEntityToEtapaFenologica(CultivoEntity.getIdEtapaFenologica()));
        cultivo.setIdFinca(fincaEntityToFinca(CultivoEntity.getIdFinca()));
        cultivo.setIdTopografia(topografiaEntityToTopografia(CultivoEntity.getIdTopografia()));
        cultivo.setIdVariedad(variedadEntityToVariedad(CultivoEntity.getIdVariedad()));
        cultivo.setPlantasPorHectarea(CultivoEntity.getPlantasPorHectarea());

        return cultivo;
    }

    @Override
    public CultivoEntity toEntity(Cultivo Cultivo) {
        if (Cultivo == null) {
            return null;
        }

        CultivoEntity cultivoEntity = new CultivoEntity();

        cultivoEntity.setDescripcion(Cultivo.getDescripcion());
        cultivoEntity.setIdCultivo(Cultivo.getIdCultivo());
        cultivoEntity.setIdDistanciaSiembra(distanciaSiembraToDistanciaSiembraEntity(Cultivo.getIdDistanciaSiembra()));
        cultivoEntity.setIdEtapaFenologica(etapaFenologicaToEtapaFenologicaEntity(Cultivo.getIdEtapaFenologica()));
        cultivoEntity.setIdFinca(fincaToFincaEntity(Cultivo.getIdFinca()));
        cultivoEntity.setIdTopografia(topografiaToTopografiaEntity(Cultivo.getIdTopografia()));
        cultivoEntity.setIdVariedad(variedadToVariedadEntity(Cultivo.getIdVariedad()));
        cultivoEntity.setPlantasPorHectarea(Cultivo.getPlantasPorHectarea());

        return cultivoEntity;
    }

    @Override
    public List<Cultivo> abonosOrganicosRecomendacionToDomain(List<CultivoEntity> abonoOrganicoEntities) {
        if (abonoOrganicoEntities == null) {
            return null;
        }

        List<Cultivo> list = new ArrayList<Cultivo>(abonoOrganicoEntities.size());
        for (CultivoEntity cultivoEntity : abonoOrganicoEntities) {
            list.add(toDomain(cultivoEntity));
        }

        return list;
    }

    protected DistanciaSiembra distanciaSiembraEntityToDistanciaSiembra(DistanciaSiembraEntity distanciaSiembraEntity) {
        if (distanciaSiembraEntity == null) {
            return null;
        }

        DistanciaSiembra distanciaSiembra = new DistanciaSiembra();

        distanciaSiembra.setId(distanciaSiembraEntity.getId());
        distanciaSiembra.setDescripcion(distanciaSiembraEntity.getDescripcion());

        return distanciaSiembra;
    }

    protected EtapaFenologica etapaFenologicaEntityToEtapaFenologica(EtapaFenologicaEntity etapaFenologicaEntity) {
        if (etapaFenologicaEntity == null) {
            return null;
        }

        EtapaFenologica etapaFenologica = new EtapaFenologica();

        etapaFenologica.setId(etapaFenologicaEntity.getId());
        etapaFenologica.setDescripcion(etapaFenologicaEntity.getDescripcion());

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

        finca.setIdFinca(fincaEntity.getIdFinca());
        finca.setNombre(fincaEntity.getNombre());
        finca.setAreaTotal(fincaEntity.getAreaTotal());
        finca.setAreaEnUso(fincaEntity.getAreaEnUso());
        finca.setGeolocalizacion(fincaEntity.getGeolocalizacion());
        finca.setIdAgricultor(agricultorEntityToAgricultor(fincaEntity.getIdAgricultor()));
        finca.setIdCorregimiento(corregimientoEntityToCorregimiento(fincaEntity.getIdCorregimiento()));
        finca.setIdMunicipio(municipioEntityToMunicipio(fincaEntity.getIdMunicipio()));
        finca.setIdVereda(veredaEntityToVereda(fincaEntity.getIdVereda()));

        return finca;
    }

    protected Topografia topografiaEntityToTopografia(TopografiaEntity topografiaEntity) {
        if (topografiaEntity == null) {
            return null;
        }

        Topografia topografia = new Topografia();

        topografia.setId(topografiaEntity.getId());
        topografia.setDescripcion(topografiaEntity.getDescripcion());

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

        variedad.setId(variedadEntity.getId());
        variedad.setDescripcion(variedadEntity.getDescripcion());
        variedad.setIdTipoCultivo(tipoCultivoEntityToTipoCultivo(variedadEntity.getIdTipoCultivo()));

        return variedad;
    }

    protected Collection<CultivoEntity> cultivoCollectionToCultivoEntityCollection(Collection<Cultivo> collection) {
        if (collection == null) {
            return null;
        }

        Collection<CultivoEntity> collection1 = new ArrayList<CultivoEntity>(collection.size());
        for (Cultivo cultivo : collection) {
            collection1.add(toEntity(cultivo));
        }

        return collection1;
    }

    protected DistanciaSiembraEntity distanciaSiembraToDistanciaSiembraEntity(DistanciaSiembra distanciaSiembra) {
        if (distanciaSiembra == null) {
            return null;
        }

        DistanciaSiembraEntity distanciaSiembraEntity = new DistanciaSiembraEntity();

        distanciaSiembraEntity.setCultivoCollection(
                cultivoCollectionToCultivoEntityCollection(distanciaSiembra.cultivoCollection()));
        distanciaSiembraEntity.setDescripcion(distanciaSiembra.getDescripcion());
        distanciaSiembraEntity.setId(distanciaSiembra.getId());

        return distanciaSiembraEntity;
    }

    protected EtapaFenologicaEntity etapaFenologicaToEtapaFenologicaEntity(EtapaFenologica etapaFenologica) {
        if (etapaFenologica == null) {
            return null;
        }

        EtapaFenologicaEntity etapaFenologicaEntity = new EtapaFenologicaEntity();

        etapaFenologicaEntity.setCultivoCollection(
                cultivoCollectionToCultivoEntityCollection(etapaFenologica.cultivoCollection()));
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
        fincaEntity.setCultivoCollection(cultivoCollectionToCultivoEntityCollection(finca.cultivoCollection()));
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

        topografiaEntity
                .setCultivoCollection(cultivoCollectionToCultivoEntityCollection(topografia.cultivoCollection()));
        topografiaEntity.setDescripcion(topografia.getDescripcion());
        topografiaEntity.setId(topografia.getId());

        return topografiaEntity;
    }

    protected Collection<VariedadEntity> variedadCollectionToVariedadEntityCollection(Collection<Variedad> collection) {
        if (collection == null) {
            return null;
        }

        Collection<VariedadEntity> collection1 = new ArrayList<VariedadEntity>(collection.size());
        for (Variedad variedad : collection) {
            collection1.add(variedadToVariedadEntity(variedad));
        }

        return collection1;
    }

    protected TipoCultivoEntity tipoCultivoToTipoCultivoEntity(TipoCultivo tipoCultivo) {
        if (tipoCultivo == null) {
            return null;
        }

        TipoCultivoEntity tipoCultivoEntity = new TipoCultivoEntity();

        tipoCultivoEntity.setDescripcion(tipoCultivo.getDescripcion());
        tipoCultivoEntity.setId(tipoCultivo.getId());
        tipoCultivoEntity.setVariedadCollection(
                variedadCollectionToVariedadEntityCollection(tipoCultivo.variedadCollection()));

        return tipoCultivoEntity;
    }

    protected VariedadEntity variedadToVariedadEntity(Variedad variedad) {
        if (variedad == null) {
            return null;
        }

        VariedadEntity variedadEntity = new VariedadEntity();

        variedadEntity
                .setCultivoCollection(cultivoCollectionToCultivoEntityCollection(variedad.cultivoCollection())) ;
        variedadEntity.setDescripcion(variedad.getDescripcion());
        variedadEntity.setId(variedad.getId());
        variedadEntity.setIdTipoCultivo(tipoCultivoToTipoCultivoEntity(variedad.getIdTipoCultivo()));

        return variedadEntity;
    }
}
