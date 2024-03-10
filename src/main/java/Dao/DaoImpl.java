package Dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao  {


    @Override
    public double getData() {
        /*
        se conn a bd pou recup la temperature
         */
        System.out.println("version base de donne");
        double temp=Math.random()*48;
        return temp;
    }
}
