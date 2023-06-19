package ufps.ukulima.infrastructure.driven_adapters.jpa.Finca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.Agricultor.Agricultor;
import ufps.ukulima.domain.model.Finca.Finca;
import ufps.ukulima.domain.model.Finca.gateway.FincaService;
import ufps.ukulima.infrastructure.db.springdata.entity.Finca.FincaEntity;
import ufps.ukulima.infrastructure.mapper.AgricultorEntityMapper;
import ufps.ukulima.infrastructure.mapper.FincaEntityMapper;

import java.util.List;

@Service
public class FincaServiceImp implements FincaService {

    @Autowired
    FincaRepository fincaRepository;

    @Autowired
    FincaEntityMapper fincaEntityMapper;

    @Autowired
    AgricultorEntityMapper agricultorEntityMapper;


    @Override
    @Transactional(readOnly = true)
    public Finca getFincaById(int idFinca) {
        return fincaEntityMapper.toDomain(fincaRepository.getById(idFinca));
    }

    @Override
    public boolean existById(int id) {
        return fincaRepository.existsById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Finca> getFincaByIdAgricultor(Agricultor idAgricultor) {
        return fincaEntityMapper.abonosOrganicosRecomendacionToDomain(fincaRepository.getAllByIdAgricultor(agricultorEntityMapper.toEntity(idAgricultor)));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Finca> getAllFinca() {
        return fincaEntityMapper.abonosOrganicosRecomendacionToDomain(fincaRepository.findAll());
    }

    @Override
    @Transactional
    public FincaEntity saveFinca(Finca Finca) {
        return fincaRepository.save(fincaEntityMapper.toEntity(Finca));
    }

    @Override
    public void disableFinca(Finca Finca) {

    }
}
