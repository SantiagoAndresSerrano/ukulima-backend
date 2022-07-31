package ufps.ukulima.infrastructure.driven_adapters.jpa.Elemento;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.domain.model.Elemento.Elemento;

public interface ElementoRepository extends JpaRepository<Elemento, Integer>
{
}
