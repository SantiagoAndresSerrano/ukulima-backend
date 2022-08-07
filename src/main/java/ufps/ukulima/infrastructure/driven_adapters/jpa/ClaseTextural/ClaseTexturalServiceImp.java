package ufps.ukulima.infrastructure.driven_adapters.jpa.ClaseTextural;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ufps.ukulima.domain.model.ClaseTextural.gateway.ClaseTexturalService;
import ufps.ukulima.infrastructure.db.springdata.entity.ClaseTextural.ClaseTexturalEntity;

import java.util.List;
@Service
public class ClaseTexturalServiceImp implements ClaseTexturalService {
    
    @Autowired
    ClaseTexturalRepository claseTexturalRepository;
    
    @Override
    @Transactional(readOnly = true)
    public ClaseTexturalEntity getClaseTexturalById(int idClaseTextural) {
        return claseTexturalRepository.getById(idClaseTextural);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ClaseTexturalEntity> getAllClaseTextural() {
        return claseTexturalRepository.findAll();
    }

    @Override
    @Transactional
    public void saveClaseTextural(ClaseTexturalEntity claseTexturalEntity) {
         claseTexturalRepository.save(claseTexturalEntity);
    }
}
