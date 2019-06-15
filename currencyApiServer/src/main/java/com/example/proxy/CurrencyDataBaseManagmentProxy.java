package com.example.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="currency-database-server")
@RibbonClient(name="currency-database-server")
public interface CurrencyDataBaseManagmentProxy {


    @RequestMapping(value= "/rates", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getCurrencyToday();

}
