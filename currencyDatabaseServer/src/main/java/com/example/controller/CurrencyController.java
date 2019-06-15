package com.example.controller;

import com.example.model.Rate;
import com.example.service.CurrencyService;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping("/rates")
public class CurrencyController {
    private final CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @GetMapping( produces = MediaType.APPLICATION_JSON_VALUE)
    public String getCurrencyToday(){
        List<Rate> rateList = currencyService.getByDate(LocalDate.now());
        return currencyService.toJson(rateList);
    }

    @PostMapping
    public String postCurrencyToday(@RequestBody Rate rate){

        rate.setCode(currencyService.findByCode(rate.getCode().getCode()));
        rate.setDateCurrency(LocalDate.now());
        currencyService.save(rate);
        return "ok-today-save!";
    }

    @DeleteMapping
    public String deleteCurrencyToday(){
        currencyService.deleteByDate(LocalDate.now());
        return "ok-today-delete!";
    }

    @GetMapping( value = "/{date}",produces = MediaType.APPLICATION_JSON_VALUE)
    public String getCurrencyByDate( @PathVariable("date") String localDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        List<Rate> rateList = currencyService.getByDate(LocalDate.parse(localDate, formatter));
        return currencyService.toJson(rateList);
    }

    @PostMapping(value = "/{date}" )
    public String postCurrencyByDate(@PathVariable("date") String localDate,@RequestBody Rate rate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        rate.setCode(currencyService.findByCode(rate.getCode().getCode()));
        rate.setDateCurrency(LocalDate.parse(localDate, formatter));
        currencyService.save(rate);
        return "ok-date-save";
    }

    @DeleteMapping(value = "/{date}")
    public String deleteCurrencyByDate(@PathVariable("date") String localDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        currencyService.deleteByDate(LocalDate.parse(localDate, formatter));
        return "ok-date-delete";
    }

}
