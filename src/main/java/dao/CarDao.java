package dao;

import model.Car;

import java.util.List;

public interface CarDao {
    List<Car> getCars(Integer count);
}