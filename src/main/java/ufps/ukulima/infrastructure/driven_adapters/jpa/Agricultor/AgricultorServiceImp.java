package ufps.ukulima.infrastructure.driven_adapters.jpa.Agricultor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.AbonoOrganicoRecomendacion.AbonoOrganicoRecomendacion;
import ufps.ukulima.domain.model.AbonoOrganicoRecomendacion.gateway.AbonoOrganicoRecomendacionService;
import ufps.ukulima.domain.model.Agricultor.Agricultor;
import ufps.ukulima.domain.model.Agricultor.gateway.AgricultorService;
import ufps.ukulima.infrastructure.db.springdata.mapper.AgricultorEntityMapper;

import java.util.List;

@Service
public class AgricultorServiceImp implements AgricultorService {

    @Autowired
    AgricultorRepository agricultorRepository;

    @Autowired
    AgricultorEntityMapper agricultorEntityMapper;


    @Override
    @Transactional(readOnly = true)
    public Agricultor getAgricultorById(int id) {
        return agricultorEntityMapper.toDomain(agricultorRepository.getById(id));
    }

    @Override
    @Transactional(readOnly = true)
    public Agricultor getAgricultorByEmail(String email) {
        return agricultorEntityMapper.toDomain(agricultorRepository.findAgricultorByEmail(email));
    }

    @Override
    public Agricultor getAgricultorByPhone(String phone) {
        return agricultorEntityMapper.toDomain(agricultorRepository.findAgricultorByTelefono(phone));

    }

    @Override
    @Transactional(readOnly = true)
    public Agricultor getAgricultorByPhoneOrEmail(String phone) {
        return agricultorEntityMapper.toDomain(agricultorRepository.findAgricultorsByTelefonoOrEmail(phone));
    }

    @Override
    @Transactional(readOnly = true)
    public boolean existById(int id) {
        return agricultorRepository.existsAgricultorByIdentifiacion(id);
    }


    @Override
    @Transactional(readOnly = true)
    public boolean existByEmail(String email) {
        return agricultorRepository.existsAgricultorByEmail(email);
    }

    @Override
    @Transactional(readOnly = true)
    public boolean existByPhone(String email) {
        return agricultorRepository.existsAgricultorByEmail(email);
    }


    @Override
    @Transactional(readOnly = true)
    public List<Agricultor> getAllAgricultor() {
        return agricultorEntityMapper.AgricultorToDomain(agricultorRepository.findAll());
    }

    @Override
    @Transactional
    public void saveAgricultor(Agricultor agricultor) {
        agricultorRepository.save(agricultorEntityMapper.toEntity(agricultor));
    }

    @Override
    public Agricultor findByResetPassword(String token) {
        return null;
    }
}
