package com.p1.javaspringbootp1.dao;

import com.p1.javaspringbootp1.model.Car;

import java.util.List;

/*
 * @author nelsj
 * @Date 14/11/2022
 */
public interface CarDao {

    // --------------- METHODS(s) to implement --------------- //
    List<Car> findAll();
    Car findById(int id);
    Car save(Car car);

}
