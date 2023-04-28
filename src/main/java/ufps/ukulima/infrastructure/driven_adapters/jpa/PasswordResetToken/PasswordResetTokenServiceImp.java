package ufps.ukulima.infrastructure.driven_adapters.jpa.PasswordResetToken;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.PasswordResetToken.PasswordResetToken;
import ufps.ukulima.domain.model.PasswordResetToken.gateway.PasswordResetTokenService;
import ufps.ukulima.infrastructure.mapper.PasswordResetTokenEntityMapper;

import java.util.List;

@Service
public class PasswordResetTokenServiceImp implements PasswordResetTokenService {

    @Autowired
    PasswordResetTokenRepository passwordResetTokenRepository;

    @Autowired
    PasswordResetTokenEntityMapper passwordResetTokenEntityMapper;



    @Override
    @Transactional(readOnly = true)
    public List<PasswordResetToken> listar() {
        return passwordResetTokenEntityMapper.abonosOrganicosRecomendacionToDomain(passwordResetTokenRepository.findAll());
    }

    @Override
    @Transactional(readOnly = true)
    public PasswordResetToken buscarToken(String token) {
        return passwordResetTokenRepository.findPasswordResetTokenByToken(token);
    }

    @Override
    @Transactional
    public void guardar(PasswordResetToken ct) {
         passwordResetTokenRepository.save(passwordResetTokenEntityMapper.toEntity(ct));
    }

    @Override
    @Transactional
    public void eliminar(PasswordResetToken ct) {
          passwordResetTokenRepository.delete(passwordResetTokenEntityMapper.toEntity(ct));
    }

    @Override
    @Transactional
    public void eliminarByToken(String ct) {
       passwordResetTokenRepository.deletePasswordResetTokenByToken(ct);
    }
}
