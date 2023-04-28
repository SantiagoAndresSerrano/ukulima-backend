package ufps.ukulima.domain.model.AnalisisElemento.gateway;

import ufps.ukulima.domain.model.AnalisisElemento.AnalisisElemento;

import java.util.List;

public interface AnalisisElementoService {

    public AnalisisElemento getAnalisisElementoById(int id);
    public List<AnalisisElemento> getAllAnalisisElemento();
    public List<AnalisisElemento> getAllAnalisisElementoByIdAnalisisSuelo(int idAnalisisSuelo);

    public void saveAnalisisElemento(AnalisisElemento analisisElemento);

}
