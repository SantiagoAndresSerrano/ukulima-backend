package ufps.ukulima.infrastructure.driven_adapters.jpa.EtapaFenologica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.EtapaFenologica.EtapaFenologica;
import ufps.ukulima.domain.model.EtapaFenologica.gateway.EtapaFenologicaService;

import java.util.List;
@Service
public class EtapaFenologicaServiceImp implements EtapaFenologicaService {

    @Autowired
    EtapaFenologicaRepository etapaFenologicaRepository;

    @Override
    @Transactional(readOnly = true)
    public EtapaFenologica getEtapaFenologicaById(int idEtapaFenologica) {
        return etapaFenologicaRepository.getById(idEtapaFenologica);
    }

    @Override
    @Transactional(readOnly = true)
    public List<EtapaFenologica> getAllEtapaFenologica() {
        return etapaFenologicaRepository.findAll();
    }

    @Override
    @Transactional
    public void saveEtapaFenologica(EtapaFenologica etapaFenologica) {
        etapaFenologicaRepository.save(etapaFenologica);
    }

    @Override

    public void disableEtapaFenologica(EtapaFenologica etapaFenologica) {

    }
}
