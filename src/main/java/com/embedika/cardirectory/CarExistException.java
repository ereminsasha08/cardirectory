package com.embedika.cardirectory;

public class CarExistException extends RuntimeException{

     static final String message = "The car is exist: ";


    public CarExistException(String message) {
        super(CarExistException.message + message);

    }
}
