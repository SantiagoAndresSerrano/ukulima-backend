package ufps.ukulima.infrastructure.driven_adapters.jpa.EnmiendaRecomendacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.EnmiendaRecomendacion.EnmiendaRecomendacion;
import ufps.ukulima.domain.model.EnmiendaRecomendacion.gateway.EnmiendaRecomendacionService;
import ufps.ukulima.infrastructure.db.springdata.entity.EnmiendaRecomendacion.EnmiendaRecomendacionEntity;
import ufps.ukulima.infrastructure.mapper.EnmiendaRecomendacionEntityMapper;

import java.util.List;

@Service
public class EnmiendaRecomendacionServiceImp implements EnmiendaRecomendacionService {
    @Autowired
    private EnmiendaRecomendacionRepository enmiendaRecomendacionRepository;
    @Autowired
    private  EnmiendaRecomendacionEntityMapper enmiendaRecomendacionEntityMapper;

    @Autowired
    public EnmiendaRecomendacionServiceImp(EnmiendaRecomendacionRepository enmiendaRecomendacionRepository,
                                            EnmiendaRecomendacionEntityMapper enmiendaRecomendacionEntityMapper) {
        this.enmiendaRecomendacionRepository = enmiendaRecomendacionRepository;
        this.enmiendaRecomendacionEntityMapper = enmiendaRecomendacionEntityMapper;
    }

    @Override
    @Transactional(readOnly = true)
    public EnmiendaRecomendacion getEnmiendaRecomendacionById(int idEnmiendaRecomendacion) {
        EnmiendaRecomendacionEntity enmiendaRecomendacionEntity =
                enmiendaRecomendacionRepository.getById(idEnmiendaRecomendacion);
        return enmiendaRecomendacionEntityMapper.toDomain(enmiendaRecomendacionEntity);
    }

    @Override
    @Transactional(readOnly = true)
    public List<EnmiendaRecomendacion> getAllEnmiendaRecomendacion() {
        List<EnmiendaRecomendacionEntity> enmiendaRecomendacionEntities =
                enmiendaRecomendacionRepository.findAll();
        return enmiendaRecomendacionEntityMapper.toDomainList(enmiendaRecomendacionEntities);
    }

    @Override
    @Transactional
    public void saveEnmiendaRecomendacion(EnmiendaRecomendacion enmiendaRecomendacion) {
        EnmiendaRecomendacionEntity enmiendaRecomendacionEntity =
                enmiendaRecomendacionEntityMapper.toEntity(enmiendaRecomendacion);
        enmiendaRecomendacionRepository.save(enmiendaRecomendacionEntity);
    }
}

