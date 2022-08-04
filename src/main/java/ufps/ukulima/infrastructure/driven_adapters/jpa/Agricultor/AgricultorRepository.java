package ufps.ukulima.infrastructure.driven_adapters.jpa.Agricultor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ufps.ukulima.domain.model.AbonoOrganicoRecomendacion.AbonoOrganicoRecomendacion;
import ufps.ukulima.domain.model.Agricultor.Agricultor;

public interface AgricultorRepository extends JpaRepository<Agricultor, Integer> {

    public Agricultor findAgricultorByEmail(String email);
    public Agricultor findAgricultorByTelefono(String telefono);

    @Query("SELECT a FROM Agricultor a WHERE a.email=:usernameOrEmail OR a.telefono=:usernameOrEmail")
    Agricultor findAgricultorByTelefonoOrEmail(String usernameOrEmail);
    public boolean existsAgricultorByEmail(String email);
    public boolean existsAgricultorByTelefono(String telefono);
    public boolean existsAgricultorByIdentifiacion(Integer identifiacion);



}
