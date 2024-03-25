package lesson_24;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {
    private List<Car> cars;

    public CarRepository(List<Car> cars) {
        this.cars = cars;
    }

    public CarRepository() {
        this.cars = new ArrayList<>();
    }

    public void add(Car car) {
        cars.add(car);
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> getAvailableCars() {
        List<Car> list = new ArrayList<>();
        for (Car car : cars) {
            if (!car.isRented()) {
                list.add(car);
            }
        }
        return list;
    }

    public List<Car> getRentedCars() {
        List<Car> list = new ArrayList<>();
        for (Car car : cars) {
            if (car.isRented()) {
                list.add(car);
            }
        }
        return list;
    }

    // Filter cars based on some criteria
    public List<Car> getCarsWithParams() {
        return null;
    }
}
