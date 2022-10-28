package ufps.ukulima.infrastructure.entry_points.rest.Densidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ufps.ukulima.config.Spring.security.dto.Mensaje;
import ufps.ukulima.domain.model.Densidad.Densidad;
import ufps.ukulima.domain.model.Densidad.gateway.DensidadService;
import ufps.ukulima.domain.model.ErrorMapping.ErrorMapping;

import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api/densidad", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class DensidadController {
    @Autowired
    DensidadService densidadService;

    @GetMapping
    public ResponseEntity<List<Densidad>> getAllDensidad() {
        return ResponseEntity.ok(densidadService.getAllDensidad());
    }

    @PostMapping
    public ResponseEntity<?> saveDensidad(@RequestBody @Valid Densidad densidad, BindingResult br) {
        if (br.hasErrors())
            return new ResponseEntity<ErrorMapping>(new ErrorMapping(br.getFieldErrors()), HttpStatus.BAD_REQUEST);

        densidadService.saveDensidad(densidad);
        return ResponseEntity.ok(new Mensaje("Densidad guardada"));
    }

    @PutMapping
    public ResponseEntity<?> updateDensidad(@RequestBody @Valid Densidad densidad, BindingResult br) {
        if (br.hasErrors())
            return new ResponseEntity<ErrorMapping>(new ErrorMapping(br.getFieldErrors()), HttpStatus.BAD_REQUEST);

        if (densidad.getIdDensidad() == null) {
            return new ResponseEntity<>(
                    new Mensaje("Debe proporcionar un id de la densidad"),
                    HttpStatus.BAD_REQUEST);
        }

        Densidad densidad2 = densidadService.getDensidadById(densidad.getIdDensidad());

        if (densidad2 == null) {
            return new ResponseEntity<>(
                    new Mensaje("La densidad que desea actualizar no existe"),
                    HttpStatus.BAD_REQUEST);
        }

        densidadService.saveDensidad(densidad);

        return ResponseEntity.ok(new Mensaje("Densidad actualizado"));
    }
}
