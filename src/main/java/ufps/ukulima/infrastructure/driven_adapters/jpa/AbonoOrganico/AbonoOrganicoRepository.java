package ufps.ukulima.infrastructure.driven_adapters.jpa.AbonoOrganico;
import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.infrastructure.db.springdata.entity.AbonoOrganico.AbonoOrganicoEntity;


public interface AbonoOrganicoRepository extends JpaRepository<AbonoOrganicoEntity, Integer> {
}
