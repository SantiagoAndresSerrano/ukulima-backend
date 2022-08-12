package ufps.ukulima.infrastructure.entry_points.rest.Densidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ufps.ukulima.config.Spring.security.dto.Mensaje;
import ufps.ukulima.domain.model.Densidad.Densidad;
import ufps.ukulima.domain.model.Densidad.gateway.DensidadService;

import java.util.List;

@RestController
@RequestMapping(value="/api/densidad",produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class DensidadController {
    @Autowired
    DensidadService densidadService;

    @GetMapping
    public ResponseEntity<List<Densidad>> getAllDensidad(){
        return ResponseEntity.ok(densidadService.getAllDensidad());
    }

    @PostMapping
    public ResponseEntity<Mensaje> saveDensidad(@RequestBody Densidad densidad){
        densidadService.saveDensidad(densidad);
        return ResponseEntity.ok(new Mensaje("Densidad guardada"));
    }
}
