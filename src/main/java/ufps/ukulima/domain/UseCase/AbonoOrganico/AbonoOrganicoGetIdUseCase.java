package ufps.ukulima.domain.UseCase.AbonoOrganico;

import lombok.RequiredArgsConstructor;
import ufps.ukulima.domain.model.AbonoOrganico.AbonoOrganico;
import ufps.ukulima.domain.model.AbonoOrganico.GateWays.AbonoOrganicoService;

@RequiredArgsConstructor
public class AbonoOrganicoGetIdUseCase {
    private final AbonoOrganicoService abonoOrganicoGateWay;
    public AbonoOrganico getAbonoOrganicoById(int id){
        return abonoOrganicoGateWay.getAbonoOrganicoById(id);
    }
}
