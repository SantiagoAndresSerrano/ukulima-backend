package ufps.ukulima.infrastructure.driven_adapters.jpa.Agricultor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.extern.slf4j.Slf4j;
import ufps.ukulima.domain.model.Agricultor.Agricultor;
import ufps.ukulima.domain.model.Agricultor.gateway.AgricultorService;
import ufps.ukulima.domain.model.TipoIdentificacion.TipoIdentificacion;
import ufps.ukulima.infrastructure.db.springdata.entity.Agricultor.AgricultorEntity;
import ufps.ukulima.infrastructure.db.springdata.mapper.AgricultorEntityMapper;
import ufps.ukulima.infrastructure.driven_adapters.jpa.TipoIdentificacion.TipoIdentificacionRepository;

import java.util.List;

@Service
@Slf4j
public class AgricultorServiceImp implements AgricultorService {

    @Autowired
    AgricultorRepository agricultorRepository;
    @Autowired
    TipoIdentificacionRepository tipoIdentificacionRepository;

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
        return agricultorRepository.existsAgricultorByIdentificacion(id);
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
        AgricultorEntity agricultorEntity = agricultorEntityMapper.toEntity(agricultor);
        agricultorEntity.setIdentificacion(agricultor.getIdentificacion());
        agricultorEntity.setIdTipoIdentificacion(tipoIdentificacionRepository.getById(agricultor.getIdTipoidentificacion().getIdTipo()));
        agricultorRepository.saveAgricultorEntity(
            agricultorEntity.getIdentificacion(),
            agricultorEntity.getNombres(),
            agricultorEntity.getApellidos(),
            agricultorEntity.getTelefono(),
            agricultorEntity.getFechaNacimiento(),
            agricultorEntity.getPassword(),
            agricultorEntity.getEmail(),
            agricultorEntity.getIdTipoIdentificacion().getIdTipo(),
            agricultorEntity.getConfirmationToken(),
            agricultorEntity.getEstado()
            );
    }

    @Override
    public Agricultor findByResetPassword(String token) {
        return null;
    }
}
