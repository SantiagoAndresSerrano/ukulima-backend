package ufps.ukulima.domain.model.ClaseTextural.gateway;

import java.util.List;

import ufps.ukulima.domain.model.ClaseTextural.ClaseTextural;

public interface ClaseTexturalService {
    public ClaseTextural getClaseTexturalById(int idClaseTextural);
    public List<ClaseTextural> getAllClaseTextural();
    public void saveClaseTextural(ClaseTextural claseTextural);
}
