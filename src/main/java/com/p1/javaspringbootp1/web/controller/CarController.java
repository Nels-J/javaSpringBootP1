package com.p1.javaspringbootp1.web.controller;

/*
 * @author nelsj
 * @Date 14/11/2022
 */

import com.p1.javaspringbootp1.model.Car;
import com.p1.javaspringbootp1.service.ServiceCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CarController {

    // -------------- ATTRIBUTE(s) -------------- //
    @Autowired
    private ServiceCar serviceCar;

    // ------------- CONSTRUCTOR(s) ------------- //

// --------- GETTER(s) & SETTER(s) ---------- //

    // --------------- METHODS(s) --------------- //

    @GetMapping("/Cars")
    public List<Car> carsList() {
        return this.serviceCar.findAll();
    }

    @GetMapping("/Cars/{id}")
    public Car showOneCar(@PathVariable int id) {
        return this.serviceCar.findById(id);
    }

    @PostMapping("/Cars")
    public Car addProduct(@RequestBody Car car) {
        return serviceCar.save(car);
        //todo manage status to respect http protocol eg. 201 rather than 200
    }

}
