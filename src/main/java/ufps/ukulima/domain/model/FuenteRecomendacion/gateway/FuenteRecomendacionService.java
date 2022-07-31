package ufps.ukulima.domain.model.FuenteRecomendacion.gateway;

import ufps.ukulima.domain.model.FuenteRecomendacion.FuenteRecomendacion;

import java.util.List;

public interface FuenteRecomendacionService {
    public FuenteRecomendacion getFuenteRecomendacionById(int idFuenteRecomendacion);
    public List<FuenteRecomendacion> getAllFuenteRecomendacion();
    public void updateFuenteRecomendacion(FuenteRecomendacion FuenteRecomendacion);
    public void deleteFuenteRecomendacion(FuenteRecomendacion FuenteRecomendacion);

}
