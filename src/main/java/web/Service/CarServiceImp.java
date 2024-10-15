package web.Service;

import org.springframework.stereotype.Component;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService {
    private int car_id;
    private List<Car> cars;

    {
        cars = new ArrayList<Car>();

        cars.add(new Car(++car_id, "BMW", 2024));
        cars.add(new Car(++car_id, "Lada", 2020));
        cars.add(new Car(++car_id, "Reno", 2022));
        cars.add(new Car(++car_id, "Volkswagen", 2023));
        cars.add(new Car(++car_id, "Mercedes", 2025));
    }

    @Override
    public List<Car> getCarByCount(int count) {
        if (count > cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }

}
