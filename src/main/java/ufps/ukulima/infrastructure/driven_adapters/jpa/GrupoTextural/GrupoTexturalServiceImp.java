package ufps.ukulima.infrastructure.driven_adapters.jpa.GrupoTextural;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.GrupoTextural.GrupoTextural;
import ufps.ukulima.domain.model.GrupoTextural.gateway.GrupoTexturalService;
import ufps.ukulima.infrastructure.mapper.GrupoTexturalEntityMapper;

import java.util.List;
@Service
public class GrupoTexturalServiceImp implements GrupoTexturalService {
    @Autowired
    GrupoTexturalRepository grupoTexturalRepository;

    @Autowired
    GrupoTexturalEntityMapper grupoTexturalEntityMapper;

    @Override
    @Transactional(readOnly = true)
    public GrupoTextural getGrupoTexturalById(int idGrupoTextural) {
        return grupoTexturalEntityMapper.toDomain(grupoTexturalRepository.getById(idGrupoTextural));
    }

    @Override
    @Transactional(readOnly = true)
    public GrupoTextural getGrupoTexturalByNombre(String nombre) {
        return grupoTexturalEntityMapper.
                toDomain(grupoTexturalRepository.getGrupoTexturalByNombre(nombre));
    }

    @Override
    @Transactional(readOnly = true)
    public List<GrupoTextural> getAllGrupoTextural() {
        return grupoTexturalEntityMapper.grupoTexturalToDomain(grupoTexturalRepository.findAll());
    }

    @Override
    @Transactional
    public void saveGrupoTextural(GrupoTextural GrupoTextural) {
        grupoTexturalRepository.save(grupoTexturalEntityMapper.toEntity(GrupoTextural));
    }

    @Override
    public void deleteGrupoTextural(GrupoTextural GrupoTextural) {

    }
}
