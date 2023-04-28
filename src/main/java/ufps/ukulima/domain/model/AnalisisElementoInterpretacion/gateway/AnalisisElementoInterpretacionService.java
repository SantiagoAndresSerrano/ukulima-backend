package ufps.ukulima.domain.model.AnalisisElementoInterpretacion.gateway;
import ufps.ukulima.domain.model.AnalisisElementoInterpretacion.AnalisisElementoInterpretacion;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisElemento.AnalisisElementosEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisElementoInterpretacion.AnalisisElementoInterpretacionEntity;

import java.util.List;

public interface AnalisisElementoInterpretacionService {
    public AnalisisElementoInterpretacion getAnalisisElementoById(int id);
    public List<AnalisisElementoInterpretacion> getAllAnalisisElemento();
    public List<AnalisisElementosEntity> getElementosByInterpretacion(
            float valorF,float valorP,float valorC,float valorM,float valorS, float valorA,int idF,int idP,int idC,
            int idM,int idS,int idA,int idAnalisisSuelo
    );

    public void saveAnalisisElemento(AnalisisElementoInterpretacion analisisElementoInterpretacion);
}
