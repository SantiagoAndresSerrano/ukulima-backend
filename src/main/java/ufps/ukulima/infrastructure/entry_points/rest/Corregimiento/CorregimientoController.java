package ufps.ukulima.infrastructure.entry_points.rest.Corregimiento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ufps.ukulima.domain.model.Corregimiento.gateway.CorregimientoService;
import ufps.ukulima.domain.model.Municipio.gateway.MunicipioService;

@RestController
@RequestMapping(value="/api/corregimiento",produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class CorregimientoController {
    @Autowired
    CorregimientoService corregimientoService;

    @Autowired
    MunicipioService municipioService;

    @GetMapping
    public ResponseEntity<?> getAllCorregimiento(){
        return ResponseEntity.ok(corregimientoService.getAllCorregimiento());
    }

    @GetMapping("/{idMunicipio}")
    public ResponseEntity<?> getCorregimientoByMunicipio(@PathVariable int idMunicipio){
        return ResponseEntity.ok(municipioService.getMunicipioById(idMunicipio));
    }


}
