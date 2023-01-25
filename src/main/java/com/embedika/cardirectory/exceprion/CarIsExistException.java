package com.embedika.cardirectory.exceprion;

import com.embedika.cardirectory.domain.Car;
import lombok.Getter;
import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import static org.springframework.boot.web.error.ErrorAttributeOptions.Include.MESSAGE;

@Getter
public class CarIsExistException extends ResponseStatusException {
    private final ErrorAttributeOptions options;
    static final String message = "The car is exist: ";

    public CarIsExistException(Car car) {
        super(HttpStatus.UNPROCESSABLE_ENTITY, CarIsExistException.message + car.toString());
        options =  ErrorAttributeOptions.of(MESSAGE);
    }
}
