package ufps.ukulima.infrastructure.driven_adapters.jpa.Departamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.Departamento.Departamento;
import ufps.ukulima.domain.model.Departamento.gateway.DepartamentoService;
import ufps.ukulima.infrastructure.db.springdata.mapper.DepartamentoEntityMapper;

import java.util.List;
@Service
public class DepartamentoServiceImp implements DepartamentoService {

    @Autowired
    DepartamentoRepository departamentoRepository;

    @Autowired
    DepartamentoEntityMapper departamentoEntityMapper;

    @Override
    @Transactional(readOnly = true)
    public Departamento getDepartamentoById(int idDepartamento) {
        return departamentoEntityMapper.toDomain(departamentoRepository.getById(idDepartamento));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Departamento> getAllDepartamento() {
        return departamentoEntityMapper.abonosOrganicosRecomendacionToDomain(departamentoRepository.findAll());
    }
}
