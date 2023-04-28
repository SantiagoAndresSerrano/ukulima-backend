package ufps.ukulima.infrastructure.driven_adapters.jpa.Cultivo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.Cultivo.Cultivo;
import ufps.ukulima.domain.model.Cultivo.gateway.CultivoService;
import ufps.ukulima.infrastructure.mapper.CultivoEntityMapper;

import java.util.List;

@Service
public class CultivoServiceImp implements CultivoService {
    @Autowired
    CultivoRepository cultivoRepository;

    @Autowired
    CultivoEntityMapper cultivoEntityMapper;

    @Override
    @Transactional(readOnly = true)
    public Cultivo getCultivoById(int idCultivo) {
        return cultivoEntityMapper.toDomain(cultivoRepository.getById(idCultivo));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Cultivo> getAllCultivo() {
        return cultivoEntityMapper.abonosOrganicosRecomendacionToDomain(cultivoRepository.findAll());
    }

    @Override
    @Transactional
    public void saveCultivo(Cultivo cultivo) {
        cultivoRepository.save(cultivoEntityMapper.toEntity(cultivo));
    }
}
