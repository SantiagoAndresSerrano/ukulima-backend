package ufps.ukulima.infrastructure.driven_adapters.jpa.Municipio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ufps.ukulima.domain.model.Municipio.Municipio;
import ufps.ukulima.domain.model.Municipio.gateway.MunicipioService;

import java.util.List;
@Service
public class MunicipioServiceImp implements MunicipioService {

    @Autowired
    MunicipioRepository municipioRepository;

    @Override
    @Transactional(readOnly = true)
    public Municipio getMunicipioById(int idMunicipio) {
        return municipioRepository.getById(idMunicipio);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Municipio> getAllMunicipio() {
        return municipioRepository.findAll();
    }
}
