package ufps.ukulima.infrastructure.driven_adapters.jpa.AnalisisSuelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.AnalisisSuelo.AnalisisSuelo;
import ufps.ukulima.domain.model.AnalisisSuelo.gateway.AnalisisSueloService;
import ufps.ukulima.infrastructure.mapper.AnalisisSueloEntityMapper;

import java.util.List;
@Service
public class AnalisisSueloServiceImp implements AnalisisSueloService {

    @Autowired
    AnalisisSueloRepository analisisSueloRepository;


    @Autowired
    AnalisisSueloEntityMapper analisisSueloEntityMapper;

    @Override
    @Transactional(readOnly = true)
    public AnalisisSuelo getAnalisisSueloById(int idAnalisisSuelo) {
        return analisisSueloEntityMapper.toDomain(analisisSueloRepository.getById(idAnalisisSuelo));
    }

    @Override
    @Transactional(readOnly = true)
    public List<AnalisisSuelo> getAllAnalisisSuelo() {
        return analisisSueloEntityMapper.toDomain(analisisSueloRepository.findAll());
    }

    @Override
    public List<AnalisisSuelo> getAllAnalisisSueloByLote(int idLote) {
        return analisisSueloEntityMapper.toDomain(analisisSueloRepository.finAllByLotes(idLote));
    }

    @Override
    @Transactional
    public AnalisisSuelo saveAnalisisSuelo(AnalisisSuelo analisisSuelo) {
        return analisisSueloEntityMapper.toDomain(
                analisisSueloRepository.save(analisisSueloEntityMapper.toEntity(analisisSuelo)));
    }
}
