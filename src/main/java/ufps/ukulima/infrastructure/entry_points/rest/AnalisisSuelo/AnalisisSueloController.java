package ufps.ukulima.infrastructure.entry_points.rest.AnalisisSuelo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ufps.ukulima.domain.model.AnalisisSuelo.AnalisisSuelo;
import ufps.ukulima.domain.model.AnalisisSuelo.gateway.AnalisisSueloService;
import ufps.ukulima.domain.model.ClaseTextural.ClaseTextural;
import ufps.ukulima.domain.model.ClaseTextural.gateway.ClaseTexturalService;
import ufps.ukulima.domain.model.Cultivo.Cultivo;
import ufps.ukulima.domain.model.Cultivo.gateway.CultivoService;
import ufps.ukulima.domain.model.Densidad.Densidad;
import ufps.ukulima.domain.model.Densidad.gateway.DensidadService;
import ufps.ukulima.domain.model.ProfundidadMuestra.ProfundidadMuestra;
import ufps.ukulima.domain.model.ProfundidadMuestra.gateway.ProfundidaMuestraService;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping(value="/api/analisissuelo",produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class AnalisisSueloController {

    @Autowired
    AnalisisSueloService analisisSueloService;

    @Autowired
    ClaseTexturalService claseTexturalService;

    @Autowired
    CultivoService cultivoService;

    @Autowired
    DensidadService densidadService;

    @Autowired
    ProfundidaMuestraService muestraService;

    @GetMapping
    public ResponseEntity<?> getAllAnalisisSuelo(){
        return ResponseEntity.ok(analisisSueloService.getAllAnalisisSuelo());
    } 

    @PostMapping
    public ResponseEntity<?> saveAnalisisSuelo(@RequestBody AnalisisSuelo analisisSuelo){
        ClaseTextural claseTextural = claseTexturalService.getClaseTexturalById(analisisSuelo.getIdClaseTextural().getIdClaseTextural());
        Cultivo cultivo = cultivoService.getCultivoById(analisisSuelo.getIdCultivo().getIdCultivo());
        Densidad densidad = densidadService.getDensidadById(analisisSuelo.getIdDensidad().getIdDensidad());
        ProfundidadMuestra muestra= muestraService.findProfundidadMuestraById(analisisSuelo.getIdProfundidad().getIdProfundidadMuestra());

        if(claseTextural==null)
            return new ResponseEntity<>("Clase textural no puede estar vacio al guardar analisis suelo", HttpStatus.BAD_REQUEST);

        if(cultivo==null)
            return new ResponseEntity<>("cultivo no puede estar vacio al guardar analisis suelo", HttpStatus.BAD_REQUEST);

        if(densidad==null)
            return new ResponseEntity<>("densidad no puede estar vacio al guardar analisis suelo", HttpStatus.BAD_REQUEST);
        
        if(muestra==null)
            return new ResponseEntity<>("profundidad muestra no puede estar vacio al guardar analisis suelo", HttpStatus.BAD_REQUEST);       

        analisisSuelo.setIdClaseTextural(claseTextural);
        analisisSuelo.setIdCultivo(cultivo);
        analisisSuelo.setIdDensidad(densidad);
        analisisSuelo.setIdProfundidad(muestra);

        analisisSueloService.saveAnalisisSuelo(analisisSuelo);

        return ResponseEntity.ok("Analisis suelo agregado");
    }

    @GetMapping("/recomendaciones")
    public ResponseEntity<?> getAllRecomendaciones(@RequestBody AnalisisSuelo analisisSuelo){
        AnalisisSuelo analisisSueloR = analisisSueloService.getAnalisisSueloById(analisisSuelo.getIdAnalisisSuelo());
        if(analisisSueloR == null){
            return new ResponseEntity<>("Análisis suelo ingresado no se encuentra registrado", HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok(analisisSueloR.getRecomendacionCollection());
    }
    
}
