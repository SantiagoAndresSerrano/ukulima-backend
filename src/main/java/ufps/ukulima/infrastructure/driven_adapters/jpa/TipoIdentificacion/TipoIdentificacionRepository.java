package ufps.ukulima.infrastructure.driven_adapters.jpa.TipoIdentificacion;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.infrastructure.db.springdata.entity.TipoIdentificacion.TipoIdentificacionEntity;

public interface TipoIdentificacionRepository extends JpaRepository<TipoIdentificacionEntity, Integer> {
}
