package ufps.ukulima.domain.model.ClaseTextural.gateway;

import java.util.List;

import ufps.ukulima.infrastructure.db.springdata.entity.ClaseTextural.ClaseTexturalEntity;

public interface ClaseTexturalService {
    public ClaseTexturalEntity getClaseTexturalById(int idClaseTextural);
    public List<ClaseTexturalEntity> getAllClaseTextural();
    public void saveClaseTextural(ClaseTexturalEntity claseTexturalEntity);
}
