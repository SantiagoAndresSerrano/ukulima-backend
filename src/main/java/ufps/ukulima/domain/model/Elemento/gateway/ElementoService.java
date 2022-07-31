package ufps.ukulima.domain.model.Elemento.gateway;

import ufps.ukulima.domain.model.Elemento.Elemento;

import java.util.List;

public interface ElementoService {
    public Elemento getElementoById(int idElemento);
    public List<Elemento> getAllElemento();
    public void saveElemento(Elemento elemento);
}
