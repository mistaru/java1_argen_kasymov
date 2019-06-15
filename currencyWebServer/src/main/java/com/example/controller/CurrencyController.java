package com.example.controller;

import com.example.model.CurrencyRates;
import com.example.model.Rate;
import com.example.service.CurrencyService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class CurrencyController {

    @Value("${nbkr.daily.url}")
    private String nbkrDailyUrl;

    @Value("${nbkr.week.url}")
    private String nbkrWeekUrl;

    private final CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @RequestMapping(value= "/currency/today", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getCurrencyToday(){
        RestTemplate restTemplate = new RestTemplate();
        CurrencyRates rate = restTemplate.getForObject(nbkrDailyUrl, CurrencyRates.class);
        List<Rate> rateList = currencyService.getListRate(rate);
        return currencyService.toJson(rateList);
    }

    @RequestMapping(value= "/currency/week", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getCurrencyWeek(){
        RestTemplate restTemplate = new RestTemplate();
        CurrencyRates rate = restTemplate.getForObject(nbkrWeekUrl, CurrencyRates.class);
        List<Rate> rateList = currencyService.getListRate(rate);
        return currencyService.toJson(rateList);
    }

}
