package ufps.ukulima.domain.model.ProfundidadMuestra.GateWays;

import ufps.ukulima.domain.model.ProfundidadMuestra.ProfundidadMuestra;

import java.util.List;

public abstract class ProfundidaMuestraService {
    public abstract void saveProfundidaMuestra();

    public abstract ProfundidadMuestra findProfundidadMuestraById(int id);

    public List<ProfundidadMuestra> findByAllProfundidadMuestra(){
        return null;
    };

}
