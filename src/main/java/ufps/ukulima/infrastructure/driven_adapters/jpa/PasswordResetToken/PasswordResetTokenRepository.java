package ufps.ukulima.infrastructure.driven_adapters.jpa.PasswordResetToken;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ufps.ukulima.domain.model.PasswordResetToken.PasswordResetToken;
import ufps.ukulima.infrastructure.db.springdata.entity.PasswordResetToken.PasswordResetTokenEntity;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetTokenEntity, Integer> {
    PasswordResetToken findPasswordResetTokenByToken(String token);
    @Modifying
    @Query("delete from PasswordResetTokenEntity prt where prt.token=:token")
    void deletePasswordResetTokenByToken(@Param("token") String token);
}
