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
import ufps.ukulima.domain.model.ErrorMapping.ErrorMapping;
import ufps.ukulima.domain.model.GrupoTextural.GrupoTextural;
import ufps.ukulima.domain.model.GrupoTextural.gateway.GrupoTexturalService;
import ufps.ukulima.domain.model.IntercambioCationico.IntercambioCationico;
import ufps.ukulima.domain.model.IntercambioCationico.gateway.IntercambioCationicoService;
import ufps.ukulima.domain.model.MateriaOrganica.MateriaOrganica;
import ufps.ukulima.domain.model.MateriaOrganica.gateway.MateriaOrganicaService;
import ufps.ukulima.domain.model.PhSuelo.PhSuelo;
import ufps.ukulima.domain.model.PhSuelo.gateway.PhSueloService;
import ufps.ukulima.domain.model.ProfundidadMuestra.ProfundidadMuestra;
import ufps.ukulima.domain.model.ProfundidadMuestra.gateway.ProfundidaMuestraService;
import org.springframework.http.HttpStatus;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import ufps.ukulima.domain.model.RelacionBase.RelacionBase;
import ufps.ukulima.domain.model.RelacionBase.gateway.RelacionBaseServicio;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisElemento.AnalisisElementosEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisSuelo.AnalisisSueloEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisSueloRelacionBases.AnalisisSueloRelacionBaseEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.RelacionBase.RelacionBaseEntity;

import java.util.List;

@RestController
@RequestMapping(value = "/api/analisissuelo", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class AnalisisSueloController {
    private static Logger log = LoggerFactory.getLogger(AuthController.class);

    @Autowired
    AnalisisSueloService analisisSueloService;

    @Autowired
    AluminioIntercambiableService aluminioIntercambiableService;
    @Autowired
    IntercambioCationicoService intercambioCationicoService;
    @Autowired
    ConductividadElectricaService conductividadElectricaService;

    @Autowired
    ClaseTexturalService claseTexturalService;

    @Autowired
    MateriaOrganicaService materiaOrganicaService;

    @Autowired
    CultivoService cultivoService;

    @Autowired
    DensidadService densidadService;
    @Autowired
    PhSueloService phSueloService;

    @Autowired
    ProfundidaMuestraService muestraService;

    @Autowired
    GrupoTexturalService grupoTexturalService;

    @Autowired
    RelacionBaseServicio relacionBasesService;

    @Autowired
    AnalisisElementoInterpretacionService analisisElementoInterpretacionService;

    @Autowired
    AnalisisElementoService analisisElementoService;

    @Autowired
    AnalisisSueloRelacionBaseService analisisSueloRelacionBaseService;

    @GetMapping
    public ResponseEntity<?> getAllAnalisisSuelo() {
        return ResponseEntity.ok(analisisSueloService.getAllAnalisisSuelo());
    }

    @PostMapping
    public ResponseEntity<?> saveAnalisisSuelo(@Valid @RequestBody AnalisisSuelo analisisSuelo, BindingResult br) throws JsonProcessingException {

        if (br.hasErrors())
            return new ResponseEntity<ErrorMapping>(new ErrorMapping(br.getFieldErrors()), HttpStatus.BAD_REQUEST);
        Cultivo cultivo = cultivoService.getCultivoById(analisisSuelo.getIdCultivo().getIdCultivo());

        ProfundidadMuestra muestra =
                muestraService.findProfundidadMuestraById(analisisSuelo.getIdProfundidad().getIdProfundidadMuestra());
        if (cultivo == null)
            return new ResponseEntity<>(new Mensaje("cultivo no encontrado."),
                    HttpStatus.BAD_REQUEST);
        if (muestra == null)
            return new ResponseEntity<>(new Mensaje("profundidad muestra no encontrada" +
                    "suelo"), HttpStatus.BAD_REQUEST);

        RestTemplate restTemplate = new RestTemplate();
        ClaseTextural claseTextural = claseTexturalService
                .getClaseTexturalPorRangos(analisisSuelo.getPorcentArena()
                        , analisisSuelo.getPorcentLimos(), analisisSuelo.getPorcentArcilla());
        Densidad densidad = densidadService.getDensidadById(analisisSuelo.getIdDensidad().getIdDensidad());

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
                = "https://api.opentopodata.org/v1/srtm90m?locations=" + cultivo.
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
        }

        analisisSuelo.setIdMateriaOrganica(materiaOrganica);
        analisisSuelo.setIdGrupoTextural(grupoTextural);
        analisisSuelo.setIdClaseTextural(claseTextural);
        analisisSuelo.setIdConductividadElectrica(conductividadElectrica);
        analisisSuelo.setIdIntercambioCationico(intercambioCationico);
        analisisSuelo.setIdAluminioIntercambiable(aluminioIntercambiable);
        analisisSuelo.setIdPhSuelo(phSuelo);
        analisisSuelo.setIdCultivo(cultivo);
        analisisSuelo.setIdDensidad(densidad);
        analisisSuelo.setIdProfundidad(muestra);
        analisisSuelo.setAnalisisElementoCollection(null);
        AnalisisSuelo savedAnalisisSuelo = analisisSueloService.saveAnalisisSuelo(analisisSuelo);

        List<AnalisisElementosEntity> analisisElementoEntityList =
                analisisElementoInterpretacionService.getElementosByInterpretacion(
                        valorF, valorP, valorC, valorM, valorS, valorA,
                        idF, idP, idC, idM, idS, idA, savedAnalisisSuelo.getIdAnalisisSuelo()
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
        savedAnalisisSuelo = analisisSueloService.getAnalisisSueloById(savedAnalisisSuelo.getIdAnalisisSuelo());
        savedAnalisisSuelo.setAnalisisSueloRelacionBaseEntities(
                analisisSueloRelacionBaseService.getAllAnalisisSueloByAnalisisSuelo(savedAnalisisSuelo.getIdAnalisisSuelo())
        );
        savedAnalisisSuelo.setAnalisisElementoCollection(
                analisisElementoService.getAllAnalisisElementoByIdAnalisisSuelo(savedAnalisisSuelo.getIdAnalisisSuelo()));
        return ResponseEntity.ok(
                new Response(200, "Analisis suelo agregado correctamente", savedAnalisisSuelo));
    }

    @GetMapping("/{idAnalisisSuelo}/recomendaciones")
    public ResponseEntity<?> getAllRecomendaciones(@PathVariable int idAnalisisSuelo) {
        AnalisisSuelo analisisSueloR = analisisSueloService.getAnalisisSueloById(idAnalisisSuelo);
        if (analisisSueloR == null) {
            return new ResponseEntity<>(new Mensaje("Análisis suelo ingresado no se encuentra registrado"),
                    HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok(analisisSueloR.recomendacionCollection());
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
