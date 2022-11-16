package com.p1.javaspringbootp1.dao;

import com.p1.javaspringbootp1.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/*
 * @author nelsj
 * @Date 14/11/2022
 */

@Repository
public class CarDaoImpl implements CarDao {
    // -------------- ATTRIBUTE(s) -------------- //
    private List<Car> cars;

    // ------------- CONSTRUCTOR(s) ------------- //
    public CarDaoImpl() {
        this.cars = new ArrayList<>();
        this.cars.add(new Car(1, "Seven", "Lotus", "British Green"));
        this.cars.add(new Car(2, "Seven R", "Lotus", "French Blue"));
        this.cars.add(new Car(3, "Seven LX", "Lotus", "Art color"));
    }

// --------- GETTER(s) & SETTER(s) ---------- //

    // --------------- METHODS(s) --------------- //

    @Override
    public List<Car> findAll() {
        return cars;
    }

    @Override
    public Car findById(int id) {
        for (Car car : cars) {
            if (car.getId() == id) {
                return car;
            }
        }
        return null;
    }

    @Override
    public Car save(Car car) {
        this.cars.add(car);
        return car;
    }

    @Override
    public void deleteOneCar(int id) {
        cars.removeIf(car -> car.getId() == id);
    }

    @Override
    public Car updateOneCar(Car car, int id) {
        findById(id).setModel(car.getModel());
        findById(id).setMake(car.getMake());
        findById(id).setColor(car.getColor());
        return car;
    }
}
