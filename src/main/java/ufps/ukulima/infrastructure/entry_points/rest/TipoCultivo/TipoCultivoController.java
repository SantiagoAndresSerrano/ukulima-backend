package ufps.ukulima.infrastructure.entry_points.rest.TipoCultivo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ufps.ukulima.config.Spring.security.dto.Mensaje;
import ufps.ukulima.domain.model.ErrorMapping.ErrorMapping;
import ufps.ukulima.domain.model.TipoCultivo.TipoCultivo;
import ufps.ukulima.domain.model.TipoCultivo.gateway.TipoCultivoService;

import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/tipocultivo")
@CrossOrigin
public class TipoCultivoController {
    @Autowired
    TipoCultivoService tipoCultivoService;

    @GetMapping
    public ResponseEntity<List<TipoCultivo>> getAllTipoCultivo() {
        return ResponseEntity.ok(tipoCultivoService.findByAllTipoCultivo());
    }

    @PostMapping
    public ResponseEntity<?> saveTipoCultivo(@RequestBody @Valid TipoCultivo tipoCultivo, BindingResult br) {
        if (br.hasErrors())
            return new ResponseEntity<ErrorMapping>(new ErrorMapping(br.getFieldErrors()), HttpStatus.BAD_REQUEST);
        tipoCultivoService.saveTipoCultivo(tipoCultivo);
        return ResponseEntity.ok(new Mensaje("Tipo cultivo guardado exitosamente"));
    }

    @PutMapping
    public ResponseEntity<?> updateTipoCultivo(@RequestBody @Valid TipoCultivo tipoCultivo, BindingResult br) {
        if (br.hasErrors())
            return new ResponseEntity<ErrorMapping>(new ErrorMapping(br.getFieldErrors()), HttpStatus.BAD_REQUEST);

        if (tipoCultivo.getId() == null) {
            return new ResponseEntity<>(
                    new Mensaje("Debe proporcionar un id del tipo cultivo"),
                    HttpStatus.BAD_REQUEST);
        }

        TipoCultivo tipoCultivo2 = tipoCultivoService.findTipoCultivoById(tipoCultivo.getId());

        if (tipoCultivo2 == null) {
            return new ResponseEntity<>(
                    new Mensaje("El tipo cultivo que desea actualizar no existe"),
                    HttpStatus.BAD_REQUEST);
        }

        tipoCultivoService.saveTipoCultivo(tipoCultivo);

        return ResponseEntity.ok(new Mensaje("Tipo cultivo actualizado"));
    }
}
