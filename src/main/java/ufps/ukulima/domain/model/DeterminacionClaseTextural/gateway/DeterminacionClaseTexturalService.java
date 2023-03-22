package ufps.ukulima.domain.model.DeterminacionClaseTextural.gateway;

import ufps.ukulima.domain.model.DeterminacionClaseTextural.DeterminacionClaseTextural;

import java.util.List;

public interface DeterminacionClaseTexturalService {
    public DeterminacionClaseTextural getDeterminacionClaseTexturalById(int id);
    public List<DeterminacionClaseTextural> getAllDeterminacionClaseTexturals();
    public void saveDeterminacionClaseTextural(DeterminacionClaseTextural determinacionClaseTextural);
}
