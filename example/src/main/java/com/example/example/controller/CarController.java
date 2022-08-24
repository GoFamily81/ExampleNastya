package com.example.example.controller;

import com.example.example.service.CarService;
import com.example.example.user.Car;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/car")
@SecurityRequirement(name = "techgeeknext-api")

public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/{id}")
    public Car getCardBId(@PathVariable Integer id) {
        return carService.getCarById(id);
    }

    @PostMapping("/post")
    public Car addCar(@RequestBody Car car) {
        System.out.println("h");
        return carService.addCar(car);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBCar(@PathVariable Integer id) {
        return carService.deleteCarById(id);
    }

    @PutMapping("/putuser/{id}")
    public Car putCar(@PathVariable Integer id, @RequestBody Car card) {
        return carService.putCar(id, card);
    }

    @GetMapping("/all")
    public List<Car> carList() {
        return carService.carList();
    }
}

