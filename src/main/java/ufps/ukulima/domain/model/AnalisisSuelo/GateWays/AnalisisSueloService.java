package ufps.ukulima.domain.model.AnalisisSuelo.GateWays;

import ufps.ukulima.domain.model.AnalisisSuelo.AnalisisSuelo;

import java.util.List;

public interface AnalisisSueloService {
    public AnalisisSuelo getAnalisisSueloById(int idAnalisisSuelo);
    public List<AnalisisSuelo> getAllAnalisisSuelo();
    public void updateAnalisisSuelo(AnalisisSuelo analisisSuelo);
}
