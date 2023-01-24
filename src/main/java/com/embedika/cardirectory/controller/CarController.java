package com.embedika.cardirectory.controller;

import com.embedika.cardirectory.domain.Car;
import com.embedika.cardirectory.dto.CarDTO;
import com.embedika.cardirectory.filter.car.CarFilter;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.embedika.cardirectory.service.CarService;

import java.util.List;

@RestController
@RequestMapping(CarController.REST)
@RequiredArgsConstructor
public class CarController {
    public static final String REST = "/cars";

    private final CarService carService;

    @GetMapping
    public List<CarDTO> getCars(CarFilter carFilter) {
        return carService.getCars(carFilter);
    }

    @PostMapping
    public void saveCar(@RequestBody @Valid CarDTO carDto){
        carService.save(carDto);
    }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable Integer id){
            carService.delete(id);
    }
}
