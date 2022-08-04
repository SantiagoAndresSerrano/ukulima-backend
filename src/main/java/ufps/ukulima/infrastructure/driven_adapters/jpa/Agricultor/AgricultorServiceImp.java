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
    public Agricultor getAgricultorByPhone(String phone) {
        return agricultorRepository.findAgricultorByTelefono(phone);

    }

    @Override
    public Agricultor getAgricultorByPhoneOrEmail(String phone) {
        return agricultorRepository.findAgricultorByTelefonoOrEmail(phone);
    }

    @Override
    public boolean existById(int id) {
        return agricultorRepository.existsAgricultorByIdentifiacion(id);
    }


    @Override
    public boolean existByEmail(String email) {
        return agricultorRepository.existsAgricultorByEmail(email);
    }

    @Override
    public boolean existByPhone(String email) {
        return agricultorRepository.existsAgricultorByEmail(email);
    }


    @Override
    @Transactional(readOnly = true)
    public List<Agricultor> getAllAgricultor() {
        return agricultorRepository.findAll();
    }

    @Override
    @Transactional
    public void saveAgricultor(Agricultor agricultor) {
        agricultorRepository.save(agricultor);
    }
}
