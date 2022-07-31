package ufps.ukulima.domain.model.EtapaFenologica.gateway;

import ufps.ukulima.domain.model.EtapaFenologica.EtapaFenologica;

import java.util.List;

public interface EtapaFenologicaService {
    public EtapaFenologica getEtapaFenologicaById(int idEtapaFenologica);
    public List<EtapaFenologica> getAllEtapaFenologica();
    public void saveEtapaFenologica(EtapaFenologica etapaFenologica);
    public void disableEtapaFenologica(EtapaFenologica etapaFenologica);

}
