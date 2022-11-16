package com.p1.javaspringbootp1.web.controller;

/*
 * @author nelsj
 * @Date 14/11/2022
 */

import com.p1.javaspringbootp1.model.Car;
import com.p1.javaspringbootp1.service.ServiceCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CarController {

    // -------------- ATTRIBUTE(s) -------------- //
    @Autowired
    private ServiceCar serviceCar;

    // ------------- CONSTRUCTOR(s) ------------- //
    private CarController() {

    }

// --------- GETTER(s) & SETTER(s) ---------- //

    // --------------- METHODS(s) --------------- //

    @GetMapping("/cars")
    public List<Car> carsList() {
        return this.serviceCar.findAll();
    }

    @GetMapping("/cars/{id}")
    public Car showOneCar(@PathVariable int id) {
        return this.serviceCar.findById(id);
    }

    @PostMapping("/cars")
    public Car addNewCar(@RequestBody Car car) {
        return serviceCar.save(car);
        //todo manage status to respect http protocol eg. 201 rather than 200
    }

    @DeleteMapping("cars/{id}")
    public ResponseEntity deleteOneCar(@PathVariable int id) {
        serviceCar.deleteOneCar(id);
        return new ResponseEntity("Delete OK", HttpStatus.OK);
    }

}
