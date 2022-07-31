package ufps.ukulima.infrastructure.driven_adapters.jpa.EtapaFenologica;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.domain.model.EtapaFenologica.EtapaFenologica;

public interface EtapaFenologicaRepository extends JpaRepository<EtapaFenologica, Integer> {
}
