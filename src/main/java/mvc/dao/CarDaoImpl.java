package mvc.dao;

import mvc.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> carList = new ArrayList<>();
    {
        carList.add(new Car("Toyota", "Corolla", 2000));
        carList.add(new Car("BMW", "F10", 2020));
        carList.add(new Car("Ford", "Focus", 2013));
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count > carList.size()) {
            return new ArrayList<>(carList);
        }
        return carList.subList(0, count);
    }
}

