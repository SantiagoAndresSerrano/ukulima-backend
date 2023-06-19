package ufps.ukulima.infrastructure.entry_points.rest.Lote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ufps.ukulima.config.Spring.security.dto.Mensaje;
import ufps.ukulima.domain.model.Finca.Finca;
import ufps.ukulima.domain.model.Finca.gateway.FincaService;
import ufps.ukulima.domain.model.Lote.Lote;
import ufps.ukulima.domain.model.Lote.gateway.LoteServicio;
import ufps.ukulima.domain.model.Suelo.Suelo;
import ufps.ukulima.domain.model.Suelo.gateway.SueloService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/api/lote",produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class LoteController {
    @Autowired
    LoteServicio loteServicio;

    @Autowired
    FincaService fincaService;

    @Autowired
    SueloService sueloService;

    @PostMapping("/{idFinca}")
    public ResponseEntity<?> saveSuelo(@PathVariable int idFinca, @RequestBody Lote lote) {
        boolean exist = fincaService.existById(idFinca);
        if(!exist){
            return new ResponseEntity<>(
                    new Mensaje("La finca no existe"),
                    HttpStatus.NOT_FOUND);
        }
        Finca finca=fincaService.getFincaById(idFinca);
        if(finca==null){
            return new ResponseEntity<>(
                    new Mensaje("La finca no existe"),
                    HttpStatus.NOT_FOUND);
        }
        lote.setIdFinca(finca);
        loteServicio.saveLote(lote);
        return ResponseEntity.ok(new Mensaje("Lote agregado con exito"));
    }

    @PutMapping("/{idLote}")
    public ResponseEntity<?> edit(@PathVariable int idLote, @RequestBody Lote lote) {
        boolean exist = loteServicio.existLoteById(idLote);
        if(!exist){
            return new ResponseEntity<>(
                    new Mensaje("El lote no existe"),
                    HttpStatus.NOT_FOUND);
        }
        Lote lote_found=loteServicio.getLoteById(idLote);
        if(lote_found==null){
            return new ResponseEntity<>(
                    new Mensaje("El lote que se quiere editar no existe"),
                    HttpStatus.NOT_FOUND);
        }
        lote.setIdFinca(lote_found.getIdFinca());
        lote.setId(idLote);
        loteServicio.saveLote(lote);
        return ResponseEntity.ok(new Mensaje("Lote editado con exito"));
    }

    @GetMapping("/{idLote}/suelos")
    public ResponseEntity<?> getSuelos(@PathVariable int idLote) {
        boolean exist = loteServicio.existLoteById(idLote);
        if(!exist){
            return new ResponseEntity<>(
                    new Mensaje("El lote no existe"),
                    HttpStatus.NOT_FOUND);
        }
        Lote lote_found=loteServicio.getLoteById(idLote);
        if(lote_found==null){
            return new ResponseEntity<>(
                    new Mensaje("El lote no existe"),
                    HttpStatus.NOT_FOUND);
        }
        List<Suelo> suelos= sueloService.getSueloByLote(idLote);
        if(suelos == null) suelos = new ArrayList<>();
        return ResponseEntity.ok(suelos);
    }


    @DeleteMapping("/{idLote}")
    public ResponseEntity<?> deleteLote(@PathVariable int idLote) {
        boolean exist = loteServicio.existLoteById(idLote);
        if(!exist){
            return new ResponseEntity<>(
                    new Mensaje("El lote no existe"),
                    HttpStatus.NOT_FOUND);
        }
        Lote lote_found=loteServicio.getLoteById(idLote);
        if(lote_found==null){
            return new ResponseEntity<>(
                    new Mensaje("El lote que se quiere eliminar no existe"),
                    HttpStatus.NOT_FOUND);
        }

        loteServicio.eliminar(idLote);
        return ResponseEntity.ok(new Mensaje("Lote eliminado con exito"));
    }
}
