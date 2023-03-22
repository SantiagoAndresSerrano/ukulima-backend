package ufps.ukulima.domain.model.ConductividadElectrica.gateway;

import ufps.ukulima.domain.model.ConductividadElectrica.ConductividadElectrica;

import java.util.List;

public interface ConductividadElectricaService {
    public ConductividadElectrica getConductividadElectricaById(int idConductividadElectrica);
    public ConductividadElectrica getConductividadElectricaByValor(float valor);

    public List<ConductividadElectrica> getAllConductividadElectrica();
    public void saveConductividadElectrica(ConductividadElectrica conductividadElectrica);
}
