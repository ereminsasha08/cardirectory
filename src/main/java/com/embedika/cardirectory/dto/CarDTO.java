package com.embedika.cardirectory.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarDTO {

    private Integer id;
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
