package ufps.ukulima.infrastructure.driven_adapters.jpa.EtapaFenologica;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.infrastructure.db.springdata.entity.EtapaFenologica.EtapaFenologicaEntity;

public interface EtapaFenologicaRepository extends JpaRepository<EtapaFenologicaEntity, Integer> {
}
