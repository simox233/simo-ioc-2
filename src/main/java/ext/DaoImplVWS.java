package ext;

import Dao.IDao;

public class DaoImplVWS implements IDao {
    @Override
    public double getData() {
        System.out.println("version web service");
        return 90;
    }
}
