package ufps.ukulima.infrastructure.driven_adapters.jpa.Departamento;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.infrastructure.db.springdata.entity.Departamento.DepartamentoEntity;

public interface DepartamentoRepository extends JpaRepository<DepartamentoEntity, Integer > {
}
