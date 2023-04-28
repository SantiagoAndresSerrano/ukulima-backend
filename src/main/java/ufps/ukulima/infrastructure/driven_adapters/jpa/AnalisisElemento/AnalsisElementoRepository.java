package ufps.ukulima.infrastructure.driven_adapters.jpa.AnalisisElemento;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.domain.model.AnalisisElemento.AnalisisElemento;
import ufps.ukulima.domain.model.AnalisisSuelo.AnalisisSuelo;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisElemento.AnalisisElementosEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisSuelo.AnalisisSueloEntity;

import java.util.List;

public interface AnalsisElementoRepository extends JpaRepository<AnalisisElementosEntity, Integer> {

    List<AnalisisElementosEntity> getAllByIdAnalisisSuelo(AnalisisSueloEntity idAnalisisSuelo);
}
