package ufps.ukulima.domain.model.AbonoOrganicoRecomendacion.gateway;

import ufps.ukulima.domain.model.AbonoOrganicoRecomendacion.AbonoOrganicoRecomendacion;

import java.util.List;

public interface AbonoOrganicoRecomendacionService {

    public AbonoOrganicoRecomendacion getAbonoOrganicoRecomendacionById(int id);
    public List<AbonoOrganicoRecomendacion> getAllAbonoOrganicoRecomendacion();
    public void saveAbonoOrganicoRecomendacion(AbonoOrganicoRecomendacion abonoOrganico);

}
