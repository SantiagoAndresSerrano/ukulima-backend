package ufps.ukulima.infrastructure.entry_points.rest.Agricultor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ufps.ukulima.config.Spring.security.dto.Mensaje;
import ufps.ukulima.domain.model.Agricultor.Agricultor;
import ufps.ukulima.domain.model.Agricultor.gateway.AgricultorService;

@RestController
@RequestMapping("/api/agricultor")
@CrossOrigin

public class AgricultorController {

    @Autowired
    AgricultorService agricultorService;

    @GetMapping("/{emailAgricultor}")
    public ResponseEntity<?> getAgricultorByEmail(@PathVariable String emailAgricultor){

        Agricultor agricultor= agricultorService.getAgricultorByEmail(emailAgricultor);
        if(agricultor==null){
            return new ResponseEntity<>(new Mensaje("Agricultor no encontrado"), HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(agricultor);
    }


}
