package ufps.ukulima.infrastructure.driven_adapters.jpa.TipoIdentificacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.TipoIdentificacion.TipoIdentificacion;
import ufps.ukulima.domain.model.TipoIdentificacion.gateway.TipoIdentificacionService;
import ufps.ukulima.infrastructure.mapper.TipoIdentificacionEntityMapper;

import java.util.List;

@Service
public class TipoIdentificacionServiceImp implements TipoIdentificacionService {

    @Autowired
    TipoIdentificacionRepository tipoIdentificacionRepository;

    @Autowired
    TipoIdentificacionEntityMapper tipoIdentificacionEntityMapper;

    @Override
    @Transactional(readOnly = true)
    public List<TipoIdentificacion> getAllTipoIdentificacion() {
        return tipoIdentificacionEntityMapper.abonosOrganicosRecomendacionToDomain(tipoIdentificacionRepository.findAll());
    }

    @Override
    @Transactional(readOnly = true)
    public TipoIdentificacion getTipoIdentificacionByid(int idTipoIdentificacion) {
        return tipoIdentificacionEntityMapper.toDomain(tipoIdentificacionRepository.getById(idTipoIdentificacion));
    }
}
