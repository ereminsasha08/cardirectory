package com.embedika.cardirectory.controller;

import com.embedika.cardirectory.service.StatisticService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(StatisticBdController.REST)
@RequiredArgsConstructor
public class StatisticBdController {

    static final String REST = "/statistics";
    private final StatisticService statisticService;

    @GetMapping
    public StatisticService statistics() {
        return this.statisticService;
    }
}
