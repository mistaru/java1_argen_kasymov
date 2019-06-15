package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CurrencyComponent {

	@Value("${currency.uri}")
	private String url;
	
	@Value("${currency.init}")
	private Boolean isInit;
	
	@Autowired
	CurrencyRepository currencyRepository;
	
	@PostConstruct
	public void init() {
		if (isInit)
			this.downloadCurrencyInfo();
	}
	
	public int downloadCurrencyInfo() {
				
		CloseableHttpClient httpClient
	      = HttpClients.custom()
	        .setSSLHostnameVerifier(new NoopHostnameVerifier())
	        .build();
	    HttpComponentsClientHttpRequestFactory requestFactory 
	      = new HttpComponentsClientHttpRequestFactory();
	    requestFactory.setHttpClient(httpClient);
		
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		String result = restTemplate.getForObject(url, String.class, new HashMap<>());
		
		List<String> lines = Arrays.asList(result.split("\n"));
		
		int i = 0;
		for (String line : lines) {
			i++;
			if (i == 1)
				continue;
			
			if (i == 502)
				break;
			
			List<String> fields = Arrays.asList(line.split(" "));
			
			// parse info
			List<String> finalFields = new ArrayList<String>();
			
			boolean quoteFound = false;
			String tmpField = "";
			for (String field : fields) {
				if (!field.contains("\"") && !quoteFound) {
					finalFields.add(field);
					continue;
				} else {
					quoteFound = !quoteFound;
					tmpField += " " + field;
					
					if (!quoteFound) {
						finalFields.add(tmpField.substring(1).replaceAll("\"", ""));
						tmpField = "";
						continue;
					}
				}
			}

			Currency currency = new Currency(finalFields.get(0), finalFields.get(1), finalFields.get(2), finalFields.get(3), 
					finalFields.get(4), finalFields.get(5), finalFields.get(6), finalFields.get(7), finalFields.get(8), 
					finalFields.get(9), finalFields.get(10), finalFields.get(11), finalFields.get(12),
					finalFields.get(14), finalFields.get(15), finalFields.get(16), finalFields.get(17), 
					finalFields.get(18), finalFields.get(19), finalFields.get(20), finalFields.get(21), finalFields.get(22), 
					finalFields.get(23), finalFields.get(24), finalFields.get(25), finalFields.get(26),
					finalFields.get(27), finalFields.get(28), finalFields.get(29), finalFields.get(30), 
					finalFields.get(31), finalFields.get(32), finalFields.get(33), finalFields.get(34), finalFields.get(13), 
					finalFields.get(35), finalFields.get(36),finalFields.get(37),finalFields.get(38));
			
			currencyRepository.save(currency);
		}
		
		return lines.size()-1;
	}
	
}
