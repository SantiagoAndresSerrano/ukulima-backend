package ufps.ukulima.infrastructure.driven_adapters.jpa.Enmienda;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ufps.ukulima.infrastructure.db.springdata.entity.Enmienda.EnmiendaEntity;

public interface EnmiendaRepository extends JpaRepository<EnmiendaEntity, Integer> {

    @Query(value = "select * from enmienda e where lower(e.nombre)  like %:nombre% and e.valor =:valor limit 1",
            nativeQuery=true)
    EnmiendaEntity getEnmiendaByValor(@Param("valor") float valor, @Param("nombre") String nombre);
}
