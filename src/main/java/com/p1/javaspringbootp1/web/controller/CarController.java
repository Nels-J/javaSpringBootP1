package com.p1.javaspringbootp1.web.controller;

/*
  @author nelsj
 * @Date 14/11/2022
 */

import com.p1.javaspringbootp1.dao.CarDao;
import com.p1.javaspringbootp1.model.Car;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CarController {

// -------------- ATTRIBUTE(s) -------------- //


// ------------- CONSTRUCTOR(s) ------------- //


// --------- GETTER(s) & SETTER(s) ---------- //


    // --------------- METHODS(s) --------------- //
    private final CarDao carDao;

    public CarController(CarDao carDao) {
        this.carDao = carDao;
    }

    @GetMapping("/Cars")
    public List<Car> carsList() {
        return this.carDao.findAll();
    }

    @GetMapping("/Cars/{id}")
    public Car showOneCar(@PathVariable int id) {
        return this.carDao.findById(id);
    }

    @PostMapping("/Cars")
    public Car addProduct(@RequestBody Car car) {
        return carDao.save(car);
    }

}
