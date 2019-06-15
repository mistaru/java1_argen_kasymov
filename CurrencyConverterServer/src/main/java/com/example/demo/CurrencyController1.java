package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Rate;

@RestController
public interface CurrencyController1 {
	@GetMapping("/rates")
	List<Rate> getRates();
}
