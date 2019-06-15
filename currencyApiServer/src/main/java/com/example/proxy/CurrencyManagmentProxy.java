package com.example.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="currency-web-server")
@RibbonClient(name="currency-web-server")
public interface CurrencyManagmentProxy {

    @RequestMapping(value= "/currency/today", produces = MediaType.APPLICATION_JSON_VALUE)
     String getCurrencyToday();
}
