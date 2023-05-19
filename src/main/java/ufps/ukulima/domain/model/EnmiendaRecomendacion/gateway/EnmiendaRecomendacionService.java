package ufps.ukulima.domain.model.EnmiendaRecomendacion.gateway;


import ufps.ukulima.domain.model.EnmiendaRecomendacion.EnmiendaRecomendacion;

import java.util.List;

public interface EnmiendaRecomendacionService {
    EnmiendaRecomendacion getEnmiendaRecomendacionById(int idEnmiendaRecomendacion);
    List<EnmiendaRecomendacion> getAllEnmiendaRecomendacion();
    void saveEnmiendaRecomendacion(EnmiendaRecomendacion enmiendaRecomendacion);
}


