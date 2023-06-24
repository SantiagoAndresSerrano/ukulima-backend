package ufps.ukulima.domain.model.RelacionBase.gateway;

import ufps.ukulima.domain.model.RelacionBase.RelacionBase;

import java.util.List;

public interface RelacionBaseServicio {
    public  void saveRelacionBase(RelacionBase relacionBase);
    public  RelacionBase findRelacionBaseById(int id);
    public  RelacionBase findRelacionCalMag(float value, boolean isWarning);
    public  RelacionBase findRelacionCalPot(float value, boolean isWarning);
    public  RelacionBase findRelacionBasesPrincipales(float value, boolean isWarning);
    public List<RelacionBase> findByAllRelacionBase();
}
