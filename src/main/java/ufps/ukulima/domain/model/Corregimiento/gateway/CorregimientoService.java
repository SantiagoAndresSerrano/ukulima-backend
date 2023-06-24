package ufps.ukulima.domain.model.Corregimiento.gateway;

import ufps.ukulima.domain.model.Corregimiento.Corregimiento;

import java.util.List;

public interface CorregimientoService {
    public Corregimiento getCorregimientoById(int idCorregimiento);
    public List<Corregimiento> getAllCorregimiento();
    public List<Corregimiento> getAllCorregimientoByIdMunicipio(int idMunicipio);

    public void saveCorregimiento(Corregimiento corregimiento);

}
