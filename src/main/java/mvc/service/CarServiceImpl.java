package mvc.service;

import mvc.dao.CarDao;
import mvc.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private final CarDao carDao;

    @Value("${max.car}")
    private int maxCar;

    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }
    @Override
    public List<Car> getCars(Integer count) {
            return carDao.getCars(count);
    }
}
