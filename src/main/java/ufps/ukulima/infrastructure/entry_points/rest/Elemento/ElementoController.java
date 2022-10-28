package ufps.ukulima.infrastructure.entry_points.rest.Elemento;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
import ufps.ukulima.domain.model.Elemento.Elemento;
import ufps.ukulima.domain.model.Elemento.gateway.ElementoService;
import ufps.ukulima.domain.model.ErrorMapping.ErrorMapping;

@RestController
@RequestMapping(value = "/api/elemento", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class ElementoController {

    @Autowired
    ElementoService elementoService;

    @PostMapping
    public ResponseEntity<?> saveElemento(@Valid @RequestBody Elemento elemento, BindingResult br) {
        if (br.hasErrors())
            return new ResponseEntity<ErrorMapping>(new ErrorMapping(br.getFieldErrors()), HttpStatus.BAD_REQUEST);

        elementoService.saveElemento(elemento);
        return ResponseEntity.ok(new Mensaje("Elemento registrado con éxito :" + elemento.getNombre()));
    }

    @GetMapping
    public ResponseEntity<?> getAllElemento() {
        return ResponseEntity.ok(elementoService.getAllElemento());
    }

    @PutMapping
    public ResponseEntity<?> updateElemento(@RequestBody @Valid Elemento elemento, BindingResult br) {
        if (br.hasErrors())
            return new ResponseEntity<ErrorMapping>(new ErrorMapping(br.getFieldErrors()), HttpStatus.BAD_REQUEST);

        if (elemento.getId() == null) {
            return new ResponseEntity<>(
                    new Mensaje("Debe proporcionar un id del elemento"),
                    HttpStatus.BAD_REQUEST);
        }

        Elemento elemento2 = elementoService.getElementoById(elemento.getId());

        if (elemento2 == null) {
            return new ResponseEntity<>(
                    new Mensaje("El elemento que desea actualizar no existe"),
                    HttpStatus.BAD_REQUEST);
        }

        elementoService.saveElemento(elemento);

        return ResponseEntity.ok(new Mensaje("Elemento actualizado"));
    }

}