package ufps.ukulima.infrastructure.driven_adapters.jpa.AbonoOrganico;
import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.domain.model.AbonoOrganico.AbonoOrganico;

public interface AbonoOrganicoRepository extends JpaRepository<AbonoOrganico, Integer> {
}
