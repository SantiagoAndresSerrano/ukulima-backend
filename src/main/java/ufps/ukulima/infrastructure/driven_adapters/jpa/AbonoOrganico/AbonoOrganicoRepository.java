package ufps.ukulima.infrastructure.driven_adapters.jpa.AbonoOrganico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import ufps.ukulima.infrastructure.db.springdata.entity.AbonoOrganico.AbonoOrganicoEntity;


public interface AbonoOrganicoRepository extends JpaRepository<AbonoOrganicoEntity, Integer> {
    public AbonoOrganicoEntity getAbonoOrganicoEntityByDescripcion(@Param("descripcion") String descripcion);
}
