package ufps.ukulima.infrastructure.driven_adapters.jpa.AnalisisElemento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.AnalisisElemento.AnalisisElemento;
import ufps.ukulima.domain.model.AnalisisElemento.gateway.AnalisisElementoService;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisSuelo.AnalisisSueloEntity;
import ufps.ukulima.infrastructure.mapper.AnalisisElementoEntityMapper;

import java.util.List;
@Service
public class AnalisisElementoServiceImp implements AnalisisElementoService {

    @Autowired
    AnalsisElementoRepository analsisElementoRepository;

    @Autowired
    AnalisisElementoEntityMapper analisisElementoEntityMapper;

    @Override
    @Transactional(readOnly = true)
    public AnalisisElemento getAnalisisElementoById(int id) {
        return analisisElementoEntityMapper.toDomain(analsisElementoRepository.getById(id));
    }

    @Override
    @Transactional(readOnly = true)
    public List<AnalisisElemento> getAllAnalisisElemento() {
        return analisisElementoEntityMapper.abonosOrganicosRecomendacionToDomain(analsisElementoRepository.findAll());
    }

    @Override
    @Transactional(readOnly = true)
    public List<AnalisisElemento> getAllAnalisisElementoByIdAnalisisSuelo(int idAnalisisSuelo) {
        return analisisElementoEntityMapper.abonosOrganicosRecomendacionToDomain(
                analsisElementoRepository.getAllByIdAnalisisSuelo(new AnalisisSueloEntity(idAnalisisSuelo))
        );
    }

    @Override
    @Transactional
    public void saveAnalisisElemento(AnalisisElemento analisisElemento) {
         analsisElementoRepository.save(analisisElementoEntityMapper.toEntity(analisisElemento));
    }
}
