package ufps.ukulima.domain.model.Cultivo.gateway;

import ufps.ukulima.domain.model.Cultivo.Cultivo;
import ufps.ukulima.domain.model.Finca.Finca;

import java.util.List;

public interface CultivoService {
    public Cultivo getCultivoById(int idCultivo);
    public List<Cultivo> getAllCultivo();
    public List<Cultivo> getAllCultivoByAgricultor(String nombreUsuario);

    public List<Cultivo> getAllCultivoByFinca(Finca idFinca);
    public void saveCultivo(Cultivo cultivo);
}
