package ufps.ukulima.domain.model.ClaseTextural.GateWays;

import ufps.ukulima.domain.model.ClaseTextural.ClaseTextural;

import java.util.List;

public interface ClaseTexturalService {
    public ClaseTextural getClaseTexturalById(int idClaseTextural);
    public List<ClaseTextural> getAllClaseTextural();
    public void updateClaseTextural(ClaseTextural claseTextural);
}
