package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("audi80", "red", 1990));
        cars.add(new Car("audi90", "black", 2000));
        cars.add(new Car("audi80", "pink", 2000));
        cars.add(new Car("audi80", "silver", 2001));
        cars.add(new Car("audi80", "white", 1999));
    }

    @Override
    public List<Car> cars(int count) {
        return cars.stream().limit(count).toList();
    }
}
