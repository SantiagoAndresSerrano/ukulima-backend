package ufps.ukulima.infrastructure.entry_points.rest.TipoIdentificacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ufps.ukulima.domain.model.TipoIdentificacion.TipoIdentificacion;
import ufps.ukulima.domain.model.TipoIdentificacion.gateway.TipoIdentificacionService;

import java.util.List;

@RestController
@RequestMapping("/api/tipoidentificacion")
@CrossOrigin
public class TipoIdentificacionController {

    @Autowired
    TipoIdentificacionService tipoIdentificacionService;

    @GetMapping
    public ResponseEntity<List<TipoIdentificacion>> getAllTipoId(){
        return ResponseEntity.ok(tipoIdentificacionService.getAllTipoIdentificacion());
    }

}
