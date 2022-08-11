package ufps.ukulima.infrastructure.entry_points.rest.Elemento;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ufps.ukulima.domain.model.Elemento.Elemento;
import ufps.ukulima.domain.model.Elemento.gateway.ElementoService;

@RestController
@RequestMapping(value="/api/elemento",produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class ElementoController{

    @Autowired
    ElementoService elementoService;

    @PostMapping
    public ResponseEntity<?> saveElemento(@RequestBody Elemento elemento){
        elementoService.saveElemento(elemento);
        return ResponseEntity.ok("Elemento registrado con éxito :" + elemento.getNombre());
    }
    @GetMapping
    public ResponseEntity<?> getAllElemento(){
        return ResponseEntity.ok(elementoService.getAllElemento());
    }

}