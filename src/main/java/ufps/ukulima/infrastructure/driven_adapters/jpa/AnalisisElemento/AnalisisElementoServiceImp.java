package ufps.ukulima.infrastructure.driven_adapters.jpa.AnalisisElemento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.AnalisisElemento.AnalisisElemento;
import ufps.ukulima.domain.model.AnalisisElemento.gateway.AnalisisElementoService;

import java.util.List;

public class AnalisisElementoServiceImp implements AnalisisElementoService {

    @Autowired
    AnalsisElementoRepository analsisElementoRepository;

    @Override
    @Transactional(readOnly = true)
    public AnalisisElemento getAnalisisElementoById(int id) {
        return analsisElementoRepository.getById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<AnalisisElemento> getAllAnalisisElemento() {
        return analsisElementoRepository.findAll();
    }

    @Override
    @Transactional
    public void saveAnalisisElemento(AnalisisElemento analisisElemento) {
         analsisElementoRepository.save(analisisElemento);
    }
}
