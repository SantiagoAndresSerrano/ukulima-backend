package ufps.ukulima.infrastructure.mapper;

import org.mapstruct.Mapper;
import ufps.ukulima.domain.model.PasswordResetToken.PasswordResetToken;
import ufps.ukulima.infrastructure.db.springdata.entity.PasswordResetToken.PasswordResetTokenEntity;

import java.util.List;
@Mapper(componentModel = "spring")
public interface PasswordResetTokenEntityMapper {
    PasswordResetToken toDomain(PasswordResetTokenEntity passwordResetTokenEntity);
    PasswordResetTokenEntity toEntity(PasswordResetToken passwordResetToken);
    List<PasswordResetToken> abonosOrganicosRecomendacionToDomain(List<PasswordResetTokenEntity> abonoOrganicoEntities);
}
