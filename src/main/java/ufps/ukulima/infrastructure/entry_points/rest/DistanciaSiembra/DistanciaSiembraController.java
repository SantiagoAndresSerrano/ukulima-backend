package ufps.ukulima.infrastructure.entry_points.rest.DistanciaSiembra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ufps.ukulima.config.Spring.security.dto.Mensaje;
import ufps.ukulima.domain.model.DistanciaSiembra.DistanciaSiembra;
import ufps.ukulima.domain.model.DistanciaSiembra.gateway.DistanciaSiembraService;
import ufps.ukulima.domain.model.ErrorMapping.ErrorMapping;

import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api/distanciasiembra", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class DistanciaSiembraController {
    @Autowired
    DistanciaSiembraService distanciaSiembraService;

    @GetMapping
    public ResponseEntity<List<DistanciaSiembra>> getAllDistanciaSiembra() {
        return ResponseEntity.ok(distanciaSiembraService.getAllDistanciaSiembra());
    }

    @PostMapping
    public ResponseEntity<?> saveDistanciaSiembra(@Valid @RequestBody DistanciaSiembra distanciaSiembra,
            BindingResult br) {
        if (br.hasErrors())
            return new ResponseEntity<ErrorMapping>(new ErrorMapping(br.getFieldErrors()), HttpStatus.BAD_REQUEST);

        distanciaSiembraService.saveDistanciaSiembra(distanciaSiembra);
        return ResponseEntity.ok(new Mensaje("Distancia siembra guardada"));
    }

}
