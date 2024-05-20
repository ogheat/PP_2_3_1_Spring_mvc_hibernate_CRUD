package service;

import model.Car;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
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
        if ((count >= 5 || count == 0)) {
            return cars;
        } else if (count <= 5 && count > 0) {
            return cars.subList(0, Math.min(count, cars.size()));
        } else {
            return null;
        }
    }
}
