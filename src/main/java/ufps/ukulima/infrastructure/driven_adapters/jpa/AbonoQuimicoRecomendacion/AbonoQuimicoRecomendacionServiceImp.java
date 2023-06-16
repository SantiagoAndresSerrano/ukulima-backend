package ufps.ukulima.infrastructure.driven_adapters.jpa.AbonoQuimicoRecomendacion;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.AbonoQuimicoRecomendacion.AbonoQuimicoRecomendacion;
import ufps.ukulima.domain.model.AbonoQuimicoRecomendacion.gateway.AbonoQuimicoRecomendacionServicio;
import ufps.ukulima.infrastructure.mapper.AbonoQuimicoRecomendacionEntityMapper;

import java.util.List;

@Service
public class AbonoQuimicoRecomendacionServiceImp implements AbonoQuimicoRecomendacionServicio {

    @Autowired
    private AbonoQuimicoRecomendacionRepository abonoQuimicosRecomendacionRepository;
    @Autowired
    private AbonoQuimicoRecomendacionEntityMapper abonoQuimicosRecomendacionEntityMapper;


    @Override
    @Transactional(readOnly = true)
    public AbonoQuimicoRecomendacion getAbonoQuimicoRecomendacionById(int idAbonoQuimicoRecomendacion) {
        return abonoQuimicosRecomendacionEntityMapper.toDomain(abonoQuimicosRecomendacionRepository.getById(idAbonoQuimicoRecomendacion));
    }

    @Override
    @Transactional(readOnly = true)
    public List<AbonoQuimicoRecomendacion> getAllAbonoQuimicoRecomendacion() {
        return abonoQuimicosRecomendacionEntityMapper.toDomainList(abonoQuimicosRecomendacionRepository.findAll());
    }

    @Override
    @Transactional
    public void saveAbonoQuimicoRecomendacion(AbonoQuimicoRecomendacion abonoQuimicosRecomendacion) {
        abonoQuimicosRecomendacionRepository.save(abonoQuimicosRecomendacionEntityMapper.toEntity(abonoQuimicosRecomendacion));
    }

    // Otros métodos del servicio si los necesitas
}

