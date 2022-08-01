package ufps.ukulima.infrastructure.driven_adapters.jpa.AnalisisSuelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.AnalisisElemento.AnalisisElemento;
import ufps.ukulima.domain.model.AnalisisElemento.gateway.AnalisisElementoService;
import ufps.ukulima.domain.model.AnalisisSuelo.AnalisisSuelo;
import ufps.ukulima.domain.model.AnalisisSuelo.gateway.AnalisisSueloService;
import ufps.ukulima.infrastructure.driven_adapters.jpa.AnalisisSuelo.AnalisisSueloRepository;

import java.util.List;
@Service
public class AnalisisSueloServiceImp implements AnalisisSueloService {

    @Autowired
    AnalisisSueloRepository analisisSueloRepository;


    @Override
    @Transactional(readOnly = true)
    public AnalisisSuelo getAnalisisSueloById(int idAnalisisSuelo) {
        return analisisSueloRepository.getById(idAnalisisSuelo);
    }

    @Override
    @Transactional(readOnly = true)
    public List<AnalisisSuelo> getAllAnalisisSuelo() {
        return analisisSueloRepository.findAll();
    }

    @Override
    @Transactional
    public void saveAnalisisSuelo(AnalisisSuelo analisisSuelo) {
        analisisSueloRepository.save(analisisSuelo);
    }
}
