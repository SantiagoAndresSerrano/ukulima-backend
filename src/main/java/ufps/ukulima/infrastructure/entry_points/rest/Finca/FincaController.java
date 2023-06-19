package ufps.ukulima.infrastructure.entry_points.rest.Finca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ufps.ukulima.config.Spring.security.dto.Mensaje;
import ufps.ukulima.domain.model.Agricultor.Agricultor;
import ufps.ukulima.domain.model.Agricultor.gateway.AgricultorService;
import ufps.ukulima.domain.model.Corregimiento.Corregimiento;
import ufps.ukulima.domain.model.Corregimiento.gateway.CorregimientoService;
import ufps.ukulima.domain.model.ErrorMapping.ErrorMapping;
import ufps.ukulima.domain.model.Finca.Finca;
import ufps.ukulima.domain.model.Finca.gateway.FincaService;
import ufps.ukulima.domain.model.Lote.Lote;
import ufps.ukulima.domain.model.Lote.gateway.LoteServicio;
import ufps.ukulima.domain.model.Municipio.Municipio;
import ufps.ukulima.domain.model.Municipio.gateway.MunicipioService;
import ufps.ukulima.domain.model.Suelo.Suelo;
import ufps.ukulima.domain.model.Suelo.gateway.SueloService;
import ufps.ukulima.domain.model.Vereda.Vereda;
import ufps.ukulima.domain.model.Vereda.gateway.VeredaService;
import ufps.ukulima.infrastructure.db.springdata.entity.Finca.FincaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Lote.LoteEntity;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/finca")
@CrossOrigin
public class FincaController {

    @Autowired
    FincaService fincaService;


    @Autowired
    LoteServicio loteServicio;
    @Autowired
    AgricultorService agricultorService;

    @Autowired
    CorregimientoService corregimientoService;

    @Autowired
    SueloService sueloService;

    @Autowired
    VeredaService veredaService;

    @Autowired
    MunicipioService municipioService;

    @GetMapping
    public ResponseEntity<List<Finca>> getAllFinca() {
        return ResponseEntity.ok(fincaService.getAllFinca());
    }

    @GetMapping("/{emailOrPhone}")
    public ResponseEntity<?> getAllFincaByAgricultor(@PathVariable String emailOrPhone) {
        Agricultor agricultor = agricultorService.getAgricultorByPhoneOrEmail(emailOrPhone);
        if (agricultor == null) {
            return new ResponseEntity<>(
                    new Mensaje("El agricultor con telefono o email " + emailOrPhone + ", no existe"),
                    HttpStatus.NOT_FOUND);
        }
        List<Finca> fincas = fincaService.getFincaByIdAgricultor(agricultor);

        if(fincas == null){
            return ResponseEntity.ok(new ArrayList<>());
        }
        return ResponseEntity.ok(fincas);
    }

    @GetMapping("/{idFinca}/lotes")
    public ResponseEntity<?> getAllLotesByFinca(@PathVariable int idFinca) {
        boolean exist = fincaService.existById(idFinca);
        if(!exist){
            return new ResponseEntity<>(
                    new Mensaje("La finca no existe"),
                    HttpStatus.NOT_FOUND);
        }
        Finca finca = fincaService.getFincaById(idFinca);
        if (finca == null) {
            return new ResponseEntity<>(
                    new Mensaje("La finca no existe"),
                    HttpStatus.NOT_FOUND);
        }
        List<Lote> lotes = loteServicio.getAllLotesByFinca(finca);

        if(lotes == null){
            return ResponseEntity.ok(new ArrayList<>());
        }
        return ResponseEntity.ok(lotes);
    }

    @PostMapping("/{emailOrPhone}")
    public ResponseEntity<?> saveFinca(@PathVariable String emailOrPhone,@Valid @RequestBody Finca finca,
                                       BindingResult br) {

        if (br.hasErrors())
            return new ResponseEntity<ErrorMapping>(new ErrorMapping(br.getFieldErrors()), HttpStatus.BAD_REQUEST);

        Agricultor agricultor = agricultorService.getAgricultorByPhoneOrEmail(emailOrPhone);
        if (agricultor == null) {
            return new ResponseEntity<>(
                    new Mensaje("El agricultor con telefono o email " + emailOrPhone + ", no existe"),
                    HttpStatus.NOT_FOUND);
        }
        finca.setIdAgricultor(agricultor);
        FincaEntity fincaEntity=fincaService.saveFinca(finca);

        if(finca.getLoteEntityCollection() != null){
            List<Lote> lotes = (List) finca.getLoteEntityCollection();
            for (int i = 0; i < finca.getLoteEntityCollection().size(); i++) {
                Lote lote=lotes.get(i);
                lote.setIdFinca(new Finca(fincaEntity.getIdFinca()));
                List<Suelo> suelos=lote.getSuelos();
                LoteEntity loteGuardado=loteServicio.saveLote(lote);
                if(suelos != null){
                    for (int j = 0; j < suelos.size(); j++) {
                        Suelo suelo = suelos.get(j);
                        suelo.setIdLote(new Lote(loteGuardado.getId()));
                        sueloService.saveSuelo(suelo);
                    }
                }
                }
        }
        return ResponseEntity.ok(new Mensaje("Finca guardada"));
    }

    @PutMapping
    public ResponseEntity<?> updateFinca(@Valid @RequestBody Finca finca, BindingResult br) {

        if (br.hasErrors())
            return new ResponseEntity<ErrorMapping>(new ErrorMapping(br.getFieldErrors()), HttpStatus.BAD_REQUEST);

        if (finca.getIdFinca() == null)
            return new ResponseEntity<>(new Mensaje("Debe proporcionar un ID si desea actualizar"),
                    HttpStatus.BAD_REQUEST);
        boolean exist = fincaService.existById(finca.getIdFinca());
        if(!exist){
            return new ResponseEntity<>(
                    new Mensaje("La finca no existe"),
                    HttpStatus.NOT_FOUND);
        }
        Corregimiento corregimiento = corregimientoService
                .getCorregimientoById(finca.getIdCorregimiento().getIdCorregimiento());
        Municipio municipio = municipioService.getMunicipioById(finca.getIdMunicipio().getIdMunicipio());
        Vereda vereda = veredaService.findVeredaById(finca.getIdVereda().getIdVereda());

        Agricultor agricultor = agricultorService.getAgricultorById(finca.getIdAgricultor().getIdentificacion());
        if (agricultor == null) {
            return new ResponseEntity<>(new Mensaje("No existe un agricultor con ese ID"), HttpStatus.BAD_REQUEST);
        }

        finca.setIdAgricultor(agricultor);
        finca.setIdCorregimiento(corregimiento);
        finca.setIdMunicipio(municipio);
        finca.setIdVereda(vereda);
        fincaService.saveFinca(finca);

        return ResponseEntity.ok(new Mensaje("Finca actualizada"));
    }

}
