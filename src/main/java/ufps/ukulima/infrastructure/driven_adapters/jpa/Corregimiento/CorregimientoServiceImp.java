package ufps.ukulima.infrastructure.driven_adapters.jpa.Corregimiento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.Corregimiento.Corregimiento;
import ufps.ukulima.domain.model.Corregimiento.gateway.CorregimientoService;
import ufps.ukulima.domain.model.Finca.Finca;
import ufps.ukulima.infrastructure.db.springdata.mapper.CorregimientoEntityMapper;

import java.util.List;
@Service
public class CorregimientoServiceImp implements CorregimientoService {

    @Autowired
    CorregimientoRepository corregimientoRepository;

    @Autowired
    CorregimientoEntityMapper corregimientoEntityMapper;

    @Override
    @Transactional(readOnly = true)
    public Corregimiento getCorregimientoById(int idCorregimiento) {
        return corregimientoEntityMapper.toDomain(corregimientoRepository.getById(idCorregimiento));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Corregimiento> getAllCorregimiento() {
        return corregimientoEntityMapper.abonosOrganicosRecomendacionToDomain(corregimientoRepository.findAll());
    }

    @Override
    @Transactional
    public void saveCorregimiento(Corregimiento corregimiento) {
        corregimientoRepository.save(corregimientoEntityMapper.toEntity(corregimiento));
    }

}
