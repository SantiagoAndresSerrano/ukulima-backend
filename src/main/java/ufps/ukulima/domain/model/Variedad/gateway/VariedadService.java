package ufps.ukulima.domain.model.Variedad.gateway;

import ufps.ukulima.domain.model.Variedad.Variedad;

import java.util.List;

public interface VariedadService {
    public void saveVariedad(Variedad variedad);
    public Variedad findVariedadById(int id);
    public List<Variedad> findByAllVariedad();
}
