package ufps.ukulima.domain.model.Densidad.gateway;

import ufps.ukulima.domain.model.Densidad.Densidad;

import java.util.List;

public interface DensidadService {
    public Densidad getDensidadById(int idDensidad);
    public List<Densidad> getAllDensidad();
    public void updateDensidad(Densidad densidad);
}
