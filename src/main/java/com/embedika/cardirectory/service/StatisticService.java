package com.embedika.cardirectory.service;

import java.time.LocalDateTime;

public interface StatisticService {
    void setLastTimeSaveCar(LocalDateTime now);

    void setLastTimeModification(LocalDateTime now);

    void setLastTimeDeleteCar(LocalDateTime now);
}
