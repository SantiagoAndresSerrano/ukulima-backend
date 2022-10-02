package ufps.ukulima.infrastructure.entry_points.rest.Finca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ufps.ukulima.config.Spring.security.dto.Mensaje;
import ufps.ukulima.domain.model.Agricultor.Agricultor;
import ufps.ukulima.domain.model.Agricultor.gateway.AgricultorService;
import ufps.ukulima.domain.model.ErrorMapping.ErrorMapping;
import ufps.ukulima.domain.model.Finca.Finca;
import ufps.ukulima.domain.model.Finca.gateway.FincaService;

import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/finca")
@CrossOrigin
public class FincaController {

    @Autowired
    FincaService fincaService;

    @Autowired
    AgricultorService agricultorService;

    @GetMapping
    public ResponseEntity<List<Finca>> getAllFinca() {
        return ResponseEntity.ok(fincaService.getAllFinca());
    }

    @PostMapping
    public ResponseEntity<?> saveFinca(@Valid @RequestBody Finca finca, BindingResult br) {

        if (br.hasErrors())
            return new ResponseEntity<ErrorMapping>(new ErrorMapping(br.getFieldErrors()), HttpStatus.BAD_REQUEST);

        Agricultor agricultor = agricultorService.getAgricultorById(finca.getIdAgricultor().getIdentificacion());
        if (agricultor == null) {
            return new ResponseEntity<>(new Mensaje("No existe un agricultor con ese ID"), HttpStatus.BAD_REQUEST);
        }
        finca.setIdAgricultor(agricultor);
        fincaService.saveFinca(finca);

        return ResponseEntity.ok(new Mensaje("Finca guardada"));
    }

    @PutMapping
    public ResponseEntity<?> updateFinca(@Valid @RequestBody Finca finca, BindingResult br) {

        if (br.hasErrors())
            return new ResponseEntity<ErrorMapping>(new ErrorMapping(br.getFieldErrors()), HttpStatus.BAD_REQUEST);

        if (finca.getIdFinca() == null)
            return new ResponseEntity<>(new Mensaje("Debe proporcionar un ID si desea actualizar"),
                    HttpStatus.BAD_REQUEST);

        Agricultor agricultor = agricultorService.getAgricultorById(finca.getIdAgricultor().getIdentificacion());
        if (agricultor == null) {
            return new ResponseEntity<>(new Mensaje("No existe un agricultor con ese ID"), HttpStatus.BAD_REQUEST);
        }

        finca.setIdAgricultor(agricultor);
        fincaService.saveFinca(finca);

        return ResponseEntity.ok(new Mensaje("Finca actualizada"));
    }

}
