package cars.dao;

import cars.model.Car;

import java.sql.SQLException;

public interface CarDao extends Dao<Car>{
    Car findCarByTitle(String title) throws SQLException;
}
