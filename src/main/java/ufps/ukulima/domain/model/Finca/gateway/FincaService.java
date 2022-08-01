package ufps.ukulima.domain.model.Finca.gateway;

import ufps.ukulima.domain.model.Agricultor.Agricultor;
import ufps.ukulima.domain.model.Finca.Finca;

import java.util.List;

public interface FincaService {
    public Finca getFincaById(int idFinca);
    public Finca getFincaByIdAgricultor(Agricultor idAgricultor);
    public List<Finca> getAllFinca();
    public void saveFinca(Finca Finca);
    public void disableFinca(Finca Finca);

}
