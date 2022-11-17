package com.p1.javaspringbootp1.web.controller;

/*
 * @author nelsj
 * @Date 16/11/2022
 */

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Ping {

// -------------- ATTRIBUTE(s) -------------- //
// ------------- CONSTRUCTOR(s) ------------- //
// --------- GETTER(s) & SETTER(s) ---------- //


    // --------------- METHODS(s) --------------- //
    @GetMapping("/ping")
    public String isAlive() {
        return "Service UP";
    }

}
