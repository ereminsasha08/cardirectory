package com.embedika.cardirectory.exceprion;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;


public class CarIsNotExistException extends ResponseStatusException {
    static final String message = "The car is not exist with id: ";

    public CarIsNotExistException(Integer id) {
        super(HttpStatus.UNPROCESSABLE_ENTITY, message + id);
    }
}
