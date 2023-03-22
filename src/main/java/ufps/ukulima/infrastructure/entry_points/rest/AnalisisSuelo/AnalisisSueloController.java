package ufps.ukulima.infrastructure.entry_points.rest.AnalisisSuelo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ufps.ukulima.config.Spring.security.dto.Mensaje;
import ufps.ukulima.domain.model.AluminioIntercambiable.AluminioIntercambiable;
import ufps.ukulima.domain.model.AluminioIntercambiable.gateway.AluminioIntercambiableService;
import ufps.ukulima.domain.model.AnalisisSuelo.AnalisisSuelo;
import ufps.ukulima.domain.model.AnalisisSuelo.gateway.AnalisisSueloService;
import ufps.ukulima.domain.model.ClaseTextural.ClaseTextural;
import ufps.ukulima.domain.model.ClaseTextural.gateway.ClaseTexturalService;
import ufps.ukulima.domain.model.ConductividadElectrica.ConductividadElectrica;
import ufps.ukulima.domain.model.ConductividadElectrica.gateway.ConductividadElectricaService;
import ufps.ukulima.domain.model.Cultivo.Cultivo;
import ufps.ukulima.domain.model.Cultivo.gateway.CultivoService;
import ufps.ukulima.domain.model.Densidad.Densidad;
import ufps.ukulima.domain.model.Densidad.gateway.DensidadService;
import ufps.ukulima.domain.model.ErrorMapping.ErrorMapping;
import ufps.ukulima.domain.model.IntercambioCationico.IntercambioCationico;
import ufps.ukulima.domain.model.IntercambioCationico.gateway.IntercambioCationicoService;
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

@RestController
@RequestMapping(value = "/api/analisissuelo", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class AnalisisSueloController {

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
    CultivoService cultivoService;

    @Autowired
    DensidadService densidadService;
    @Autowired
    PhSueloService phSueloService;

    @Autowired
    ProfundidaMuestraService muestraService;

    @GetMapping
    public ResponseEntity<?> getAllAnalisisSuelo() {
        return ResponseEntity.ok(analisisSueloService.getAllAnalisisSuelo());
    }

    @PostMapping
    public ResponseEntity<?> saveAnalisisSuelo(@Valid @RequestBody AnalisisSuelo analisisSuelo, BindingResult br) {

        if (br.hasErrors())
            return new ResponseEntity<ErrorMapping>(new ErrorMapping(br.getFieldErrors()), HttpStatus.BAD_REQUEST);

        ClaseTextural claseTextural = claseTexturalService
                .getClaseTexturalPorRangos(analisisSuelo.getPorcentArena()
                        ,analisisSuelo.getPorcentLimos(), analisisSuelo.getPorcentArcilla());
        Cultivo cultivo = cultivoService.getCultivoById(analisisSuelo.getIdCultivo().getIdCultivo());
        Densidad densidad = densidadService.getDensidadById(analisisSuelo.getIdDensidad().getIdDensidad());
        ProfundidadMuestra muestra =
                muestraService.findProfundidadMuestraById(analisisSuelo.getIdProfundidad().getIdProfundidadMuestra());
        PhSuelo phSuelo =phSueloService.getPhSueloByValor(analisisSuelo.getPhSuelo());
        AluminioIntercambiable aluminioIntercambiable =
                aluminioIntercambiableService.getAluminioIntercambiableByValor(analisisSuelo.getAluminioIntercambiable());
        ConductividadElectrica conductividadElectrica =
                conductividadElectricaService.getConductividadElectricaByValor(analisisSuelo.getConductividadElectrica());
        IntercambioCationico intercambioCationico =
                intercambioCationicoService.getIntercambioCationicoByValor(analisisSuelo.getIntercambioCationico());

        if (cultivo == null)
            return new ResponseEntity<>(new Mensaje("cultivo no encontrada"),
                    HttpStatus.BAD_REQUEST);

        if (muestra == null)
            return new ResponseEntity<>(new Mensaje("profundidad muestra no encontrada" +
                    "suelo"), HttpStatus.BAD_REQUEST);

        analisisSuelo.setIdClaseTextural(claseTextural);
        analisisSuelo.setIdConductividadElectrica(conductividadElectrica);
        analisisSuelo.setIdIntercambioCationico(intercambioCationico);
        analisisSuelo.setIdAluminioIntercambiable(aluminioIntercambiable);
        analisisSuelo.setIdPhSuelo(phSuelo);
        analisisSuelo.setIdCultivo(cultivo);
        analisisSuelo.setIdDensidad(densidad);
        analisisSuelo.setIdProfundidad(muestra);
        //analisisSueloService.saveAnalisisSuelo(analisisSuelo);

        return ResponseEntity.ok(analisisSuelo);
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
