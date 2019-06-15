package com.example.demo;

import java.util.Arrays;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Rate;

@RestController
public class CurrencyControllerImp implements CurrencyController1{

	@Override
	public List<Rate> getRates() {
		Rate usdRate = new Rate("USD", 68.5);
		Rate eurRate = new Rate("EUR", 78.6);
		Rate rubRate = new Rate("RUB", 1.07);
		
	
		
		return Arrays.asList(usdRate, eurRate, rubRate);
	}

}
