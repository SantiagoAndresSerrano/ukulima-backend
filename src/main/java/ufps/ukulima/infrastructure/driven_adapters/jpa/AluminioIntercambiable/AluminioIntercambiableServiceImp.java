package ufps.ukulima.infrastructure.driven_adapters.jpa.AluminioIntercambiable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.AluminioIntercambiable.AluminioIntercambiable;
import ufps.ukulima.domain.model.AluminioIntercambiable.gateway.AluminioIntercambiableService;
import ufps.ukulima.infrastructure.mapper.AluminioIntercambiableEntityMapper;

import java.util.List;

@Service
public class AluminioIntercambiableServiceImp implements AluminioIntercambiableService {
    @Autowired
    AluminioIntercambiableRepository aluminioIntercambiableRepository;

    @Autowired
    AluminioIntercambiableEntityMapper aluminioIntercambiableEntityMapper;

    @Override
    @Transactional(readOnly = true)
    public AluminioIntercambiable getAluminioIntercambiableById(int id) {
        return aluminioIntercambiableEntityMapper.toDomain(aluminioIntercambiableRepository.getById(id));
    }

    @Override
    public AluminioIntercambiable getAluminioIntercambiableByValor(float valor) {
        return aluminioIntercambiableEntityMapper.toDomain(aluminioIntercambiableRepository.determinarAluminioIntercambiable(valor));
    }

    @Override
    @Transactional(readOnly = true)
    public List<AluminioIntercambiable> getAllAluminioIntercambiables() {
        return aluminioIntercambiableEntityMapper.toDomain(aluminioIntercambiableRepository.findAll());
    }

    @Override
    @Transactional
    public void saveAluminioIntercambiable(AluminioIntercambiable abonoOrganico) {

    }

}