package ufps.ukulima.infrastructure.driven_adapters.jpa.EtapaFenologica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.Recomendacion.EtapaFenologica.EtapaFenologica;
import ufps.ukulima.domain.model.Recomendacion.EtapaFenologica.gateway.EtapaFenologicaService;
import ufps.ukulima.infrastructure.db.springdata.mapper.EtapaFenologicaEntityMapper;

import java.util.List;
@Service
public class EtapaFenologicaServiceImp implements EtapaFenologicaService {

    @Autowired
    EtapaFenologicaRepository etapaFenologicaRepository;

    @Autowired
    EtapaFenologicaEntityMapper etapaFenologicaEntityMapper;

    @Override
    @Transactional(readOnly = true)
    public EtapaFenologica getEtapaFenologicaById(int idEtapaFenologica) {
        return etapaFenologicaEntityMapper.toDomain(etapaFenologicaRepository.getById(idEtapaFenologica));
    }

    @Override
    @Transactional(readOnly = true)
    public List<EtapaFenologica> getAllEtapaFenologica() {
        return etapaFenologicaEntityMapper.abonosOrganicosRecomendacionToDomain(etapaFenologicaRepository.findAll());
    }

    @Override
    @Transactional
    public void saveEtapaFenologica(EtapaFenologica etapaFenologica) {
        etapaFenologicaRepository.save(etapaFenologicaEntityMapper.toEntity(etapaFenologica));
    }

    @Override

    public void disableEtapaFenologica(EtapaFenologica etapaFenologica) {

    }
}
