package ufps.ukulima.infrastructure.entry_points.rest.Finca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ufps.ukulima.domain.model.Finca.gateway.FincaService;

@RestController
@RequestMapping("/api/finca")
@CrossOrigin
public class FincaController {

    @Autowired
    FincaService fincaService;


}
