package ufps.ukulima.infrastructure.driven_adapters.jpa.AbonoOrganicoRecomendacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.AbonoOrganicoRecomendacion.AbonoOrganicoRecomendacion;
import ufps.ukulima.domain.model.AbonoOrganicoRecomendacion.gateway.AbonoOrganicoRecomendacionService;
import ufps.ukulima.infrastructure.mapper.AbonoOrganicoRecomendacionEntityMapper;

import java.util.List;

@Service
public class AbonoOrganicoRecomendacionServiceImp implements AbonoOrganicoRecomendacionService {

    @Autowired
    AbonoOrganicoRecomendacionRepository abonoOrganicoRepository;

    @Autowired
    AbonoOrganicoRecomendacionEntityMapper abonoOrganicoRecomendacionEntityMapper;

    @Override
    @Transactional(readOnly = true)
    public AbonoOrganicoRecomendacion getAbonoOrganicoRecomendacionById(int id) {
        return abonoOrganicoRecomendacionEntityMapper.toDomain(abonoOrganicoRepository.getById(id));
    }

    @Override
    @Transactional(readOnly = true)
    public List<AbonoOrganicoRecomendacion> getAllAbonoOrganicoRecomendacion() {
        return abonoOrganicoRecomendacionEntityMapper.abonosOrganicosRecomendacionToDomain(abonoOrganicoRepository.findAll());
    }

    @Override
    @Transactional
    public void saveAbonoOrganicoRecomendacion(AbonoOrganicoRecomendacion abonoOrganico) {
        abonoOrganicoRepository.save(abonoOrganicoRecomendacionEntityMapper.toEntity(abonoOrganico));
    }
}
