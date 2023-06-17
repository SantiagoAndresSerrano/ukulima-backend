package ufps.ukulima.domain.model.Lote.gateway;
import ufps.ukulima.domain.model.Finca.Finca;
import ufps.ukulima.domain.model.Lote.Lote;
import ufps.ukulima.infrastructure.db.springdata.entity.Lote.LoteEntity;

import java.util.List;

public interface LoteServicio {
    public Lote getLoteById(int id);
    public List<Lote> getAllLotes();
    public LoteEntity saveLote(Lote lote);

    public List<Lote> getAllLotesByFinca(Finca idFinca);


}
