package com.p1.javaspringbootp1.model;

/*
 * @author nelsj
 * @Date 14/11/2022
 */

public class Car {

    // -------------- ATTRIBUTE(s) -------------- //
    private int id;
    private String model;
    private String make;
    private String color;


    // ------------- CONSTRUCTOR(s) ------------- //
    public Car() {

    }

    public Car(int id, String model, String make, String color) {
        this.id = id;
        this.model = model;
        this.make = make;
        this.color = color;
    }

    // --------- GETTER(s) & SETTER(s) ---------- //
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    // --------------- METHODS(s) --------------- //
    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model=" + model +
                ", make=" + make +
                ", color=" + color +
                '}';
    }

}
