package ufps.ukulima.infrastructure.driven_adapters.jpa.AbonoOrganico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.AbonoOrganico.AbonoOrganico;
import ufps.ukulima.domain.model.AbonoOrganico.gateway.AbonoOrganicoService;
import ufps.ukulima.domain.model.Recomendacion.Recomendacion;

import java.util.List;

@Service
public class AbonoOrganicoServiceImp implements AbonoOrganicoService{
    @Autowired
    AbonoOrganicoRepository abonoOrganicoRepository;

    @Override
    @Transactional(readOnly = true)
    public AbonoOrganico getAbonoOrganicoById(int id) {
        return abonoOrganicoRepository.getById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<AbonoOrganico> getAllAbonoOrganicos() {
        return abonoOrganicoRepository.findAll();
    }

    @Override
    @Transactional
    public void saveAbonoOrganico(AbonoOrganico abonoOrganico) {

    }

    @Override
    public List<Recomendacion> recomendaciones(int idAbonoOrganico) {
        return (List)(abonoOrganicoRepository.getById(idAbonoOrganico).aOrganicoRecomendacionCollection());

    }
}


