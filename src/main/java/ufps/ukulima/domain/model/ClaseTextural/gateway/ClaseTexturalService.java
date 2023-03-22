package ufps.ukulima.domain.model.ClaseTextural.gateway;

import java.util.List;

import ufps.ukulima.domain.model.ClaseTextural.ClaseTextural;

public interface ClaseTexturalService {
    public ClaseTextural getClaseTexturalById(int idClaseTextural);
    public List<ClaseTextural> getAllClaseTextural();
    public void saveClaseTextural(ClaseTextural claseTextural);

    public ClaseTextural getClaseTexturalPorRangos(float porcent_arena,float porcent_limo, float porcent_arcilla);
}
