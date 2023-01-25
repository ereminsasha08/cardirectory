package com.embedika.cardirectory.controller;

import com.embedika.cardirectory.dto.StatisticDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(StatisticBdController.REST_URL)
@RequiredArgsConstructor
public class StatisticBdController {

    static final String REST_URL = "/statistics";
    private final StatisticDTO statisticDTO;

    @GetMapping
    public StatisticDTO statistics() {
        return statisticDTO;
    }
}

