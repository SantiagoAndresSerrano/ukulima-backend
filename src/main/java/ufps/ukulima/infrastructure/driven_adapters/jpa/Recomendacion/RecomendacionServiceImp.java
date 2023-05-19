package ufps.ukulima.infrastructure.driven_adapters.jpa.Recomendacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.Recomendacion.Recomendacion;
import ufps.ukulima.domain.model.Recomendacion.gateway.RecomendacionService;
import ufps.ukulima.infrastructure.db.springdata.entity.Recomendacion.RecomendacionEntity;
import ufps.ukulima.infrastructure.mapper.RecomendacionEntityMapper;

import java.util.List;
@Service
public class RecomendacionServiceImp implements RecomendacionService {

    @Autowired
    private RecomendacionRepository recomendacionRepository;
    @Autowired
    private RecomendacionEntityMapper recomendacionEntityMapper;

    @Autowired
    public RecomendacionServiceImp(RecomendacionRepository recomendacionRepository, RecomendacionEntityMapper recomendacionEntityMapper) {
        this.recomendacionRepository = recomendacionRepository;
        this.recomendacionEntityMapper = recomendacionEntityMapper;
    }

    @Override
    @Transactional(readOnly = true)
    public Recomendacion getRecomendacionById(int idRecomendacion) {
        return recomendacionEntityMapper.toDomain(recomendacionRepository.getById(idRecomendacion));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Recomendacion> getAllRecomendacion() {
        return recomendacionEntityMapper.abonosOrganicosRecomendacionToDomain(recomendacionRepository.findAll());
    }

    @Override
    @Transactional
    public RecomendacionEntity saveRecomendacion(RecomendacionEntity recomendacion) {
        return recomendacionRepository.save(recomendacion);
    }
}

