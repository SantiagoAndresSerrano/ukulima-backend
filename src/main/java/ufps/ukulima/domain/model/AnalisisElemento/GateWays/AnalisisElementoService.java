package ufps.ukulima.domain.model.AnalisisElemento.GateWays;

import ufps.ukulima.domain.model.AnalisisElemento.AnalisisElemento;

import java.util.List;

public interface AnalisisElementoService {

    public AnalisisElemento getAnalisisElementoById(int id);
    public List<AnalisisElemento> getAllAnalisisElemento();
    public void updateAnalisisElemento(AnalisisElemento analisisElemento);

}
