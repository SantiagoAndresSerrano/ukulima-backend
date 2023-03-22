package ufps.ukulima.domain.model.AluminioIntercambiable.gateway;

import ufps.ukulima.domain.model.AluminioIntercambiable.AluminioIntercambiable;

import java.util.List;

public interface AluminioIntercambiableService {
        public AluminioIntercambiable getAluminioIntercambiableById(int id);
        public AluminioIntercambiable getAluminioIntercambiableByValor(float valor);

        public List<AluminioIntercambiable> getAllAluminioIntercambiables();
        public void saveAluminioIntercambiable(AluminioIntercambiable aluminioIntercambiable);
}
