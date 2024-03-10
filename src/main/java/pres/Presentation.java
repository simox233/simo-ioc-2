package pres;

import Metier.MetierImpl;
import ext.DaoImpl2;

public class Presentation {
    public static void main(String[]args){
        /*
        Injection dependances par static=> NEW
         */
        DaoImpl2 Dao=new DaoImpl2();
        MetierImpl metier=new MetierImpl(Dao);
       // metier.setDao(dao);
        System.out.println("resultat=" +metier.calcul());
    }
}
