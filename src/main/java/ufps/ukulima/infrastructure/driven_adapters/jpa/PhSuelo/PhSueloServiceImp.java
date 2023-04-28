package ufps.ukulima.infrastructure.driven_adapters.jpa.PhSuelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.PhSuelo.PhSuelo;
import ufps.ukulima.domain.model.PhSuelo.gateway.PhSueloService;
import ufps.ukulima.infrastructure.mapper.PhSueloEntityMapper;

import java.util.List;

@Service
public class PhSueloServiceImp implements PhSueloService {
    @Autowired
    PhSueloRepository phSueloRepository;

    @Autowired
    PhSueloEntityMapper phSueloEntityMapper;

    @Override
    @Transactional(readOnly = true)
    public PhSuelo getPhSueloById(int id) {
        return phSueloEntityMapper.toDomain(phSueloRepository.getById(id));
    }

    @Override
    public PhSuelo getPhSueloByValor(float valor_ph) {
        return phSueloEntityMapper.toDomain(phSueloRepository.determinarPhSuelo(valor_ph));
    }

    @Override
    @Transactional(readOnly = true)
    public List<PhSuelo> getAllPhSuelos() {
        return phSueloEntityMapper.toDomain(phSueloRepository.findAll());
    }

    @Override
    @Transactional
    public void savePhSuelo(PhSuelo abonoOrganico) {

    }

}
