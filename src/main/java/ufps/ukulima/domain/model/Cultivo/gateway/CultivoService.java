package ufps.ukulima.domain.model.Cultivo.gateway;

import ufps.ukulima.domain.model.Cultivo.Cultivo;

import java.util.List;

public interface CultivoService {
    public Cultivo getCultivoById(int idCultivo);
    public List<Cultivo> getAllCultivo();
    public void saveCultivo(Cultivo cultivo);
}
