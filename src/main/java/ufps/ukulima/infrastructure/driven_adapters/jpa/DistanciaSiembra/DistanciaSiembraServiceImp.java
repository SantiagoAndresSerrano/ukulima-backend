package ufps.ukulima.infrastructure.driven_adapters.jpa.DistanciaSiembra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.DistanciaSiembra.DistanciaSiembra;
import ufps.ukulima.domain.model.DistanciaSiembra.gateway.DistanciaSiembraService;
import ufps.ukulima.infrastructure.db.springdata.mapper.DistanciaSiembraEntityMapper;

import java.util.List;
@Service
public class DistanciaSiembraServiceImp implements DistanciaSiembraService {
    @Autowired
    DistanciaSiembraRepository distanciaSiembraRepository;

    @Autowired
    DistanciaSiembraEntityMapper distanciaSiembraEntityMapper;

    @Override
    @Transactional(readOnly = true)
    public DistanciaSiembra getDistanciaSiembraById(int idDistanciaSiembra) {
        return distanciaSiembraEntityMapper.toDomain(distanciaSiembraRepository.getById(idDistanciaSiembra));
    }

    @Override
    @Transactional(readOnly = true)
    public List<DistanciaSiembra> getAllDistanciaSiembra() {
        return distanciaSiembraEntityMapper.abonosOrganicosRecomendacionToDomain(distanciaSiembraRepository.findAll());
    }

    @Override
    @Transactional
    public void saveDistanciaSiembra(DistanciaSiembra distanciaSiembra) {
        distanciaSiembraRepository.save(distanciaSiembraEntityMapper.toEntity(distanciaSiembra));
    }
}
