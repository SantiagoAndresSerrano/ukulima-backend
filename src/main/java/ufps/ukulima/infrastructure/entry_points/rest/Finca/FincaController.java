package ufps.ukulima.infrastructure.entry_points.rest.Finca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ufps.ukulima.domain.model.Agricultor.Agricultor;
import ufps.ukulima.domain.model.Agricultor.gateway.AgricultorService;
import ufps.ukulima.domain.model.Finca.Finca;
import ufps.ukulima.domain.model.Finca.gateway.FincaService;

import java.util.List;

@RestController
@RequestMapping("/api/finca")
@CrossOrigin
public class FincaController {

    @Autowired
    FincaService fincaService;

    @Autowired
    AgricultorService agricultorService;

    @GetMapping
    public ResponseEntity<List<Finca>> getAllFinca(){
        return ResponseEntity.ok(fincaService.getAllFinca());
    }



    @PostMapping
    public ResponseEntity<?> saveFinca(@RequestBody Finca finca){
        Agricultor agricultor = agricultorService.getAgricultorById(finca.getIdAgricultor().getIdentifiacion());
        if(agricultor==null){
            return new ResponseEntity<>("No existe un agricultor con ese ID", HttpStatus.BAD_REQUEST);
        }
        finca.setIdAgricultor(agricultor);
        fincaService.saveFinca(finca);

        return ResponseEntity.ok("Finca guardada");
    }

    @PutMapping
    public ResponseEntity<?> updateFinca(@RequestBody Finca finca){
        if(finca.getIdFinca()==null)
            return new ResponseEntity<>("Debe proporcionar un ID si desea actualizar", HttpStatus.BAD_REQUEST);

        Agricultor agricultor = agricultorService.getAgricultorById(finca.getIdAgricultor().getIdentifiacion());
        if(agricultor==null){
            return new ResponseEntity<>("No existe un agricultor con ese ID", HttpStatus.BAD_REQUEST);
        }

        finca.setIdAgricultor(agricultor);
        fincaService.saveFinca(finca);

        return ResponseEntity.ok("Finca actualizada");
    }




}
