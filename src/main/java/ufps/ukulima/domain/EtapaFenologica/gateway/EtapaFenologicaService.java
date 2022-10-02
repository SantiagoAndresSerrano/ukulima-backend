package ufps.ukulima.domain.EtapaFenologica.gateway;

import java.util.List;

import ufps.ukulima.domain.EtapaFenologica.EtapaFenologica;

public interface EtapaFenologicaService {
    public EtapaFenologica getEtapaFenologicaById(int idEtapaFenologica);

    public List<EtapaFenologica> getAllEtapaFenologica();

    public void saveEtapaFenologica(EtapaFenologica etapaFenologica);

    public void disableEtapaFenologica(EtapaFenologica etapaFenologica);

}
