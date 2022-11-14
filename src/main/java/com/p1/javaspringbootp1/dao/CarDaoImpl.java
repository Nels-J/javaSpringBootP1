package com.p1.javaspringbootp1.dao;

import com.p1.javaspringbootp1.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nelsj
 * @Date 14/11/2022
 */

@Repository
public class CarDaoImpl implements CarDao {
// -------------- ATTRIBUTE(s) -------------- //


// ------------- CONSTRUCTOR(s) ------------- //


// --------- GETTER(s) & SETTER(s) ---------- //


    // --------------- METHODS(s) --------------- //
    public static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car(1, "Seven", "Lotus", "British Green"));
        cars.add(new Car(2, "Seven R", "Lotus", "French Blue"));
        cars.add(new Car(3, "Seven LX", "Lotus", "Art color"));
    }

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
        return null;
    }
}
