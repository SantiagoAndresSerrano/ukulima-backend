package ufps.ukulima.infrastructure.driven_adapters.jpa.Cultivo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.Cultivo.Cultivo;
import ufps.ukulima.domain.model.Cultivo.gateway.CultivoService;

import java.util.List;

@Service
public class CultivoServiceImp implements CultivoService {
    @Autowired
    CultivoRepository cultivoRepository;

    @Override
    @Transactional(readOnly = true)
    public Cultivo getCultivoById(int idCultivo) {
        return cultivoRepository.getById(idCultivo);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Cultivo> getAllCultivo() {
        return cultivoRepository.findAll();
    }

    @Override
    @Transactional
    public void saveCultivo(Cultivo cultivo) {
        cultivoRepository.save(cultivo);
    }
}
