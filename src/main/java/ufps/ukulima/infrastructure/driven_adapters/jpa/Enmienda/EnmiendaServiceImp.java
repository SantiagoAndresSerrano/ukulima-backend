package ufps.ukulima.infrastructure.driven_adapters.jpa.Enmienda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.Enmienda.Enmienda;
import ufps.ukulima.domain.model.Enmienda.gateway.EnmiendaService;
import ufps.ukulima.infrastructure.mapper.EnmiendaEntityMapper;

import java.util.List;
@Service
public class EnmiendaServiceImp implements EnmiendaService {

    @Autowired
    EnmiendaRepository enmiendaRepository;
    @Autowired
    EnmiendaEntityMapper enmiendaEntityMapper;

    @Override
    @Transactional(readOnly = true)
    public Enmienda getEnmiendaById(int idEnmienda) {
        return enmiendaEntityMapper.toDomain(enmiendaRepository.getById(idEnmienda));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Enmienda> getAllEnmienda() {
        return enmiendaEntityMapper.abonosOrganicosRecomendacionToDomain(enmiendaRepository.findAll());
    }

    @Override
    @Transactional
    public void saveEnmienda(Enmienda Enmienda) {
         enmiendaRepository.save(enmiendaEntityMapper.toEntity(Enmienda));
    }

    @Override
    public void disableEnmienda(Enmienda Enmienda) {

    }
}
