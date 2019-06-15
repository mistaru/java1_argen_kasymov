package com.example.controller;

import com.example.model.Rate;
import com.example.proxy.CurrencyDataBaseManagmentProxy;
import com.example.proxy.CurrencyManagmentProxy;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class CurrencyController {
    private final CurrencyManagmentProxy curProxy;
    private final CurrencyDataBaseManagmentProxy dbProxy;
    public CurrencyController(CurrencyManagmentProxy curProxy, CurrencyDataBaseManagmentProxy dbProxy) {
        this.curProxy = curProxy;
        this.dbProxy = dbProxy;
    }


    @RequestMapping(value= "/currency/today", produces = MediaType.APPLICATION_JSON_VALUE)
    @HystrixCommand(fallbackMethod = "defaultCurrencyInfoToday")
    public String getCurrencyToday() {
        String json = curProxy.getCurrencyToday();
        return json;
    }

    public String defaultCurrencyInfoToday(){
        String json = dbProxy.getCurrencyToday();
        return json;
    }
}
