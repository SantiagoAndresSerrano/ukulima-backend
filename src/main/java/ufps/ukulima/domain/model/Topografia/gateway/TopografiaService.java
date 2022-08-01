package ufps.ukulima.domain.model.Topografia.gateway;

import ufps.ukulima.domain.model.Topografia.Topografia;

import java.util.List;

public interface TopografiaService {
    public  void saveTopografia(Topografia topografia);
    public  Topografia findTopografiaById(int id);
    public List<Topografia> findByAllTopografia();
}
