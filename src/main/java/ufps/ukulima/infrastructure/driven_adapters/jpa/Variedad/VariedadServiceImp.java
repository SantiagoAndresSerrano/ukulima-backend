package ufps.ukulima.infrastructure.driven_adapters.jpa.Variedad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.Variedad.Variedad;
import ufps.ukulima.domain.model.Variedad.gateway.VariedadService;
import ufps.ukulima.infrastructure.db.springdata.mapper.VariedadEntityMapper;

import java.util.List;
@Service
public class VariedadServiceImp implements VariedadService {

    @Autowired
    VariedadRepository variedadRepository;

    @Autowired
    VariedadEntityMapper variedadEntityMapper;

    @Override
    @Transactional
    public void saveVariedad(Variedad variedad) {
        variedadRepository.save(variedadEntityMapper.toEntity(variedad));
    }

    @Override
    @Transactional(readOnly = true)
    public Variedad findVariedadById(int id) {
        return variedadEntityMapper.toDomain(variedadRepository.getById(id));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Variedad> findByAllVariedad() {
        return variedadEntityMapper.abonosOrganicosRecomendacionToDomain(variedadRepository.findAll());
    }
}
