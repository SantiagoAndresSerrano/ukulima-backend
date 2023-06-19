package ufps.ukulima.infrastructure.driven_adapters.jpa.ElementoVariedad;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.parameters.P;
import ufps.ukulima.infrastructure.db.springdata.entity.Elemento.ElementoEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.ElementoVariedad.ElementoVariedadEntity;

public interface ElementoVariedadRepository extends JpaRepository<ElementoVariedadEntity, Integer> {
    @Query(value = "select ev.* from elemento_variedad ev \n" +
            "inner join elemento e on e.id = ev.id_elemento\n" +
            "where e.nombre = :elemento and ev.id_variedad = :id_variedad and ev.rendimiento = :rendimiento limit 1",
            nativeQuery = true)
    ElementoVariedadEntity obtenerElementoVariedadPorElemento(@Param("elemento") String elemento,
                                                      @Param("id_variedad") int id_variedad,
                                                      @Param("rendimiento") int rendimiento);
}
