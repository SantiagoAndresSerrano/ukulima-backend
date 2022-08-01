package ufps.ukulima.infrastructure.driven_adapters.jpa.TipoCultivo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.TipoCultivo.TipoCultivo;
import ufps.ukulima.domain.model.TipoCultivo.gateway.TipoCultivoService;

import java.util.List;

@Service
public class TipoCultivoServiceImp implements TipoCultivoService {

    @Autowired
    TipoCultivoRepository cultivoRepository;

    @Override
    @Transactional
    public void saveTipoCultivo(TipoCultivo tipoCultivo) {
        cultivoRepository.save(tipoCultivo);
    }

    @Override
    @Transactional(readOnly = true)
    public TipoCultivo findTipoCultivoById(int id) {
        return cultivoRepository.getById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<TipoCultivo> findByAllTipoCultivo() {
        return cultivoRepository.findAll();
    }
}
