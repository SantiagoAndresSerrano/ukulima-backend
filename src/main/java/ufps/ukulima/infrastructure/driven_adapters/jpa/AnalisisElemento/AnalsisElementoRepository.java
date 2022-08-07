package ufps.ukulima.infrastructure.driven_adapters.jpa.AnalisisElemento;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisElemento.AnalisisElementosEntity;

public interface AnalsisElementoRepository extends JpaRepository<AnalisisElementosEntity, Integer> {
}
