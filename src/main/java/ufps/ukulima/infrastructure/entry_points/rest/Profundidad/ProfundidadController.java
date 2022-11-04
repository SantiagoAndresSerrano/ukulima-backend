package ufps.ukulima.infrastructure.entry_points.rest.Profundidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ufps.ukulima.infrastructure.driven_adapters.jpa.ProfundidadMuestra.ProfundidaMuestraRepository;

@RestController
@RequestMapping("/api/profundidad")
@CrossOrigin
public class ProfundidadController {
    @Autowired
    ProfundidaMuestraRepository profundidaMuestraRepository;

    @GetMapping
    public ResponseEntity<?> getAllMuestra() {
        return ResponseEntity.ok((profundidaMuestraRepository.findAll()));
    }

}
