package ufps.ukulima.infrastructure.entry_points.rest.AbonoOrganico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ufps.ukulima.domain.model.AbonoOrganico.AbonoOrganico;
import ufps.ukulima.domain.model.AbonoOrganico.gateway.AbonoOrganicoService;
import ufps.ukulima.domain.model.Recomendacion.Recomendacion;

import java.util.List;

@RestController
@RequestMapping("/api/abonoorganico")
@CrossOrigin

public class AbonoOrganicoRestController {

    @Autowired
    AbonoOrganicoService abonoOrganicoService;

    @GetMapping
    public ResponseEntity<List<AbonoOrganico>> getAll(){
        return new ResponseEntity<>(abonoOrganicoService.getAllAbonoOrganicos(), HttpStatus.OK);
    }

    @GetMapping("/{idAbonoOrganico}")
    public ResponseEntity<List<AbonoOrganico>> getAll(@PathVariable int idAbonoOrganico){
        return new ResponseEntity<>(abonoOrganicoService.getAllAbonoOrganicos(), HttpStatus.OK);
    }

    @GetMapping("/recomendacion/{idAbonoOrganico}")
    public ResponseEntity<List<Recomendacion>> getAllRecomendationAbono(@PathVariable int idAbonoOrganico){
        return new ResponseEntity<>(abonoOrganicoService.recomendaciones(idAbonoOrganico), HttpStatus.OK);
    }


}
