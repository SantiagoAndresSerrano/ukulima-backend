package ufps.ukulima.domain.model.Agricultor.gateway;

import ufps.ukulima.domain.model.Agricultor.Agricultor;

import java.util.List;

public interface AgricultorService {
    public Agricultor getAgricultorById(int id);
    public Agricultor getAgricultorByEmail(String email);
    public Agricultor getAgricultorByTelefono(String telefono);
    public List<Agricultor> getAllAgricultor();
    public void saveAgricultor(Agricultor agricultor);

}
