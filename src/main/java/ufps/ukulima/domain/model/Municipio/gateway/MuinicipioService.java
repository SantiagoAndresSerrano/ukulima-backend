package ufps.ukulima.domain.model.Municipio.gateway;

import ufps.ukulima.domain.model.Municipio.Municipio;

import java.util.List;

public interface MuinicipioService {
    public Municipio getMunicipioById(int idMunicipio);
    public List<Municipio> getAllMunicipio();
}
