package ufps.ukulima.infrastructure.driven_adapters.jpa.Elemento;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.infrastructure.db.springdata.entity.Elemento.ElementoEntity;

public interface ElementoRepository extends JpaRepository<ElementoEntity, Integer>
{
}
