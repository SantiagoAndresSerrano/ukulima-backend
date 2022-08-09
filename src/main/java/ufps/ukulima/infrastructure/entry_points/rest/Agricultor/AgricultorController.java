package ufps.ukulima.infrastructure.entry_points.rest.Agricultor;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import ufps.ukulima.config.Spring.security.dto.Mensaje;
import ufps.ukulima.domain.model.Agricultor.Agricultor;
import ufps.ukulima.domain.model.Agricultor.gateway.AgricultorService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value="/api/agricultor",produces = MediaType.APPLICATION_JSON_VALUE)
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

    @GetMapping
    public ResponseEntity<List<Agricultor>>getAllAgricultor(){
        return ResponseEntity.ok(agricultorService.getAllAgricultor());
    }

    @PutMapping
    public ResponseEntity<?> updateAgricultor(@RequestBody @Valid Agricultor agricultor, @NotNull BindingResult br){
        if (br.hasErrors()) {
            return new ResponseEntity<List<ObjectError>>(br.getAllErrors(), HttpStatus.BAD_REQUEST);
        }

        agricultorService.saveAgricultor(agricultor);

        return ResponseEntity.ok("Agricultor actualizado");
    }

}
