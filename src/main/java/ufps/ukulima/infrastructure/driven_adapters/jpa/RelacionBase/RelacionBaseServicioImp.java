package ufps.ukulima.infrastructure.driven_adapters.jpa.RelacionBase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.RelacionBase.RelacionBase;
import ufps.ukulima.domain.model.RelacionBase.gateway.RelacionBaseServicio;
import ufps.ukulima.infrastructure.mapper.RelacionBaseEntityMapper;

import java.util.List;
@Service
public class RelacionBaseServicioImp implements RelacionBaseServicio{
    
    @Autowired
    RelacionBaseRepository relacionBaseRepository;
    @Autowired
    RelacionBaseEntityMapper relacionBaseEntityMapper;

    @Override
    @Transactional(readOnly = true)
    public RelacionBase findRelacionBaseById(int idRelacionBase) {
        return relacionBaseEntityMapper.toDomain(relacionBaseRepository.getById(idRelacionBase));
    }

    @Override
    public RelacionBase findRelacionCalMag(float value, boolean isWarning) {
        if(!isWarning)
            return relacionBaseEntityMapper.toDomain(relacionBaseRepository.findRelacionCalMag(value));
        return relacionBaseEntityMapper.toDomain(relacionBaseRepository.findRelacionCalMagNull());
    }

    @Override
    public RelacionBase findRelacionCalPot(float value, boolean isWarning) {
        if(!isWarning)
            return relacionBaseEntityMapper.toDomain(relacionBaseRepository.findRelacionCalPot(value));
        return relacionBaseEntityMapper.toDomain(relacionBaseRepository.findRelacionCalPotNull());
    }

    @Override
    public RelacionBase findRelacionBasesPrincipales(float value, boolean isWarning) {
        if(!isWarning)
            return relacionBaseEntityMapper.toDomain(relacionBaseRepository.findRelacionBasesPrincipales(value));
        return relacionBaseEntityMapper.toDomain(relacionBaseRepository.findRelacionBasesPrincipalesNull());
    }

    @Override
    @Transactional(readOnly = true)
    public List<RelacionBase> findByAllRelacionBase() {
        return relacionBaseEntityMapper.toDomain(relacionBaseRepository.findAll());
    }

    @Override
    @Transactional
    public void saveRelacionBase(RelacionBase RelacionBase) {
        relacionBaseRepository.save(relacionBaseEntityMapper.toEntity(RelacionBase));
    }
}
