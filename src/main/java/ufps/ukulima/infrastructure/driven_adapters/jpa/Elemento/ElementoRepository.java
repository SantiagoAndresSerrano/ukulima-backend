package ufps.ukulima.infrastructure.driven_adapters.jpa.Elemento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import ufps.ukulima.infrastructure.db.springdata.entity.Elemento.ElementoEntity;

public interface ElementoRepository extends JpaRepository<ElementoEntity, Integer>
{
    public ElementoEntity getElementoEntityByNombre(@Param("nombre") String nombre);
    public ElementoEntity getElementoEntityById(@Param("id") int id);
}
