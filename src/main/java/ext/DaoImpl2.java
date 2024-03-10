package ext;

import Dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao")

public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version capteurs");
        double temp=5000;
        return temp;
    }
}
