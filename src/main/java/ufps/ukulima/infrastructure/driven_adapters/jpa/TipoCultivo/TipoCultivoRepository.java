package ufps.ukulima.infrastructure.driven_adapters.jpa.TipoCultivo;
import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.domain.model.TipoCultivo.TipoCultivo;

public interface TipoCultivoRepository extends JpaRepository<TipoCultivo, Integer> {
}
