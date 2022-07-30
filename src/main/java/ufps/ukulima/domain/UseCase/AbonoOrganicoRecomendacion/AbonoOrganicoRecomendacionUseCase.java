package ufps.ukulima.domain.UseCase.AbonoOrganicoRecomendacion;


import lombok.RequiredArgsConstructor;
import ufps.ukulima.domain.model.AbonoOrganico.AbonoOrganico;
import ufps.ukulima.domain.model.AbonoOrganico.GateWays.AbonoOrganicoService;
import ufps.ukulima.domain.model.AbonoOrganicoRecomendacion.AbonoOrganicoRecomendacion;
import ufps.ukulima.domain.model.AbonoOrganicoRecomendacion.GateWays.AbonoOrganicoRecomendacionService;
import ufps.ukulima.domain.model.Recomendacion;

import java.util.List;
@RequiredArgsConstructor
public class AbonoOrganicoRecomendacionUseCase {
    private final AbonoOrganicoRecomendacionService abonoOrganicoGateWay;

    public AbonoOrganicoRecomendacion getAbonoOrganicoById(int id){
        return abonoOrganicoGateWay.getAbonoOrganicoRecomendacionById(id);
    }
    public List<AbonoOrganicoRecomendacion> getAllAbonoOrganicos(){
        return abonoOrganicoGateWay.getAllAbonoOrganicoRecomendacion();
    }
    public void updateAbonoOrganico(AbonoOrganicoRecomendacion abonoOrganico){
        abonoOrganicoGateWay.updateAbonoOrganicoRecomendacion(abonoOrganico);
    }

}
