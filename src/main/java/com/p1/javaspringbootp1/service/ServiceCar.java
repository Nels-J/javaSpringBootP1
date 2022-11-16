package com.p1.javaspringbootp1.service;

/*
 * @author nelsj
 * @Date 15/11/2022
 */

import com.p1.javaspringbootp1.dao.CarDao;
import com.p1.javaspringbootp1.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCar {

    // -------------- ATTRIBUTE(s) -------------- //
    @Autowired
    private CarDao carDao;


    // ------------- CONSTRUCTOR(s) ------------- //

// --------- GETTER(s) & SETTER(s) ---------- //


    // --------------- METHODS(s) --------------- //
    public List<Car> findAll() {
        return this.carDao.findAll();
    }

    public Car findById(int id) {
        return this.carDao.findById(id);
    }

    public Car save(Car car) {
        return this.carDao.save(car);
    }

    public void deleteOneCar(int id) {
        this.carDao.deleteOneCar(id);
    }

    public Car updateOneCar(Car car, int id){
        return this.carDao.updateOneCar(car, id);
    }

}
