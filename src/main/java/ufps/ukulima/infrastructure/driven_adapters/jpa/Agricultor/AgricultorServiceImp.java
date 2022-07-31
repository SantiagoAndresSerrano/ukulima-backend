package ufps.ukulima.infrastructure.driven_adapters.jpa.Agricultor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
    public Agricultor getAgricultorById(int id) {
        return agricultorRepository.getById(id);
    }

    @Override
    public Agricultor getAgricultorByEmail(String email) {
        return agricultorRepository.findAgricultorByEmail(email);
    }

    @Override
    public Agricultor getAgricultorByTelefono(String telefono) {
        return agricultorRepository.findAgricultorByTelefono(telefono);
    }

    @Override
    public List<Agricultor> getAllAgricultor() {
        return agricultorRepository.findAll();
    }

    @Override
    public void updateAgricultor(Agricultor agricultor) {
        agricultorRepository.save(agricultor);
    }
}
