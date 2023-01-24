package com.embedika.cardirectory.service.car;

import com.embedika.cardirectory.domain.Car;
import com.embedika.cardirectory.filter.car.CarFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.embedika.cardirectory.repository.CarRepository;
import com.embedika.cardirectory.service.CarService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarServiceImp implements CarService {

    private final CarRepository carRepository;

    @Override
    public List<Car> getCars(CarFilter carFilter) {
        return carRepository.findAll(carFilter);
    }
}
