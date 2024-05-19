package service;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CarServiceimpl implements CarService {
    private final List<Car> cars = Arrays.asList(
            new Car(1, "BMW", 3),
            new Car(2, "TESLA", 3),
            new Car(3, "Ford", 2),
            new Car(4, "audi", 8),
            new Car(5, "mercedes", 222)
    );


    @Override
    public List<Car> getList(int count) {
        if (count >= 5) {
            return cars;
        }
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
