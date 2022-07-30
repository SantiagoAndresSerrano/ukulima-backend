package ufps.ukulima.domain.model.AbonoOrganico.GateWays;


import ufps.ukulima.domain.model.AbonoOrganico.AbonoOrganico;
import ufps.ukulima.domain.model.Recomendacion;

import java.util.List;
public interface AbonoOrganicoService{
    public AbonoOrganico getAbonoOrganicoById(int id);
    public List<AbonoOrganico> getAllAbonoOrganicos();
    public void updateAbonoOrganico(AbonoOrganico abonoOrganico);
    public List<Recomendacion> recomendaciones(int idAbonoOrganico);
}
