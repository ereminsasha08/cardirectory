package com.embedika.cardirectory.service;

import com.embedika.cardirectory.dto.CarDTO;
import com.embedika.cardirectory.filter.car.CarFilter;

import java.util.List;

public interface CarService {
    List<CarDTO> getCars(CarFilter carFilter);

    void save(CarDTO carDto);

    void delete(Integer id);
}
