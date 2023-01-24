package com.embedika.cardirectory.aspect;

import com.embedika.cardirectory.service.StatisticService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Aspect
@Slf4j
@RequiredArgsConstructor
public class StatisticBdAdvice {

    private final StatisticService statisticService;

    @Pointcut(value = "execution( public * com.embedika.cardirectory.repository.car.CarRepositoryPostgres.save(..))")
    public void saveCar() {
    }

    @AfterReturning(pointcut = "saveCar()", returning = "result")
    public void lastTimeSaveCar(Object result){
        LocalDateTime now = LocalDateTime.now();
        statisticService.setLastTimeSaveCar(now);
        log.info("Save car: {}", result);
    }

}
