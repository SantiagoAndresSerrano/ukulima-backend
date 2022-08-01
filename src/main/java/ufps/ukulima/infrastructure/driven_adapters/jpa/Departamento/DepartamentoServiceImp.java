package ufps.ukulima.infrastructure.driven_adapters.jpa.Departamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.Departamento.Departamento;
import ufps.ukulima.domain.model.Departamento.gateway.DepartamentoService;

import java.util.List;
@Service
public class DepartamentoServiceImp implements DepartamentoService {

    @Autowired
    DepartamentoRepository departamentoRepository;

    @Override
    @Transactional(readOnly = true)
    public Departamento getDepartamentoById(int idDepartamento) {
        return departamentoRepository.getById(idDepartamento);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Departamento> getAllDepartamento() {
        return departamentoRepository.findAll();
    }
}
