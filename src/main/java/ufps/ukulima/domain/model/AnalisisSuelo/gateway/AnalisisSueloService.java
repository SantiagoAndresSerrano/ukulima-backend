package ufps.ukulima.domain.model.AnalisisSuelo.gateway;

import ufps.ukulima.domain.model.AnalisisSuelo.AnalisisSuelo;

import java.util.List;

public interface AnalisisSueloService {
    public AnalisisSuelo getAnalisisSueloById(int idAnalisisSuelo);
    public List<AnalisisSuelo> getAllAnalisisSuelo();

    public List<AnalisisSuelo> getAllAnalisisSueloByLote(int idLote);

    public AnalisisSuelo saveAnalisisSuelo(AnalisisSuelo analisisSuelo);
}
