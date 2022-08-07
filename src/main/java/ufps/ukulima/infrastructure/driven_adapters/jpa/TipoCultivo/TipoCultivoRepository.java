package ufps.ukulima.infrastructure.driven_adapters.jpa.TipoCultivo;
import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.infrastructure.db.springdata.entity.TipoCultivo.TipoCultivoEntity;

public interface TipoCultivoRepository extends JpaRepository<TipoCultivoEntity, Integer> {
}
