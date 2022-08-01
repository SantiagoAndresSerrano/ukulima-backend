package ufps.ukulima.domain.model.Vereda.gateway;

import ufps.ukulima.domain.model.Vereda.Vereda;

import java.util.List;

public interface VeredaService {
    public void saveVereda(Vereda vereda);
    public Vereda findVeredaById(int id);
    public List<Vereda> findByAllVereda();
}
