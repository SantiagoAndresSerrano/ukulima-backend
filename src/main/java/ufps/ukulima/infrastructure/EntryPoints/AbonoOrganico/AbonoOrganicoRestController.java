package ufps.ukulima.infrastructure.EntryPoints.AbonoOrganico;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ufps.ukulima.domain.UseCase.AbonoOrganico.AbonoOrganicoUseCase;
import ufps.ukulima.domain.model.AbonoOrganico.AbonoOrganico;
import ufps.ukulima.domain.model.AbonoOrganico.GateWays.AbonoOrganicoService;
import ufps.ukulima.domain.model.Recomendacion;

import java.util.List;

@RestController
@RequestMapping("/abonoorganico")

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
