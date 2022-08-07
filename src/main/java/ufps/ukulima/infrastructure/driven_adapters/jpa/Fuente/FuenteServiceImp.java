package ufps.ukulima.infrastructure.driven_adapters.jpa.Fuente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.Fuente.Fuente;
import ufps.ukulima.domain.model.Fuente.gateway.FuenteService;
import ufps.ukulima.infrastructure.db.springdata.mapper.FuenteEntityMapper;

import java.util.List;
@Service
public class FuenteServiceImp implements FuenteService {

    @Autowired
    FuenteRepository fuenteRepository;

    @Autowired
    FuenteEntityMapper fuenteEntityMapper;
    @Override
    @Transactional(readOnly = true)
    public Fuente getFuenteById(int idFuente) {
        return fuenteEntityMapper.toDomain(fuenteRepository.getById(idFuente));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Fuente> getAllFuente() {
        return fuenteEntityMapper.abonosOrganicosRecomendacionToDomain(fuenteRepository.findAll());
    }

    @Override
    @Transactional
    public void saveFuente(Fuente Fuente) {
         fuenteRepository.save(fuenteEntityMapper.toEntity(Fuente));
    }
}
