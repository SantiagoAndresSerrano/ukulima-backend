package ufps.ukulima.infrastructure.entry_points.rest.EtapaFenologica;

import io.swagger.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ufps.ukulima.config.Spring.security.dto.Mensaje;
import ufps.ukulima.domain.model.Recomendacion.EtapaFenologica.EtapaFenologica;
import ufps.ukulima.domain.model.Recomendacion.EtapaFenologica.gateway.EtapaFenologicaService;

@RestController
@RequestMapping(value="/api/etapafenologica",produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class EtapaFenologicaController {

    @Autowired
    EtapaFenologicaService etapaFenologicaService;

    @GetMapping
    public ResponseEntity<?> getAllEtapaFenologica(){
        return ResponseEntity.ok(etapaFenologicaService.getAllEtapaFenologica());
    }

    @GetMapping("/{idEtapa}")
    public ResponseEntity<?> getEtapaById(@PathVariable int idEtapa){
       EtapaFenologica etapaFenologica= etapaFenologicaService.getEtapaFenologicaById(idEtapa);
        if(etapaFenologica==null)
            return new ResponseEntity<>(new Mensaje("Etapa fenologica con id"+idEtapa+" no encontrada"),
                    HttpStatus.NOT_FOUND);
        return ResponseEntity.ok(etapaFenologica);
    }


}
