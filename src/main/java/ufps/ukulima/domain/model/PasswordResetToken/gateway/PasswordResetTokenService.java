package ufps.ukulima.domain.model.PasswordResetToken.gateway;


import ufps.ukulima.domain.model.PasswordResetToken.PasswordResetToken;

import java.util.List;

public interface PasswordResetTokenService {
    public List<PasswordResetToken> listar();
    public PasswordResetToken buscarToken(String token);
    public void guardar(PasswordResetToken ct);
    public void eliminar(PasswordResetToken ct);
    public void eliminarByToken(String ct);

}
