package ufps.ukulima.infrastructure.driven_adapters.jpa.AbonoOrganicoRecomendacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ufps.ukulima.domain.model.AbonoOrganicoRecomendacion.AbonoOrganicoRecomendacion;
import ufps.ukulima.domain.model.AbonoOrganicoRecomendacion.gateway.AbonoOrganicoRecomendacionService;

import java.util.List;

@Service
public class AbonoOrganicoRecomendacionServiceImp implements AbonoOrganicoRecomendacionService {

    @Autowired
    AbonoOrganicoRecomendacionRepository abonoOrganicoRepository;

    @Override
    public AbonoOrganicoRecomendacion getAbonoOrganicoRecomendacionById(int id) {
        return abonoOrganicoRepository.getById(id);
    }

    @Override
    public List<AbonoOrganicoRecomendacion> getAllAbonoOrganicoRecomendacion() {
        return abonoOrganicoRepository.findAll();
    }

    @Override
    public void updateAbonoOrganicoRecomendacion(AbonoOrganicoRecomendacion abonoOrganico) {
        abonoOrganicoRepository.save(abonoOrganico);
    }
}
