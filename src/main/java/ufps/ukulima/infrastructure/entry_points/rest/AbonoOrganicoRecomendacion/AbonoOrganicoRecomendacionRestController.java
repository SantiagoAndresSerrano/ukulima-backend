package ufps.ukulima.infrastructure.entry_points.rest.AbonoOrganicoRecomendacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ufps.ukulima.config.Spring.security.dto.Mensaje;
import ufps.ukulima.domain.model.AbonoOrganico.AbonoOrganico;
import ufps.ukulima.domain.model.AbonoOrganico.gateway.AbonoOrganicoService;
import ufps.ukulima.domain.model.AbonoOrganicoRecomendacion.AbonoOrganicoRecomendacion;
import ufps.ukulima.domain.model.AbonoOrganicoRecomendacion.gateway.AbonoOrganicoRecomendacionService;
import ufps.ukulima.domain.model.Recomendacion.Recomendacion;
import ufps.ukulima.domain.model.Recomendacion.gateway.RecomendacionService;

@RestController
@RequestMapping(value="/api/abonoorganicorecomendacion",produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin

public class AbonoOrganicoRecomendacionRestController {

    @Autowired
    AbonoOrganicoRecomendacionService abonoOrganicoRecomendacionService;

    @Autowired
    AbonoOrganicoService abonoOrganicoService;

    @Autowired
    RecomendacionService recomendacionService;

    @GetMapping
    public ResponseEntity<?> getAbonoOrganico(){
        return ResponseEntity.ok(abonoOrganicoRecomendacionService.getAllAbonoOrganicoRecomendacion());
    }

    @PostMapping
    public ResponseEntity<?> saveAbonoOrganico(@RequestBody AbonoOrganicoRecomendacion abonoOrganico){
        AbonoOrganico abonoOrganico1 =
                abonoOrganicoService.getAbonoOrganicoById(abonoOrganico.getIdAbonoOrganico().getId());
        if(abonoOrganico1==null)
            return new ResponseEntity<>(new Mensaje("Abono organico no existe"), HttpStatus.NOT_FOUND);
        Recomendacion recomendacion =
                recomendacionService.findRecomendacionById(abonoOrganico.getIdRecomendacion().getId());
        if(recomendacion==null)
            return new ResponseEntity<>(new Mensaje("Recomendacion no existe"), HttpStatus.NOT_FOUND);
        abonoOrganico.setIdAbonoOrganico(abonoOrganico1);
        abonoOrganico.setIdRecomendacion(recomendacion);
        abonoOrganicoRecomendacionService.saveAbonoOrganicoRecomendacion(abonoOrganico);
        return ResponseEntity.ok(new Mensaje("Abono organico recomendacion guardado"));
    }


}
