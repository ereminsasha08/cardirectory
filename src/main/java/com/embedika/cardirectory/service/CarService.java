package com.embedika.cardirectory.service;

import com.embedika.cardirectory.domain.Car;
import com.embedika.cardirectory.filter.car.CarFilter;

import java.util.List;

public interface CarService {
    List<Car> getCars(CarFilter carFilter);
}
