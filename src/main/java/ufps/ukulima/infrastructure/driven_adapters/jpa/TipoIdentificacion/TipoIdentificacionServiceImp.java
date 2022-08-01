package ufps.ukulima.infrastructure.driven_adapters.jpa.TipoIdentificacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.TipoIdentificacion.TipoIdentificacion;
import ufps.ukulima.domain.model.TipoIdentificacion.gateway.TipoIdentificacionService;

import java.util.List;

@Service
public class TipoIdentificacionServiceImp implements TipoIdentificacionService {

    @Autowired
    TipoIdentificacionRepository tipoIdentificacionRepository;

    @Override
    @Transactional(readOnly = true)
    public List<TipoIdentificacion> getAllTipoIdentificacion() {
        return tipoIdentificacionRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public TipoIdentificacion getTipoIdentificacionByid(int idTipoIdentificacion) {
        return tipoIdentificacionRepository.getById(idTipoIdentificacion);
    }
}
