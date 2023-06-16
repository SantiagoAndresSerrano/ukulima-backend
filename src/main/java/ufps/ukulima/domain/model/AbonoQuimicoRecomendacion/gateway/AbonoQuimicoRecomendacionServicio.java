package ufps.ukulima.domain.model.AbonoQuimicoRecomendacion.gateway;

import ufps.ukulima.domain.model.AbonoQuimicoRecomendacion.AbonoQuimicoRecomendacion;

import java.util.List;

public interface AbonoQuimicoRecomendacionServicio {

    AbonoQuimicoRecomendacion getAbonoQuimicoRecomendacionById(int id);

    List<AbonoQuimicoRecomendacion> getAllAbonoQuimicoRecomendacion();

    void saveAbonoQuimicoRecomendacion(AbonoQuimicoRecomendacion abonoQuimicosRecomendacion);

    // Otros métodos del servicio según tus necesidades

}
