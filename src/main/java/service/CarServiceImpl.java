package service;

import model.Car;

import java.util.Arrays;
import java.util.List;

public class CarServiceImpl implements CarService {

    private final List<Car> listCars = Arrays.asList(
            new Car("BMW", 777, 2020),
            new Car("Opel", 333, 2022),
            new Car("Ford", 555, 2020),
            new Car("Audi", 999, 2021),
            new Car("Ferrari", 888, 2024)

    );

    @Override
    public List<Car> getCars(Integer count) {
        if (count > listCars.size() || count <= 0) {
            return listCars;
        }
        return listCars.subList(0, count); }
}
