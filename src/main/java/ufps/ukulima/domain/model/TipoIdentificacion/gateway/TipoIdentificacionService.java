package ufps.ukulima.domain.model.TipoIdentificacion.gateway;

import ufps.ukulima.domain.model.TipoIdentificacion.TipoIdentificacion;

import java.util.List;

public interface TipoIdentificacionService {
    public List<TipoIdentificacion> getAllTipoIdentificacion();
    public TipoIdentificacion getTipoIdentificacionByid(int idTipoIdentificacion);

}
