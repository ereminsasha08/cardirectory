package com.embedika.cardirectory.repository;

import com.embedika.cardirectory.domain.Car;
import com.embedika.cardirectory.filter.car.CarFilter;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

public interface CarRepository {
    List<Car> findAll(CarFilter carFilter);

    Car save(Car map);

    void deleteById(Integer id);
}
