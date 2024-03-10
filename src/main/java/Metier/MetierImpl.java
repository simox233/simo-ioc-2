package Metier;

import Dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")

public class MetierImpl implements IMetier {
    //couplage faible

     private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double tmp=dao.getData();
        double res=tmp*548/Math.cos(tmp*Math.PI);
         return res;
    }
/*
Injecter  dans la variable dao un obj d'une classe qui implemente l'interface IDao
 */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
