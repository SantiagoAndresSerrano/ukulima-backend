package ufps.ukulima.infrastructure.driven_adapters.jpa.ConductividadElectrica;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ufps.ukulima.infrastructure.db.springdata.entity.ConductividadElectrica.ConductividadElectricaEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.PhSuelo.PhSueloEntity;

public interface ConductividadElectricaRepository extends JpaRepository<ConductividadElectricaEntity, Integer> {
    @Query(value = "SELECT * FROM conductividad_electrica where conductividad_electrica.valor_min <= :valor_conductividad " +
            "and conductividad_electrica.valor_max >= :valor_conductividad ;",
            nativeQuery = true)
    ConductividadElectricaEntity determinarConductividadElectrica(@Param("valor_conductividad") float valor_conductividad);
}
