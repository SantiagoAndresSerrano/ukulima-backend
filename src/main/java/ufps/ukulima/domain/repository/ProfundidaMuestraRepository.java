package ufps.ukulima.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.domain.model.ProfundidadMuestra.ProfundidadMuestra;

public interface ProfundidaMuestraRepository extends JpaRepository<ProfundidadMuestra, Integer> {
}
