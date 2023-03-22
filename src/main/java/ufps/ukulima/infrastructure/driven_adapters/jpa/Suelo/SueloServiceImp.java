package ufps.ukulima.infrastructure.driven_adapters.jpa.Suelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.Suelo.Suelo;
import ufps.ukulima.domain.model.Suelo.gateway.SueloService;
import ufps.ukulima.infrastructure.db.springdata.mapper.SueloEntityMapper;

import java.util.List;

@Service
public class SueloServiceImp implements SueloService {
    @Autowired
    SueloRepository sueloRepository;

    @Autowired
    SueloEntityMapper sueloEntityMapper;

    @Override
    @Transactional(readOnly = true)
    public Suelo getSueloById(int id) {
        return sueloEntityMapper.toDomain(sueloRepository.getById(id));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Suelo> getAllSuelos() {
        return sueloEntityMapper.toDomain(sueloRepository.findAll());
    }

    @Override
    @Transactional
    public void saveSuelo(Suelo abonoOrganico) {

    }

}
