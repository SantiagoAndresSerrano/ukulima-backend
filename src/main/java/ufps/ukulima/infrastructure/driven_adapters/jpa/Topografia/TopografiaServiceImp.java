package ufps.ukulima.infrastructure.driven_adapters.jpa.Topografia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ufps.ukulima.domain.model.Topografia.Topografia;
import ufps.ukulima.domain.model.Topografia.gateway.TopografiaService;

import java.util.List;
@Service
public class TopografiaServiceImp implements TopografiaService {

    @Autowired
    TopografiaRepository topografiaRepository;

    @Override
    public void saveTopografia(Topografia topografia) {
        topografiaRepository.save(topografia);
    }

    @Override
    public Topografia findTopografiaById(int id) {
        return topografiaRepository.getById(id);
    }

    @Override
    public List<Topografia> findByAllTopografia() {
        return topografiaRepository.findAll();
    }
}
