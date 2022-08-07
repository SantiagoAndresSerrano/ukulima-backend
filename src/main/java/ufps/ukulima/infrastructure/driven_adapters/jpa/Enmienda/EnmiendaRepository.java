package ufps.ukulima.infrastructure.driven_adapters.jpa.Enmienda;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.infrastructure.db.springdata.entity.Enmienda.EnmiendaEntity;

public interface EnmiendaRepository extends JpaRepository<EnmiendaEntity, Integer> {
}
