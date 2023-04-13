package ufps.ukulima.domain.model.GrupoTextural.gateway;

import ufps.ukulima.domain.model.GrupoTextural.GrupoTextural;

import java.util.List;

public interface GrupoTexturalService {
    public GrupoTextural getGrupoTexturalById(int idGrupoTextural);
    public List<GrupoTextural> getAllGrupoTextural();
    public void saveGrupoTextural(GrupoTextural GrupoTextural);
    public void deleteGrupoTextural(GrupoTextural GrupoTextural);
    public GrupoTextural getGrupoTexturalByNombre(String nombre);
}
