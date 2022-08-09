package ufps.ukulima.infrastructure.db.springdata.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.PasswordResetToken.PasswordResetToken;
import ufps.ukulima.domain.model.ProfundidadMuestra.ProfundidadMuestra;
import ufps.ukulima.infrastructure.db.springdata.entity.PasswordResetToken.PasswordResetTokenEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.ProfundidadMuestra.ProfundidadMuestraEntity;

import java.util.List;
@Mapper(componentModel = "spring")
public interface PasswordResetTokenEntityMapper {
    PasswordResetToken toDomain(PasswordResetTokenEntity passwordResetTokenEntity);
    PasswordResetTokenEntity toEntity(PasswordResetToken passwordResetToken);
    List<PasswordResetToken> abonosOrganicosRecomendacionToDomain(List<PasswordResetTokenEntity> abonoOrganicoEntities);
}
