package ufps.ukulima.domain.model.Recomendacion.gateway;


import ufps.ukulima.domain.model.Recomendacion.Recomendacion;

import java.util.List;

public interface RecomendacionService {
    public  void saveRecomendacion(Recomendacion recomendacion);
    public  Recomendacion findRecomendacionById(int id);
    public List<Recomendacion> findByAllRecomendacion();
}
