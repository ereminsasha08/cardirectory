package com.embedika.cardirectory.service.statistic;

import com.embedika.cardirectory.service.StatisticService;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Getter
public class StatisticServiceBd implements StatisticService {

    private LocalDateTime lastTimeSaveCar;

    @Override
    public void setLastTimeSaveCar(LocalDateTime now) {
        this.lastTimeSaveCar = now;
    }
}
