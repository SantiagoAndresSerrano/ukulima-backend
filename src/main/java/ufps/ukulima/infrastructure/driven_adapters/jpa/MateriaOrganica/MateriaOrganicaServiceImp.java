package ufps.ukulima.infrastructure.driven_adapters.jpa.MateriaOrganica;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.config.Spring.security.controller.AuthController;
import ufps.ukulima.domain.model.MateriaOrganica.MateriaOrganica;
import ufps.ukulima.domain.model.MateriaOrganica.gateway.MateriaOrganicaService;
import ufps.ukulima.infrastructure.db.springdata.entity.MateriaOrganica.MateriaOrganicaEntity;
import ufps.ukulima.infrastructure.db.springdata.mapper.MateriaOrganicaEntityMapper;

import java.util.List;

@Service
@Slf4j
public class MateriaOrganicaServiceImp implements MateriaOrganicaService {
    @Autowired
    MateriaOrganicaRepository materiaOrganicaRepository;
    private static Logger log = LoggerFactory.getLogger(AuthController.class);

    @Autowired
    MateriaOrganicaEntityMapper materiaOrganicaEntityMapper;

    @Override
    @Transactional(readOnly = true)
    public MateriaOrganica getMateriaOrganicaById(int id) {
        return materiaOrganicaEntityMapper.toDomain(materiaOrganicaRepository.getById(id));
    }

    @Override
    @Transactional(readOnly = true)
    public List<MateriaOrganica> getAllMateriaOrganicas() {
        return materiaOrganicaEntityMapper.toDomain(materiaOrganicaRepository.findAll());
    }

    @Override
    public MateriaOrganica getMateriaOrganicaByClimaAndValor(String clima, float valor) {
        List<MateriaOrganicaEntity> materiaOrganicaEntities=
                materiaOrganicaRepository.getMateriaOrganicaByClima(clima);
        for (int i = 0; i < materiaOrganicaEntities.size(); i++) {
            MateriaOrganicaEntity materiaOrganicaEntity= materiaOrganicaEntities.get(i);
            if(materiaOrganicaEntity.getValorMin() < 0 && materiaOrganicaEntity.getValorMax() > valor){
                return materiaOrganicaEntityMapper.toDomain(materiaOrganicaEntity);
            }
            if(materiaOrganicaEntity.getValorMax() > 10 && materiaOrganicaEntity.getValorMin() < valor){
                return materiaOrganicaEntityMapper.toDomain(materiaOrganicaEntity);
            }
            if(materiaOrganicaEntity.getValorMax() >= valor && materiaOrganicaEntity.getValorMin() <= valor){
                return materiaOrganicaEntityMapper.toDomain(materiaOrganicaEntity);
            }
        }

        return null;
    }

    @Override
    @Transactional
    public void saveMateriaOrganica(MateriaOrganica abonoOrganico) {

    }

}
