package ufps.ukulima.infrastructure.entry_points.rest.Cultivo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ufps.ukulima.config.Spring.security.dto.Mensaje;
import ufps.ukulima.domain.model.Agricultor.Agricultor;
import ufps.ukulima.domain.model.Agricultor.gateway.AgricultorService;
import ufps.ukulima.domain.model.Cultivo.Cultivo;
import ufps.ukulima.domain.model.Cultivo.gateway.CultivoService;
import ufps.ukulima.domain.model.DistanciaSiembra.DistanciaSiembra;
import ufps.ukulima.domain.model.DistanciaSiembra.gateway.DistanciaSiembraService;
import ufps.ukulima.domain.model.ErrorMapping.ErrorMapping;
import ufps.ukulima.domain.model.Finca.Finca;
import ufps.ukulima.domain.model.Finca.gateway.FincaService;
import ufps.ukulima.domain.model.Recomendacion.EtapaFenologica.EtapaFenologica;
import ufps.ukulima.domain.model.Recomendacion.EtapaFenologica.gateway.EtapaFenologicaService;
import ufps.ukulima.domain.model.Topografia.Topografia;
import ufps.ukulima.domain.model.Topografia.gateway.TopografiaService;
import ufps.ukulima.domain.model.Variedad.Variedad;
import ufps.ukulima.domain.model.Variedad.gateway.VariedadService;

import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api/cultivo", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class CultivoController {

    @Autowired
    CultivoService cultivoService;

    @Autowired
    FincaService fincaService;

    @Autowired
    AgricultorService agricultorService;

    @Autowired
    DistanciaSiembraService distanciaSiembraService;

    @Autowired
    EtapaFenologicaService etapaFenologicaService;

    @Autowired
    TopografiaService topografiaService;

    @Autowired
    VariedadService variedadService;

    @GetMapping
    public ResponseEntity<?> getAllCultivo() {
        return ResponseEntity.ok(cultivoService.getAllCultivo());
    }

    @PostMapping
    public ResponseEntity<?> saveCultivo(@Valid @RequestBody Cultivo cultivo, BindingResult br) {

        if (br.hasErrors())
            return new ResponseEntity<ErrorMapping>(new ErrorMapping(br.getFieldErrors()), HttpStatus.BAD_REQUEST);

        DistanciaSiembra distanciaSiembra = distanciaSiembraService
                .getDistanciaSiembraById(cultivo.getIdDistanciaSiembra().getId());
        EtapaFenologica etapaFenologica = etapaFenologicaService
                .getEtapaFenologicaById(cultivo.getIdEtapaFenologica().getId());
        Topografia topografia = topografiaService.findTopografiaById(cultivo.getIdTopografia().getId());
        Variedad variedad = variedadService.findVariedadById(cultivo.getIdVariedad().getId());
        Finca finca = fincaService.getFincaById(cultivo.getIdFinca().getIdFinca());

        if (distanciaSiembra == null)
            return new ResponseEntity<>(new Mensaje("distanciaSiembra no encontrada"),
                    HttpStatus.BAD_REQUEST);

        if (etapaFenologica == null)
            return new ResponseEntity<>(new Mensaje("etapaFenologica no encontrada"),
                    HttpStatus.BAD_REQUEST);

        if (topografia == null)
            return new ResponseEntity<>(new Mensaje("topografia no encontrada"),
                    HttpStatus.BAD_REQUEST);

        if (variedad == null)
            return new ResponseEntity<>(new Mensaje("variedad no encontrada"),
                    HttpStatus.BAD_REQUEST);

        if (finca == null)
            return new ResponseEntity<>(new Mensaje("finca no encontrada"),
                    HttpStatus.BAD_REQUEST);

        cultivo.setIdFinca(finca);
        cultivo.setIdTopografia(topografia);
        cultivo.setIdVariedad(variedad);
        cultivo.setIdDistanciaSiembra(distanciaSiembra);
        cultivo.setIdEtapaFenologica(etapaFenologica);
        cultivoService.saveCultivo(cultivo);

        return ResponseEntity.ok(new Mensaje("Cultivo agregado a la finca " + finca.getNombre()));

    }

    @PutMapping
    public ResponseEntity<?> updateCultivo(@Valid @RequestBody Cultivo cultivo, BindingResult br) {

        if (br.hasErrors())
            return new ResponseEntity<ErrorMapping>(new ErrorMapping(br.getFieldErrors()), HttpStatus.BAD_REQUEST);

        if (cultivo.getIdCultivo() == null)
            return new ResponseEntity<>(new Mensaje("Debe proporcionar un ID si desea actualizar"),
                    HttpStatus.BAD_REQUEST);

        DistanciaSiembra distanciaSiembra = distanciaSiembraService
                .getDistanciaSiembraById(cultivo.getIdDistanciaSiembra().getId());
        EtapaFenologica etapaFenologica = etapaFenologicaService
                .getEtapaFenologicaById(cultivo.getIdEtapaFenologica().getId());
        Topografia topografia = topografiaService.findTopografiaById(cultivo.getIdTopografia().getId());
        Variedad variedad = variedadService.findVariedadById(cultivo.getIdVariedad().getId());
        Finca finca = fincaService.getFincaById(cultivo.getIdFinca().getIdFinca());

        if (distanciaSiembra == null)
            return new ResponseEntity<>(new Mensaje("distanciaSiembra no encontrada"),
                    HttpStatus.BAD_REQUEST);

        if (etapaFenologica == null)
            return new ResponseEntity<>(new Mensaje("etapaFenologica no encontrada"),
                    HttpStatus.BAD_REQUEST);

        if (topografia == null)
            return new ResponseEntity<>(new Mensaje("topografia no encontrada"),
                    HttpStatus.BAD_REQUEST);

        if (variedad == null)
            return new ResponseEntity<>(new Mensaje("variedad no encontrada"),
                    HttpStatus.BAD_REQUEST);

        if (finca == null)
            return new ResponseEntity<>(new Mensaje("finca no encontrada"),
                    HttpStatus.BAD_REQUEST);

        cultivo.setIdFinca(finca);
        cultivo.setIdTopografia(topografia);
        cultivo.setIdVariedad(variedad);
        cultivo.setIdDistanciaSiembra(distanciaSiembra);
        cultivo.setIdEtapaFenologica(etapaFenologica);

        cultivoService.saveCultivo(cultivo);

        return ResponseEntity.ok(new Mensaje("Cultivo actualizado"));

    }

    @GetMapping("/{emailOrPhone}")
    public ResponseEntity<?> getAllCultivoAgricultor(@PathVariable String emailOrPhone) {
        Agricultor agricultor = agricultorService.getAgricultorByPhoneOrEmail(emailOrPhone);
        if (agricultor == null) {
            return new ResponseEntity<>(
                    new Mensaje("El agricultor con telefono o email " + emailOrPhone + ", no existe"),
                    HttpStatus.NOT_FOUND);
        }
        List<Finca> fincas = (List<Finca>) (agricultor.getFincaCollection());
        return ResponseEntity.ok(fincas.get(0).getCultivoCollection());
    }

}
