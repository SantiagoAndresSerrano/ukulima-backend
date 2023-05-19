package ufps.ukulima.domain.model.Recomendacion.gateway;


import ufps.ukulima.domain.model.Recomendacion.Recomendacion;
import ufps.ukulima.infrastructure.db.springdata.entity.Recomendacion.RecomendacionEntity;

import java.util.List;

public interface RecomendacionService {
        Recomendacion getRecomendacionById(int idRecomendacion);
        List<Recomendacion> getAllRecomendacion();
        RecomendacionEntity saveRecomendacion(RecomendacionEntity recomendacion);
    }

