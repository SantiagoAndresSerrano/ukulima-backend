package ufps.ukulima.infrastructure.entry_points.rest.Enmienda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ufps.ukulima.config.Spring.security.dto.Mensaje;
import ufps.ukulima.domain.model.Enmienda.Enmienda;
import ufps.ukulima.domain.model.Enmienda.gateway.EnmiendaService;

import java.util.List;

@RestController
@RequestMapping(value="/api/enmienda",produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class EnmiendaController {
    @Autowired
    EnmiendaService enmiendaService;

    @GetMapping
    public ResponseEntity<List<Enmienda>>getAllEnmienda(){
        return ResponseEntity.ok(enmiendaService.getAllEnmienda());
    }

    @PostMapping
    public ResponseEntity<Mensaje> saveEnmienda(@RequestBody Enmienda enmienda){
        enmiendaService.saveEnmienda(enmienda);
        return ResponseEntity.ok(new Mensaje("Enmienda guardada"));
    }
}
