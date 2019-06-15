package com.example.demo;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.example.demo.CurrencyConverterService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
public class CurrencyController2 {
	@Autowired
	private CurrencyConverterService ccs;
	
	@GetMapping("/convert/{amount}/{currency}")
	@HystrixCommand(fallbackMethod="defaultCurrencyConverter", ignoreExceptions = {IOException.class}, commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "6000")
	})
	public String makeCurrencyConverter(@PathVariable("amount") Double amount, 
							@PathVariable("currency") String currency) throws JsonParseException, JsonMappingException, IOException {
		return ccs.makeConvert(amount, currency);
	}
	
	@GetMapping("/convert/{amount}")
	public String defaultCurrencyConverter(@PathVariable("amount") Double amount, @PathVariable("currency") String currency) 
												throws JsonParseException, JsonMappingException, IOException{
		return "Currency Info Service has error for request amount -> " + amount + ", currency -> " + currency;
	}
}
