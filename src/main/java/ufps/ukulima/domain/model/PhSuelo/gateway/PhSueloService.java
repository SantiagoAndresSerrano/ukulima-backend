package ufps.ukulima.domain.model.PhSuelo.gateway;

import ufps.ukulima.domain.model.PhSuelo.PhSuelo;

import java.util.List;

public interface PhSueloService {
    public PhSuelo getPhSueloById(int id);
    public PhSuelo getPhSueloByValor(float valor_ph);

    public List<PhSuelo> getAllPhSuelos();
    public void savePhSuelo(PhSuelo phSuelo);
}
