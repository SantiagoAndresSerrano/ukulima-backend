package ufps.ukulima.infrastructure.driven_adapters.jpa.AnalisisSueloRelacionBase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.AnalisisSueloRelacionBase.AnalisisSueloRelacionBase;
import ufps.ukulima.domain.model.AnalisisSueloRelacionBase.gateway.AnalisisSueloRelacionBaseService;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisSuelo.AnalisisSueloEntity;
import ufps.ukulima.infrastructure.mapper.AnalisisSueloRelacionBaseEntityMapper;

import java.util.List;

@Service
public class AnalisisSueloRelacionBaseServiceImp implements AnalisisSueloRelacionBaseService {
    @Autowired
    AnalisisSueloRelacionBaseRepository analisisSueloRelacionBaseRepository;
    @Autowired
    AnalisisSueloRelacionBaseEntityMapper analisisSueloRelacionBaseEntityMapper;

    @Override
    @Transactional(readOnly = true)

    public AnalisisSueloRelacionBase getAnalisisSueloRelacionBaseById(int idAnalisisSueloRelacionBase) {
        return analisisSueloRelacionBaseEntityMapper.toDomain(analisisSueloRelacionBaseRepository.getById(idAnalisisSueloRelacionBase));
    }

    @Override
    @Transactional(readOnly = true)
    public List<AnalisisSueloRelacionBase> getAllAnalisisSueloRelacionBase() {
        return analisisSueloRelacionBaseEntityMapper.toDomain(analisisSueloRelacionBaseRepository.findAll());
    }

    @Override
    public List<AnalisisSueloRelacionBase> getAllAnalisisSueloByAnalisisSuelo(int idAnalisisSuelo) {
        return analisisSueloRelacionBaseEntityMapper.toDomain(analisisSueloRelacionBaseRepository.
                getAllByIdAnalisisSuelo(new AnalisisSueloEntity(idAnalisisSuelo)));
    }

    @Override
    @Transactional
    public void saveAnalisisSueloRelacionBase(AnalisisSueloRelacionBase analisisSueloRelacionBase) {
        analisisSueloRelacionBaseRepository.save(analisisSueloRelacionBaseEntityMapper.toEntity(analisisSueloRelacionBase));
    }
}
