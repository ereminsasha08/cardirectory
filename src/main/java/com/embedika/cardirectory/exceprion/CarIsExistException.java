package com.embedika.cardirectory.exceprion;

import com.embedika.cardirectory.dto.CarDTO;

public class CarIsExistException extends RuntimeException{

     static final String message = "The car is exist: ";


    public CarIsExistException(CarDTO carDTO) {
        super(CarIsExistException.message + carDTO.toString());

    }
}
