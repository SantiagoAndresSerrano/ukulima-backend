package ufps.ukulima.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.domain.model.TipoCultivo;

public interface TipoCultivoRepository extends JpaRepository<TipoCultivo, Integer> {
}
