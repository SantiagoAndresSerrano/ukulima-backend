package ufps.ukulima.domain.model.Departamento.gateway;

import ufps.ukulima.domain.model.Departamento.Departamento;

import java.util.List;

public interface DepartamentoService {
    public Departamento getDepartamentoById(int idDepartamento);
    public List<Departamento> getAllDepartamento();
}
