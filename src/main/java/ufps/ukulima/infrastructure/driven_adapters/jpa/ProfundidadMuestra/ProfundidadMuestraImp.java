package ufps.ukulima.infrastructure.driven_adapters.jpa.ProfundidadMuestra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.ProfundidadMuestra.gateway.ProfundidaMuestraService;
import ufps.ukulima.domain.model.ProfundidadMuestra.ProfundidadMuestra;

import java.util.List;

@Service
public class ProfundidadMuestraImp implements ProfundidaMuestraService {

    @Autowired
    ProfundidaMuestraRepository profundidaMuestraRepository;

    @Override
    @Transactional
    public void saveProfundidaMuestra(ProfundidadMuestra profundidadMuestra) {
        profundidaMuestraRepository.save(profundidadMuestra);
    }
    @Override
    @Transactional(readOnly = true)
    public ProfundidadMuestra findProfundidadMuestraById(int id) {
        return profundidaMuestraRepository.getById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ProfundidadMuestra> findByAllProfundidadMuestra() {
        return profundidaMuestraRepository.findAll();
    }
}


