package ufps.ukulima.infrastructure.entry_points.rest.ElementoVariedad;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ufps.ukulima.config.Spring.security.dto.Mensaje;
import ufps.ukulima.domain.model.ElementoVariedad.ElementoVariedad;
import ufps.ukulima.domain.model.ElementoVariedad.gateway.ElementoVariedadService;
import ufps.ukulima.domain.model.ErrorMapping.ErrorMapping;

@RestController
@RequestMapping(value = "/api/elementovariedad", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class ElementoVariedadController {

    @Autowired
    ElementoVariedadService ElementoVariedadService;

    @PostMapping
    public ResponseEntity<?> saveElementoVariedad(@Valid @RequestBody ElementoVariedad elementoVariedad,
            BindingResult br) {
        if (br.hasErrors())
            return new ResponseEntity<ErrorMapping>(new ErrorMapping(br.getFieldErrors()), HttpStatus.BAD_REQUEST);

        ElementoVariedadService.saveElementoVariedad(elementoVariedad);
        return ResponseEntity.ok(new Mensaje("ElementoVariedad registrado con éxito :"));
    }

    @GetMapping
    public ResponseEntity<?> getAllElementoVariedad() {
        return ResponseEntity.ok(ElementoVariedadService.getAllElementoVariedad());
    }

}