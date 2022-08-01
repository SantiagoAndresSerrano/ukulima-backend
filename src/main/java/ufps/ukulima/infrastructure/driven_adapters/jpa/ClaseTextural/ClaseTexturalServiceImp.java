package ufps.ukulima.infrastructure.driven_adapters.jpa.ClaseTextural;

import org.eclipse.persistence.annotations.ReadOnly;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.ClaseTextural.ClaseTextural;
import ufps.ukulima.domain.model.ClaseTextural.gateway.ClaseTexturalService;

import java.util.List;
@Service
public class ClaseTexturalServiceImp implements ClaseTexturalService {
    
    @Autowired
    ClaseTexturalRepository claseTexturalRepository;
    
    @Override
    @Transactional(readOnly = true)
    public ClaseTextural getClaseTexturalById(int idClaseTextural) {
        return claseTexturalRepository.getById(idClaseTextural);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ClaseTextural> getAllClaseTextural() {
        return claseTexturalRepository.findAll();
    }

    @Override
    @Transactional
    public void saveClaseTextural(ClaseTextural claseTextural) {
         claseTexturalRepository.save(claseTextural);
    }
}
