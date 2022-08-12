package ufps.ukulima.infrastructure.entry_points.rest.TipoCultivo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ufps.ukulima.config.Spring.security.dto.Mensaje;
import ufps.ukulima.domain.model.TipoCultivo.TipoCultivo;
import ufps.ukulima.domain.model.TipoCultivo.gateway.TipoCultivoService;

import java.util.List;

@RestController
@RequestMapping("/api/tipocultivo")
@CrossOrigin
public class TipoCultivoController {
    @Autowired
    TipoCultivoService tipoCultivoService;

    @GetMapping
    public ResponseEntity<List<TipoCultivo>> getAllTipoCultivo(){
        return ResponseEntity.ok(tipoCultivoService.findByAllTipoCultivo());
    }

    @PostMapping
    public ResponseEntity<?> saveTipoCultivo(@RequestBody TipoCultivo cultivo){
        tipoCultivoService.saveTipoCultivo(cultivo);
        return ResponseEntity.ok(new Mensaje("Tipo cultivo guardado exitosamente"));
    }
}
