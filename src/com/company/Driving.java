package com.company;
import java.util.ArrayList;
import java.util.List;

public class Driving {

    List<Car> cars = new ArrayList<Car>();

    public Driving() {
        super();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> getCars() {
        return new ArrayList<Car>(cars);
    }

    public void drive() {
        if (cars.isEmpty()) {
            System.out.println("Nothing to draw!");
        } else {
            cars.stream().forEach(car -> car.drive());
        }
    }

    public void cost() {
        if (cars.isEmpty()) {
            System.out.println("Nothing to calculate!");
        } else {
            cars.stream().forEach(car -> car.cost());
        }
    }
}
