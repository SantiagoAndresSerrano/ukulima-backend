package ufps.ukulima.infrastructure.entry_points.rest.Recomendación;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;
import ufps.ukulima.config.Spring.security.dto.Mensaje;
import ufps.ukulima.domain.model.Agricultor.Agricultor;
import ufps.ukulima.domain.model.Agricultor.gateway.AgricultorService;
import ufps.ukulima.domain.model.ErrorMapping.ErrorMapping;
import ufps.ukulima.domain.model.Recomendacion.Recomendacion;
import ufps.ukulima.domain.model.Recomendacion.gateway.RecomendacionService;
import ufps.ukulima.infrastructure.mapper.RecomendacionEntityMapper;

@RestController
@RequestMapping("/api/recomendacion")
@CrossOrigin
public class RecomendacionController {
    @Autowired
    RecomendacionService recomendacionService;
    @Autowired
    AgricultorService agricultorService;

    @Autowired
    RecomendacionEntityMapper recomendacionEntityMapper;

    @GetMapping
    public ResponseEntity<?> getAllRecomendacion() {
        return ResponseEntity.ok(recomendacionService.getAllRecomendacion());
    }

    @PostMapping
    public ResponseEntity<?> saveRecomendacion(@Valid @RequestBody Recomendacion recomendacion,
            BindingResult br) {
        if (br.hasErrors())
            return new ResponseEntity<ErrorMapping>(new ErrorMapping(br.getFieldErrors()), HttpStatus.BAD_REQUEST);

        recomendacionService.saveRecomendacion(recomendacionEntityMapper.toEntity(recomendacion));
        return ResponseEntity.ok(new Mensaje("Recomendación registrado con éxito :"));
    }

    // @GetMapping("/{idCultivo}")
    // public ResponseEntity<?> getAllRecomendacionByAgricultor(@PathVariable int
    // idAgricultor) {
    // Agricultor agricultor = agricultorService.getAgricultorById(idAgricultor);

    // return ResponseEntity.ok((List) (agricultor.re.municipioCollection()));
    // }
}
