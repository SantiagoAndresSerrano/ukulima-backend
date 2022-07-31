package ufps.ukulima.infrastructure.driven_adapters.jpa.ProfundidadMuestra;

import org.springframework.beans.factory.annotation.Autowired;
import ufps.ukulima.domain.model.ProfundidadMuestra.gateway.ProfundidaMuestraService;
import ufps.ukulima.domain.model.ProfundidadMuestra.ProfundidadMuestra;

public class ProfundidadMuestraImp extends ProfundidaMuestraService {

    @Autowired
    ProfundidaMuestraRepository profundidaMuestraRepository;

    @Override
    public void saveProfundidaMuestra() {

    }

    @Override
    public ProfundidadMuestra findProfundidadMuestraById(int id) {
        return null;
    }
}


