package com.embedika.cardirectory.exceprion;

import com.embedika.cardirectory.domain.Car;

public class CarIsExistException extends RuntimeException {

    static final String message = "The car is exist: ";


    public CarIsExistException(Car car) {
        super(CarIsExistException.message + car.toString());

    }
}
