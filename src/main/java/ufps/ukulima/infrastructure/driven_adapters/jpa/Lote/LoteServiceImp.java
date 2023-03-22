package ufps.ukulima.infrastructure.driven_adapters.jpa.Lote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.Lote.gateway.LoteServicio;
import ufps.ukulima.domain.model.Lote.Lote;
import ufps.ukulima.infrastructure.db.springdata.mapper.LoteEntityMapper;

import java.util.List;

@Service
public class LoteServiceImp implements LoteServicio {
        @Autowired
        LoteRepository loteRepository;

        @Autowired
        LoteEntityMapper loteEntityMapper;

        @Override
        @Transactional(readOnly = true)
        public Lote getLoteById(int id) {
            return loteEntityMapper.toDomain(loteRepository.getById(id));
        }

        @Override
        @Transactional(readOnly = true)
        public List<Lote> getAllLotes() {
            return loteEntityMapper.toDomain(loteRepository.findAll());
        }

        @Override
        @Transactional
        public void saveLote(Lote abonoOrganico) {

        }

    }
