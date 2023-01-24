package com.embedika.cardirectory.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

public interface StatisticService {
    void setLastTimeSaveCar(LocalDateTime now);
}
