package ufps.ukulima.infrastructure.driven_adapters.jpa.Topografia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ufps.ukulima.domain.model.Topografia.Topografia;
import ufps.ukulima.domain.model.Topografia.gateway.TopografiaService;
import ufps.ukulima.infrastructure.db.springdata.mapper.TopografiaEntityMapper;

import java.util.List;
@Service
public class TopografiaServiceImp implements TopografiaService {

    @Autowired
    TopografiaRepository topografiaRepository;

    @Autowired
    TopografiaEntityMapper topografiaEntityMapper;

    @Override
    public void saveTopografia(Topografia topografia) {
        topografiaRepository.save(topografiaEntityMapper.toEntity(topografia));
    }

    @Override
    public Topografia findTopografiaById(int id) {
        return topografiaEntityMapper.toDomain(topografiaRepository.getById(id));
    }

    @Override
    public List<Topografia> findByAllTopografia() {
        return topografiaEntityMapper.abonosOrganicosRecomendacionToDomain(topografiaRepository.findAll());
    }
}
