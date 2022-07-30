package ufps.ukulima.infrastructure.DrivenAdapters.ProfundidadMuestra;

import org.springframework.beans.factory.annotation.Autowired;
import ufps.ukulima.domain.model.ProfundidadMuestra.GateWays.ProfundidaMuestraService;
import ufps.ukulima.domain.model.ProfundidadMuestra.ProfundidadMuestra;
import ufps.ukulima.domain.repository.ProfundidaMuestraRepository;

import java.util.List;

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


