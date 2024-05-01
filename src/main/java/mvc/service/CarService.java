package mvc.service;

import mvc.model.Car;
import java.util.List;

public interface CarService {
    List<Car> getCars(Integer count);
}