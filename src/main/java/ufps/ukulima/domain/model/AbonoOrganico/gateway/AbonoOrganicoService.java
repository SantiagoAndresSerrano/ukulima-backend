package ufps.ukulima.domain.model.AbonoOrganico.gateway;


import ufps.ukulima.domain.model.AbonoOrganico.AbonoOrganico;
import ufps.ukulima.domain.model.Recomendacion.Recomendacion;

import java.util.List;
public interface AbonoOrganicoService{
    public AbonoOrganico getAbonoOrganicoById(int id);
    public AbonoOrganico getAbonoOrganicoByNombre(String nombre);

    public List<AbonoOrganico> getAllAbonoOrganicos();
    public void saveAbonoOrganico(AbonoOrganico abonoOrganico);
    public List<Recomendacion> recomendaciones(int idAbonoOrganico);
}
