package ufps.ukulima.infrastructure.driven_adapters.jpa.DeterminacionClaseTextural;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.DeterminacionClaseTextural.DeterminacionClaseTextural;
import ufps.ukulima.domain.model.DeterminacionClaseTextural.gateway.DeterminacionClaseTexturalService;
import ufps.ukulima.infrastructure.mapper.DeterminacionClaseTexturalEntityMapper;

import java.util.List;

@Service
public class DeterminacionClaseTexturalServiceImp implements DeterminacionClaseTexturalService {
    @Autowired
    DeterminacionClaseTexturalRepository determinacionClaseTexturalRepository;

    @Autowired
    DeterminacionClaseTexturalEntityMapper determinacionClaseTexturalEntityMapper;

    @Override
    @Transactional(readOnly = true)
    public DeterminacionClaseTextural getDeterminacionClaseTexturalById(int id) {
        return determinacionClaseTexturalEntityMapper.toDomain(determinacionClaseTexturalRepository.getById(id));
    }

    @Override
    @Transactional(readOnly = true)
    public List<DeterminacionClaseTextural> getAllDeterminacionClaseTexturals() {
        return determinacionClaseTexturalEntityMapper.toDomain(determinacionClaseTexturalRepository.findAll());
    }

    @Override
    @Transactional
    public void saveDeterminacionClaseTextural(DeterminacionClaseTextural abonoOrganico) {

    }

}
