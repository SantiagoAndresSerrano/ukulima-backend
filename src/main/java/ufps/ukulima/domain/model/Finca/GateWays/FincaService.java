package ufps.ukulima.domain.model.Finca.GateWays;

import ufps.ukulima.domain.model.Finca.Finca;

import java.util.List;

public interface FincaService {
    public Finca getFincaById(int idFinca);
    public Finca getFincaByIdAgricultor(int idAgricultor);
    public List<Finca> getAllFinca();
    public void updateFinca(Finca Finca);
    public void disableFinca(Finca Finca);

}
