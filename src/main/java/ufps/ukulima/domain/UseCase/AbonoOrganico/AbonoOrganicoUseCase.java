package ufps.ukulima.domain.UseCase.AbonoOrganico;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import ufps.ukulima.domain.model.AbonoOrganico.AbonoOrganico;
import ufps.ukulima.domain.model.AbonoOrganico.GateWays.AbonoOrganicoService;
import ufps.ukulima.domain.model.Recomendacion;

import java.util.List;

@RequiredArgsConstructor
public class AbonoOrganicoUseCase {

    private final AbonoOrganicoService abonoOrganicoGateWay;

    public void updateAbonoOrganico(AbonoOrganico abonoOrganico){
        abonoOrganicoGateWay.updateAbonoOrganico(abonoOrganico);
    }

    public AbonoOrganico getAbonoOrganicoById(int id){
        return abonoOrganicoGateWay.getAbonoOrganicoById(id);
    }
    public List<AbonoOrganico> getAllAbonoOrganicos(){
        return abonoOrganicoGateWay.getAllAbonoOrganicos();
    }

    public List<Recomendacion> recomendaciones(int idAbonoOrganico){
        return abonoOrganicoGateWay.recomendaciones(idAbonoOrganico);
    }


}
