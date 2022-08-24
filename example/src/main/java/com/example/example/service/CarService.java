package com.example.example.service;


import com.example.example.user.Car;

import java.util.List;

public interface CarService {

    Car addCar(Car car);

    String deleteCarById(Integer id);

    Car putCar(Integer id, Car car);

    Car getCarById(Integer id);

    List<Car> carList();
}
