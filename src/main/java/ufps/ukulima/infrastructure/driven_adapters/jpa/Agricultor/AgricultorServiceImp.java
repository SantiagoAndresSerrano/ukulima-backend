package ufps.ukulima.infrastructure.driven_adapters.jpa.Agricultor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.AbonoOrganicoRecomendacion.AbonoOrganicoRecomendacion;
import ufps.ukulima.domain.model.AbonoOrganicoRecomendacion.gateway.AbonoOrganicoRecomendacionService;
import ufps.ukulima.domain.model.Agricultor.Agricultor;
import ufps.ukulima.domain.model.Agricultor.gateway.AgricultorService;

import java.util.List;

@Service
public class AgricultorServiceImp implements AgricultorService {

    @Autowired
    AgricultorRepository agricultorRepository;


    @Override
    @Transactional(readOnly = true)
    public Agricultor getAgricultorById(int id) {
        return agricultorRepository.getById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Agricultor getAgricultorByEmail(String email) {
        return agricultorRepository.findAgricultorByEmail(email);
    }

    @Override
    @Transactional(readOnly = true)
    public Agricultor getAgricultorByTelefono(String telefono) {
        return agricultorRepository.findAgricultorByTelefono(telefono);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Agricultor> getAllAgricultor() {
        return agricultorRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public void saveAgricultor(Agricultor agricultor) {
        agricultorRepository.save(agricultor);
    }
}
