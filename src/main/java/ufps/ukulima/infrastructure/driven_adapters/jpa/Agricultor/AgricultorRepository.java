package ufps.ukulima.infrastructure.driven_adapters.jpa.Agricultor;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.ukulima.domain.model.AbonoOrganicoRecomendacion.AbonoOrganicoRecomendacion;
import ufps.ukulima.domain.model.Agricultor.Agricultor;

public interface AgricultorRepository extends JpaRepository<Agricultor, Integer> {

    public Agricultor findAgricultorByEmail(String email);
    public Agricultor findAgricultorByTelefono(String telefono);

}
