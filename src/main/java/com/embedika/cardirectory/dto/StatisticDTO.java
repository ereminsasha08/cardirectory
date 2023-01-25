package com.embedika.cardirectory.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicLong;

@Getter
@Setter
@NoArgsConstructor
@Component
public class StatisticDTO {

    private LocalDateTime lastTimeSaveCar;

    private LocalDateTime lastTimeDeleteCar;

    private LocalDateTime lastTimeModificationDb;

    private AtomicLong amountCar;
}
