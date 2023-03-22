package ufps.ukulima.domain.model.Lote.gateway;
import ufps.ukulima.domain.model.Lote.Lote;
import java.util.List;

public interface LoteServicio {
    public Lote getLoteById(int id);
    public List<Lote> getAllLotes();
    public void saveLote(Lote lote);
}
