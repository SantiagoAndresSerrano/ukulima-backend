package ufps.ukulima.infrastructure.driven_adapters.jpa.Agricultor;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ufps.ukulima.infrastructure.db.springdata.entity.Agricultor.AgricultorEntity;

public interface AgricultorRepository extends JpaRepository<AgricultorEntity, Integer> {

    public AgricultorEntity findAgricultorByEmail(String email);
    public AgricultorEntity findAgricultorByTelefono(String telefono);
    @Query(value = "select pr.agricultor from PasswordResetTokenEntity pr where pr.token=:token")
    public AgricultorEntity getAgricultorByToken(@Param("token") String token);
    @Modifying
    @Query(value = "INSERT INTO `agricultor` (`identificacion`, `nombres`, `apellidos`, `telefono`, `fecha_nacimiento`, `password`, `email`, `id_tipo_identificacion`, `confirmation_token`, `estado`) VALUES (:identificacion, :nombres, :apellidos, :telefono, :fecha_nacimiento, :password, :email, :id_tipo_identificacion, :confirmation_token, :estado);" , nativeQuery = true)
    public void saveAgricultorEntity(
        @Param("identificacion") int identificacion, 
        @Param("nombres") String nombres,
        @Param("apellidos") String apellidos, 
        @Param("telefono") String telefono,
        @Param("fecha_nacimiento") Date fecha_nacimiento ,
        @Param("password") String password,
        @Param("email") String email,
        @Param("id_tipo_identificacion") int id_tipo_identificacion,
        @Param("confirmation_token") String confirmation_token,
        @Param("estado") Boolean estado
        );

    @Query("SELECT a FROM AgricultorEntity a WHERE a.email=:usernameOrEmail OR a.telefono=:usernameOrEmail")
    AgricultorEntity findAgricultorsByTelefonoOrEmail(@Param("usernameOrEmail") String usernameOrEmail);
    public boolean existsAgricultorByEmail(String email);
    public boolean existsAgricultorByTelefono(String telefono);
    public boolean existsAgricultorByIdentificacion(Integer identificacion);



}
