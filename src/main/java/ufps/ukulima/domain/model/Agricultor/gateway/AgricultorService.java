package ufps.ukulima.domain.model.Agricultor.gateway;

import ufps.ukulima.domain.model.Agricultor.Agricultor;

import java.util.List;

public interface AgricultorService {
    public Agricultor getAgricultorById(int id);

    public Agricultor getAgricultorByEmail(String email);

    public Agricultor getAgricultorByPhone(String phone);

    public Agricultor getAgricultorByPhoneOrEmail(String phone);

    public boolean existById(int id);

    public boolean existByEmail(String email);

    public boolean existByPhone(String email);

    public List<Agricultor> getAllAgricultor();

    public void saveAgricultor(Agricultor agricultor);

    public void save(Agricultor agricultor);

    Agricultor findByResetPassword(String token);
}
