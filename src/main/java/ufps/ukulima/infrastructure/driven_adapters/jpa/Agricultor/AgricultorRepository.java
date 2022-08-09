package ufps.ukulima.infrastructure.driven_adapters.jpa.Agricultor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ufps.ukulima.domain.model.Agricultor.Agricultor;
import ufps.ukulima.infrastructure.db.springdata.entity.Agricultor.AgricultorEntity;

public interface AgricultorRepository extends JpaRepository<AgricultorEntity, Integer> {

    public AgricultorEntity findAgricultorByEmail(String email);
    public AgricultorEntity findAgricultorByTelefono(String telefono);
    @Query(value = "select pr.agricultor from PasswordResetTokenEntity pr where pr.token=:token")
    public AgricultorEntity getAgricultorByToken(@Param("token") String token);

    @Query("SELECT a FROM AgricultorEntity a WHERE a.email=:usernameOrEmail OR a.telefono=:usernameOrEmail")
    AgricultorEntity findAgricultorsByTelefonoOrEmail(@Param("usernameOrEmail") String usernameOrEmail);
    public boolean existsAgricultorByEmail(String email);
    public boolean existsAgricultorByTelefono(String telefono);
    public boolean existsAgricultorByIdentifiacion(Integer identifiacion);



}
