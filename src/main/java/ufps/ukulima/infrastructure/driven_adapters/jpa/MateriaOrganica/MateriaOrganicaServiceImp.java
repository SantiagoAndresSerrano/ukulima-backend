package ufps.ukulima.infrastructure.driven_adapters.jpa.MateriaOrganica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.MateriaOrganica.MateriaOrganica;
import ufps.ukulima.domain.model.MateriaOrganica.gateway.MateriaOrganicaService;
import ufps.ukulima.infrastructure.db.springdata.mapper.MateriaOrganicaEntityMapper;

import java.util.List;

@Service
public class MateriaOrganicaServiceImp implements MateriaOrganicaService {
    @Autowired
    MateriaOrganicaRepository materiaOrganicaRepository;

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
    @Transactional
    public void saveMateriaOrganica(MateriaOrganica abonoOrganico) {

    }

}
