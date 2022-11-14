package com.p1.javaspringbootp1.web.controller;

/*
  @author nelsj
 * @Date 14/11/2022
 */

import com.p1.javaspringbootp1.model.Car;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CarController {

// -------------- ATTRIBUTE(s) -------------- //


// ------------- CONSTRUCTOR(s) ------------- //


// --------- GETTER(s) & SETTER(s) ---------- //


    // --------------- METHODS(s) --------------- //
    @GetMapping("/Cars")
    public String listCar() {
        return "Cars list";
    }

    @GetMapping("/Cars/{id}")
    public Car showOneCar(@PathVariable int id) {
        Car car = new Car(id, new String("Seven"), new String("Lotus Cars"), new String("Blue"));
        return car;
    }

}
