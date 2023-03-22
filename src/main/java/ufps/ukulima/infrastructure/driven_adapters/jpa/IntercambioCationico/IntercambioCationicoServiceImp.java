package ufps.ukulima.infrastructure.driven_adapters.jpa.IntercambioCationico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.IntercambioCationico.IntercambioCationico;
import ufps.ukulima.domain.model.IntercambioCationico.gateway.IntercambioCationicoService;
import ufps.ukulima.infrastructure.db.springdata.mapper.IntercambioCationicoEntityMapper;

import java.util.List;

@Service
public class IntercambioCationicoServiceImp implements IntercambioCationicoService {
    @Autowired
    IntercambioCationicoRepository intercambioCationicoRepository;

    @Autowired
    IntercambioCationicoEntityMapper intercambioCationicoEntityMapper;

    @Override
    @Transactional(readOnly = true)
    public IntercambioCationico getIntercambioCationicoById(int id) {
        return intercambioCationicoEntityMapper.toDomain(intercambioCationicoRepository.getById(id));
    }

    @Override
    public IntercambioCationico getIntercambioCationicoByValor(float valor) {
        return intercambioCationicoEntityMapper.toDomain(intercambioCationicoRepository.determinarIntercambioCationico(valor));
    }

    @Override
    @Transactional(readOnly = true)
    public List<IntercambioCationico> getAllIntercambioCationicos() {
        return intercambioCationicoEntityMapper.toDomain(intercambioCationicoRepository.findAll());
    }

    @Override
    @Transactional
    public void saveIntercambioCationico(IntercambioCationico abonoOrganico) {

    }

}