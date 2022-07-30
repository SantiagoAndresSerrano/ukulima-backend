package ufps.ukulima.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.domain.model.TipoIdentificacion;

public interface TipoIdentificacionRepository extends JpaRepository<TipoIdentificacion, Integer> {
}
