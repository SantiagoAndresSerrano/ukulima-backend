package ufps.ukulima.infrastructure.driven_adapters.jpa.Densidad;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ufps.ukulima.infrastructure.db.springdata.entity.Densidad.DensidadEntity;

public interface DensidadRepository extends JpaRepository<DensidadEntity, Integer> {
    @Query("select d from DensidadEntity d where d.valor = :valor")
    public DensidadEntity findByValor(@Param("valor") float valor);
}
