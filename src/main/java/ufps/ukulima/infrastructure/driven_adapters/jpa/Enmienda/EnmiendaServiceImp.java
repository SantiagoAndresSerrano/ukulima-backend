package ufps.ukulima.infrastructure.driven_adapters.jpa.Enmienda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.Enmienda.Enmienda;
import ufps.ukulima.domain.model.Enmienda.gateway.EnmiendaService;

import java.util.List;
@Service
public class EnmiendaServiceImp implements EnmiendaService {

    @Autowired
    EnmiendaRepository enmiendaRepository;

    @Override
    @Transactional(readOnly = true)
    public Enmienda getEnmiendaById(int idEnmienda) {
        return enmiendaRepository.getById(idEnmienda);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Enmienda> getAllEnmienda() {
        return enmiendaRepository.findAll();
    }

    @Override
    @Transactional
    public void saveEnmienda(Enmienda Enmienda) {
         enmiendaRepository.save(Enmienda);
    }

    @Override
    public void disableEnmienda(Enmienda Enmienda) {

    }
}
