package ufps.ukulima.infrastructure.driven_adapters.jpa.ClaseTextural;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ufps.ukulima.domain.model.ClaseTextural.ClaseTextural;
import ufps.ukulima.domain.model.ClaseTextural.gateway.ClaseTexturalService;
import ufps.ukulima.infrastructure.db.springdata.mapper.ClaseTexturalEntityMapper;

import java.util.List;
@Service
public class ClaseTexturalServiceImp implements ClaseTexturalService {
    
    @Autowired
    ClaseTexturalRepository claseTexturalRepository;

    @Autowired
    ClaseTexturalEntityMapper claseTexturalEntityMapper;
    
    @Override
    @Transactional(readOnly = true)
    public ClaseTextural getClaseTexturalById(int idClaseTextural) {
        return claseTexturalEntityMapper.toDomain(claseTexturalRepository.getById(idClaseTextural));
    }

    @Override
    @Transactional(readOnly = true)
    public List<ClaseTextural> getAllClaseTextural() {
        return claseTexturalEntityMapper.abonosOrganicosRecomendacionToDomain(claseTexturalRepository.findAll());
    }

    @Override
    @Transactional
    public void saveClaseTextural(ClaseTextural claseTextural) {
         claseTexturalRepository.save(claseTexturalEntityMapper.toEntity(claseTextural));
    }

    @Override
    public ClaseTextural getClaseTexturalPorRangos(float porcent_arena, float porcent_limo, float porcent_arcilla) {
        return claseTexturalEntityMapper.toDomain(claseTexturalRepository.getClaseTexturalByRangos(porcent_arena,porcent_limo
                ,porcent_arcilla));
    }
}
