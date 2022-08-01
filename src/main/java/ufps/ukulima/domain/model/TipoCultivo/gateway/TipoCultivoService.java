package ufps.ukulima.domain.model.TipoCultivo.gateway;

import ufps.ukulima.domain.model.TipoCultivo.TipoCultivo;

import java.util.List;

public interface TipoCultivoService {
    public  void saveTipoCultivo(TipoCultivo tipoCultivo);
    public  TipoCultivo findTipoCultivoById(int id);
    public List<TipoCultivo> findByAllTipoCultivo();
}
