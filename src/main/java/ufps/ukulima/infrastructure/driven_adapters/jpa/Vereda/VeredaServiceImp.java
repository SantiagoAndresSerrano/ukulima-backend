package ufps.ukulima.infrastructure.driven_adapters.jpa.Vereda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.Vereda.Vereda;
import ufps.ukulima.domain.model.Vereda.gateway.VeredaService;

import java.util.List;
@Service
public class VeredaServiceImp implements VeredaService {

    @Autowired
    VeredaRepository veredaRepository;

    @Override
    @Transactional
    public void saveVereda(Vereda vereda) {
        veredaRepository.save(vereda);
    }

    @Override
    @Transactional(readOnly = true)
    public Vereda findVeredaById(int id) {
        return veredaRepository.getById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Vereda> findByAllVereda() {
        return veredaRepository.findAll();
    }
}
