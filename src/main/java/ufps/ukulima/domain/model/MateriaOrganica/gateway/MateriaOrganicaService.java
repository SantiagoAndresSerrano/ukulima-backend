package ufps.ukulima.domain.model.MateriaOrganica.gateway;

import ufps.ukulima.domain.model.MateriaOrganica.MateriaOrganica;

import java.util.List;

public interface MateriaOrganicaService {
    public MateriaOrganica getMateriaOrganicaById(int id);
    public List<MateriaOrganica> getAllMateriaOrganicas();
    public void saveMateriaOrganica(MateriaOrganica aluminioIntercambiable);
}
