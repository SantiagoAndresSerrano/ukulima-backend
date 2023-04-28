package ufps.ukulima.domain.model.AnalisisSueloRelacionBase.gateway;

import ufps.ukulima.domain.model.AnalisisSuelo.AnalisisSuelo;
import ufps.ukulima.domain.model.AnalisisSueloRelacionBase.AnalisisSueloRelacionBase;

import java.util.List;

public interface AnalisisSueloRelacionBaseService {
    public AnalisisSueloRelacionBase getAnalisisSueloRelacionBaseById(int idAnalisisSueloRelacionBase);
    public List<AnalisisSueloRelacionBase> getAllAnalisisSueloRelacionBase();
    public List<AnalisisSueloRelacionBase> getAllAnalisisSueloByAnalisisSuelo(int idAnalisisSuelo);

    public void saveAnalisisSueloRelacionBase(AnalisisSueloRelacionBase relacionBase);
}
