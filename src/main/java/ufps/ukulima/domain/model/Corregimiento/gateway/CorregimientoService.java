package ufps.ukulima.domain.model.Corregimiento.gateway;

import ufps.ukulima.domain.model.Corregimiento.Corregimiento;

import java.util.List;

public interface CorregimientoService {
    public Corregimiento getCorregimientoById(int idCorregimiento);
    public List<Corregimiento> getAllCorregimiento();
    public void saveCorregimiento(Corregimiento corregimiento);

}