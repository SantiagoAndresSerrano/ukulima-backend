package ufps.ukulima.infrastructure.entry_points.rest.Topografia;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ufps.ukulima.config.Spring.security.dto.Mensaje;
import ufps.ukulima.domain.model.ErrorMapping.ErrorMapping;
import ufps.ukulima.domain.model.Topografia.Topografia;
import ufps.ukulima.domain.model.Topografia.gateway.TopografiaService;

@RestController
@RequestMapping(value = "/api/topografia", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class TopografiaController {
    @Autowired
    TopografiaService topografiaService;

    @GetMapping
    public ResponseEntity<?> getAllTopografia() {
        return ResponseEntity.ok(topografiaService.findByAllTopografia());
    }

    @PostMapping
    public ResponseEntity<?> saveTopografia(@RequestBody Topografia topografia) {
        topografiaService.saveTopografia(topografia);
        return ResponseEntity.ok(new Mensaje("Topografia agregada"));
    }

    @PutMapping
    public ResponseEntity<?> updateTopografia(@RequestBody @Valid Topografia topografia, BindingResult br) {
        if (br.hasErrors())
            return new ResponseEntity<ErrorMapping>(new ErrorMapping(br.getFieldErrors()), HttpStatus.BAD_REQUEST);

        if (topografia.getId() == null) {
            return new ResponseEntity<>(
                    new Mensaje("Debe proporcionar un id de la topografía"),
                    HttpStatus.BAD_REQUEST);
        }

        Topografia topografia2 = topografiaService.findTopografiaById(topografia.getId());

        if (topografia2 == null) {
            return new ResponseEntity<>(
                    new Mensaje("La topografia que desea actualizar no existe"),
                    HttpStatus.BAD_REQUEST);
        }

        topografiaService.saveTopografia(topografia);

        return ResponseEntity.ok(new Mensaje("Topografia actualizado"));
    }
}
