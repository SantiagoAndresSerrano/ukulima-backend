package ufps.ukulima.infrastructure.driven_adapters.jpa.ConductividadElectrica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.ConductividadElectrica.ConductividadElectrica;
import ufps.ukulima.domain.model.ConductividadElectrica.gateway.ConductividadElectricaService;
import ufps.ukulima.infrastructure.db.springdata.mapper.ConductividadElectricaEntityMapper;

import java.util.List;
@Service
public class ConductividadElectricaServiceImp implements ConductividadElectricaService {
    @Autowired
    ConductividadElectricaRepository conductividadElectricaRepository;

    @Autowired
    ConductividadElectricaEntityMapper conductividadElectricaEntityMapper;

    @Override
    @Transactional(readOnly = true)
    public ConductividadElectrica getConductividadElectricaById(int idconductividadElectrica) {
        return conductividadElectricaEntityMapper.toDomain(conductividadElectricaRepository.getById(idconductividadElectrica));
    }

    @Override
    @Transactional(readOnly = true)
    public List<ConductividadElectrica> getAllConductividadElectrica() {
        return conductividadElectricaEntityMapper.abonosOrganicosRecomendacionToDomain(conductividadElectricaRepository.findAll());
    }

    @Override
    @Transactional
    public void saveConductividadElectrica(ConductividadElectrica conductividadElectrica) {
        conductividadElectricaRepository.save(conductividadElectricaEntityMapper.toEntity(conductividadElectrica));
    }

    @Override
    public ConductividadElectrica getConductividadElectricaByValor(float valor) {
        return conductividadElectricaEntityMapper.toDomain(
                conductividadElectricaRepository.determinarConductividadElectrica(valor));
    }
}
