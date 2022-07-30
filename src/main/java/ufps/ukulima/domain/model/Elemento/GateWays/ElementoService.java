package ufps.ukulima.domain.model.Elemento.GateWays;

import ufps.ukulima.domain.model.Elemento.Elemento;

import java.util.List;

public interface ElementoService {
    public Elemento getElementoById(int idElemento);
    public List<Elemento> getAllElemento();
    public void updateElemento(Elemento elemento);
}
