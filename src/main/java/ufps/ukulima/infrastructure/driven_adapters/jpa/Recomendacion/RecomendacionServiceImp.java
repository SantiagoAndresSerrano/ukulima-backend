package ufps.ukulima.infrastructure.driven_adapters.jpa.Recomendacion;

import org.springframework.stereotype.Service;
import ufps.ukulima.domain.model.Recomendacion.Recomendacion;
import ufps.ukulima.domain.model.Recomendacion.gateway.RecomendacionService;

import java.util.List;
@Service
public class RecomendacionServiceImp implements RecomendacionService {
    @Override
    public void saveRecomendacion(Recomendacion recomendacion) {

    }

    @Override
    public Recomendacion findRecomendacionById(int id) {
        return null;
    }

    @Override
    public List<Recomendacion> findByAllRecomendacion() {
        return null;
    }
}
