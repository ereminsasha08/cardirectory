package com.embedika.cardirectory.exceprion;

public class CarIsNotExistException extends RuntimeException{

     static final String message = "The car is not exist id: ";


    public CarIsNotExistException(Integer id) {
        super(CarIsNotExistException.message + id);

    }
}
