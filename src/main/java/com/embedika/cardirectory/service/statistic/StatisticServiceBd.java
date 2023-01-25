package com.embedika.cardirectory.service.statistic;

import com.embedika.cardirectory.dto.StatisticDTO;
import com.embedika.cardirectory.repository.CarRepository;
import com.embedika.cardirectory.service.StatisticService;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicLong;

@Service
@Getter
@RequiredArgsConstructor
public class StatisticServiceBd implements StatisticService {
    private final CarRepository carRepository;

    private final StatisticDTO statisticDTO;

    @PostConstruct
    void init() {
        statisticDTO.setAmountCar(new AtomicLong(carRepository.count()));
    }

    @Override
    public void setLastTimeSaveCar(LocalDateTime now) {
        statisticDTO.getAmountCar().incrementAndGet();
        statisticDTO.setLastTimeSaveCar(now);
    }

    @Override
    public void setLastTimeModification(LocalDateTime now) {
        statisticDTO.setLastTimeModificationDb(now);
    }

    @Override
    public void setLastTimeDeleteCar(LocalDateTime now) {
        statisticDTO.getAmountCar().addAndGet(-1);
        statisticDTO.setLastTimeDeleteCar(now);
    }
}
