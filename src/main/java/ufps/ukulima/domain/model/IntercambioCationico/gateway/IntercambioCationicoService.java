package ufps.ukulima.domain.model.IntercambioCationico.gateway;

import ufps.ukulima.domain.model.IntercambioCationico.IntercambioCationico;
import java.util.List;

public interface IntercambioCationicoService {
    public IntercambioCationico getIntercambioCationicoById(int id);
    public IntercambioCationico getIntercambioCationicoByValor(float valor);

    public List<IntercambioCationico> getAllIntercambioCationicos();
    public void saveIntercambioCationico(IntercambioCationico intercambioCationico);
}