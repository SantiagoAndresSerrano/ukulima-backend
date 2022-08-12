package ufps.ukulima.infrastructure.entry_points.rest.Departamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ufps.ukulima.domain.model.Departamento.Departamento;
import ufps.ukulima.domain.model.Departamento.gateway.DepartamentoService;

import java.util.List;

@RestController
@RequestMapping(value="/api/departamento",produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class DepartamentoController {
    @Autowired
    DepartamentoService departamentoService;

    @GetMapping
    public ResponseEntity<List<Departamento>> getAllDepartamento(){
        return ResponseEntity.ok(departamentoService.getAllDepartamento());
    }
}

