package ufps.ukulima.infrastructure.driven_adapters.jpa.Finca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.Agricultor.Agricultor;
import ufps.ukulima.domain.model.Finca.Finca;
import ufps.ukulima.domain.model.Finca.gateway.FincaService;
import ufps.ukulima.infrastructure.db.springdata.mapper.FincaEntityMapper;

import java.util.List;

@Service
public class FincaServiceImp implements FincaService {

    @Autowired
    FincaRepository fincaRepository;

    @Autowired
    FincaEntityMapper fincaEntityMapper;


    @Override
    @Transactional(readOnly = true)
    public Finca getFincaById(int idFinca) {
        return fincaEntityMapper.toDomain(fincaRepository.getById(idFinca));
    }

    @Override
    @Transactional(readOnly = true)
    public Finca getFincaByIdAgricultor(Agricultor idAgricultor) {
        return (fincaRepository.getFincaByIdAgricultor(idAgricultor));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Finca> getAllFinca() {
        return fincaEntityMapper.abonosOrganicosRecomendacionToDomain(fincaRepository.findAll());
    }

    @Override
    @Transactional
    public void saveFinca(Finca Finca) {
        fincaRepository.save(fincaEntityMapper.toEntity(Finca));
    }

    @Override
    public void disableFinca(Finca Finca) {

    }
}
