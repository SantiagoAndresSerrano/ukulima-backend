package ufps.ukulima.infrastructure.entry_points.rest.AnalisisSuelo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.client.RestTemplate;
import ufps.ukulima.config.Spring.security.controller.AuthController;
import ufps.ukulima.config.Spring.security.dto.Mensaje;
import ufps.ukulima.config.Spring.security.dto.Response;
import ufps.ukulima.domain.model.AbonoOrganico.AbonoOrganico;
import ufps.ukulima.domain.model.AbonoOrganico.gateway.AbonoOrganicoService;
import ufps.ukulima.domain.model.AbonoOrganicoRecomendacion.AbonoOrganicoRecomendacion;
import ufps.ukulima.domain.model.AbonoOrganicoRecomendacion.gateway.AbonoOrganicoRecomendacionService;
import ufps.ukulima.domain.model.AbonoQuimicoRecomendacion.AbonoQuimicoRecomendacion;
import ufps.ukulima.domain.model.AbonoQuimicoRecomendacion.gateway.AbonoQuimicoRecomendacionServicio;
import ufps.ukulima.domain.model.AluminioIntercambiable.AluminioIntercambiable;
import ufps.ukulima.domain.model.AluminioIntercambiable.gateway.AluminioIntercambiableService;
import ufps.ukulima.domain.model.AnalisisElemento.AnalisisElemento;
import ufps.ukulima.domain.model.AnalisisElemento.gateway.AnalisisElementoService;
import ufps.ukulima.domain.model.AnalisisElementoInterpretacion.gateway.AnalisisElementoInterpretacionService;
import ufps.ukulima.domain.model.AnalisisSuelo.AnalisisSuelo;
import ufps.ukulima.domain.model.AnalisisSuelo.gateway.AnalisisSueloService;
import ufps.ukulima.domain.model.AnalisisSueloRelacionBase.AnalisisSueloRelacionBase;
import ufps.ukulima.domain.model.AnalisisSueloRelacionBase.gateway.AnalisisSueloRelacionBaseService;
import ufps.ukulima.domain.model.ClaseTextural.ClaseTextural;
import ufps.ukulima.domain.model.ClaseTextural.gateway.ClaseTexturalService;
import ufps.ukulima.domain.model.ConductividadElectrica.ConductividadElectrica;
import ufps.ukulima.domain.model.ConductividadElectrica.gateway.ConductividadElectricaService;
import ufps.ukulima.domain.model.Cultivo.Cultivo;
import ufps.ukulima.domain.model.Cultivo.gateway.CultivoService;
import ufps.ukulima.domain.model.Densidad.Densidad;
import ufps.ukulima.domain.model.Densidad.gateway.DensidadService;
import ufps.ukulima.domain.model.Elemento.Elemento;
import ufps.ukulima.domain.model.Elemento.gateway.ElementoService;
import ufps.ukulima.domain.model.ElementoVariedad.gateway.ElementoVariedadService;
import ufps.ukulima.domain.model.Enmienda.Enmienda;
import ufps.ukulima.domain.model.Enmienda.gateway.EnmiendaService;
import ufps.ukulima.domain.model.EnmiendaRecomendacion.EnmiendaRecomendacion;
import ufps.ukulima.domain.model.EnmiendaRecomendacion.gateway.EnmiendaRecomendacionService;
import ufps.ukulima.domain.model.ErrorMapping.ErrorMapping;
import ufps.ukulima.domain.model.GrupoTextural.GrupoTextural;
import ufps.ukulima.domain.model.GrupoTextural.gateway.GrupoTexturalService;
import ufps.ukulima.domain.model.IntercambioCationico.IntercambioCationico;
import ufps.ukulima.domain.model.IntercambioCationico.gateway.IntercambioCationicoService;
import ufps.ukulima.domain.model.Lote.Lote;
import ufps.ukulima.domain.model.Lote.gateway.LoteServicio;
import ufps.ukulima.domain.model.MateriaOrganica.MateriaOrganica;
import ufps.ukulima.domain.model.MateriaOrganica.gateway.MateriaOrganicaService;
import ufps.ukulima.domain.model.PhSuelo.PhSuelo;
import ufps.ukulima.domain.model.PhSuelo.gateway.PhSueloService;
import ufps.ukulima.domain.model.ProfundidadMuestra.ProfundidadMuestra;
import ufps.ukulima.domain.model.ProfundidadMuestra.gateway.ProfundidaMuestraService;
import org.springframework.http.HttpStatus;

