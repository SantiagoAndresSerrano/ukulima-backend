package ufps.ukulima.infrastructure.driven_adapters.jpa.Lote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.Finca.Finca;
import ufps.ukulima.domain.model.Lote.gateway.LoteServicio;
import ufps.ukulima.domain.model.Lote.Lote;
import ufps.ukulima.infrastructure.db.springdata.entity.Lote.LoteEntity;
import ufps.ukulima.infrastructure.mapper.FincaEntityMapper;
import ufps.ukulima.infrastructure.mapper.LoteEntityMapper;

import java.util.List;

@Service
public class LoteServiceImp implements LoteServicio {
        @Autowired
        LoteRepository loteRepository;

        @Autowired
        LoteEntityMapper loteEntityMapper;

        @Autowired
        FincaEntityMapper fincaEntityMapper;

        @Override
        @Transactional(readOnly = true)
        public Lote getLoteById(int id) {
            return loteEntityMapper.toDomain(loteRepository.getById(id));
        }

        @Override
        public boolean existLoteById(int id) {
                return loteRepository.existsById(id);
        }

        @Override
        @Transactional(readOnly = true)
        public List<Lote> getAllLotes() {
            return loteEntityMapper.toDomain(loteRepository.findAll());
        }

        @Override
        @Transactional
        public LoteEntity saveLote(Lote abonoOrganico) {
                return this.loteRepository.save(this.loteEntityMapper.toEntity(abonoOrganico));
        }

        @Override
        public void eliminar(int idLote) {
                this.loteRepository.deleteById(idLote);
        }

        @Override
        public List<Lote> getAllLotesByFinca(Finca idFinca) {
                return loteEntityMapper.toDomain(
                        loteRepository.getAllByIdFinca(fincaEntityMapper.toEntity(idFinca)));
        }

}
