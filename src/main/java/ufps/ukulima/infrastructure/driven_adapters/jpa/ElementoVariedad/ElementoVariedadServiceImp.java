package ufps.ukulima.infrastructure.driven_adapters.jpa.ElementoVariedad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ufps.ukulima.domain.model.ElementoVariedad.ElementoVariedad;
import ufps.ukulima.domain.model.ElementoVariedad.gateway.ElementoVariedadService;
import ufps.ukulima.infrastructure.mapper.ElementoVariedadEntityMapper;

import java.util.List;

@Service
public class ElementoVariedadServiceImp implements ElementoVariedadService {

    @Autowired
    ElementoVariedadRepository elementoVariedadRepository;

    @Autowired
    ElementoVariedadEntityMapper elementoVariedadEntityMapper;

    @Override
    public ElementoVariedad getElementoVariedadById(int idElementoVariedad) {
        return elementoVariedadEntityMapper.toDomain(elementoVariedadRepository.getById(idElementoVariedad));
    }

    @Override
    public List<ElementoVariedad> getAllElementoVariedad() {
        return elementoVariedadEntityMapper.elementoVariedadToDomain(elementoVariedadRepository.findAll());
    }

    @Override
    public void saveElementoVariedad(ElementoVariedad elementoVariedad) {
        elementoVariedadRepository.save(elementoVariedadEntityMapper.toEntity(elementoVariedad));
    }
}
