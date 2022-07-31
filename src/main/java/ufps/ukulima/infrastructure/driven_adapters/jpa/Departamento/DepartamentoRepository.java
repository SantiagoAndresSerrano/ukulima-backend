package ufps.ukulima.infrastructure.driven_adapters.jpa.Departamento;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.domain.model.Departamento.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Integer > {
}
