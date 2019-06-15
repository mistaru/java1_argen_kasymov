package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {

	@Autowired
	CurrencyComponent publisherComponent;
	
	@Autowired
	CurrencyRepository publishRepository;
	
	@GetMapping("/init")
	public int init() {
		
		publisherComponent.downloadCurrencyInfo();
		
		return 1;
	}
	
	@GetMapping("/publisher")
	public List<Currency> getPublisherList() {
		return publishRepository.findAll();
	}
	
	@GetMapping("/publisher/{id}")
	public Currency getPublisherById(@PathVariable("id") int id) {
		return publishRepository.findById(id).orElse(new Currency());
	}
	
}
