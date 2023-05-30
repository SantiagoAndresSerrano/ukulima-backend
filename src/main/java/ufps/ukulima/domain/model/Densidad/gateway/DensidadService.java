package ufps.ukulima.domain.model.Densidad.gateway;

import ufps.ukulima.domain.model.Densidad.Densidad;

import java.util.List;

public interface DensidadService {

    public Densidad getDensidadById(int idDensidad);
    public Densidad getDensidadByValor(float valor);

    public List<Densidad> getAllDensidad();
    public void saveDensidad(Densidad densidad);
}
