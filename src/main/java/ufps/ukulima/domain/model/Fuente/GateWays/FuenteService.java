package ufps.ukulima.domain.model.Fuente.GateWays;

import ufps.ukulima.domain.model.Fuente.Fuente;

import java.util.List;

public interface FuenteService {
    public Fuente getFuenteById(int idFuente);
    public List<Fuente> getAllFuente();
    public void updateFuente(Fuente Fuente);
}
