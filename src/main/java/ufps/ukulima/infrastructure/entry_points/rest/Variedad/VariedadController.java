package ufps.ukulima.infrastructure.entry_points.rest.Variedad;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ufps.ukulima.config.Spring.security.dto.Mensaje;
import ufps.ukulima.domain.model.TipoCultivo.TipoCultivo;
import ufps.ukulima.domain.model.TipoCultivo.gateway.TipoCultivoService;
import ufps.ukulima.domain.model.Variedad.Variedad;
import ufps.ukulima.domain.model.Variedad.gateway.VariedadService;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping(value="/api/variedad",produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class VariedadController {

    @Autowired
    VariedadService variedadService;

    @Autowired
    TipoCultivoService tipoCultivoService;

    @PostMapping
	public ResponseEntity<?> saveVariedad(@RequestBody Variedad variedad) {
        TipoCultivo tipoCultivo = tipoCultivoService.findTipoCultivoById(variedad.getIdTipoCultivo().getId());
        variedad.setIdTipoCultivo(tipoCultivo);
        variedadService.saveVariedad(variedad);
		if( tipoCultivo == null)
			return new ResponseEntity<>(new Mensaje("El tipo de cultivo no puede estar vacio al registrar la ") +
                    "variedad", HttpStatus.BAD_REQUEST);

        return ResponseEntity.ok(new Mensaje("Variedad agregada con éxito ") + variedad.getDescripcion());
	}

    @GetMapping
    public ResponseEntity<?> getAllVariedad(){
        return ResponseEntity.ok(variedadService.findByAllVariedad());
    }

}