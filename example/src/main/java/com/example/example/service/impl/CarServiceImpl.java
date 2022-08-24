package com.example.example.service.impl;


import com.example.example.repository.CarRepository;
import com.example.example.service.CarService;
import com.example.example.user.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarRepository carRepository;

    @Override
    public Car addCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public String deleteCarById(Integer id) {
        carRepository.deleteById(id);
        return "user с id был удален: " + id;
    }

    @Override
    public Car putCar(Integer id, Car car) {
        car.setId(id);
        carRepository.save(car);
        return getCarById(id);
    }

    @Override
    public Car getCarById(Integer id) {
        return carRepository.getCarById(id);
    }

    @Override
    public List<Car> carList() {
        return carRepository.findAll();
    }
}

