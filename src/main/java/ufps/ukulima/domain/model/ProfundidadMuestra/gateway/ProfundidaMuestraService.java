package ufps.ukulima.domain.model.ProfundidadMuestra.gateway;

import ufps.ukulima.domain.model.ProfundidadMuestra.ProfundidadMuestra;

import java.util.List;

public interface ProfundidaMuestraService {
    public void saveProfundidaMuestra(ProfundidadMuestra profundidadMuestra);

    public ProfundidadMuestra findProfundidadMuestraById(int id);

    public List<ProfundidadMuestra> findByAllProfundidadMuestra();

}
