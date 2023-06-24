package ufps.ukulima.infrastructure.entry_points.rest.Suelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ufps.ukulima.config.Spring.security.dto.Mensaje;
import ufps.ukulima.domain.model.Cultivo.Cultivo;
import ufps.ukulima.domain.model.Cultivo.gateway.CultivoService;
import ufps.ukulima.domain.model.Lote.Lote;
import ufps.ukulima.domain.model.Lote.gateway.LoteServicio;
import ufps.ukulima.domain.model.Suelo.Suelo;
import ufps.ukulima.domain.model.Suelo.gateway.SueloService;
import ufps.ukulima.domain.model.TipoCultivo.TipoCultivo;
import ufps.ukulima.domain.model.TipoCultivo.gateway.TipoCultivoService;
import ufps.ukulima.domain.model.Variedad.Variedad;
import ufps.ukulima.domain.model.Variedad.gateway.VariedadService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/api/suelo",produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class SueloController {

    @Autowired
    SueloService sueloService;

    @Autowired
    TipoCultivoService tipoCultivoService;

    @Autowired
    LoteServicio loteServicio;

    @Autowired
    CultivoService cultivoService;

    @PostMapping("/{idLote}")
    public ResponseEntity<?> saveSuelo(@PathVariable int idLote,@RequestBody Suelo suelo) {
        Lote lote=loteServicio.getLoteById(idLote);
        if(lote==null){
            return new ResponseEntity<>(
                    new Mensaje("El lote no existe"),
                    HttpStatus.NOT_FOUND);
        }
        suelo.setIdLote(lote);
        sueloService.saveSuelo(suelo);
        return ResponseEntity.ok(new Mensaje("Suelo agregado con exito"));
    }

    @PutMapping("/{idSuelo}")
    public ResponseEntity<?> editSuelo(@PathVariable int idSuelo,@RequestBody Suelo suelo) {
        suelo.setId(idSuelo);
        sueloService.saveSuelo(suelo);
        return ResponseEntity.ok(new Mensaje("Suelo editado con exito"));
    }
    @GetMapping("/{idSuelo}/cultivos")
    public ResponseEntity<?> cultivos(@PathVariable int idSuelo) {
        List<Cultivo>all_cultivos= cultivoService.getAllCultivoBySuelo(idSuelo);
        if(all_cultivos == null){
            all_cultivos=new ArrayList<>();
        }
        return ResponseEntity.ok(all_cultivos);
    }
}