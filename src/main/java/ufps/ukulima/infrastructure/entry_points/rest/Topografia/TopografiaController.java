package ufps.ukulima.infrastructure.entry_points.rest.Topografia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ufps.ukulima.config.Spring.security.dto.Mensaje;
import ufps.ukulima.domain.model.Topografia.Topografia;
import ufps.ukulima.domain.model.Topografia.gateway.TopografiaService;

@RestController
@RequestMapping(value="/api/topografia",produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class TopografiaController {
    @Autowired
    TopografiaService topografiaService;

    @GetMapping
    public ResponseEntity<?> getAllTopografia(){
        return ResponseEntity.ok(topografiaService.findByAllTopografia());
    }

    @PostMapping
    public ResponseEntity<?> saveTopografia(@RequestBody Topografia topografia){
        topografiaService.saveTopografia(topografia);
        return ResponseEntity.ok(new Mensaje("Topografia agregada"));
    }
}
