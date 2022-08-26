package ufps.ukulima.infrastructure.entry_points.rest.DistanciaSiembra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ufps.ukulima.config.Spring.security.dto.Mensaje;
import ufps.ukulima.domain.model.DistanciaSiembra.DistanciaSiembra;
import ufps.ukulima.domain.model.DistanciaSiembra.gateway.DistanciaSiembraService;

import java.util.List;

@RestController
@RequestMapping(value="/api/distanciasiembra",produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class DistanciaSiembraController {
    @Autowired
    DistanciaSiembraService distanciaSiembraService;

    @GetMapping
    public ResponseEntity<List<DistanciaSiembra>> getAllDistanciaSiembra(){
        return ResponseEntity.ok(distanciaSiembraService.getAllDistanciaSiembra());
    }

    @PostMapping
    public ResponseEntity<Mensaje> saveDistanciaSiembra(@RequestBody DistanciaSiembra distanciaSiembra){
        distanciaSiembraService.saveDistanciaSiembra(distanciaSiembra);
        return ResponseEntity.ok(new Mensaje("Distancia siembra guardada"));
    }


}
