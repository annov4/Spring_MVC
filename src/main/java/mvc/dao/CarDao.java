package mvc.dao;

import mvc.model.Car;

import java.util.List;

public interface CarDao {
    List<Car> getCars(Integer count);
}