package ufps.ukulima.infrastructure.entry_points.rest.AbonoOrganico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import ufps.ukulima.config.Spring.security.dto.Mensaje;
import ufps.ukulima.domain.model.AbonoOrganico.AbonoOrganico;
import ufps.ukulima.domain.model.AbonoOrganico.gateway.AbonoOrganicoService;
import ufps.ukulima.domain.model.ErrorMapping.ErrorMapping;
import ufps.ukulima.domain.model.Recomendacion.Recomendacion;

import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api/abonoorganico", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class AbonoOrganicoRestController {

    @Autowired
    AbonoOrganicoService abonoOrganicoService;

    @GetMapping
    public ResponseEntity<List<AbonoOrganico>> getAll() {
        return new ResponseEntity<>(abonoOrganicoService.getAllAbonoOrganicos(), HttpStatus.OK);
    }

    @GetMapping("/{idAbonoOrganico}")
    public ResponseEntity<List<AbonoOrganico>> getAll(@PathVariable int idAbonoOrganico) {
        return new ResponseEntity<>(abonoOrganicoService.getAllAbonoOrganicos(), HttpStatus.OK);
    }

    @GetMapping("/recomendacion/{idAbonoOrganico}")
    public ResponseEntity<List<Recomendacion>> getAllRecomendationAbono(@PathVariable int idAbonoOrganico) {
        return new ResponseEntity<>(abonoOrganicoService.recomendaciones(idAbonoOrganico), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> saveAbonoOrganico(@RequestBody @Valid AbonoOrganico abonoOrganico, BindingResult br) {

        if (br.hasErrors())
            return new ResponseEntity<ErrorMapping>(new ErrorMapping(br.getFieldErrors()), HttpStatus.BAD_REQUEST);

        abonoOrganicoService.saveAbonoOrganico(abonoOrganico);
        return ResponseEntity.ok(new Mensaje("Abono organico guardado con exito"));
    }

}
