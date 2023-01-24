package com.embedika.cardirectory.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Persistable;

@Entity
@Table(name = "car")
@Getter
@Setter
@NoArgsConstructor
@JsonSerialize
public class Car implements Persistable<Integer> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "license_plate", nullable = false)
    @NotNull
    @Size(min = 5)
//    @Pattern(regexp = "/^[АВЕКМНОРСТУХ]\\d{3}(?<!000)[АВЕКМНОРСТУХ]{2}\\d{2,3}$/ui")
    private String licensePlate;
    @Column(name = "brand", nullable = false)
    @NotNull
    @Size(min = 2)
    private String brand;

    @NotNull
    @Column(name = "year_manufacture")
    @Min(value = 1900)
    private short yearManufacture;

    public Car(String licensePlate, String brand, short yearManufacture) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.yearManufacture = yearManufacture;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    @JsonIgnore
    public boolean isNew() {
        return id == null;
    }
}
