package ufps.ukulima.infrastructure.entry_points.rest.Vereda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ufps.ukulima.config.Spring.security.dto.Mensaje;
import ufps.ukulima.domain.model.Corregimiento.Corregimiento;
import ufps.ukulima.domain.model.Corregimiento.gateway.CorregimientoService;
import ufps.ukulima.domain.model.Vereda.gateway.VeredaService;

@RestController
@RequestMapping(value="/api/vereda",produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class VeredaController {
    @Autowired
    VeredaService veredaService;

    @Autowired
    CorregimientoService corregimientoService;

    @GetMapping
    public ResponseEntity<?> getAllVereda(){
        return ResponseEntity.ok(veredaService.findByAllVereda());
    }

    @GetMapping("/{idCorregimiento}")
    public ResponseEntity<?> getVeredaByCorregimiento(@PathVariable int idCorregimiento){
        Corregimiento corregimiento=corregimientoService.getCorregimientoById(idCorregimiento);

        if(corregimiento==null)
            return new ResponseEntity<>(new Mensaje("Corregimiento con id:"+idCorregimiento+" no encontrado"),
                    HttpStatus.NOT_FOUND);

        return ResponseEntity.ok(corregimiento.veredaCollection());
    }


}
