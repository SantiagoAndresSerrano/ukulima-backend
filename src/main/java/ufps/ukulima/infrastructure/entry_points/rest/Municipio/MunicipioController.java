package ufps.ukulima.infrastructure.entry_points.rest.Municipio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ufps.ukulima.domain.model.Departamento.Departamento;
import ufps.ukulima.domain.model.Departamento.gateway.DepartamentoService;
import ufps.ukulima.domain.model.Municipio.gateway.MunicipioService;

import java.util.List;

@RestController
@RequestMapping("/api/municipio")
@CrossOrigin
public class MunicipioController {
    @Autowired
    MunicipioService municipioService;

    @Autowired
    DepartamentoService departamentoService;

    @GetMapping
    public ResponseEntity<?> getAllMunicipio(){
        return ResponseEntity.ok(municipioService.getAllMunicipio());
    }

    @GetMapping("/departamento/{idDepartamento}")
    public ResponseEntity<?> getMunicipiosByDepartamento(@PathVariable int idDepartamento){
        Departamento departamento=departamentoService.getDepartamentoById(idDepartamento);
        return ResponseEntity.ok((List)(departamento.municipioCollection()));
    }

}
