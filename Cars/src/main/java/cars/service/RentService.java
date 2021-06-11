package cars.service;

import cars.dao.Dao;
import cars.dao.impl.RentDaoImpl;
import cars.model.Rent;

import java.sql.SQLException;
import java.util.List;

public class RentService {

    private Dao<Rent> rentDao = new RentDaoImpl();

    public List<Rent> printAllRents() throws SQLException {
        return rentDao.findAll();
    }

    public void saveRent(Rent rent) throws SQLException {
        rentDao.add(rent);
    }

    public void deleteRent(Long id) throws SQLException {
        rentDao.deleteById(id);
    }

    public void updateRent(Rent newRent) throws SQLException {
        rentDao.update(newRent);
    }

    public Rent getRentById(Long id) throws SQLException {
        return rentDao.findById(id);
    }
}
