package ufps.ukulima.infrastructure.driven_adapters.jpa.FuenteRecomendacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.Fuente.gateway.FuenteService;
import ufps.ukulima.domain.model.FuenteRecomendacion.FuenteRecomendacion;
import ufps.ukulima.domain.model.FuenteRecomendacion.gateway.FuenteRecomendacionService;
import ufps.ukulima.infrastructure.db.springdata.mapper.FuenteRecomendacionEntityMapper;
import ufps.ukulima.infrastructure.driven_adapters.jpa.Fuente.FuenteRepository;

import java.util.List;

@Service
public class FuenteRecomendacionServiceImp implements FuenteRecomendacionService {

    @Autowired
    FuenteRecomendacionRepository fuenteRecomendacionRepository;

    @Autowired
    FuenteRecomendacionEntityMapper fuenteRecomendacionEntityMapper;

    @Override
    @Transactional(readOnly = true)
    public FuenteRecomendacion getFuenteRecomendacionById(int idFuenteRecomendacion) {
        return fuenteRecomendacionEntityMapper.toDomain(fuenteRecomendacionRepository.getById(idFuenteRecomendacion));
    }

    @Override
    @Transactional(readOnly = true)
    public List<FuenteRecomendacion> getAllFuenteRecomendacion() {
        return fuenteRecomendacionEntityMapper.abonosOrganicosRecomendacionToDomain(fuenteRecomendacionRepository.findAll());
    }

    @Override
    @Transactional
    public void saveFuenteRecomendacion(FuenteRecomendacion FuenteRecomendacion) {
        fuenteRecomendacionRepository.save(fuenteRecomendacionEntityMapper.toEntity(FuenteRecomendacion));
    }

    @Override
    public void deleteFuenteRecomendacion(FuenteRecomendacion FuenteRecomendacion) {

    }
}
