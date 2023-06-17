package ufps.ukulima.domain.model.Finca.gateway;

import ufps.ukulima.domain.model.Agricultor.Agricultor;
import ufps.ukulima.domain.model.Finca.Finca;
import ufps.ukulima.infrastructure.db.springdata.entity.Finca.FincaEntity;

import java.util.List;

public interface FincaService {
    public Finca getFincaById(int idFinca);
    public List<Finca> getFincaByIdAgricultor(Agricultor idAgricultor);
    public List<Finca> getAllFinca();
    public FincaEntity saveFinca(Finca Finca);
    public void disableFinca(Finca Finca);

}
