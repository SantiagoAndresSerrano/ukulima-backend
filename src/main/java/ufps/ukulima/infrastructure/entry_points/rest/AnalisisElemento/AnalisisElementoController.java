package ufps.ukulima.infrastructure.entry_points.rest.AnalisisElemento;

import io.swagger.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ufps.ukulima.domain.model.AnalisisElemento.AnalisisElemento;
import ufps.ukulima.domain.model.AnalisisElemento.gateway.AnalisisElementoService;
import ufps.ukulima.domain.model.AnalisisSuelo.AnalisisSuelo;
import ufps.ukulima.domain.model.AnalisisSuelo.gateway.AnalisisSueloService;
import ufps.ukulima.domain.model.Elemento.Elemento;
import ufps.ukulima.domain.model.Elemento.gateway.ElementoService;

@RestController
@RequestMapping(value="/api/analisiselemento",produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class AnalisisElementoController {
    @Autowired
    AnalisisElementoService analisisElementoService;

    @Autowired
    AnalisisSueloService analisisSueloService;

    @Autowired
    ElementoService elementoService;

    @PostMapping
    public ResponseEntity<?> saveAnalisisElemento(@RequestBody AnalisisElemento analisisElemento){
        AnalisisSuelo analisisSuelo =
                analisisSueloService.getAnalisisSueloById(analisisElemento.getIdAnalisisSuelo().getIdAnalisisSuelo());
        Elemento elemento = elementoService.getElementoById(analisisElemento.getIdElemento().getId());

        if( analisisSuelo == null)
            return new ResponseEntity<>("Analisis suelo no puede estar vacio al registrar analisis elemento",
                    HttpStatus.BAD_REQUEST);
        if( elemento == null)
            return new ResponseEntity<>("Elemento no puede estar vacio al registrar elemento",
                    HttpStatus.BAD_REQUEST);

        analisisElementoService.saveAnalisisElemento(analisisElemento);
        return ResponseEntity.ok("Analisis elemento guardado con exito");
    }

    @GetMapping
    public ResponseEntity<?> getAllAnalisisElemento(){
        return ResponseEntity.ok(analisisElementoService.getAllAnalisisElemento());
    }
}
