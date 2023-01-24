package com.embedika.cardirectory.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CarDTO {

    @NotNull
    @Size(min = 5)
    private String licensePlate;

    @NotNull
    @Size(min = 2)
    private String brand;

    @NotNull
    @Min(value = 1900)
    private short yearManufacture;

}
