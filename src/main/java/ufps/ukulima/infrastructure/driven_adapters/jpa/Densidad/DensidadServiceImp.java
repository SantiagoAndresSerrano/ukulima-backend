package ufps.ukulima.infrastructure.driven_adapters.jpa.Densidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.Densidad.Densidad;
import ufps.ukulima.domain.model.Densidad.gateway.DensidadService;

import java.util.List;
@Service
public class DensidadServiceImp implements DensidadService {

    @Autowired
    DensidadRepository densidadRepository;

    @Override
    @Transactional(readOnly = true)
    public Densidad getDensidadById(int idDensidad) {
        return densidadRepository.getById(idDensidad);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Densidad> getAllDensidad() {
        return densidadRepository.findAll();
    }

    @Override
    @Transactional
    public void saveDensidad(Densidad densidad) {
        densidadRepository.save(densidad);
    }
}
