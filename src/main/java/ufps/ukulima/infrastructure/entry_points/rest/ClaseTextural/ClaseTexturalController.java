package ufps.ukulima.infrastructure.entry_points.rest.ClaseTextural;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ufps.ukulima.domain.model.ClaseTextural.gateway.ClaseTexturalService;

@RestController
@RequestMapping(value="/api/clasetextural",produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class ClaseTexturalController {
    @Autowired
    ClaseTexturalService claseTexturalService;

    @GetMapping
    public ResponseEntity<?> getAllClaseTextural(){
        return ResponseEntity.ok(claseTexturalService.getAllClaseTextural());
    }
    @GetMapping("/{idClase}")
    public ResponseEntity<?> getClaseTexturalById(@PathVariable int idClase){
        return ResponseEntity.ok(claseTexturalService.getClaseTexturalById(idClase));
    }

}
