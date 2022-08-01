package ufps.ukulima.infrastructure.driven_adapters.jpa.Elemento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.Elemento.Elemento;
import ufps.ukulima.domain.model.Elemento.gateway.ElementoService;

import java.util.List;
@Service
public class ElementoServiceImp implements ElementoService {

    @Autowired
    ElementoRepository elementoRepository;

    @Override
    @Transactional(readOnly = true)

    public Elemento getElementoById(int idElemento) {
        return elementoRepository.getById(idElemento);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Elemento> getAllElemento() {
        return elementoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public void saveElemento(Elemento elemento) {
        elementoRepository.save(elemento);
    }
}
