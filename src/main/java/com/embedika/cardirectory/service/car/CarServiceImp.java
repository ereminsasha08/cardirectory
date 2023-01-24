package com.embedika.cardirectory.service.car;

import com.embedika.cardirectory.CarExistException;
import com.embedika.cardirectory.domain.Car;
import com.embedika.cardirectory.dto.CarDTO;
import com.embedika.cardirectory.filter.car.CarFilter;
import com.embedika.cardirectory.repository.CarRepository;
import com.embedika.cardirectory.service.CarService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarServiceImp implements CarService {

    private final CarRepository carRepository;
    private final ModelMapper mapper;

    @Override
    public List<Car> getCars(CarFilter carFilter) {
        return carRepository.findAll(carFilter);
    }

    @Override
    public void save(CarDTO carDto) {
        List<Car> cars = getCars(new CarFilter(carDto));
        if (cars.size() !=0){
            throw new CarExistException(cars.get(0).toString());
        }
        carRepository.save(mapper.map(carDto, Car.class));
    }
}
