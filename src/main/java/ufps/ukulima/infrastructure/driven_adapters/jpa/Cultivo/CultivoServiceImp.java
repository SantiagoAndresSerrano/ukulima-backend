package ufps.ukulima.infrastructure.driven_adapters.jpa.Cultivo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.Cultivo.Cultivo;
import ufps.ukulima.domain.model.Cultivo.gateway.CultivoService;
import ufps.ukulima.domain.model.Finca.Finca;
import ufps.ukulima.infrastructure.db.springdata.entity.Finca.FincaEntity;
import ufps.ukulima.infrastructure.mapper.CultivoEntityMapper;
import ufps.ukulima.infrastructure.mapper.FincaEntityMapper;

import java.util.List;

@Service
public class CultivoServiceImp implements CultivoService {
    @Autowired
    CultivoRepository cultivoRepository;

    @Autowired
    CultivoEntityMapper cultivoEntityMapper;

    @Autowired
    FincaEntityMapper fincaEntityMapper;

    @Override
    @Transactional(readOnly = true)
    public Cultivo getCultivoById(int idCultivo) {
        return cultivoEntityMapper.toDomain(cultivoRepository.getById(idCultivo));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Cultivo> getAllCultivo() {
        return cultivoEntityMapper.abonosOrganicosRecomendacionToDomain(cultivoRepository.findAll());
    }

    @Override
    public List<Cultivo> getAllCultivoByAgricultor(String nombreUsuario) {
        return cultivoEntityMapper.abonosOrganicosRecomendacionToDomain(cultivoRepository.getAllByAgricultor(nombreUsuario));
    }

    @Override
    public List<Cultivo> getAllCultivoByFinca(Finca idFinca) {
        return cultivoEntityMapper.abonosOrganicosRecomendacionToDomain(cultivoRepository.getAllByIdFinca(
                fincaEntityMapper.toEntity(idFinca)));
    }

    @Override
    @Transactional
    public void saveCultivo(Cultivo cultivo) {
        cultivoRepository.save(cultivoEntityMapper.toEntity(cultivo));
    }
}
