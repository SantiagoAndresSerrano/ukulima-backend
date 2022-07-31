package ufps.ukulima.domain.model.DistanciaSiembra.gateway;

import ufps.ukulima.domain.model.DistanciaSiembra.DistanciaSiembra;

import java.util.List;

public interface DistanciaSiembraService {
    public DistanciaSiembra getDistanciaSiembraById(int idDistanciaSiembra);
    public List<DistanciaSiembra> getAllDistanciaSiembra();
    public void saveDistanciaSiembra(DistanciaSiembra distanciaSiembra);

}
