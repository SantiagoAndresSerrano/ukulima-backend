package ufps.ukulima.domain.model.Enmienda.GateWays;

import ufps.ukulima.domain.model.Enmienda.Enmienda;

import java.util.List;

public interface EnmiendaService {
    public Enmienda getEnmiendaById(int idEnmienda);
    public List<Enmienda> getAllEnmienda();
    public void updateEnmienda(Enmienda Enmienda);
    public void disableEnmienda(Enmienda Enmienda);

}
