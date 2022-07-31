package ufps.ukulima.infrastructure.driven_adapters.jpa.TipoIdentificacion;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.domain.model.TipoIdentificacion.TipoIdentificacion;

public interface TipoIdentificacionRepository extends JpaRepository<TipoIdentificacion, Integer> {
}
