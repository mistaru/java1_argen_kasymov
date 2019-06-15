package com.example.demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CurrencyConverterService {
	public String makeConvert(Double amount, String currency) throws JsonParseException, JsonMappingException, IOException {
		
		String url = "http://localhost:8080/rates";
		List<Map<String, Object>> rates= new ArrayList<Map<String, Object>>();
		 
		RestTemplate restTemplate = new RestTemplate();
		
		String result = restTemplate.getForEntity(url, String.class, new LinkedHashMap<String, Object>()).getBody();
		ObjectMapper mapper = new ObjectMapper();
		rates = mapper.readValue(result, rates.getClass());
		
		for(Map<String, Object> rate : rates)
			if(currency.equals(rate.get("code")))
				return Double.toString(Double.parseDouble(rate.get("rate").toString()) * amount);
		
		return "0.0";
		
	}
}
