package ufps.ukulima.domain.model.Suelo.gateway;

import ufps.ukulima.domain.model.Suelo.Suelo;

import java.util.List;

public interface SueloService {
    public Suelo getSueloById(int id);

    public List<Suelo> getSueloByLote(int id);

    public List<Suelo> getAllSuelos();
    public void saveSuelo(Suelo suelo);
}
