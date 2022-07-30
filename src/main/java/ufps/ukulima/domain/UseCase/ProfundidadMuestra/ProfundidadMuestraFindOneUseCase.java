package ufps.ukulima.domain.UseCase.ProfundidadMuestra;

import lombok.RequiredArgsConstructor;
import ufps.ukulima.domain.model.ProfundidadMuestra.GateWays.ProfundidaMuestraService;
import ufps.ukulima.domain.model.ProfundidadMuestra.ProfundidadMuestra;

@RequiredArgsConstructor
public class ProfundidadMuestraFindOneUseCase {
    ProfundidaMuestraService profundidadMuestraService;

    public ProfundidadMuestra findProfundidaMuestraOne(int id){
        return profundidadMuestraService.findProfundidadMuestraById(id);
    }
}
