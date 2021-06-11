package cars.service;

import cars.dao.CarDao;
import cars.dao.impl.CarDaoImpl;
import cars.model.Car;


import java.sql.SQLException;
import java.util.List;

public class CarService {

    private CarDao carDao = new CarDaoImpl();

    public List<Car> printAllCars() throws SQLException {
        return carDao.findAll();
    }

    public void saveCar(Car car) throws SQLException {
        carDao.add(car);
    }

    public void deleteCar(Long id) throws SQLException {
        carDao.deleteById(id);
    }

    public void updateCar(Car newCar) throws SQLException {
        carDao.update(newCar);
    }

    public Car getCarById(Long id) throws SQLException {
        return carDao.findById(id);
    }

    public Car getCarByTitle(String title) throws SQLException {
        return carDao.findCarByTitle(title);
    }
}
