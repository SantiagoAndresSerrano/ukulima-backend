package ufps.ukulima.domain.model.Cultivo.GateWays;

import ufps.ukulima.domain.model.Cultivo.Cultivo;

import java.util.List;

public interface CultivoService {
    public Cultivo getCultivoById(int idCultivo);
    public List<Cultivo> getAllCultivo();
    public void updateCultivo(Cultivo cultivo);
}
