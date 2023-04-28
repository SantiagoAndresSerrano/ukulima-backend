package ufps.ukulima.infrastructure.driven_adapters.jpa.AnalisisElementoInterpretacion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.config.Spring.security.controller.AuthController;
import ufps.ukulima.domain.model.AnalisisElementoInterpretacion.AnalisisElementoInterpretacion;
import ufps.ukulima.domain.model.AnalisisElementoInterpretacion.gateway.AnalisisElementoInterpretacionService;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisElemento.AnalisisElementosEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisElementoInterpretacion.AnalisisElementoInterpretacionEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.AnalisisSuelo.AnalisisSueloEntity;
import ufps.ukulima.infrastructure.db.springdata.entity.Elemento.ElementoEntity;
import ufps.ukulima.infrastructure.mapper.AnalisisElementoInterpretacionEntityMapper;
import ufps.ukulima.infrastructure.driven_adapters.jpa.AnalisisElemento.AnalsisElementoRepository;
import ufps.ukulima.infrastructure.driven_adapters.jpa.Elemento.ElementoRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnalisisElementoInterpretacionServiceImp implements AnalisisElementoInterpretacionService {
    private static Logger log = LoggerFactory.getLogger(AuthController.class);

    @Autowired
    AnalisisElementoInterpretacionRepository analsisElementoRepository;

    @Autowired
    AnalsisElementoRepository analisisElementoRepository;

    @Autowired
    ElementoRepository elementoRepository;

    @Autowired
    AnalisisElementoInterpretacionEntityMapper analisisElementoEntityMapper;

    @Override
    @Transactional(readOnly = true)
    public AnalisisElementoInterpretacion getAnalisisElementoById(int id) {
        return analisisElementoEntityMapper.toDomain(analsisElementoRepository.getById(id));
    }

    @Override
    @Transactional(readOnly = true)
    public List<AnalisisElementoInterpretacion> getAllAnalisisElemento() {
        return analisisElementoEntityMapper.toDomain(analsisElementoRepository.findAll());
    }

    @Override
    public List<AnalisisElementosEntity> getElementosByInterpretacion(
            float valorF, float valorP, float valorC, float valorM, float valorS, float valorA,
            int idF, int idP, int idC, int idM, int idS, int idA, int idAnalisisSuelo) {
        List<AnalisisElementoInterpretacionEntity> muyBajos =
                analsisElementoRepository.obtenerInterpretacionMuyBajos(valorF, valorP, valorC, valorM);
        List<AnalisisElementoInterpretacionEntity> all =
                analsisElementoRepository.obtenerInterpretacionVarias(valorF, valorP, valorC, valorM, valorS, valorA);

        List<AnalisisElementosEntity> result = new ArrayList<>();

        ElementoEntity fElementoEntity = elementoRepository.getElementoEntityById(idF);
        ElementoEntity pElementoEntity = elementoRepository.getElementoEntityById(idP);
        ElementoEntity cElementoEntity = elementoRepository.getElementoEntityById(idC);
        ElementoEntity mElementoEntity = elementoRepository.getElementoEntityById(idM);

        if (muyBajos.size() > 0 || all.size() > 0) {
            String interpretacion = muyBajos.get(0).getInterpretacion();
            result.add(analisisElementoRepository.save(new AnalisisElementosEntity(null, valorF,
                    new AnalisisSueloEntity(idAnalisisSuelo),
                    fElementoEntity, analsisElementoRepository.
                            getAnalisisElementoInterpretacionEntityByIdElementoAndInterpretacion
                                    (fElementoEntity,interpretacion))));
            result.add(analisisElementoRepository.save(new AnalisisElementosEntity(null, valorP,
                    new AnalisisSueloEntity(idAnalisisSuelo),
                    pElementoEntity, analsisElementoRepository.
                    getAnalisisElementoInterpretacionEntityByIdElementoAndInterpretacion
                            (pElementoEntity,interpretacion))));
            result.add(analisisElementoRepository.save(new AnalisisElementosEntity(null, valorC,
                    new AnalisisSueloEntity(idAnalisisSuelo),
                    cElementoEntity, analsisElementoRepository.
                    getAnalisisElementoInterpretacionEntityByIdElementoAndInterpretacion
                            (cElementoEntity,interpretacion))));
            result.add(analisisElementoRepository.save(new AnalisisElementosEntity(null, valorM,
                    new AnalisisSueloEntity(idAnalisisSuelo),
                    mElementoEntity, analsisElementoRepository.
                    getAnalisisElementoInterpretacionEntityByIdElementoAndInterpretacion
                            (mElementoEntity,interpretacion))));

            if(all.size() > 0){
                ElementoEntity sElementoEntity = elementoRepository.getElementoEntityById(idS);
                ElementoEntity aElementoEntity = elementoRepository.getElementoEntityById(idA);
                result.add(analisisElementoRepository.save(new AnalisisElementosEntity(null, valorS,
                        new AnalisisSueloEntity(idAnalisisSuelo),
                        sElementoEntity, analsisElementoRepository.
                        getAnalisisElementoInterpretacionEntityByIdElementoAndInterpretacion
                                (sElementoEntity,interpretacion))));

                result.add(analisisElementoRepository.save(new AnalisisElementosEntity(null, valorA,
                        new AnalisisSueloEntity(idAnalisisSuelo),
                        aElementoEntity, analsisElementoRepository.
                        getAnalisisElementoInterpretacionEntityByIdElementoAndInterpretacion
                                (aElementoEntity,interpretacion))));
            }
        }
        return result;
    }

    @Override
    @Transactional
    public void saveAnalisisElemento(AnalisisElementoInterpretacion analisisElementoInterpretacion) {
        analsisElementoRepository.save(analisisElementoEntityMapper.toEntity(analisisElementoInterpretacion));
    }


}
