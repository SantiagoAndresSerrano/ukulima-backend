package ufps.ukulima.domain.model.Corregimiento.GateWays;

import ufps.ukulima.domain.model.Corregimiento.Corregimiento;
import ufps.ukulima.domain.model.Finca.Finca;

import java.util.List;

public interface CorregimientoService {
    public Corregimiento getCorregimientoById(int idCorregimiento);
    public List<Corregimiento> getAllCorregimiento();
    public void updateCorregimiento(Corregimiento corregimiento);
    public List<Finca> getAllFinca(Corregimiento corregimiento);

}