import javax.validation.Valid;
import javax.validation.constraints.Null;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import ufps.ukulima.domain.model.Recomendacion.Recomendacion;
import ufps.ukulima.domain.model.Recomendacion.gateway.RecomendacionService;
import ufps.ukulima.domain.model.RelacionBase.RelacionBase;
import ufps.ukulima.domain.model.RelacionBase.gateway.RelacionBaseServicio;
import ufps.ukulima.domain.model.Suelo.Suelo;
import ufps.ukulima.domain.model.Suelo.gateway.SueloService;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisElemento.AnalisisElementosEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisSuelo.AnalisisSueloEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisSueloRelacionBases.AnalisisSueloRelacionBaseEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Recomendacion.RecomendacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.RelacionBase.RelacionBaseEntity;
import ufps.ukulima.infrastructure.mapper.AnalisisSueloEntityMapper;
import ufps.ukulima.infrastructure.mapper.RecomendacionEntityMapper;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/analisissuelo", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class AnalisisSueloController {
    private static Logger log = LoggerFactory.getLogger(AuthController.class);

    @Autowired
    AnalisisSueloService analisisSueloService;

    @Autowired
    AbonoOrganicoService abonoOrganicoService;
    @Autowired
    AluminioIntercambiableService aluminioIntercambiableService;
    @Autowired
    IntercambioCationicoService intercambioCationicoService;
    @Autowired
    ConductividadElectricaService conductividadElectricaService;

    @Autowired
    AbonoOrganicoRecomendacionService abonoOrganicoRecomendacionService;

    @Autowired
    ClaseTexturalService claseTexturalService;

    @Autowired
    MateriaOrganicaService materiaOrganicaService;

    @Autowired
    RecomendacionEntityMapper recomendacionEntityMapper;

    @Autowired
    CultivoService cultivoService;

    @Autowired
    DensidadService densidadService;
    @Autowired
    PhSueloService phSueloService;

    @Autowired
    EnmiendaRecomendacionService enmiendaRecomendacionService;
    @Autowired
    ProfundidaMuestraService muestraService;

    @Autowired
    GrupoTexturalService grupoTexturalService;

    @Autowired
    RelacionBaseServicio relacionBasesService;

    @Autowired
    ElementoService elementoService;

    @Autowired
    EnmiendaService enmiendaService;

    @Autowired
    AnalisisSueloEntityMapper analisisSueloEntityMapper;

    @Autowired
    RecomendacionService recomendacionService;

    @Autowired
    AnalisisElementoInterpretacionService analisisElementoInterpretacionService;

    @Autowired
    AnalisisElementoService analisisElementoService;

    @Autowired
    AnalisisSueloRelacionBaseService analisisSueloRelacionBaseService;

    @Autowired
    SueloService sueloService;

    @Autowired
    AbonoQuimicoRecomendacionServicio abonoQuimicoRecomendacionServicio;

    @Autowired
    ElementoVariedadService elementoVariedadService;

    @Autowired
    LoteServicio loteServicio;

    @GetMapping
    public ResponseEntity<?> getAllAnalisisSuelo() {
        return ResponseEntity.ok(analisisSueloService.getAllAnalisisSuelo());
    }

    @PostMapping
    public ResponseEntity<?> saveAnalisisSuelo(@Valid @RequestBody AnalisisSuelo analisisSuelo, BindingResult br) throws JsonProcessingException {

        if (br.hasErrors())
            return new ResponseEntity<ErrorMapping>(new ErrorMapping(br.getFieldErrors()), HttpStatus.BAD_REQUEST);

        ProfundidadMuestra muestra =
                muestraService.findProfundidadMuestraById(analisisSuelo.getIdProfundidad().getIdProfundidadMuestra());
        if (muestra == null)
            return new ResponseEntity<>(new Mensaje("profundidad muestra no encontrada" +
                    "suelo"), HttpStatus.BAD_REQUEST);

        RestTemplate restTemplate = new RestTemplate();
        ClaseTextural claseTextural = claseTexturalService
                .getClaseTexturalPorRangos(analisisSuelo.getPorcentArena()
                        , analisisSuelo.getPorcentLimos(), analisisSuelo.getPorcentArcilla());


        Suelo suelo = sueloService.getSueloById(analisisSuelo.getIdSuelo().getId());
        PhSuelo phSuelo = phSueloService.getPhSueloByValor(analisisSuelo.getPhSuelo());
        AluminioIntercambiable aluminioIntercambiable =
                aluminioIntercambiableService.getAluminioIntercambiableByValor(analisisSuelo.getAluminioIntercambiable());
        ConductividadElectrica conductividadElectrica =
                conductividadElectricaService.getConductividadElectricaByValor(analisisSuelo.getConductividadElectrica());
        IntercambioCationico intercambioCationico =
                intercambioCationicoService.getIntercambioCationicoByValor(analisisSuelo.getIntercambioCationico());

        //Determinacion de materiales
        String MUY_FINOS_INTERPRETACION = "MUY FINOS";
        String FINOS_INTERPRETACION = "FINOS";
        String MODERADAMENTE_FINOS_INTERPRETACION = "MODERADAMENTE FINOS";
        String MEDIOS_INTERPRETACION = "MEDIOS";
        String MODERADAMENTE_GRUESOS_INTERPRETACION = "MODERADAMENTE GRUESOS";
        String GRUESOS_INTERPRETACION = "GRUESOS";

        String interpretacion = "";

        if (analisisSuelo.getPorcentArcilla() > 60)
            interpretacion = MUY_FINOS_INTERPRETACION;
        if (claseTextural.getNombre().equals("ARENOSO") || claseTextural.getNombre().equals("ARENOSO FRANCO"))
            interpretacion = GRUESOS_INTERPRETACION;
        if (claseTextural.getNombre().equals("ARCILLOSO") || (claseTextural.getNombre().equals("ARCILLO ARENOSO")) || (claseTextural.getNombre().equals("ARCILLO LIMOSO")))
            interpretacion = FINOS_INTERPRETACION;
        if (claseTextural.getNombre().equals("FRANCO ARCILLOSO")
                || (claseTextural.getNombre().equals("FRANCO ARCILLO ARENOSO"))
                || (claseTextural.getNombre().equals("FRANCO ARCILLO LIMOSO"))
                || (claseTextural.getNombre().equals("FRANCO"))
                || (claseTextural.getNombre().equals("FRANCO LIMOSO")))
            interpretacion = MODERADAMENTE_FINOS_INTERPRETACION;

        if (((claseTextural.getNombre().equals("FRANCO ARCILLO LIMOSO"))
                && analisisSuelo.getPorcentArena() < 15 && analisisSuelo.getPorcentArcilla() < 35)
                || ((claseTextural.getNombre().equals("FRANCO LIMOSO"))
                && analisisSuelo.getPorcentArcilla() > 18 && analisisSuelo.getPorcentArena() < 15))
            interpretacion = MEDIOS_INTERPRETACION;

        if ((claseTextural.getNombre().equals("FRANCO"))
                || (claseTextural.getNombre().equals("LIMOSO"))
                || (claseTextural.getNombre().equals("FRANCO ARENOSO"))
                || ((claseTextural.getNombre().equals("FRANCO LIMOSO"))
                && analisisSuelo.getPorcentArcilla() < 18 && analisisSuelo.getPorcentArena() < 15))
            interpretacion = MODERADAMENTE_GRUESOS_INTERPRETACION;

        // Determinacion de clima
        String fooResourceUrl
                = "https://api.opentopodata.org/v1/srtm90m?locations=" + suelo.getIdLote().
                getIdFinca().getGeolocalizacion();
        ResponseEntity<String> response
                = restTemplate.getForEntity(fooResourceUrl, String.class);
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(response.getBody());
        double altitude = rootNode.get("results").get(0).get("elevation").asDouble();

        String CLIMA_FRIO = "FRIO";
        String CLIMA_MEDIO = "MEDIO";
        String CLIMA_CALIDO = "CALIDO";

        String clima = "";

        if (altitude > 2000) clima = CLIMA_FRIO;
        if (altitude < 2000 && altitude > 1000) clima = CLIMA_MEDIO;
        if (altitude < 1000) clima = CLIMA_CALIDO;

        MateriaOrganica materiaOrganica = materiaOrganicaService.getMateriaOrganicaByClimaAndValor(clima,
                analisisSuelo.getMateriaOrganica());
        GrupoTextural grupoTextural = grupoTexturalService.getGrupoTexturalByNombre(interpretacion);

        float densidad = 0;
        try{
            densidad = analisisSuelo.getIdDensidad();
        }catch (NullPointerException error){
            if(grupoTextural.getNombre().equals("MUY FINOS")){
                densidad = 1.1f;
            }
            if(grupoTextural.getNombre().equals("FINOS")){
                densidad = 1.2f;
            }
            if(grupoTextural.getNombre().equals("MODERADAMENTE FINOS")){
                densidad = 1.3f;
            }
            if(grupoTextural.getNombre().equals("MEDIOS")){
                densidad = 1.35f;
            }
            if(grupoTextural.getNombre().equals("MODERADAMENTE GRUESOS")){
                densidad = 1.5f;
            }
            if(grupoTextural.getNombre().equals("GRUESOS")){
                densidad = 1.6f;
            }
        }

        float valorF = 0;
        int idF = 0;
        float valorP = 0;
        int idP = 0;
        float valorC = 0;
        int idC = 0;
        float valorM = 0;
        int idM = 0;
        float valorS = 0;
        int idS = 0;
        float valorA = 0;
        int idA = 0;
        float valorCo = 0;
        int idCo = 0;
        float valorBo = 0;
        int idBo = 0;

        List<AnalisisElemento> analisisElementosEntities =
                (List<AnalisisElemento>) analisisSuelo.getAnalisisElementoCollection();
        for (int i = 0; i < analisisElementosEntities.size(); i++) {
            AnalisisElemento analisisElementosEntity = analisisElementosEntities.get(i);
            if (analisisElementosEntity.getIdElemento().getNombre().equals("FÓSFORO (P)")) {
                valorF = analisisElementosEntity.getValor();
                idF = analisisElementosEntity.getIdElemento().getId();
            }
            if (analisisElementosEntity.getIdElemento().getNombre().equals("POTASIO (K)")) {
                valorP = analisisElementosEntity.getValor();
                idP = analisisElementosEntity.getIdElemento().getId();
            }
            if (analisisElementosEntity.getIdElemento().getNombre().equals("MAGNESIO (Mg)")) {
                valorM = analisisElementosEntity.getValor();
                idM = analisisElementosEntity.getIdElemento().getId();
            }
            if (analisisElementosEntity.getIdElemento().getNombre().equals("CALCIO (Ca)")) {
                valorC = analisisElementosEntity.getValor();
                idC = analisisElementosEntity.getIdElemento().getId();
            }
            if (analisisElementosEntity.getIdElemento().getNombre().equals("AZUFRE (S)")) {
                valorA = analisisElementosEntity.getValor();
                idA = analisisElementosEntity.getIdElemento().getId();
            }
            if (analisisElementosEntity.getIdElemento().getNombre().equals("SODIO (Na)")) {
                valorS = analisisElementosEntity.getValor();
                idS = analisisElementosEntity.getIdElemento().getId();
            }

            if (analisisElementosEntity.getIdElemento().getNombre().equals("COBRE (Cu)")) {
                valorCo = analisisElementosEntity.getValor();
                idCo = analisisElementosEntity.getIdElemento().getId();
            }
            if (analisisElementosEntity.getIdElemento().getNombre().equals("BORO (B)")) {
                valorBo = analisisElementosEntity.getValor();
                idBo = analisisElementosEntity.getIdElemento().getId();
            }
        }

        analisisSuelo.setIdMateriaOrganica(materiaOrganica);
        analisisSuelo.setIdGrupoTextural(grupoTextural);
        analisisSuelo.setIdClaseTextural(claseTextural);
        analisisSuelo.setIdConductividadElectrica(conductividadElectrica);
        analisisSuelo.setIdIntercambioCationico(intercambioCationico);
        analisisSuelo.setIdAluminioIntercambiable(aluminioIntercambiable);
        analisisSuelo.setIdPhSuelo(phSuelo);
        analisisSuelo.setIdSuelo(suelo);
        analisisSuelo.setIdDensidad(densidad);
        analisisSuelo.setIdProfundidad(muestra);
        analisisSuelo.setAnalisisElementoCollection(null);
        AnalisisSuelo savedAnalisisSuelo = analisisSueloService.saveAnalisisSuelo(analisisSuelo);

        List<AnalisisElementosEntity> analisisElementoEntityList =
                analisisElementoInterpretacionService.getElementosByInterpretacion(
                        valorF, valorP, valorC, valorM, valorS, valorA,valorBo,valorCo,
                        idF, idP, idC, idM, idS, idA,idBo,idCo, savedAnalisisSuelo.getIdAnalisisSuelo()
                );
        float relacion_ca_mg = valorC/valorM;
        float relacion_ca_k = valorC/valorP;
        float relacion_ca_mg_k = (valorC+valorM)/valorP;

        RelacionBase relacionBaseCaMg = relacionBasesService.findRelacionCalMag(relacion_ca_mg);
        RelacionBase relacionBaseCaK = relacionBasesService.findRelacionCalPot(relacion_ca_k);
        RelacionBase relacionBaseCaMgK = relacionBasesService.findRelacionBasesPrincipales(relacion_ca_mg_k);

        analisisSueloRelacionBaseService.saveAnalisisSueloRelacionBase(new AnalisisSueloRelacionBase(null,
                relacionBaseCaMg,savedAnalisisSuelo,relacion_ca_mg));
        analisisSueloRelacionBaseService.saveAnalisisSueloRelacionBase(new AnalisisSueloRelacionBase(null,
                relacionBaseCaK,savedAnalisisSuelo,relacion_ca_k));
        analisisSueloRelacionBaseService.saveAnalisisSueloRelacionBase(new AnalisisSueloRelacionBase(null,
                relacionBaseCaMgK,savedAnalisisSuelo,relacion_ca_mg_k));

        if (analisisElementoEntityList.size()==0){
            return ResponseEntity.ok(
                    new Response(200, "Analisis suelo agregado correctamente. (No se encontraron valores para Interpretación de la Disponibilidad de nutrientes)",
                            savedAnalisisSuelo));
        }
        String labranza ="";
        if(grupoTextural.getNombre().equals(MUY_FINOS_INTERPRETACION)){
            if(densidad<1.20){
                labranza="Labranza mecanizada reducida con rastrillo y nivelación en suelo medio seco";
            }
            if(densidad>1.21){
                labranza="Labranza mínima mecanizada con arado cincel, rastrillo y nivelación en suelo\n" +
                        "seco";
            }

        }

        if(grupoTextural.getNombre().equals(FINOS_INTERPRETACION)){
            if(densidad<1.30){
                labranza="Labranza mecanizada reducida con rastrillo y nivelación en suelo medio seco";
            }
            if(densidad>1.31){
                labranza="Labranza mínima mecanizada con arado cincel, rastrillo y nivelación en suelo\n" +
                        "seco";
            }

        }

        if(grupoTextural.getNombre().equals(MODERADAMENTE_FINOS_INTERPRETACION)){
            if(densidad<1.40){
                labranza="Labranza mecanizada reducida con rastrillo y nivelación en suelo medio seco";
            }
            if(densidad>1.41){
                labranza="Labranza mínima mecanizada con arado cincel, rastrillo y nivelación en suelo\n" +
                        "seco";
            }

        }

        if(grupoTextural.getNombre().equals(MEDIOS_INTERPRETACION)){
            if(densidad<1.50){
                labranza="Labranza mecanizada reducida con rastrillo y nivelación en suelo medio seco";
            }
            if(densidad>1.51){
                labranza="Labranza mínima mecanizada con arado cincel, rastrillo y nivelación en suelo\n" +
                        "seco";
            }

        }

        if(grupoTextural.getNombre().equals(MODERADAMENTE_GRUESOS_INTERPRETACION)){
            if(densidad<1.60){
                labranza="Labranza mecanizada con rastrillo y nivelación en suelo medio seco";
            }
            if(densidad>1.61){
                labranza="Labranza mecanizada con rastrillo y nivelación en suelo medio seco";
            }

        }

        RecomendacionEntity r = recomendacionService.saveRecomendacion(new RecomendacionEntity(null,0.0f,(short)0.0,
                analisisSueloEntityMapper.toEntity(savedAnalisisSuelo),labranza));
        Recomendacion r2 = recomendacionEntityMapper.toDomain(r);

        //Guardar enmiendas
        if(analisisSuelo.getPhSuelo() < 5.5){
            float value_em = (analisisSuelo.getAluminioIntercambiable() != 0.0)?1:0;
            Enmienda enmiendaCal= enmiendaService.getByValor(value_em,"calcio");
            Enmienda enmiendaDol=enmiendaService.getByValor(value_em,"dolomita");
            Enmienda enmiendaFos=enmiendaService.getByValor(value_em,"fosforita");
            Enmienda enmiendaCalcitica=enmiendaService.getByValor(value_em,"calcitica");

            float vEnmiendaCal;
            float vEnmiendaDol;
            float vEnmiendaFos;
            float vEnmiendaCalcitica;

            if (analisisSuelo.getAluminioIntercambiable() != 0.0){
                vEnmiendaCal = analisisSuelo.getAluminioIntercambiable() * 1000;
            }else{
                float SB2 = 85f;
                float SB1 = ((valorC + valorM + valorP + valorS)/analisisSuelo.getIntercambioCationico())*100;
                vEnmiendaCal = analisisSuelo.getIntercambioCationico()*(SB2-SB1)*10;
            }

            vEnmiendaDol = vEnmiendaCal * 1.06f;
            vEnmiendaFos = vEnmiendaCal * 1.37f;
            vEnmiendaCalcitica = vEnmiendaCal * 0.9f;
            enmiendaRecomendacionService.saveEnmiendaRecomendacion(new EnmiendaRecomendacion(enmiendaCal,r2,vEnmiendaCal));
            enmiendaRecomendacionService.saveEnmiendaRecomendacion(new EnmiendaRecomendacion(enmiendaDol,r2,vEnmiendaDol));
            enmiendaRecomendacionService.saveEnmiendaRecomendacion(new EnmiendaRecomendacion(enmiendaFos,r2,vEnmiendaFos));
            enmiendaRecomendacionService.saveEnmiendaRecomendacion(new EnmiendaRecomendacion(enmiendaCalcitica,r2,
                    vEnmiendaCalcitica));
        }

        double peso_suelo = densidad*10000*analisisSuelo.getIdProfundidad().getProfundidad()*1000;
        if(!savedAnalisisSuelo.getIdMateriaOrganica().getInterpretacion().equals("ALTO")){
            int total_clima = 0;
            if(clima.equals(CLIMA_FRIO))
                total_clima=10;

            if(clima.equals(CLIMA_MEDIO))
                total_clima=5;

            if(clima.equals(CLIMA_CALIDO))
                total_clima=3;
            float diferencial_suelo=total_clima-savedAnalisisSuelo.getMateriaOrganica();
            float materia_organica= (float) (peso_suelo*(diferencial_suelo/100));

            r.setMateriaOrganica(materia_organica);
            recomendacionService.saveRecomendacion(r);
            r2 = recomendacionEntityMapper.toDomain(r);

            materia_organica/=3;
            AbonoOrganicoRecomendacion recomendacion_raquis = new AbonoOrganicoRecomendacion((float)materia_organica,
                    abonoOrganicoService.getAbonoOrganicoByNombre("RAQUIS"),r2);
            AbonoOrganicoRecomendacion recomendacion_bovinaza = new AbonoOrganicoRecomendacion((float)materia_organica,
                    abonoOrganicoService.getAbonoOrganicoByNombre("BOVINAZA"),r2);
            AbonoOrganicoRecomendacion recomendacion_vermicompost = new AbonoOrganicoRecomendacion((float)materia_organica,
                    abonoOrganicoService.getAbonoOrganicoByNombre("VERMICOMPOST"),r2);
            abonoOrganicoRecomendacionService.saveAbonoOrganicoRecomendacion(recomendacion_raquis);
            abonoOrganicoRecomendacionService.saveAbonoOrganicoRecomendacion(recomendacion_bovinaza);
            abonoOrganicoRecomendacionService.saveAbonoOrganicoRecomendacion(recomendacion_vermicompost);
        }

        // Recomendacion de abono quimicos

        Elemento elemento_nit = elementoService.getElementoEntityByNombre("NITRÓGENO (N)");
        Elemento elemento_fos = elementoService.getElementoEntityByNombre("FÓSFORO (P)");
        Elemento elemento_pot = elementoService.getElementoEntityByNombre("POTASIO (K)");
        Elemento elemento_azu = elementoService.getElementoEntityByNombre("AZUFRE (S)");
        Elemento elemento_cal = elementoService.getElementoEntityByNombre("CALCIO (Ca)");
        Elemento elemento_mag = elementoService.getElementoEntityByNombre("MAGNESIO (Mg)");
        Elemento elemento_cob = elementoService.getElementoEntityByNombre("COBRE (Cu)");
        Elemento elemento_bor = elementoService.getElementoEntityByNombre("BORO (B)");

        float nit_disponibilidad=0.0f;
        float fos_disponibilidad=0.0f;
        float pot_disponibilidad=0.0f;
        float cal_disponibilidad=0.0f;
        float mag_disponibilidad=0.0f;
        float azu_disponibilidad=0.0f;
        float bor_disponibilidad=0.0f;
        float cob_disponibilidad=0.0f;

        float nit_eficiencia=1f;
        float fos_eficiencia=1f;
        float pot_eficiencia=1f;
        float cal_eficiencia=1f;
        float mag_eficiencia=1f;
        float azu_eficiencia=1f;

        Cultivo cultivo = cultivoService.getCultivoBySuelo(savedAnalisisSuelo.getIdSuelo().getId());
        int variedad = cultivo.getIdVariedad().getId();
        int rendimiento =cultivo.getRendimiento();

        float nit_requerimiento=elementoVariedadService.getElementoVariedadByVariedadRendimiento(
                variedad,rendimiento, "NITRÓGENO (N)").getValorOptimo();
        float fos_requerimiento=elementoVariedadService.getElementoVariedadByVariedadRendimiento(
                variedad,rendimiento, "FÓSFORO (P)").getValorOptimo();
        float pot_requerimiento=elementoVariedadService.getElementoVariedadByVariedadRendimiento(
                variedad,rendimiento, "POTASIO (K)").getValorOptimo();
        float cal_requerimiento=elementoVariedadService.getElementoVariedadByVariedadRendimiento(
                variedad,rendimiento, "CALCIO (Ca)").getValorOptimo();
        float mag_requerimiento=elementoVariedadService.getElementoVariedadByVariedadRendimiento(
                variedad,rendimiento, "MAGNESIO (Mg)").getValorOptimo();
        float azu_requerimiento=elementoVariedadService.getElementoVariedadByVariedadRendimiento(
                variedad,rendimiento, "AZUFRE (S)").getValorOptimo();


        float mo=savedAnalisisSuelo.getMateriaOrganica();
        if(clima.equals(CLIMA_CALIDO)){
            if(mo>1.5f){
                nit_disponibilidad=(float) (mo*0.02*(peso_suelo/2000));
            }
            if(grupoTextural.getNombre().equals("MUY FINOS") ||
                    grupoTextural.getNombre().equals("FINOS") ||
                    grupoTextural.getNombre().equals("MODERADAMENTE FINOS")){
                nit_eficiencia=0.7f;
            }

            if(grupoTextural.getNombre().equals("MEDIOS")){
                nit_eficiencia=0.6f;
            }

            if(grupoTextural.getNombre().equals("MODERADAMENTE GRUESOS") ||
                    grupoTextural.getNombre().equals("GRUESOS")){
                nit_eficiencia=0.5f;
            }

        }
        if(clima.equals(CLIMA_MEDIO)){
            if(mo>3f)
                nit_disponibilidad=(float) (mo*0.015*(peso_suelo/2000));
            if(grupoTextural.getNombre().equals("MUY FINOS") ||
                    grupoTextural.getNombre().equals("FINOS") ||
                    grupoTextural.getNombre().equals("MODERADAMENTE FINOS")){
                nit_eficiencia=0.8f;
            }

            if(grupoTextural.getNombre().equals("MEDIOS")){
                nit_eficiencia=0.7f;
            }

            if(grupoTextural.getNombre().equals("MODERADAMENTE GRUESOS") ||
                    grupoTextural.getNombre().equals("GRUESOS")){
                nit_eficiencia=0.6f;
            }
        }
        if(clima.equals(CLIMA_FRIO)){
            if(mo>5f){
                nit_disponibilidad=(float) (mo*0.01*(peso_suelo/2000));
            }
            if(grupoTextural.getNombre().equals("MUY FINOS") ||
                    grupoTextural.getNombre().equals("FINOS") ||
                    grupoTextural.getNombre().equals("MODERADAMENTE FINOS")){
                nit_eficiencia=0.85f;
            }

            if(grupoTextural.getNombre().equals("MEDIOS")){
                nit_eficiencia=0.75f;
            }

            if(grupoTextural.getNombre().equals("MODERADAMENTE GRUESOS") ||
                    grupoTextural.getNombre().equals("GRUESOS")){
                nit_eficiencia=0.65f;
            }
        }

        String precipitacion=savedAnalisisSuelo.getIdSuelo().getIdLote().getIdFinca().getPrecipitacion();
        if(precipitacion.equals("Lluvioso")){
            if(grupoTextural.getNombre().equals("MUY FINOS") ||
                    grupoTextural.getNombre().equals("FINOS") ||
                    grupoTextural.getNombre().equals("MODERADAMENTE FINOS")){
                pot_eficiencia=0.75f;
                cal_eficiencia=0.75f;
                mag_eficiencia=0.75f;

            }

            if(grupoTextural.getNombre().equals("MEDIOS")){
                pot_eficiencia=0.65f;
                cal_eficiencia=0.65f;
                mag_eficiencia=0.65f;
            }

            if(grupoTextural.getNombre().equals("MODERADAMENTE GRUESOS") ||
                    grupoTextural.getNombre().equals("GRUESOS")){
                pot_eficiencia=0.5f;
                cal_eficiencia=0.5f;
                mag_eficiencia=0.5f;
            }
        }

        if(precipitacion.equals("Medio")){
            if(grupoTextural.getNombre().equals("MUY FINOS") ||
                    grupoTextural.getNombre().equals("FINOS") ||
                    grupoTextural.getNombre().equals("MODERADAMENTE FINOS")){
                pot_eficiencia=0.8f;
                cal_eficiencia=0.8f;
                mag_eficiencia=0.8f;
            }

            if(grupoTextural.getNombre().equals("MEDIOS")){
                pot_eficiencia=0.75f;
                cal_eficiencia=0.75f;
                mag_eficiencia=0.75f;
            }

            if(grupoTextural.getNombre().equals("MODERADAMENTE GRUESOS") ||
                    grupoTextural.getNombre().equals("GRUESOS")){
                pot_eficiencia=0.6f;
                cal_eficiencia=0.6f;
                mag_eficiencia=0.6f;
            }
        }

        if(precipitacion.equals("Seco")){
            if(grupoTextural.getNombre().equals("MUY FINOS") ||
                    grupoTextural.getNombre().equals("FINOS") ||
                    grupoTextural.getNombre().equals("MODERADAMENTE FINOS")){
                pot_eficiencia=0.9f;
                cal_eficiencia=0.9f;
                mag_eficiencia=0.9f;

            }

            if(grupoTextural.getNombre().equals("MEDIOS")){
                pot_eficiencia=0.85f;
                cal_eficiencia=0.85f;
                mag_eficiencia=0.85f;
            }

            if(grupoTextural.getNombre().equals("MODERADAMENTE GRUESOS") ||
                    grupoTextural.getNombre().equals("GRUESOS")){
                pot_eficiencia=0.7f;
                cal_eficiencia=0.7f;
                mag_eficiencia=0.7f;
            }
        }


        for (int i = 0; i < analisisElementoEntityList.size(); i++) {
            AnalisisElementosEntity analisisElementosEntity = analisisElementoEntityList.get(i);
            if (analisisElementosEntity.getIdElemento().getNombre().equals("FÓSFORO (P)")) {
                if(!analisisElementosEntity.getIdAnalisisElementoInterpretacion().getInterpretacion().equals(
                        "ALTO")){
                    fos_disponibilidad = (float) (analisisElementosEntity.getValor()*2.29*peso_suelo/1000000);
                }
            }
            if (analisisElementosEntity.getIdElemento().getNombre().equals("FÓSFORO (P)")) {
                if(!analisisElementosEntity.getIdAnalisisElementoInterpretacion().getInterpretacion().equals(
                        "ALTO")){
                    fos_disponibilidad = (float) (analisisElementosEntity.getValor()*2.29*peso_suelo/1000000);
                }
            }
            if (analisisElementosEntity.getIdElemento().getNombre().equals("BORO (B)")) {
                if(!analisisElementosEntity.getIdAnalisisElementoInterpretacion().getInterpretacion().equals(
                        "MUY ALTO")){
                    if(analisisElementosEntity.getIdAnalisisElementoInterpretacion().getInterpretacion().equals(
                            "ALTO")){
                        bor_disponibilidad = 1.1f;
                    }
                    if(analisisElementosEntity.getIdAnalisisElementoInterpretacion().getInterpretacion().equals(
                            "MEDIO")){
                        bor_disponibilidad = 1.1f;
                    }
                    if(analisisElementosEntity.getIdAnalisisElementoInterpretacion().getInterpretacion().equals(
                            "BAJO")){
                        bor_disponibilidad = 2.2f;
                    }
                    if(analisisElementosEntity.getIdAnalisisElementoInterpretacion().getInterpretacion().equals(
                            "MUY BAJO")){
                        bor_disponibilidad = 2.2f;
                    }
                }
            }

            if (analisisElementosEntity.getIdElemento().getNombre().equals("COBRE (Cu)")) {
                if(!analisisElementosEntity.getIdAnalisisElementoInterpretacion().getInterpretacion().equals(
                        "MUY ALTO")){
                    if(analisisElementosEntity.getIdAnalisisElementoInterpretacion().getInterpretacion().equals(
                            "ALTO")){
                        cob_disponibilidad = 1.1f;
                    }
                    if(analisisElementosEntity.getIdAnalisisElementoInterpretacion().getInterpretacion().equals(
                            "MEDIO")){
                        cob_disponibilidad = 3.4f;
                    }
                    if(analisisElementosEntity.getIdAnalisisElementoInterpretacion().getInterpretacion().equals(
                            "BAJO")){
                        cob_disponibilidad = 4.5f;
                    }
                    if(analisisElementosEntity.getIdAnalisisElementoInterpretacion().getInterpretacion().equals(
                            "MUY BAJO")){
                        cob_disponibilidad = 5.6f;
                    }
                }
            }
        }
        // Calculo de eficiencia
        if(savedAnalisisSuelo.getPhSuelo()<5.5){
            if(grupoTextural.getNombre().equals("MUY FINOS") ||
                    grupoTextural.getNombre().equals("FINOS") ||
                    grupoTextural.getNombre().equals("MODERADAMENTE FINOS")){
                fos_eficiencia=0.2f;
            }

            if(grupoTextural.getNombre().equals("MEDIOS")){
                fos_eficiencia=0.35f;
            }

            if(grupoTextural.getNombre().equals("MODERADAMENTE GRUESOS") ||
                    grupoTextural.getNombre().equals("GRUESOS")){
                fos_eficiencia=0.3f;
            }
        }

        if(savedAnalisisSuelo.getPhSuelo()>=5.6 && savedAnalisisSuelo.getPhSuelo()<=9.0){
            if(grupoTextural.getNombre().equals("MUY FINOS") ||
                    grupoTextural.getNombre().equals("FINOS") ||
                    grupoTextural.getNombre().equals("MODERADAMENTE FINOS")){
                fos_eficiencia=0.5f;
            }

            if(grupoTextural.getNombre().equals("MEDIOS")){
                fos_eficiencia=0.6f;
            }

            if(grupoTextural.getNombre().equals("MODERADAMENTE GRUESOS") ||
                    grupoTextural.getNombre().equals("GRUESOS")){
                fos_eficiencia=0.4f;
            }
        }

        if(savedAnalisisSuelo.getPhSuelo()>9.0){
            if(grupoTextural.getNombre().equals("MUY FINOS") ||
                    grupoTextural.getNombre().equals("FINOS") ||
                    grupoTextural.getNombre().equals("MODERADAMENTE FINOS")){
                fos_eficiencia=0.4f;
            }

            if(grupoTextural.getNombre().equals("MEDIOS")){
                fos_eficiencia=0.45f;
            }

            if(grupoTextural.getNombre().equals("MODERADAMENTE GRUESOS") ||
                    grupoTextural.getNombre().equals("GRUESOS")){
                fos_eficiencia=0.35f;
            }
        }

        AbonoQuimicoRecomendacion aqr_nit = new AbonoQuimicoRecomendacion(null,r2,elemento_nit,
                nit_disponibilidad,nit_eficiencia,(nit_requerimiento-nit_disponibilidad)/nit_eficiencia);

        AbonoQuimicoRecomendacion aqr_fos = new AbonoQuimicoRecomendacion(null,r2,elemento_fos,
                fos_disponibilidad,fos_eficiencia,(fos_requerimiento-fos_disponibilidad)/fos_eficiencia);

        AbonoQuimicoRecomendacion aqr_pot = new AbonoQuimicoRecomendacion(null,r2,elemento_pot,
                pot_disponibilidad,pot_eficiencia,(pot_requerimiento-pot_disponibilidad)/pot_eficiencia);

        AbonoQuimicoRecomendacion aqr_cal = new AbonoQuimicoRecomendacion(null,r2,elemento_cal,
                cal_disponibilidad,cal_eficiencia,(cal_requerimiento-cal_disponibilidad)/cal_eficiencia);

        AbonoQuimicoRecomendacion aqr_mag = new AbonoQuimicoRecomendacion(null,r2,elemento_mag,
                mag_disponibilidad,mag_eficiencia,(mag_requerimiento-mag_disponibilidad)/mag_eficiencia);

        AbonoQuimicoRecomendacion aqr_azu = new AbonoQuimicoRecomendacion(null,r2,elemento_azu,
                azu_disponibilidad,azu_eficiencia,(azu_requerimiento-azu_disponibilidad)/azu_eficiencia);

        AbonoQuimicoRecomendacion aqr_bor = new AbonoQuimicoRecomendacion(null,r2,elemento_bor,
                bor_disponibilidad,null,bor_disponibilidad);

        AbonoQuimicoRecomendacion aqr_cob = new AbonoQuimicoRecomendacion(null,r2,elemento_cob,
                cob_disponibilidad,null,bor_disponibilidad);

        abonoQuimicoRecomendacionServicio.saveAbonoQuimicoRecomendacion(aqr_nit);
        abonoQuimicoRecomendacionServicio.saveAbonoQuimicoRecomendacion(aqr_fos);
        abonoQuimicoRecomendacionServicio.saveAbonoQuimicoRecomendacion(aqr_pot);
        abonoQuimicoRecomendacionServicio.saveAbonoQuimicoRecomendacion(aqr_cal);
        abonoQuimicoRecomendacionServicio.saveAbonoQuimicoRecomendacion(aqr_mag);
        abonoQuimicoRecomendacionServicio.saveAbonoQuimicoRecomendacion(aqr_azu);

        abonoQuimicoRecomendacionServicio.saveAbonoQuimicoRecomendacion(aqr_bor);
        abonoQuimicoRecomendacionServicio.saveAbonoQuimicoRecomendacion(aqr_cob);



        savedAnalisisSuelo = analisisSueloService.getAnalisisSueloById(savedAnalisisSuelo.getIdAnalisisSuelo());
        savedAnalisisSuelo.setAnalisisSueloRelacionBaseEntities(
                analisisSueloRelacionBaseService.getAllAnalisisSueloByAnalisisSuelo(savedAnalisisSuelo.getIdAnalisisSuelo())
        );
        savedAnalisisSuelo.setAnalisisElementoCollection(
                analisisElementoService.getAllAnalisisElementoByIdAnalisisSuelo(savedAnalisisSuelo.getIdAnalisisSuelo()));
        AnalisisSuelo analisisSueloR = analisisSueloService.getAnalisisSueloById(savedAnalisisSuelo.getIdAnalisisSuelo());

        return ResponseEntity.ok(
                new Response(200, "Analisis suelo agregado correctamente", analisisSueloR));
    }

    @GetMapping("/{idAnalisisSuelo}/recomendaciones")
    public ResponseEntity<?> getAllRecomendaciones(@PathVariable int idAnalisisSuelo) {
        AnalisisSuelo analisisSueloR = analisisSueloService.getAnalisisSueloById(idAnalisisSuelo);
        if (analisisSueloR == null) {
            return new ResponseEntity<>(new Mensaje("Análisis suelo ingresado no se encuentra registrado"),
                    HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok(analisisSueloR.getRecomendacionCollection());
    }

    @GetMapping("/{idAnalisisSuelo}")
    public ResponseEntity<?> getAnalisisSueloById(@PathVariable int idAnalisisSuelo) {
        AnalisisSuelo analisisSueloR = analisisSueloService.getAnalisisSueloById(idAnalisisSuelo);
        if (analisisSueloR == null) {
            return new ResponseEntity<>(new Mensaje("Análisis suelo ingresado no se encuentra registrado"),
                    HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok(analisisSueloR);
    }

    @GetMapping("/{idLote}/analisisLotes")
    public ResponseEntity<?> getAnalisisSueloByLote(@PathVariable int idLote) {
        Lote lote = loteServicio.getLoteById(idLote);
        if (lote == null) {
            return new ResponseEntity<>(new Mensaje("Ese lote no existe"),
                    HttpStatus.BAD_REQUEST);
        }
        List<AnalisisSuelo> analisisSueloLotes = analisisSueloService.getAllAnalisisSueloByLote(idLote);
        if(analisisSueloLotes==null)
            analisisSueloLotes = new ArrayList<>();
        return ResponseEntity.ok(analisisSueloLotes);
    }

    @PutMapping
    public ResponseEntity<?> updateAnalisisSuelo(@RequestBody @Valid AnalisisSuelo analisisSuelo, BindingResult br) {
        if (br.hasErrors())
            return new ResponseEntity<ErrorMapping>(new ErrorMapping(br.getFieldErrors()), HttpStatus.BAD_REQUEST);

        if (analisisSuelo.getIdAnalisisSuelo() == null) {
            return new ResponseEntity<>(
                    new Mensaje("Debe proporcionar un id del analisis suelo"),
                    HttpStatus.BAD_REQUEST);
        }

        AnalisisSuelo analisisSuelo2 = analisisSueloService.getAnalisisSueloById(analisisSuelo.getIdAnalisisSuelo());

        if (analisisSuelo2 == null) {
            return new ResponseEntity<>(
                    new Mensaje("El analisis suelo que desea actualizar no existe"),
                    HttpStatus.BAD_REQUEST);
        }

        analisisSueloService.saveAnalisisSuelo(analisisSuelo);

        return ResponseEntity.ok(new Mensaje("Analisis suelo actualizado actualizado"));
    }

}
