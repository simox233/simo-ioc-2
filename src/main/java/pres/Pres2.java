package pres;

import Dao.IDao;
import Metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[]args) throws Exception {
        Scanner scanner=new Scanner(new File("config.txt"));
        String daoClassName=scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        IDao dao=(IDao) cDao.newInstance();

        String MetierClassName=scanner.nextLine();
        Class cMetier=Class.forName(MetierClassName);
        IMetier metier=(IMetier) cMetier.newInstance();

        Method method=cMetier.getMethod("setDao",IDao.class);
        method.invoke(metier,dao);
        System.out.println("resultat=>"+metier.calcul());
    }


}
