package ufps.ukulima.infrastructure.driven_adapters.jpa.TipoCultivo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.TipoCultivo.TipoCultivo;
import ufps.ukulima.domain.model.TipoCultivo.gateway.TipoCultivoService;
import ufps.ukulima.infrastructure.db.springdata.mapper.TipoCultivoEntityMapper;

import java.util.List;

@Service
public class TipoCultivoServiceImp implements TipoCultivoService {

    @Autowired
    TipoCultivoRepository cultivoRepository;

    @Autowired
    TipoCultivoEntityMapper cultivoEntityMapper;


    @Override
    @Transactional
    public void saveTipoCultivo(TipoCultivo tipoCultivo) {
        cultivoRepository.save(cultivoEntityMapper.toEntity(tipoCultivo));
    }

    @Override
    @Transactional(readOnly = true)
    public TipoCultivo findTipoCultivoById(int id) {
        return cultivoEntityMapper.toDomain(cultivoRepository.getById(id));
    }

    @Override
    @Transactional(readOnly = true)
    public List<TipoCultivo> findByAllTipoCultivo() {
        return cultivoEntityMapper.abonosOrganicosRecomendacionToDomain(cultivoRepository.findAll());
    }
}
