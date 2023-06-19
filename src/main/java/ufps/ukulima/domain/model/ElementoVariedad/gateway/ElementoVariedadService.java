package ufps.ukulima.domain.model.ElementoVariedad.gateway;

import ufps.ukulima.domain.model.Elemento.Elemento;
import ufps.ukulima.domain.model.ElementoVariedad.ElementoVariedad;

import java.util.List;

public interface ElementoVariedadService {
    public ElementoVariedad getElementoVariedadById(int idElementoVariedad);

    public ElementoVariedad getElementoVariedadByVariedadRendimiento(int idVariedad,int rendimiento,String elemento);

    public List<ElementoVariedad> getAllElementoVariedad();
    public void saveElementoVariedad(ElementoVariedad elementoVariedad);
}
