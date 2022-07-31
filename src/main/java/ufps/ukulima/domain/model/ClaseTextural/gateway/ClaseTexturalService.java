package ufps.ukulima.domain.model.ClaseTextural.gateway;

import ufps.ukulima.domain.model.ClaseTextural.ClaseTextural;

import java.util.List;

public interface ClaseTexturalService {
    public ClaseTextural getClaseTexturalById(int idClaseTextural);
    public List<ClaseTextural> getAllClaseTextural();
    public void saveClaseTextural(ClaseTextural claseTextural);
}
